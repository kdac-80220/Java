package com.shivshankar.assignment5;

import java.util.Scanner;

public class commissionEmployee extends Employee {
		int grossSale;
		double commissionRate;
	@Override
	void acceptData() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Name: ");
		this.firstName=sc.next();
		System.out.print("Enter Last Name: ");
		this.lastName=sc.next();
		System.out.print("Enter SSN number: ");
		this.SSN=sc.nextInt();
		System.out.println("Enter Gross Sales: ");
		this.grossSale=sc.nextInt();
		System.out.println("Enter Commission Rate: ");
		this.commissionRate=sc.nextDouble();
	}

	@Override
	void calculateSalary() {
		System.out.println("Salary for Commissioned Employee: "+(commissionRate*grossSale));
	}
	
	public String toString()
	{
		return super.toString()+" Gross Sale: "+this.grossSale+" commissionRate: "+this.commissionRate;
	}

}
