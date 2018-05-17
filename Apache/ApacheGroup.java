package com.shangli.Apache.Commons;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.collections4.CollectionUtils;

public class ApacheGroup {
	public static void main(String[] args) {
		Set<Integer> set1=new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		Set<Integer> set2=new HashSet<Integer>();
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		//并集
		Collection<Integer> union=CollectionUtils.union(set1, set2);
		for(Integer temp:union) {
			System.out.println(temp);
		}
		
		//交集
//		Collection<Integer> intersection=CollectionUtils.intersection(set1, set2);
		//第二种方法
		Collection<Integer> intersection=CollectionUtils.retainAll(set1, set2);
		for(Integer temp:intersection) {
			System.out.println(temp);
		}
		
		//差集
		Collection<Integer> difference=CollectionUtils.subtract(set1, set2);
		for(Integer temp:difference) {
			System.out.println(temp);
		}
	}
}
