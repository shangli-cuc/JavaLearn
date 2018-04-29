package com.shangli.MyMap;
/*
 * ����һ��Student�࣬���ԣ�name��num��score
 * �ֽ�Student�������List
 * ͳ�Ƴ�ÿ���༶���ֺܷ�ƽ����
 * 
 * �������������+�ּ�洢
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
	 * ģ�⿼��
	 * �����������
	 */
	public static List<Student> exam(){
		List<Student> list=new ArrayList<Student>();
		//���ѧ����Ϣ
		list.add(new Student("��1","A��",80));
		list.add(new Student("��2","A��",80));
		list.add(new Student("��3","A��",80));
		list.add(new Student("��4","C��",80));
		list.add(new Student("��5","C��",80));
		list.add(new Student("��6","C��",80));
		return list;
	}
	/*
	 * ͳ�Ʒ���
	 * �������+�ּ�洢�����Ĵ��룩
	 */
	public static Map<String, ClassRoom> count(List<Student> list){
		//key-->�༶��� value-->classroom
		Map<String, ClassRoom> map=new HashMap<String,ClassRoom>();
		//����list
		for(Student stu:list) {
			//�ּ𣬲鿴�Ƿ���ڸñ�ŵİ༶
			String num=stu.getNum();//�༶���
			double score=stu.getScore();//����
			//�����ڣ������ð༶
			ClassRoom room=map.get(num); 
			if(room==null) {
				room=new ClassRoom();
				map.put(num, room);
			}
			//���ڣ�ѧ����Ϣ����ð༶
			room.getStuList().add(stu);
			room.setTotal(room.getTotal()+score);//�����ܷ�
		}
		return map;
	}
	/*
	 * �鿴ÿ������ֺܷ�ƽ����
	 */
	public static void view(Map<String, ClassRoom> map) {
		Set<String> keys=map.keySet();
		//��ȡ������
		Iterator<String> iterator=keys.iterator();
		while(iterator.hasNext()) {
			//��ȡ
			String num=iterator.next();
			ClassRoom room=map.get(num);
			//����
			double total=room.getTotal();
			double average=total/room.getStuList().size();
			System.out.println(num+"--->"+total+"--->"+average);
		}
	}
}
