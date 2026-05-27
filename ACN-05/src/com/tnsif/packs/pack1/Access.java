package com.tnsif.packs.pack1;

public class Access {
	private int a = 10;
	int b=20;
	protected int c=30;
	public int d=40;
	
	private void show1()
	{
		System.out.println("private show");
	}
	 void show2()
	{
		System.out.println("default show");
	}
	protected void show3()
	{
		System.out.println("protected show");
	}
	public void show4()
	{
		System.out.println("public show");
	}
	
}
