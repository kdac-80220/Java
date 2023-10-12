package com.app.vehicles;

import java.util.Scanner;

public class Vehicle {
	 int chasisNo;
	 String color;
	 double price;
	 
	 public void acceptData()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Chasis Number: ");
		 chasisNo=sc.nextInt();
		 System.out.print("Enter Color: ");
		 color=sc.next();
		 System.out.print("Enter Price: ");
		 price=sc.nextDouble();
	 }
	 
	 public String toString()
	 {
		 return "Chasis Number: "+this.chasisNo+" Color: "+this.color+" Price: "+this.price;
	 }
	 
	 public boolean equals(Object obj)
	 {
		 if(obj==this)
			 return true;
		 if(obj==null)
			 return false;
		 if(!(obj instanceof Vehicle))
			 return false;
		 
		Vehicle vehicle=(Vehicle)obj;
		if(this.chasisNo==vehicle.chasisNo)
			return true;
		
		return false;
		 
	 }
	 
}
