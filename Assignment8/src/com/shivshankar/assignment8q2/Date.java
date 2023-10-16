package com.shivshankar.assignment8q2;

import java.util.Scanner;

public class Date implements Displayable {
	int day;
	int month;
	int year;
	
	Scanner sc=new Scanner(System.in);
	
	
	public void acceptData() {
		System.out.println("Enter Day");
		day=sc.nextInt();
		System.out.println("Enter Month");
		month=sc.nextInt();
		System.out.println("Enter Year");
		year=sc.nextInt();
	}
	
	@Override
	public void displayData() {
		System.out.println("Day: "+this.day);
		System.out.println("Month: "+this.month);
		System.out.println("Year: "+this.year);
	}
	
	
	public String toString()
	{
		return "Date: "+this.day+"/"+this.month+"/"+this.year;
	}
}
