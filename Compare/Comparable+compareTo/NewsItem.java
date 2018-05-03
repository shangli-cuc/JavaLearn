package com.shangli.MyCompare;
/*
 * ������Ŀʵ����
 */

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class NewsItem implements Comparable<NewsItem>{
	private String title;
	private int hits;
	private Date pubTime;
	public NewsItem() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
	public NewsItem(String title, int hits, Date pubTime) {
		super();
		this.title = title;
		this.hits = hits;
		this.pubTime = pubTime;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public Date getPubTime() {
		return pubTime;
	}
	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}

	//ʱ�併��
	//���������
	//���⽵��
	@Override
	public int compareTo(NewsItem o) {
		//С�ڷ��ظ���
		//Ĭ������
		// TODO �Զ����ɵķ������
		int result=0;
	//Ĭ�����������������Ҫ����Ӹ��ż���
		//����ʱ�併������
		result=-this.pubTime.compareTo(o.pubTime);
		if(result==0) {
			//�������������
			result=-this.pubTime.compareTo(o.pubTime);
			if(result==0) {
				//���⽵������
				result=-this.title.compareTo(o.title);
			}
		}
		return result;
	}

//	@Override
//	public String toString() {
//		// TODO �Զ����ɵķ������
//		StringBuilder sb=new StringBuilder();
//		sb.append("���⣺").append(this.title);
//		sb.append("��ʱ�䣺").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.pubTime));
//		sb.append("���������").append(this.hits).append("\n");
//		return sb.toString();
//	}
	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return "���⣺"+this.title+",ʱ�䣺"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.pubTime)+",�������"+this.hits+"\n";
	}
}
