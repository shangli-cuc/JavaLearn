package com.shangli.myCollection;

public class Letter {
	
	private String name;
	private int count;
	
	//空构造器alt+/
	public Letter() {
		// TODO 自动生成的构造函数存根
	}
	public Letter(String name) {
		super();
		this.name = name;
	}

	//非空构造器alt+shift+s -->o
	public Letter(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}

	//setter、getter方法alt+shift+s -->r -->tab -->enter -->shift+tab -->enter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
