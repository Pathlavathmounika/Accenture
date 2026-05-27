package com.tnsif.packs.pack2;

import com.tnsif.packs.pack1.Access;

public class Sample extends Access {
	public void test2() {
		Sample ob2 = new Sample();
		
		System.out.println(ob2.c);
		System.out.println(ob2.d);
		
		ob2.show3();
		ob2.show4();
	}

}
