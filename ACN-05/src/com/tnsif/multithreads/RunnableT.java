package com.tnsif.multithreads;

public class RunnableT implements Runnable {
    // function interface- it will have only one abstract method
	// marker interface - having 0 abstract methods
	@Override
	public void run() {
		for(int i =1; i<=10; i++)
		{
	         System.out.println("Child runnable thread: +i");
	         
		}
		
	}
	}


