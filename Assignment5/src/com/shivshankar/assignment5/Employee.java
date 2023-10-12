package com.shivshankar.assignment5;

abstract public class Employee {
	String firstName;
	String lastName;
	int SSN;
	
	abstract void acceptData();
	abstract void calculateSalary();
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	
	public String toString()
	{
		return "First Name: "+this.firstName+" Last Name: "+this.lastName+" SSN: "+this.SSN;
	}
}
