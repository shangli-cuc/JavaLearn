package com.shangli.MyCompare;

import java.util.Comparator;
/*
 * ���ռ۸������ҵ����
 * ����
 */
public class GoodsPriceCompare implements Comparator<Goods>{

	@Override
	public int compare(Goods o1, Goods o2) {
		// TODO �Զ����ɵķ������
		return -(o1.getPrice()-o2.getPrice()>0? 1:
			(o1.getPrice()-o2.getPrice()<0?-1:0)
			);
	}

}
