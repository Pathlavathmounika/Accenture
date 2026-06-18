package com.tnsif.collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.addElement(101);
		v.addElement(102);
		v.addElement(103);
		v.addElement(104);
		
		System.out.println(v);
		v.addElement(101);
		System.out.println(v);
		v.addElement(null);
		v.addElement(null);
		System.out.println(v);
		v.removeElementAt(2);
		System.out.println(v);

	}

}