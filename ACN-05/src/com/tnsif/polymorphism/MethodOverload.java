package com.tnsif.polymorphism;

public class MethodOverload {
	public void show() {
		
		System.out.println("This is show method with 0 parameters");
	}
public void show(int a) {
		
		System.out.println("This is show method with 1 parameters"+a);
	}
public void show(int a, int b) {
	
	System.out.println("This is show method with 2 parameters"+a+ "and" +b);
}
public void show(float a,int b, int c) {
	
	System.out.println("This is show method with 3 parameters"+a+ "and" +b+ "and" +c);
}
	
   
}