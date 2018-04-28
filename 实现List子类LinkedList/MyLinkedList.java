package com.shangli.MyLinkedList;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;

public class MyLinkedList {
	private Node first;
	private Node last;
	private int size;

	public MyLinkedList() {
		// TODO 自动生成的构造函数存根
	}

	public MyLinkedList(Node first, Node last) {
		super();
		this.first = first;
		// this.first.setPrevious(null);
		this.last = last;
		// this.last.setNext(null);
	}

	public int size() {
		return size;
	}

	public void add(Object object) {
		Node node = new Node();
		if (first == null) {
			node.setPrevious(null);
			node.setObject(object);
			node.setNext(null);

			first = node;
			last = node;
		} else {
			node.setPrevious(last);
			node.setObject(object);
			node.setNext(null);

			last.setNext(node);
			last = node;
		}
		size++;
	}

	public Object get(int index) {
		Node temp = null;
		if (first != null) {
			temp = first;
			for (int i = 0; i < index; i++) {
				temp = temp.getNext();
			}
		}
		return temp.getObject();
	}

	public void remove(int index) {
		Node temp = null;
		if (first != null) {
			temp = first;
			for (int i = 0; i < index; i++) {
				temp = temp.getNext();
			}
		}
		if (temp != null) {
			Node temp_previous = temp.getPrevious();
			Node temp_next = temp.getNext();
			temp_previous.setNext(temp_next);
			temp_next.setPrevious(temp_previous);
			size--;
		}
	}
	public void add(int index, Object object) {
		Node temp = null;
		if (first != null) {
			if (index < (size >> 1)) {
				temp = first;
				for (int i = 0; i < index; i++) {
					temp=temp.getNext();
				}
			}else {
				temp=last;
				for(int i=size-1;i>index;i--) {
					temp=temp.getPrevious();
				}
			}
		}
		if (temp != null) {
			Node temp_previous = temp.getPrevious();
			Node new_node = new Node();
			new_node.setObject(object);
			new_node.setPrevious(temp_previous);
			new_node.setNext(temp);
			temp_previous.setNext(new_node);
			temp.setPrevious(new_node);
			size++;
		}
	}

	public static void main(String[] args) {
		MyLinkedList mLinkedList = new MyLinkedList();
		mLinkedList.add("aaa");
		mLinkedList.add("bbb");
		mLinkedList.add("ccc");
		System.out.println(mLinkedList.size());
		System.out.println(mLinkedList.get(0));
		System.out.println(mLinkedList.get(1));
		mLinkedList.remove(1);
		System.out.println(mLinkedList.get(1));
		System.out.println(mLinkedList.size());
		mLinkedList.add(1, "ddd");
		System.out.println(mLinkedList.get(1));
	}
}
