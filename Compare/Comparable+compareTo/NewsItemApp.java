package com.shangli.MyCompare;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class NewsItemApp {
	public static void main(String[] args) {
		List<NewsItem> list=new ArrayList<NewsItem>();
		
		list.add(new NewsItem("���ַ��������",100,new Date()));
		list.add(new NewsItem("����ʵѵ",20,new Date(System.currentTimeMillis()-1000*60*60)));
		list.add(new NewsItem("��Ӣ����20��",30,new Date(System.currentTimeMillis()+1000*60*60)));
		list.add(new NewsItem("�콵ΰ�����²���",50,new Date(System.currentTimeMillis()-1000*60*60)));
		
		System.out.println("����ǰ��\n"+list);
		//list��Ԫ�أ�����NewsItem��Ķ���ʵ���˽ӿ�comparable
		//������д��compareTo���������ԱȽϵ�ʱ��ᰴ����д���compareTo������
		Collections.sort(list);
		System.out.println("�����\n"+list);
	}
}
