package com.shangli.MyCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsApp {
	public static void main(String[] args) {
		List<Goods> list=new ArrayList<Goods>();
		list.add(new Goods("xx��Ӱ",100,20));
		list.add(new Goods("��������",3000,1000));
		list.add(new Goods("�����",20,3721));
		list.add(new Goods("�޹�",250,20));
		list.add(new Goods("լ",2.1,3));
		System.out.println("����ǰ��"+list);
		Collections.sort(list, new GoodsPriceCompare());
		System.out.println("�����"+list);
	}
}
