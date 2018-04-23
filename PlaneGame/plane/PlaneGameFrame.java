package com.shangli.plane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Date;

import com.shangli.util.Constant;
import com.shangli.util.GameUtil;
import com.shangli.util.MyFrame;

public class PlaneGameFrame extends MyFrame {
	Image bg = GameUtil.getImage("image/bg.jpg");
	Plane plane = new Plane("image/plane.png", 200, 200);
	ArrayList bulletList = new ArrayList();
	Date startTime,endTime;
	Explode explode;

	public void paint(Graphics g) {
		g.drawImage(bg, 0, 0, null);
		plane.draw(g);
		for (int i = 0; i < bulletList.size(); i++) {
			Bullet bullet = (Bullet) bulletList.get(i);
			bullet.draw(g);
			boolean touch = bullet.getRect().intersects(plane.getRect());
			if (touch) {
				plane.setLive(false);
				if(explode==null) {
					endTime =new Date();
					explode=new Explode(plane.x,plane.y);
				}
				explode.draw(g);
				break;
			}
		}
		int liveTime;
		if (!plane.isLive()) {
			liveTime=(int)((endTime.getTime()-startTime.getTime())/1000);
			printInfo("GameOver", 100, 200, 50, g, Color.WHITE);
			printInfo("生存时间"+liveTime+"秒", 100, 100, 50, g, Color.YELLOW);
		}
	}

	public void printInfo(String string, int x, int y, int size, Graphics g, Color color) {
		Color c = g.getColor();
		g.setColor(color);
		Font font = new Font("隶书", Font.BOLD, size);
		g.setFont(font);
		g.drawString(string, x, y);
		g.setColor(c);
	}

	// 定义键盘监听
	class KeyMonitor extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			// System.out.println("按下" + e.getKeyCode());
			plane.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// System.out.println("释放" + e.getKeyCode());
			plane.minusDirection(e);
		}
	}

	public void lauchFrame() {
		super.lauchFrame();
		addKeyListener(new KeyMonitor());
		for (int i = 0; i < 50; i++) {
			Bullet bullet = new Bullet();
			bulletList.add(bullet);
		}
		startTime=new Date();
	}

	public static void main(String[] args) {
		PlaneGameFrame pFrame = new PlaneGameFrame();
		pFrame.lauchFrame();
	}
}
