package com.shangli.MyMap;

import java.util.HashSet;
import java.util.LinkedList;

import com.shangli.MyLinkedList.MyLinkedList;

public class MyMap {
	
	int size;
	LinkedList arr[]=new LinkedList[999];
	
	public void put(Object key,Object value) {
		MyEntry myEntry=new MyEntry(key, value);
		
		int hash=key.hashCode();
		hash=(hash<0)?(-hash):hash;
		
		int a=hash%arr.length;
		if(arr[a]==null) {
			LinkedList list=new LinkedList();
			arr[a]=list;
			list.add(myEntry);
			for(int i=0;i<list.size();i++) {
				MyEntry myEntry2=(MyEntry)list.get(i);
				if(myEntry2.key.equals(key)) {
					myEntry2.value=value;
					return;
				}
			}
		}else {
			LinkedList list=arr[a];
			for(int i=0;i<list.size();i++) {
				MyEntry myEntry2=(MyEntry)list.get(i);
				if(myEntry2.key.equals(key)) {
					myEntry2.value=value;
					return;
				}
			}
			arr[a].add(myEntry);
		}
	}
	public Object get(Object key) {
		int a=key.hashCode()%arr.length;
		if(arr[a]!=null) {
			LinkedList list=arr[a];
			for(int i=0;i<list.size();i++) {
				MyEntry myEntry=(MyEntry)list.get(i);
				if(myEntry.key.equals(key)) {
					return myEntry.value;
				}
			}
		}
		return null;
	}
	public static void main(String[] args) {
		MyMap map=new MyMap();
		map.put("husband0", new Wife("wife0"));
		map.put("husband0", new Wife("wife2"));
		map.put("husband0", new Wife("wife3"));
		Wife wife=(Wife)map.get("husband0");
		System.out.println(wife.name);
	}
}
class MyEntry{
	Object key,value;

	public MyEntry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
}
class Wife{
	String name;
	public Wife(String name) {
		this.name=name;
	}
}