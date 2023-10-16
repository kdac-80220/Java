package com.shivshankar.assignment8q2;

import java.util.Scanner;

public class Person implements Displayable{
	int pid;
	String name;
	Scanner sc=new Scanner(System.in);

	
	public void acceptData() {
		System.out.println("Enter pid:");
		pid=sc.nextInt();
		System.out.println("Enter Name:");
		name=sc.next();
	}
	@Override
	public void displayData() {
		System.out.println("Name: "+this.name);
		System.out.println("Pid: "+this.pid);
	}
	
	@Override
	public String toString()
	{
		return "Name: "+this.name+" PId: "+this.pid;
	}
}
