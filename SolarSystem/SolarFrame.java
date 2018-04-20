package com.shangli.SolarSystem;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import com.shangli.test.Constant;
import com.shangli.test.GameUtil;
import com.shangli.test.MyFrame;

public class SolarFrame extends MyFrame {

//	Image img=GameUtil.getImage("image/sun.png");
	
	Star sun=new Star("image/sun.png",Constant.GAME_WIDTH/2, Constant.GAME_HEIGHT/2);
	Planet earth= new Planet("image/earth.png", 500, 200, 0.1, sun);
	Planet moon=new Planet("image/moon.png", 100, 50, 0.1, earth);
	public void paint(Graphics g) {
		Color color = g.getColor();
		g.setColor(Color.BLACK);
		g.fillRect(Constant.LOCATION_X, Constant.LOCATION_Y, getWidth(), getHeight());
		g.setColor(color);
		// g.drawImage(img, Constant.GAME_WIDTH/2, Constant.GAME_HEIGHT/2, null);
		sun.draw(g);
		earth.draw(g);
		moon.draw(g);
	}

	public static void main(String[] args) {
		SolarFrame sFrame = new SolarFrame();
		sFrame.lauchFrame();
	}
}
