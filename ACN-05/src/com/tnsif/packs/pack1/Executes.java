package com.tnsif.packs.pack1;

import com.tnsif.packs.pack2.Sample;
import com.tnsif.packs.pack2.Student;

public class Executes {

	public static void main(String[] args) {
		Access ob = new Access();
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
		
		ob.show2();
		ob.show3();
		ob.show4();
		Demo ob1 = new Demo();
		ob1.test1();
		Sample ob2 = new Sample();
		ob2.test2();
		Student ob3 = new Student();
		ob3.test3();
	}

}
