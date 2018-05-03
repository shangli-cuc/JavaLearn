package com.shangli.MyCompare;

public class Goods {
	private String name;
	private double price;
	private int favorite;
	public Goods() {
		// TODO 自动生成的构造函数存根
	}
	public Goods(String name, double price, int favorite) {
		super();
		this.name = name;
		this.price = price;
		this.favorite = favorite;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getFavorite() {
		return favorite;
	}
	public void setFavorite(int favorite) {
		this.favorite = favorite;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "商品名："+this.name+"，价格："+this.price+"，收藏量"+this.favorite+"\n";
	}
}
