package com.shangli.SolarSystem;

import java.awt.Graphics;
import java.awt.Image;

import com.shangli.test.GameUtil;

public class Star {
	double x, y;
	Image img;
	double width, height;

	public Star() {

	}
	public Star(Image img) {
		this.img=img;
		this.width=img.getWidth(null);
		this.height=img.getHeight(null);
	}
	public Star(Image img,double x,double y) {
		this(img);
		this.x=x;
		this.y=y;
	}
	public Star(String imgpath,double x, double y) {
		this(GameUtil.getImage(imgpath),x,y);
	}

	public void draw(Graphics g) {
		g.drawImage(img, (int) x, (int) y, null);
	}
}
