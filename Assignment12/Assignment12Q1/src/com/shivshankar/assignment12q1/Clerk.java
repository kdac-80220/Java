package com.shivshankar.assignment12q1;


public class Clerk implements Emp {
	double salary;
	
	
	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Clerk(double salary) {
		this.salary = salary;
	}


	@Override
	public double getSal() {
		return this.salary;
	}

}
