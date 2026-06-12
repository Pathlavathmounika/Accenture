package com.tnsif.exceptionhandling;

public class ExceptionHandle {
	public void show() {
		try {
			//Null PointerException
			String s = "null";
			System.out.println(s.length());
			
			// ArithmeticException
			
			int a = 10;
			int b = 20;
			int c = a/b;
			
			System.out.println(c);
			int[] arr = {10,202,30,40,50};
			System.out.println(arr.length);
			System.out.println(arr[2]);
		}
		
		catch(ArrayIndexOutOfBoundsException e2) {
			
			System.out.println("The division is not possible because the num is divided by zero");
		}
		
		catch(NullPointerException e)
		{
			System.out.println("The string null doesnt contain any length");
		}
		
		finally {
			System.out.print("This is finally block");
		}
	
	}

	
		
	}
