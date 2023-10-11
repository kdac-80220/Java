package com.shivshankar.assignment4;

import java.util.Scanner;

public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh=true;
	
	Fruit()
	{
		
	}
	Fruit(String name)
	{
		this.name=name;
	}
	public Fruit(String color, double weight, String name, boolean isFresh) {
		
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	public String taste()
	{
		return "no specific taste";
	}
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter color: ");
		this.color=sc.next();
		System.out.println("Enter Weight: ");
		this.weight=sc.nextDouble();
	}
	
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Weight: "+this.weight);
		System.out.println("Color: "+this.color);
		if(isFresh)
			System.out.println("Fresh");
		else 
			System.out.println("Not Fresh");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	public String toString()
	{
		return "Color:"+this.color+" Name: "+this.name+" Weight: "+this.weight;
	}
}
