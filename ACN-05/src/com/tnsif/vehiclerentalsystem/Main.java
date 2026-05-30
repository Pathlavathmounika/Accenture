package com.tnsif.vehiclerentalsystem;

class Vehicle {

	   String vehicleName;
	   double rentPerDay;

	   static int rentedVehicles = 0;
	   
	   Vehicle(String vehicleName, double rentPerDay) {
		   this.vehicleName = vehicleName;
		   this.rentPerDay = rentPerDay;
		   rentedVehicles++;
	   }
	   
	   void display() {
		   System.out.println(vehicleName + " " + rentPerDay);
	   }
}

class Car extends Vehicle {
	
	Car (String vehicleName, double rentPerDay) {
		super (vehicleName, rentPerDay);
	}
	
}
class Bike extends Vehicle{
	Bike(String vehicleName, double rentPerDay){
		super (vehicleName, rentPerDay);
	}
}

public class Main {
	   public static void main(String[] args) {

	       Car c = new Car("Swift", 2500);
	       Bike b = new Bike("Royal Enfield", 1200);

	       c.display();
	       b.display();

	       System.out.println("Total Rented Vehicles: " + Vehicle.rentedVehicles);
     }
	   
}