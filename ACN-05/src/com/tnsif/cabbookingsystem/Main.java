package com.tnsif.cabbookingsystem;

import java.util.Scanner;

class Cab {
    int cabId;
    String driverName;
    String cabType;
    double ratePerKm;

    Cab(int cabId, String driverName, String cabType, double ratePerKm) {
        this.cabId = cabId;
        this.driverName = driverName;
        this.cabType = cabType;
        this.ratePerKm = ratePerKm;
    }

    void displayCabDetails() {
        System.out.println("\nCab Details");
        System.out.println("Cab ID: " + cabId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Cab Type: " + cabType);
        System.out.println("Rate Per Km: ₹" + ratePerKm);
    }
}

// Child Class
class Booking extends Cab {
    String customerName;
    double distance;
    double totalFare;

    Booking(int cabId, String driverName, String cabType,
            double ratePerKm, String customerName, double distance) {

        super(cabId, driverName, cabType, ratePerKm);

        this.customerName = customerName;
        this.distance = distance;
        this.totalFare = distance * ratePerKm;
    }

    void generateBill() {
        displayCabDetails();

        System.out.println("\nBooking Details");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: ₹" + totalFare);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== CAB BOOKING SYSTEM =====");

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Distance (km): ");
        double distance = sc.nextDouble();

        Booking b1 = new Booking(
                101,
                "Ramesh",
                "Sedan",
                15.0,
                customerName,
                distance
        );

        System.out.println("\nBooking Successful!");
        b1.generateBill();

        sc.close();
    }
}