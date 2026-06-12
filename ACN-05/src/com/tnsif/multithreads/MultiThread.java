package com.tnsif.multithreads;

public class MultiThread extends Thread {
	public void run()
	{
		for(int i =1; i<=10; i++)
		{
	         System.out.println("Child thread: +i");
	         
		}
	}
	
	

}
