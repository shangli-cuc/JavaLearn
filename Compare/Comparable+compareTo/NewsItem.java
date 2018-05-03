package com.shangli.MyCompare;
/*
 * 新闻条目实体类
 */

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class NewsItem implements Comparable<NewsItem>{
	private String title;
	private int hits;
	private Date pubTime;
	public NewsItem() {
		// TODO 自动生成的构造函数存根
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

	//时间降序
	//点击量降序
	//标题降序
	@Override
	public int compareTo(NewsItem o) {
		//小于返回负数
		//默认升序
		// TODO 自动生成的方法存根
		int result=0;
	//默认排序规则是升序，想要降序加负号即可
		//发布时间降序排列
		result=-this.pubTime.compareTo(o.pubTime);
		if(result==0) {
			//点击量降序排列
			result=-this.pubTime.compareTo(o.pubTime);
			if(result==0) {
				//标题降序排列
				result=-this.title.compareTo(o.title);
			}
		}
		return result;
	}

//	@Override
//	public String toString() {
//		// TODO 自动生成的方法存根
//		StringBuilder sb=new StringBuilder();
//		sb.append("标题：").append(this.title);
//		sb.append("，时间：").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.pubTime));
//		sb.append("，点击量：").append(this.hits).append("\n");
//		return sb.toString();
//	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "标题："+this.title+",时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.pubTime)+",点击量："+this.hits+"\n";
	}
}
