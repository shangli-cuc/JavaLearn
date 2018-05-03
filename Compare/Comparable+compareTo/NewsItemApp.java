package com.shangli.MyCompare;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class NewsItemApp {
	public static void main(String[] args) {
		List<NewsItem> list=new ArrayList<NewsItem>();
		
		list.add(new NewsItem("娱乐方面的新闻",100,new Date()));
		list.add(new NewsItem("国际实训",20,new Date(System.currentTimeMillis()-1000*60*60)));
		list.add(new NewsItem("屠英灭美20年",30,new Date(System.currentTimeMillis()+1000*60*60)));
		list.add(new NewsItem("天降伟人你怕不怕",50,new Date(System.currentTimeMillis()-1000*60*60)));
		
		System.out.println("排序前：\n"+list);
		//list里元素，即类NewsItem类的对象实现了接口comparable
		//并且重写了compareTo方法，所以比较的时候会按照重写后的compareTo来排序
		Collections.sort(list);
		System.out.println("排序后：\n"+list);
	}
}
