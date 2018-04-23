package com.shangli.plane;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import com.shangli.util.Constant;

public class Bullet extends GameObject{
	
	
	public Bullet() {
		degree=Math.random()*Math.PI*2;
		x=Constant.GAME_WIDTH/2;
		y=Constant.GAME_HEIGHT/2;
		width=10;
		height=10;
	}
	public void draw(Graphics g) {
		if(live) {
			Color color=g.getColor();
			g.setColor(Color.YELLOW);
			g.fillOval((int)x, (int)y, width, height);
			x+=speed*Math.cos(degree);
			y+=speed*Math.sin(degree);
			g.setColor(color);
			if (y > Constant.GAME_HEIGHT-width || y < 30) {
				degree = -degree;
			}
			if (x > Constant.GAME_WIDTH-height || x < 0) {
				degree = Math.PI - degree;
			}
		}
	}
}
