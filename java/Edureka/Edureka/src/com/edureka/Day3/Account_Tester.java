package com.edureka.Day3;

public class Account_Tester {

	public static void main(String[] args) {
		Account susmit = new Savings_Bank_Account("S0001","Susmit Chatterjee",100);
		susmit.deposit(500);
		susmit.withdraw_Funds(100);
		
		System.out.println("Sayani --- ");
		Account sayani = new Current_Account("S0002", "Sayani Chatterjee",200);
		sayani.deposit(400);
		sayani.withdraw_Funds(600);
	
	}

}
