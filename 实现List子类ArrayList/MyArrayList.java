package com.shangli.myCollection;

import java.io.ObjectInputStream.GetField;

public class MyArrayList {
	private Object value[];
	private int size;
	
	public MyArrayList() {
		this(16);
	}
	public MyArrayList(int size) {
		value=new Object[size];
	}
	
	public void add(Object object) {
		value[size]=object;
		size++;
		if(size>=value.length) {
			int newCapacity=value.length*2+2;
			Object newArrayList[]=new Object[newCapacity];
			
			for(int i=0;i<value.length;i++) {
				newArrayList[i]=value[i];
			}
			
			value=newArrayList;
		}
	}
	public Object get(int index) {
		if(index<0 || index>=value.length) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		return value[index];
	}
	
	public static void main(String[] args) {
		MyArrayList myArrayList=new MyArrayList();
		myArrayList.add("shangli");
		System.out.println(myArrayList.get(0));
		myArrayList.add(new Man("shangli"));
		Man man=(Man)myArrayList.get(1);
		System.out.println(man.getName());
	}
}
