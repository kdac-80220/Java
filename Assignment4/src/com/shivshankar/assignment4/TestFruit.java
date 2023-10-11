package com.shivshankar.assignment4;
import static java.lang.System.*;

import java.util.Scanner;
public class TestFruit {

	static int menu()
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		out.println("0.Exit");
		out.println("1.Add Mango");
		out.println("2.Add Apple");
		out.println("3.Add Orange");
		out.println("4.Show fruits in basket");
		out.println("5.Details of fruits");
		out.println("6.tastes of all stale(not fresh) fruits");
		out.println("7.Mark fruit as Stale");
		out.println("8.Mark fruit as Stale whose taste are sour");
		out.println("Enter choice");
		choice=sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		int count=0;
		int size;
		int index;
		String tasteoffruit="sour";
		out.println("Enter number of fruits you want");
		size=sc.nextInt();
		Fruit fruit[]=new Fruit[size];
		while((choice=menu())!=0)
		{
			switch(choice)
			{
				case 1:if(count<size)
					   {
						fruit[count]=new Mango();
						fruit[count].accept();
						count++;
						out.println("Mango added...!");
					   }
					break;
				case 2:if(count<size)
					   {
						fruit[count]=new Apple();
						fruit[count].accept();
						count++;
						out.println("Apple added...!");
					   }
					break;
				case 3:if(count<size)
					   {
						fruit[count]=new Orange();
						fruit[count].accept();
						count++;
						out.println("Orange added...!");
					   }
					break;
				case 4:for(Fruit f:fruit)
						if(f!=null)
						out.print(f.getName()+",");
					break;
				case 5:for(Fruit f:fruit)
						if(f!=null)
						out.println(f);
					break;
				case 6:for(Fruit f:fruit)
						if(f!=null)
						{
							if(!f.isFresh())
							{
								if(f!=null)
								out.println("Test of "+f.getName()+":"+f.taste()+": Not fresh");
							}
						}
					break;
				case 7:out.println("Enter index");
						index=sc.nextInt();
						if(index<size)
						{
						fruit[index].setFresh(false);
						out.println("Fruit marked as stale");
						}
						else {
							out.println("Error!!! Invalid Index");
						}
					break;
				case 8:for(Fruit f:fruit)
						if(f.taste().equals(tasteoffruit))
						{
							f.setFresh(false);
						}
						out.println("sour tase fruit marked stale");
					break;
				default:out.println("Wrong Input...");
					break;
			}
		}
	}

}
