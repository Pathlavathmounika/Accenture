package com.tnsif.nonaccessmodifiers;

public class Static {
	
	// Static variable
	
	static int count;
	int variable; // instance variable
	
	// Static block
	static {
		count = 20;
		
		System.out.println("Showing the static variable count:"+count);
	}
	
	static void display() {
		System.out.println("Displaying the count value"+count);
	}

	public static void main(String[] args) {
		System.out.println("Displaying the main method");
		
		display();

	}
}
