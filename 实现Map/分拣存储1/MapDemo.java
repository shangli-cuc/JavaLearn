package com.shangli.myCollection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
 * ͳ�Ƶ��ʳ��ֵĴ���
 * �ָ��ַ���
 * �ּ�洢
 * �������
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
			//��Ŀ����������һ��
			/*Integer value=map.get(key);
			value=map.containsKey(key)?
					map.put(key, value+1):map.put(key, 1);*/
			//����Ƿ��д���
//			if(!map.containsKey(key)) {//û�д���
//				//׼��һ������
//				map.put(key, new Letter(key));
//			}
//			//��ȡ����
//			Letter value=map.get(key);
//			value.setCount(value.getCount()+1);//װ����
			Letter value=map.get(key);
			if(value==null) {
				value=new Letter(key);
				map.put(key, value);
			}
			value.setCount(value.getCount()+1);
		}
//		Set<String> keySet=map.keySet();//��map�����key�����ӵ�keySet����
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
