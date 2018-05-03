package com.shangli.MyCompare;

import java.util.Comparator;
/*
 * 按照价格排序的业务类
 * 降序
 */
public class GoodsPriceCompare implements Comparator<Goods>{

	@Override
	public int compare(Goods o1, Goods o2) {
		// TODO 自动生成的方法存根
		return -(o1.getPrice()-o2.getPrice()>0? 1:
			(o1.getPrice()-o2.getPrice()<0?-1:0)
			);
	}

}
