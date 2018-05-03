package com.shangli.MyCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsApp {
	public static void main(String[] args) {
		List<Goods> list=new ArrayList<Goods>();
		list.add(new Goods("xx电影",100,20));
		list.add(new Goods("抱团旅行",3000,1000));
		list.add(new Goods("码代码",20,3721));
		list.add(new Goods("遛狗",250,20));
		list.add(new Goods("宅",2.1,3));
		System.out.println("排序前："+list);
		Collections.sort(list, new GoodsPriceCompare());
		System.out.println("排序后："+list);
	}
}
