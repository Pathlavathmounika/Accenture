package com.java;

public class Operators {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		//Arithmetic Operators
		System.out.println("Arithmetic operators");
		System.out.println("Addition:"+(a+b));
		System.out.println("Subtraction:"+(a-b));
		System.out.println("Multiplication:"+(a*b));
		System.out.println("Division"+(a/b));
		System.out.println("Modulus:"+(a%b));
		
		//Relational Operators
		System.out.println("\nRelational Operators");
		System.out.println("a==b:"+(a==b));
		System.out.println("a!=b:"+(a!=b));
		System.out.println("a>b:"+(a>b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>=b:"+(a>=b));
		System.out.println("a<=b:"+(a<=b));
		//Logical Operators
		System.out.println("\nLogical Operators");
		boolean x=true;
		boolean y=false;
		System.out.println("x && y:"+(x && y));
		System.out.println("x || y:"+(x || y));
		System.out.println("!x :"+(!x));
		//Assignment Operators 
		System.out.println("\nAssignment Operators");
		int c = 20;
		System.out.println("Initial value of c:"+c);
		c += 5;
		System.out.println("c += 5:"+c);
		c -=3;
		System.out.println("c -= 3:"+c);
		c *= 2;
		System.out.println("c *= 2:"+c);
		c /= 4;
		System.out.println("c /= 4:"+c);
		// Increment and Decrement Operators
		System.out.println("/nIncrement and Decrement Operators");
		int d = 10;
		System.out.println("Initial value of d:"+d);
		d++;
		System.out.println("After Increment d++:"+d);
		d--;
		System.out.println("After Decrement d--:"+d);
		
	}

}
