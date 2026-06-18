package com.tnsif.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List al= new ArrayList();
		al.add(101);
		al.add(25.76);
		al.add(201);
		al.add(null);
		al.add("java");
		al.add(true);
		al.add('h');
		
		System.out.println(al);
		al.add(101);
		System.out.println(al);
		
		al.remove(3);
		System.out.println(al);
		System.out.println(al.get(2));
		
		
		
		ArrayList<Integer> ai= new ArrayList<Integer>();
		ai.add(101);
		ai.add(102);
		ai.add(103);
		ai.add(104);
		
		for(int j:ai) {
			System.out.println("This is generics:"+j);
		}

	}

}
