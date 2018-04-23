package com.shangli.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
/*
 * ��Ϸ�����еĹ����ࣨͼƬ���أ�
 */
public class GameUtil {
	public static Image getImage(String path) {
		URL url=GameUtil.class.getClassLoader().getResource(path);
		BufferedImage img=null;
		try {
			img =ImageIO.read(url);
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return img;
	}
}