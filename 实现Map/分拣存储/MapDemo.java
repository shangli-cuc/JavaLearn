package com.shangli.myCollection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
 * 统计单词出现的次数
 * 分割字符串
 * 分拣存储
 * 面向对象
 */
public class MapDemo {
	public static void main(String[] args) {
		String[] arr="this is a cat what do you want can i help you ?".split(" ");
//		Map<String, Integer> map=new HashMap<String,Integer>();
		Map<String, Letter> map=new HashMap<String,Letter>();
		for (String key : arr) {
//			System.out.println(key);
			/*if(!map.containsKey(key)) {
				map.put(key, 1);
			}else {
				map.put(key, map.get(key)+1);
			}*/
			//三目运算符更简洁一点
			/*Integer value=map.get(key);
			value=map.containsKey(key)?
					map.put(key, value+1):map.put(key, 1);*/
			//检查是否有袋子
//			if(!map.containsKey(key)) {//没有袋子
//				//准备一个袋子
//				map.put(key, new Letter(key));
//			}
//			//获取袋子
//			Letter value=map.get(key);
//			value.setCount(value.getCount()+1);//装东西
			Letter value=map.get(key);
			if(value==null) {
				value=new Letter(key);
				map.put(key, value);
			}
			value.setCount(value.getCount()+1);
		}
//		Set<String> keySet=map.keySet();//将map里面的key对象扔到keySet里面
//		Iterator<String> iterator=keySet.iterator();
//		while (iterator.hasNext()) {
//			String key =  iterator.next();
//			int value=map.get(key);
//			System.out.println(key+"--->"+value);
//		}
		for(String key:map.keySet()) {
			Letter value=map.get(key);
			System.out.println(key+"--->"+value.getCount());
		}
	}
}
