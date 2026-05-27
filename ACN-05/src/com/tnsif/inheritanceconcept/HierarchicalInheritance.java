package com.tnsif.inheritanceconcept;
class Employee
{
	void company()
	{
		System.out.println("Company :TNSIF");
	}
}
class Developer extends Employee
{
	void role()
	{
		System.out.println("Role : Software Developer");
	}
}
class Tester extends Employee
{
	void role()
	{
		System.out.println("Role : QA Tester");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Developer dev=new Developer();
		Tester tester=new Tester();
		
		dev.role();
		tester.role();

	}

	}
