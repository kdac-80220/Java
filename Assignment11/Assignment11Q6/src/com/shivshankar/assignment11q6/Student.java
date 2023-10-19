package com.shivshankar.assignment11q6;

import java.util.Scanner;

public class Student {
	int rollNo;
	String name;
	String city;
	Double marks;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public Double getMarks() {
		return marks;
	}
	public Student(int rollNo, String name, String city, Double marks) {
	
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	Scanner sc=new Scanner(System.in);
	public void acceptData() {
		System.out.println("Enter Rollno");
		this.rollNo = sc.nextInt();
		System.out.println("Enter Name");
		this.name = sc.next();
		System.out.println("Enter City");
		this.city = sc.next();
		System.out.println("Enter Marks");
		this.marks = sc.nextDouble();
	}
	@Override
	public String toString() {
		
		return "Roll Number: "+this.rollNo+" Name: "+this.name+" City: "+this.city+" Marks: "+this.marks;
	}
}

