package com.day3encapusulation;

public class MainBank {
	public static void main(String[] args) {
		BankEncapsulation bank = new BankEncapsulation(75590107, 12000);
		bank.checkbalance();
		bank.deposit(3000);
		bank.checkbalance();
		bank.withdraw(1200);
		bank.checkbalance();
	}

}
