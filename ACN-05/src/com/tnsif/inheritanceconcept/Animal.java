package com.tnsif.inheritanceconcept;

public class Animal {
	void sound() {

		System.out.println("Animals make sound");

		}
}

		class Dog extends Animal {

		void bark() {

		System.out.println("Dog barks"); 
        }

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.sound();
		obj.bark();
		

	}

}
