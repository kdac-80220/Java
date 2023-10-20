package com.shivshankar.assignment12q1;

public class SalaryCalculation {

	public static void main(String[] args) {
		Emp employee[]=new Emp[4];
		employee[0]=new Manager(80000,12000);
		employee[1]=new Labour(305,600);
		employee[2]=new Clerk(65000);
		employee[3]=new Manager(75500,12500);
		
		double Tsalary=Emp.calcTotalIncome(employee);
		double Lsaray=employee[1].getSal();
		System.out.println(Lsaray);
		System.out.println(Tsalary);
	}

}
