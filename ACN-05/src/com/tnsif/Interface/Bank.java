package com.tnsif.Interface;

public interface Bank {
	
	int MIN_BAL = 1000;
	int DEPOSITE_LIMIT = 25000;
	
	void deposite(Account account, double amount);// public abstract
	void withdrawl(Account account, double amount); 

}
