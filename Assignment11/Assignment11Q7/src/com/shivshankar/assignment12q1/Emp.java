package com.shivshankar.assignment12q1;

public interface Emp {
	
	
	double getSal();
	
	default double calcIncentives() {
		return 0.0;
	}
	
	static double calcTotalIncome(Emp arr[])
	{
		double totalSalary=0;
		for(int i=0;i<arr.length;i++)
		{
			totalSalary=totalSalary+arr[i].getSal()+arr[i].calcIncentives();
		}
		return totalSalary;
	}
}
