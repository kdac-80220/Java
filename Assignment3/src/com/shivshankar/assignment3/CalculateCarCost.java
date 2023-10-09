package com.shivshankar.assignment3;

import java.util.Scanner;

class CalaculateCost{
	Scanner sc=new Scanner(System.in);
	private int totalMilesDriven;
	private int gallonCost;
	private int avarageMilesPerGallon;
	private int parkingAmout;
	private int tollAmount;
	
	public void acceptData()
	{
		System.out.println("Enter Total Miles per Day: ");
		totalMilesDriven=sc.nextInt();
		System.out.println("Enter Gallon cost:");
		gallonCost=sc.nextInt();
		System.out.println("Enter Avarage Miles per Gallon: ");
		avarageMilesPerGallon=sc.nextInt();
		System.out.println("Enter Parking Amount: ");
		parkingAmout=sc.nextInt();
		System.out.println("Enter Toll amount:");
		tollAmount=sc.nextInt();
	}
	
	public void calculateDailyCost()
	{
		double cost=((totalMilesDriven/avarageMilesPerGallon)*gallonCost)+tollAmount+parkingAmout;
		System.out.println("Daily cost: "+cost);
	}
}
public class CalculateCarCost {
	

	public static void main(String[] args) {
		CalaculateCost c1=new CalaculateCost();
		c1.acceptData();
		c1.calculateDailyCost();
	}

}
