package com.tnsif.multithreads;

public class RunMain {

	public static void main(String[] args) {
		RunnableT rt = new RunnableT ();
			Thread t = new Thread(rt);
			t.run();

	}

}
