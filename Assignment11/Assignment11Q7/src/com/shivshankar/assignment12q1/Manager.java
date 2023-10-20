package com.shivshankar.assignment12q1;

public class Manager implements Emp{
		double basicSalary;
		double dearanceAllowance;
		
		public double getBasicSalary() {
			return basicSalary;
		}

		public void setBasicSalary(double basicSalary) {
			this.basicSalary = basicSalary;
		}

		public double getDearanceAllowance() {
			return dearanceAllowance;
		}

		public void setDearanceAllowance(double dearanceAllowance) {
			this.dearanceAllowance = dearanceAllowance;
		}
		
		public Manager() {}
		
		public Manager(double basicSalary, double dearanceAllowance) {
			this.basicSalary = basicSalary;
			this.dearanceAllowance = dearanceAllowance;
		}
		
		@Override
		public double calcIncentives() {
			return this.basicSalary*0.20;
		}
		@Override
		public double getSal() {
			return basicSalary + dearanceAllowance;
		}
		
		
}
