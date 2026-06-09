package com.tnsif.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		// auto boxing
		int a = 10;
		System.out.println("The value of a is:"+a);
		Integer i = new Integer(a);
		System.out.println("The value of i is:"+i);
		
		// Auto unboxing
		int unbox = i.intValue();
		System.out.println("The value of unbox is:"+i);
		
		char c = 'n';
		Character ch = new Character(c);
		System.out.println("The value of ch is:"+ch);
		
		char nchar = ch.charValue();
		System.out.println("The value of nchar is:"+nchar);

	}

}
