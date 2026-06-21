package com.tnsif.features;

@FunctionalInterface
interface Demo{
	void Hello();  //Functional Interface
	
}
//Lambda Expression without parameters
public class LambdaFeature {
	public static void main(String[] args) {
		Demo d = ()->{
			System.out.println("Helloo!!!");
			System.out.println("Welcome to Java!!!");
		};
		d.Hello();
	}
}