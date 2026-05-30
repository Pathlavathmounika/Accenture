package com.tnsif.constructor;

public class Student {
	
	String name;
	
	// CONSTRUCTOR
	
	Student(String name){
		this.name = name;
	}
	
	void display() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		Student s = new Student("Mounika");
		s.display();
	

	}

}
