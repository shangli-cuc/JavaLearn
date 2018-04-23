package com.shangli.plane;

import java.awt.Graphics;
import java.awt.Image;

import com.shangli.util.GameUtil;

public class Explode {
	double x,y;
	static Image[] imgs=new Image[16];
	static {
		for(int i=0;i<=15;i++) {
			imgs[i]=GameUtil.getImage("imageExplode/e"+(i+1)+".gif");
		}
	}
	int count;
	public void draw(Graphics g) {
		if(count<=15) {
			g.drawImage(imgs[count], (int)x, (int)y, null);
			count++;
		}
	}
	public Explode(double x,double y) {
		this.x=x;
		this.y=y;
	}
}
