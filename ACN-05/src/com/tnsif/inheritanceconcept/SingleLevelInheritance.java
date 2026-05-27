package com.tnsif.inheritanceconcept;

//single level inheritance
class Course  //parent class
{
	String coursename="Java Programming";
	
	void showCourse()
	{
		System.out.println("Course : "+coursename);
	}
}
class Student extends Course   //child class
{
	String studentName="Amit";
	
	void showStudent()
	{
		System.out.println("Student :"+studentName);
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		Student student=new Student();
		student.showCourse();
		student.showStudent();

	}

}
