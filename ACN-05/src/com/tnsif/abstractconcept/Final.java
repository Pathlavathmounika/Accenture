package com.tnsif.abstractconcept;

// class using final
final class Final {
	
	// Variable using final
	
	final int MAX_VALUE = 100;
	
	// method using final
	final void show() {
		System.out.println("Max allowed:"+MAX_VALUE);
	}

	public static void main(String[] args) {
		Final obj = new Final();
		obj.show();
		
		

	}

}
