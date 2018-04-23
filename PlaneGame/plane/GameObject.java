package com.shangli.plane;

import java.awt.Image;
import java.awt.Rectangle;

public class GameObject {
	Image img;
	boolean live=true;
	double x,y;
	double speed=10,degree;
	int width=10,height=10;
	public Rectangle getRect() {
		Rectangle rectangle=new Rectangle((int)x, (int)y, width, height);
		return rectangle;
	}
	public boolean isLive() {
		return live;
	}

	public void setLive(boolean live) {
		this.live = live;
	}
}
