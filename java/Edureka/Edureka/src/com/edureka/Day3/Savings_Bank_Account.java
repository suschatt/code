package com.edureka.Day3;

public final class Savings_Bank_Account extends Account {
	
	final static double min_Bal=1000;
	
	public Savings_Bank_Account(String accountNumber,String accountHolderName,double accountBalance){
		super(accountNumber,accountHolderName,accountBalance,min_Bal);
		System.out.println("Your Account will pay 4% interest annually");
	}
		
		void deposit(double deposit_value){
			if(super.accountBalance<min_Bal)
				System.out.println("You don't have enough balance to perform transaction");
			else{
				super.accountBalance=super.accountBalance+deposit_value;
				System.out.println("New Balance: "+super.accountBalance);
				}//end else
		}//end deposit

		void withdraw_Funds(double withdraw_value){
			if(super.accountBalance<min_Bal)
				System.out.println("You don't have enough balance to perform transaction");
			else if(super.accountBalance<withdraw_value)
				System.out.println("Sorry..You don't have enough balance");
			else{
				super.accountBalance=super.accountBalance-withdraw_value;
				System.out.println("New Balance: "+super.accountBalance);
			}
		}//end withdraw_Funds
		
}
