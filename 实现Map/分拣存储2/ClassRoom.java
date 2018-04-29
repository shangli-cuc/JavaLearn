package com.shangli.MyMap;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
	List<Student> stuList;
	private String num;
	private double total;
	public ClassRoom() {
		// TODO 自动生成的构造函数存根
		stuList=new ArrayList<Student>();
	}
	public ClassRoom(String num) {
		// TODO 自动生成的构造函数存根
		this();
		this.num=num;
	}
	public ClassRoom(List<Student> stuList, String num, double total) {
		super();
		this.stuList = stuList;
		this.num = num;
		this.total = total;
	}
	public List<Student> getStuList() {
		return stuList;
	}
	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
}
