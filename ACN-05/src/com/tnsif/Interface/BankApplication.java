package com.tnsif.Interface;

public class BankApplication {

	public static void main(String[] args) {
		Bank bank = new BankImplementation();
		
		Account account = new Account(12345,"Mounika",30000,bank);
		
		bank.deposite(account, 3000);
		System.out.println(account);
		
		bank.withdrawl(account, 10000);
		System.out.println(account);

	}

}
