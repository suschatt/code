package com.edureka.Day3;

public abstract class Account {
	String accountNumber,accountHolderName;
	double accountBalance;
	
	public Account(String accountNumber,String accountHolderName,double accountBalance,double minBal){
		if (accountBalance<minBal)
			System.out.println("NOTE: You don't have enough balance to open Savings Account");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}//end Constructor
	
	abstract void deposit(double deposit_value);
	abstract void withdraw_Funds(double withdraw_value);
	
	
}
