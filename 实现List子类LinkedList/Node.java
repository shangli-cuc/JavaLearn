package com.shangli.MyLinkedList;

public class Node {
	private Node previous;
	private Node next;
	private Object object;
	
	public Node() {
	}
	
	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	
}
