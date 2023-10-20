package com.shivshankar.assignment12q3;

import java.util.Comparator;
import java.util.Scanner;

public class Calculator{

	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
		
		}
	public static void main(String[] args) {
//		class addition implements Comparator<Double>
//		{
//			@Override
//			public int compare(Double arg0, Double arg1) {
//				return arg0+arg1;			}
//		}
		Scanner sc=new Scanner(System.in);
		double num1,num2,result;
		int choice=0;
		do {
			System.out.println("++++++++++++++++++++++++");
			System.out.println("0.Exit");
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("Enter choice");
			choice=sc.nextInt();
			System.out.println("++++++++++++++++++++++++");
			
			switch(choice)
			{
			case 1: System.out.println("Enter 1st number");
					num1=sc.nextDouble();
				    System.out.println("Enter 2st number");
				    num2=sc.nextDouble();
				    calculate(num1,num2,(a,b)-> a+b);
				break;
			case 2: System.out.println("Enter 1st number");
					num1=sc.nextDouble();
					System.out.println("Enter 2st number");
					num2=sc.nextDouble();
					calculate(num1,num2,(x,y)-> x-y);
				break;
			case 3: System.out.println("Enter 1st number");
					num1=sc.nextDouble();
					System.out.println("Enter 2st number");
					num2=sc.nextDouble();
					calculate(num1,num2,(a,b)->a*b);
				break;
			case 4: System.out.println("Enter 1st number");
					num1=sc.nextDouble();
					System.out.println("Enter 2st number");
					num2=sc.nextDouble();
					calculate(num1,num2,(a,b)->a/b);
				break;
			default:System.out.println("Wrong Input");
				break;
			}
		}while(choice!=0);
		
		
	}
	
	
	

}
