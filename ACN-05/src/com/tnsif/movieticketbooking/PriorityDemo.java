package com.tnsif.movieticketbooking;

import com.tnsif.multithreads.MyThread;

public class PriorityDemo {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread("Low Priority");
		MyThread t2 = new MyThread("Medium Priority");
		MyThread t3 = new MyThread("High Priority");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
