package com.tnsif.schoolfeemanagement;

class Student{
	int studentId;
	String studentName;
	double feeAmount;
	
	
	Student(int studentId, String studentName, double feeAmount){
		this.studentId = studentId;
		this.studentName = studentName;
		this.feeAmount = feeAmount;
	}
	
	void displayStudentDetails() {
		System.out.println("\nStudent Details");
		System.out.println("student Id:"+ studentId);
		System.out.println("student Name:"+ studentName);
		System.out.println("Total fee:"+ feeAmount);
	}
	
}
class Fees extends Student {
	double paidAmount; 
	
	Fees (int studentId, String studentName, double feeAmount, double paidAmount){
		super(studentId,studentName,feeAmount);
		this.paidAmount = (feeAmount - paidAmount);
		
	}
	
	void calculateBalance() {
		double balance = feeAmount - paidAmount;
		System.out.println("paid Amount:"+ paidAmount);
		System.out.println("Balance Fee:"+ balance);
		
	}
}

public class SchoolFee{
	public static void main(String[] args) {
		Fees s1 = new Fees(101, "Mounika", 50000, 30000);
		s1.displayStudentDetails();
		s1.calculateBalance();
	}
	
}
