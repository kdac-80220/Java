package com.shivshankar.assignment9.q3;

public class Student {
	int rollNo;
	String name;
	String city;
	Double marks;
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
	
	@Override
	public String toString() {
		
		return "Roll Number: "+this.rollNo+" Name: "+this.name+" City: "+this.city+" Marks: "+this.marks;
	}
}
