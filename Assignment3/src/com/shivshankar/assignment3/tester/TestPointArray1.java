package com.shivshankar.assignment3.tester;
import com.shivshankar.assignment3.*;
import java.util.Scanner;

public class TestPointArray1 {
	
	static int menu()
	{
		Scanner s=new Scanner(System.in);
		int choise;
		System.out.println("1.Details of a specific point");
		System.out.println("2.x, y co-ordinates of all points");
		System.out.println("3.validate the indices");
		System.out.println("4.Exit");
		choise=s.nextInt();
		return choise;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;
		int choise;
		int x=0,y=0;
		System.out.println("Enter how many plots you want to plot:");
		size=sc.nextInt();
		
		Point2D arr[]=new Point2D[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=new Point2D();
			arr[i].acceptPoints();
		}
		
		while((choise=menu())!=0)
		{
			switch(choise)
			{
				case 1:System.out.println("Enter point");
						int p=sc.nextInt();
						for(int i=0;i<size;i++)
						{
							if(i==p)
								arr[i].displayPoints();
							else
								System.out.println("Not found");
						}
						break;
				case 2:for(int i=0;i<size;i++)
						{
							arr[i].displayPoints();
			
						}
						break;
				case 3:System.out.println("Enter index 1:");
						x=sc.nextInt();
					   System.out.println("Enter index 2:");
					   y=sc.nextInt();
					   break;
					   
				default: System.out.println("Wrong choise...");
				  		break;
			}
		}
		
	}

}






//logic for int value store
//for(int i=0;i<size;i++)
//{
//	System.out.println("Enter element:");
//	ar[i]=sc.nextInt();
//}
//for(int i=0;i<size;i++)
//{
//	System.out.println("element:"+ar[i]);
//}



//logic using constructor
//System.out.println("Enter x: ");
//x=sc.nextInt();
//System.out.println("Enter y: ");
//y=sc.nextInt();
//arr[i]=new Point2D(x,y);

//printing x,y using getter 
//System.out.print("x: "+arr[i].getX());
//System.out.print("y: "+arr[i].getY());