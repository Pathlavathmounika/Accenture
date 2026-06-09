package com.tnsif.str;

public class StringDemo {

	public static void main(String[] args) {
		String s = "Hello";
		String s1 = new String ("Hello");
		
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		System.out.println(s.length());
		
		System.out.println(s);
		System.out.println(s.toUpperCase());
		System.out.println(s);
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(3));
		

	}

}
