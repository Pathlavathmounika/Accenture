package com.tnsif.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList li = new LinkedList();
		li.addFirst(101);
		li.addFirst('c');
		li.addFirst("hello");
		li.addFirst(104);
		li.addLast(20.56);
		li.addLast(true);
		li.addLast(203);
		li.addLast(204);
		System.out.println(li);
		li.removeFirst();
		System.out.println(li);
		li.removeLast();
		System.out.println(li);
		

	}

}
