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
	
	//无序bag
	public static void hashBag() {
		Bag<String> bag=new HashBag<String>();
		bag.add("a");
		bag.add("a",5);//添加对象B，5次
		bag.remove("a",2);//删除对象B，3次
		bag.add("b");
		Iterator<String> iterator=bag.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	//有序bag
	public static void treeBag() {
		Bag<String> bag=new TreeBag<String>();
		bag.add("D");
		bag.add("B",5);//添加对象B，5次
		bag.remove("B",3);//删除对象B，3次
		bag.add("C");
		Iterator<String> iterator=bag.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	//使用Bag统计词频
	public static void WordsCount() {
		String[] arr="this is a cat and that is a mice where is the food ?".split(" ");
//		Bag<String> bag=new HashBag<String>();//无序
		Bag<String> bag=new TreeBag<String>();//有序
		for(String temp:arr) {
			bag.add(temp);
		}
		Set<String> set=bag.uniqueSet();
		for(String temp:set) {
			System.out.println(temp+"--->"+bag.getCount(temp));
		}
	}
}
