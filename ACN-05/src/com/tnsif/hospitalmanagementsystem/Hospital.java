package com.tnsif.hospitalmanagementsystem;

class Hospital {
    int patientId;
    String patientName;
    String disease;

    static int patientCount = 0;

    Hospital(int patientId, String patientName, String disease) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.disease = disease;
        patientCount++;
    }

    void displayDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Disease: " + disease);
    }

    public static void main(String[] args) {
        Hospital p1 = new Hospital(101, "Ravi", "Fever");
        Hospital p2 = new Hospital(102, "Priya", "Cold");

        p1.displayDetails();
        System.out.println();

        p2.displayDetails();
        System.out.println();

        System.out.println("Total Patients: " + Hospital.patientCount);
    }
}