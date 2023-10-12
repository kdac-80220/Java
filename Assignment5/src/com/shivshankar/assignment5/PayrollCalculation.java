package com.shivshankar.assignment5;

public class PayrollCalculation {

	public static void main(String[] args) {
		Employee employee=new SaliriedEmployee();
		employee.acceptData();
		System.out.println(employee);
		employee.calculateSalary();
		
		employee=new HourlyEmployee();
		employee.acceptData();
		System.out.println(employee);
		employee.calculateSalary();
		
		employee=new commissionEmployee();
		employee.acceptData();
		System.out.println(employee);
		employee.calculateSalary();
		
		employee=new BasePlusCommissionEmployye();
		employee.acceptData();
		System.out.println(employee);
		employee.calculateSalary();
	}

}
