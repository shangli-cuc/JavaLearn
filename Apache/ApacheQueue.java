package com.shangli.Apache.Commons;

import java.util.Queue;

import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.apache.commons.collections4.queue.CircularFifoQueue;
import org.apache.commons.collections4.queue.PredicatedQueue;
import org.apache.commons.collections4.queue.UnmodifiableQueue;

public class ApacheQueue {
	public static void main(String[] args) {
//		circular();
//		readOnly();
		predicate();
	}
	
	//�ж϶���
	public static void predicate() {
		Queue<String> queue=new CircularFifoQueue<String>(2);
		queue.add("a");
		queue.add("b");
		queue.add("c");
		
		Predicate<String> predicate=NotNullPredicate.notNullPredicate();
		
		PredicatedQueue<String> preQueue=PredicatedQueue.predicatedQueue(queue, predicate);
//		preQueue.add(null);//����
	}
	
	//ֻ������
	public static void readOnly() {
		Queue<String> queue=new CircularFifoQueue<String>(2);
		queue.add("a");
		queue.add("b");
		queue.add("c");
		
		Queue<String> readOnlyQueue=UnmodifiableQueue.unmodifiableQueue(queue);
//		readOnlyQueue.add("d");//����
	}
	
	//ѭ������
	public static void circular() {
		
		//����Ϊ2
		CircularFifoQueue<String> queue=new CircularFifoQueue<String>(2);
		queue.add("a");
		queue.add("b");
		queue.add("c");
		//�����޶����ȣ�֮ǰ�ĳ�ȥ��֮��Ľ���
//		for(String temp:queue) {
//			System.out.println(temp);
//		}
		for(int i=0;i<queue.size();i++) {
			System.out.println(queue.get(i));
		}
	}
}
