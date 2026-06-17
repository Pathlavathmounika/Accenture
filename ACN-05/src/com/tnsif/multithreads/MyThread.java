package com.tnsif.multithreads;

public class MyThread extends Thread {
	
	public MyThread(String name) {
		super(name);
		
	}
	
	

	public void run() {
		for(int i=1; i<=3; i++) {
			System.out.println(
					Thread.currentThread().getName()+"Priority:"+
			Thread.currentThread().getPriority()
			);
		}
	}

}
