package com.shangli.myCollection;

public class Letter {
	
	private String name;
	private int count;
	
	//�չ�����alt+/
	public Letter() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public Letter(String name) {
		super();
		this.name = name;
	}

	//�ǿչ�����alt+shift+s -->o
	public Letter(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}

	//setter��getter����alt+shift+s -->r -->tab -->enter -->shift+tab -->enter
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
