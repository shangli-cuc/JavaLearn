package com.shangli.SolarSystem;

import java.awt.Color;
import java.awt.Graphics;

import com.shangli.test.GameUtil;

public class Planet extends Star {
	double longAxis, shortAxis;
	double speed, degree;

	Star center;

	public Planet(String imgpath, double longAxis, double shortAxis, double speed, Star center) {
		super(GameUtil.getImage(imgpath));
		this.x = this.longAxis + center.x;
		this.y = center.y;
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		this.center = center;
	}

	public void draw(Graphics g) {
//		g.drawImage(img, (int) x, (int) y, null);
		super.draw(g);
		move();
		drawTrace(g);
	}
	
	public void move() {
		x = center.x + center.width / 2 + longAxis * Math.cos(degree);
		y = center.y + center.height / 2 + shortAxis * Math.sin(degree);
		degree += speed;
	}
	public void drawTrace(Graphics g) {
		Color color=g.getColor();
		g.setColor(Color.BLUE);
		g.drawOval(
				(int)(center.x + center.width / 2-longAxis), 
				(int)(center.y + center.height / 2-shortAxis), 
				(int)(2*longAxis), 
				(int)(2*shortAxis)
				);
		g.setColor(color);
	}
}
