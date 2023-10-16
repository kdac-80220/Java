package com.shivshankar.assignment8;
import java.util.*;

class Employee extends Person
{
private int Empid;
private double Salary;

public Employee()
{

}
public Employee(int Empid,double Salary,String Name)
{
super(Name);
this.Empid=Empid;
this.Salary=Salary;
}

public int getEmpid() {
return Empid;
}

public void setEmpid(int empid) {
Empid = empid;
}

public double getSalary() {
return Salary;
}

public void setSalary(double salary) {
Salary = salary;
}

public void acceptEmployee()
{
this.accpet();
System.out.println("Enter Employee Id = ");
Empid = sc.nextInt();
System.out.println("Enter Salary = ");
Salary = sc.nextDouble();
}

public void displayEmployee()
{
this.displayPerson();
System.out.println("Empid = "+this.Empid);
System.out.println("Salary = "+this.Salary);
}

	@Override
		public double calculateSalary() {
			// TODO Auto-generated method stub
			return this.Salary*12;
		}
}


