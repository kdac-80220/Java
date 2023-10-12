package com.shivshankar.assignment5;

import java.util.Scanner;

public class SaliriedEmployee extends Employee{
	double weekleySalary;
	
	
	//acceptMethod
	void acceptData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Name: ");
		this.firstName=sc.next();
		System.out.print("Enter Last Name: ");
		this.lastName=sc.next();
		System.out.print("Enter SSN number: ");
		this.SSN=sc.nextInt();
		System.out.print("Enter Weekly Salary: ");
		this.weekleySalary=sc.nextDouble();
	}
	
	
	
	
	public double getWeekleySalary() {
		return weekleySalary;
	}



	public void setWeekleySalary(double weekleySalary) {
		this.weekleySalary = weekleySalary;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Weekly Salary: "+weekleySalary;
	}




	@Override
	void calculateSalary() {
		System.out.println("Weekly Salary: "+weekleySalary);
	}
}
