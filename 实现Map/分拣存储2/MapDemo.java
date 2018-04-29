package com.shangli.MyMap;
/*
 * 定义一个Student类，属性：name、num、score
 * 现将Student对象放入List
 * 统计出每个班级的总分和平均分
 * 
 * 方案：面向对象+分拣存储
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		List<Student> list=exam();
		Map<String, ClassRoom> map=count(list);
		view(map);
	}
	/*
	 * 模拟考试
	 * 放入测试数据
	 */
	public static List<Student> exam(){
		List<Student> list=new ArrayList<Student>();
		//存放学生信息
		list.add(new Student("甲1","A班",80));
		list.add(new Student("甲2","A班",80));
		list.add(new Student("甲3","A班",80));
		list.add(new Student("甲4","C班",80));
		list.add(new Student("甲5","C班",80));
		list.add(new Student("甲6","C班",80));
		return list;
	}
	/*
	 * 统计分析
	 * 面向对象+分拣存储（核心代码）
	 */
	public static Map<String, ClassRoom> count(List<Student> list){
		//key-->班级编号 value-->classroom
		Map<String, ClassRoom> map=new HashMap<String,ClassRoom>();
		//遍历list
		for(Student stu:list) {
			//分拣，查看是否存在该编号的班级
			String num=stu.getNum();//班级编号
			double score=stu.getScore();//分数
			//不存在，创建该班级
			ClassRoom room=map.get(num); 
			if(room==null) {
				room=new ClassRoom();
				map.put(num, room);
			}
			//存在，学生信息放入该班级
			room.getStuList().add(stu);
			room.setTotal(room.getTotal()+score);//计算总分
		}
		return map;
	}
	/*
	 * 查看每个班的总分和平均分
	 */
	public static void view(Map<String, ClassRoom> map) {
		Set<String> keys=map.keySet();
		//获取迭代器
		Iterator<String> iterator=keys.iterator();
		while(iterator.hasNext()) {
			//获取
			String num=iterator.next();
			ClassRoom room=map.get(num);
			//计算
			double total=room.getTotal();
			double average=total/room.getStuList().size();
			System.out.println(num+"--->"+total+"--->"+average);
		}
	}
}
