package com.shivshankar.assignment8;

import java.util.Scanner;
abstract class Person
{
private String Name;
Scanner sc = new Scanner(System.in);
public Person()
{
this.Name = "";
}
public Person(String Name)
{
this.Name = Name;
}
void setName(String name)
{
this.Name = name;
}
String getName()
{
System.out.println("Enter Name = ");
this.Name = sc.nextLine();
return this.Name;
}
public void accpet()
{
System.out.println("Enter Name = ");
this.Name = sc.next();
}
public void displayPerson()
{
System.out.println("Name = "+this.Name);
}

public String toString()
{
	return "Name: "+this.Name;
}

abstract public double calculateSalary();
}

