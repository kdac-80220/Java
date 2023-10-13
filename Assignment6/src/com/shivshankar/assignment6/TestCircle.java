package com.shivshankar.assignment6;

import java.util.Scanner;

public class TestCircle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		int y;
		double diameter;
		System.out.println("Enter value for x");
		x=sc.nextInt();
		System.out.println("Enter value for y");
		y=sc.nextInt();
		
		System.out.println("Enter value for Diameter");
		diameter=sc.nextDouble();
		try {
			Circle Point2D=new Circle(x,y,diameter);
			System.out.println(Point2D);
		}
		catch(DimeterNotNegativeException e)
		{
			e.printStackTrace();
		}
		
	}
}
