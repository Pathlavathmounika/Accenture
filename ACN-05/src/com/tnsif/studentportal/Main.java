package com.tnsif.studentportal;

class Student {

	   int studentId;
	   String studentName;

	   final String collegeName = "Sri Indu College of Engineering and Technology";

	   Student(int studentId, String studentName) {
	       this.studentId = studentId;
	       this.studentName = studentName;
	   }

	   void display() {
	       System.out.println(studentId + " " + studentName);
	       System.out.println(collegeName);
	   }
	}

	class EngineeringStudent extends Student {

	   EngineeringStudent(int studentId, String studentName) {
	       super(studentId, studentName);
	   }
	}

	class MedicalStudent extends Student {

	   MedicalStudent(int studentId, String studentName) {
	       super(studentId, studentName);
	   }
	}

	public class Main {
	   public static void main(String[] args) {

	       EngineeringStudent e = new EngineeringStudent(1, "Mounika");
	       MedicalStudent m = new MedicalStudent(2, "Priya");

	       e.display();
	       m.display();
	   }
	}
