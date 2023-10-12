package com.shivshankar.assignment5;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
		double wages;
		int hours;
		
	@Override
	void acceptData() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Name: ");
		this.firstName=sc.next();
		System.out.print("Enter Last Name: ");
		this.lastName=sc.next();
		System.out.print("Enter SSN number: ");
		this.SSN=sc.nextInt();
		System.out.print("Wages: ");
		this.wages=sc.nextDouble();
		System.out.print("Hours: ");
		this.hours=sc.nextInt();
	}
	void calculateSalary()
	{
		if(hours<=40)
		System.out.println("Salary: "+(this.wages*this.hours));
		else {
			System.out.println("Salary: "+((40*this.wages)+(this.hours-40)*this.wages*1.5));
		}
	}
	@Override
	public String toString() {
	// TODO Auto-generated method stub
	return super.toString()+"Wages: "+this.wages+"Hours: "+this.hours;
	}
	
}
