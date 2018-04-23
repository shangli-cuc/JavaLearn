package com.shangli.util;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyFrame extends Frame {
	
	public void lauchFrame() {
		setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);// 设置大小
		setLocation(Constant.LOCATION_X+300, Constant.LOCATION_Y+300);// 起始点
		setVisible(true);// 可见

		new PaintThread().start();

		// WindowAdapter内部匿名类，钩子函数
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO 自动生成的方法存根
				super.windowClosing(e);
				System.exit(0);// 停止java虚拟机，相当于关闭
			}

		});
		
//		addKeyListener(new KeyMoitor());
	}
/*
 * 利用双缓冲机制消除窗口闪烁
 * 
 */
	private Image offScreenImage=null;
	public void update(Graphics g) {
		if(offScreenImage==null) {
			offScreenImage=this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
		}
		Graphics gOff=offScreenImage.getGraphics();
		paint(gOff);
		g.drawImage(offScreenImage, 0, 0, null);
	}
	
	/*
	 * 重画窗口的线程类，内部类
	 */
	class PaintThread extends Thread {
		public void run() {
			while (true) {
				repaint();
				try {
					sleep(50);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}
	/*class KeyMoitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("按下"+e.getKeyCode());
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("释放"+e.getKeyCode());
		}
		
	}*/
}
