package com.shangli.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
/*
 * 游戏开发中的工具类（图片加载）
 */
public class GameUtil {
	public static Image getImage(String path) {
		URL url=GameUtil.class.getClassLoader().getResource(path);
		BufferedImage img=null;
		try {
			img =ImageIO.read(url);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return img;
	}
}
