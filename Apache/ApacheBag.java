package com.shangli.Apache.Commons;

import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.TreeBag;

public class ApacheBag {
	public static void main(String[] args) {
//		hashBag();
//		System.out.println("------------");
//		treeBag();
		WordsCount();
	}
	
	//����bag
	public static void hashBag() {
		Bag<String> bag=new HashBag<String>();
		bag.add("a");
		bag.add("a",5);//��Ӷ���B��5��
		bag.remove("a",2);//ɾ������B��3��
		bag.add("b");
		Iterator<String> iterator=bag.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	//����bag
	public static void treeBag() {
		Bag<String> bag=new TreeBag<String>();
		bag.add("D");
		bag.add("B",5);//��Ӷ���B��5��
		bag.remove("B",3);//ɾ������B��3��
		bag.add("C");
		Iterator<String> iterator=bag.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	//ʹ��Bagͳ�ƴ�Ƶ
	public static void WordsCount() {
		String[] arr="this is a cat and that is a mice where is the food ?".split(" ");
//		Bag<String> bag=new HashBag<String>();//����
		Bag<String> bag=new TreeBag<String>();//����
		for(String temp:arr) {
			bag.add(temp);
		}
		Set<String> set=bag.uniqueSet();
		for(String temp:set) {
			System.out.println(temp+"--->"+bag.getCount(temp));
		}
	}
}
