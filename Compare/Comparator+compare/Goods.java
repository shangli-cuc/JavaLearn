package com.shangli.MyCompare;

public class Goods {
	private String name;
	private double price;
	private int favorite;
	public Goods() {
		// TODO �Զ����ɵĹ��캯�����
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
		// TODO �Զ����ɵķ������
		return "��Ʒ����"+this.name+"���۸�"+this.price+"���ղ���"+this.favorite+"\n";
	}
}
