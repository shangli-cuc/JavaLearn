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
		setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);// ���ô�С
		setLocation(Constant.LOCATION_X+300, Constant.LOCATION_Y+300);// ��ʼ��
		setVisible(true);// �ɼ�

		new PaintThread().start();

		// WindowAdapter�ڲ������࣬���Ӻ���
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO �Զ����ɵķ������
				super.windowClosing(e);
				System.exit(0);// ֹͣjava��������൱�ڹر�
			}

		});
		
//		addKeyListener(new KeyMoitor());
	}
/*
 * ����˫�����������������˸
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
	 * �ػ����ڵ��߳��࣬�ڲ���
	 */
	class PaintThread extends Thread {
		public void run() {
			while (true) {
				repaint();
				try {
					sleep(50);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
	}
	/*class KeyMoitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("����"+e.getKeyCode());
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("�ͷ�"+e.getKeyCode());
		}
		
	}*/
}
