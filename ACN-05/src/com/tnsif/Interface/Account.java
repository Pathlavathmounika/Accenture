package com.tnsif.Interface;

public class Account {
	
	private int accNo;
	private String name;
	private double bal;
	private Bank bank;
	
	public Account(int accNo, String name, double bal, Bank bank) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.bal = bal;
		this.bank = bank;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", bal=" + bal + ", bank=" + bank + "]";
	}
	
	
	
}
	