package com.shangli.myCollection;

import java.util.Iterator;

public class MyIterator {
	private String[] ele= {"a","b","c"};
	private int size=ele.length;
	public int size() {
		return this.size;
	}
	public class MyIter implements Iterator{

		private int cursor=-1;
		
		public void remove() {
			System.arraycopy(ele, cursor+1, ele, cursor, size-(cursor+1));
			MyIterator.this.size--;
			this.cursor--;
		}
		public boolean hasNext() {
			return cursor+1<size;
		}
		public String next() {
			cursor++;
			return ele[cursor];
		}
	}
	public Iterator iterator() {
		return new MyIter();
	}
	public static void main(String[] args) {
		MyIterator mIterator=new MyIterator();
//		if(mIterator.iterator().hasNext()) {
//			System.out.println(mIterator.iterator().next());
//			System.out.println(mIterator.size());
//		}
//		for(mIterator.iterator();mIterator.iterator().hasNext();) {
//			System.out.println(mIterator.iterator().next());
//		}
		Iterator it=mIterator.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for(it=mIterator.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
	}
}
