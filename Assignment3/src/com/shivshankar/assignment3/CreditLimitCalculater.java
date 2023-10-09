package com.shivshankar.assignment3;

import java.util.Scanner;

class CalculateBalanceSheet{
	Scanner sc=new Scanner(System.in);
	private int accountNumber;
	private int initialBalance;
	private int charged;
	private int creditApplied;
	private int creditCardLimit=20000;
	
	public void acceptData()
	{
		System.out.println("Enter Account Number:");
		accountNumber=sc.nextInt();
		System.out.println("Enter Initial Balance:");
		initialBalance=sc.nextInt();
		System.out.println("Enter Charged/Used Card Amount:");
		charged=sc.nextInt();
		System.out.println("Enter Credited Amount: ");
		creditApplied=sc.nextInt();
	}
	
	public void monthlySummery()
	{
		int newBalance=initialBalance+creditCardLimit;
		newBalance=newBalance-charged+creditApplied;
		if(newBalance<0)
		{
			System.out.println("Account Balance Status: "+newBalance);
			System.out.println("Credit card limit Exceeds");
		}
		else
		{
			System.out.println("Remaining Balance: "+newBalance);
		}
	}
}
public class CreditLimitCalculater {
	public static void main(String[] args) {
		CalculateBalanceSheet u1=new CalculateBalanceSheet();
		u1.acceptData();
		u1.monthlySummery();
	}
}
