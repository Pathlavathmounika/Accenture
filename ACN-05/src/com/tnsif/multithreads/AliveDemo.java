package com.tnsif.multithreads;

public class AliveDemo extends Thread {
	public void run() {
		System.out.println("Thread Running");
		
	}

	public static void main(String[] args) {
		AliveDemo t = new AliveDemo();
		System.out.println(t.isAlive());
		t.start();
		System.out.println(t.isAlive());
		

	}

}
