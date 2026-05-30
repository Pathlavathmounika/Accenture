package com.tnsif.employeemanagement;

class Employee {
	   int employeeId;
	   String employeeName;
	   double salary;

	   static int count = 0;

	   Employee(int employeeId, String employeeName, double salary) {
	       this.employeeId = employeeId;
	       this.employeeName = employeeName;
	       this.salary = salary;
	       count++;
	   }

	   void displayDetails() {
	       System.out.println(employeeId + " " + employeeName + " " + salary);
	   }
	}

	class Developer extends Employee {

	   Developer(int employeeId, String employeeName, double salary) {
	       super(employeeId, employeeName, salary);
	   }
	}

	class Manager extends Employee {

	   Manager(int employeeId, String employeeName, double salary) {
	       super(employeeId, employeeName, salary);
	   }
	}

	public class Main {
	   public static void main(String[] args) {

	       Developer d1 = new Developer(101, "Rahul", 50000);
	       Manager m1 = new Manager(201, "Sneha", 80000);

	       d1.displayDetails();
	       m1.displayDetails();

	       System.out.println("Total Employees: " + Employee.count);
	   }
	}
