/**
 * 
 */
package com.shivshankar.assignment10q3;

import java.util.Scanner;

/**
 * @author sunbeam
 *
 */
public class Employee {
	int empid;
	String ename;
	double salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	public Employee(int empid, String ename, double salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter EmpId:");
		this.empid=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Name: ");
		this.ename=sc.nextLine();
		System.out.print("Enter Salary:");
		this.salary=sc.nextDouble();
	}
}
