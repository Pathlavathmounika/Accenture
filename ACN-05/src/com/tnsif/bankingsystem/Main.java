package com.tnsif.bankingsystem;

class BankAccount {

	   int accountNumber;
	   String customerName;
	   double balance;

	   final String bankName = "SBI";

	   static int totalAccounts = 0;

	   BankAccount(int accountNumber, String customerName, double balance) {
	       this.accountNumber = accountNumber;
	       this.customerName = customerName;
	       this.balance = balance;
	       totalAccounts++;
	   }

	   void display() {
	       System.out.println(accountNumber + " " + customerName);
	       System.out.println(balance + " " + bankName);
	   }
	}

	class SavingsAccount extends BankAccount {

	   SavingsAccount(int accountNumber, String customerName, double balance) {
	       super(accountNumber, customerName, balance);
	   }
	}

	class CurrentAccount extends BankAccount {

	   CurrentAccount(int accountNumber, String customerName, double balance) {
	       super(accountNumber, customerName, balance);
	   }
	}

	public class Main {
	   public static void main(String[] args) {

	       SavingsAccount s1 = new SavingsAccount(1001, "Anu", 25000);
	       CurrentAccount c1 = new CurrentAccount(2001, "Ravi", 50000);

	       s1.display();
	       c1.display();

	       System.out.println("Total Accounts: " + BankAccount.totalAccounts);
	   }
	}
