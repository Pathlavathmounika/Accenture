package com.tnsif.getset;

public class StudentDetails {

	public static void main(String[] args) {
		Student std = new Student();
		std.setStdid(108);
		std.setStdname("Mounika");
		std.setMarks(88.03);
		std.setClgname("Sri Indu College of Engineering and Technology");
		System.out.println(std.getStdid());
		System.out.println(std.getStdname());
		System.out.println(std.getMarks());
		System.out.println(std.getClgname());

	}

}
