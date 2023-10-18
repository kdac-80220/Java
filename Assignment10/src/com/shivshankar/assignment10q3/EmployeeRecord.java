package com.shivshankar.assignment10q3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeRecord {

	public static void main(String[] args) {
		LinkedList<Employee> employee=new LinkedList<>();
		Employee e1;
		int choice=0;
		int id;
		int index;
		int sortid;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("0.Exit");
			System.out.println("1.Add Employee");
			System.out.println("2.Delete Employee");
			System.out.println("3.Search Employee");
			System.out.println("4.Sort Employee");
			System.out.println("5.Edit Employee");
			System.out.println("Enter Choice");
			choice=sc.nextInt();
			
			
			switch(choice)
			{
				case 1: e1=new Employee();
					    e1.accept();
					    employee.addLast(e1);
					    System.out.println("Employee Added Successfully");
					break;
				case 2: System.out.println("Enter Employee Id");
						Employee e=new Employee();
						e.empid=sc.nextInt();
						for(int i=0;i<employee.size();i++)
						{
							if(employee.contains(e))
							{
								employee.remove(i);
							}
						}
					break;
				case 3: System.out.println("Enter Employee Index");
						index=sc.nextInt();
						Employee ee=new Employee();
						
						for(int i=0;i<employee.size();i++)
						{
							if(i==index)
							{
								ee=employee.get(i);
								System.out.println(ee);	
							}
						}
					break;
				case 4: System.out.println("1:Ascending /n2:Descending");
						sortid=sc.nextInt();
						class SortAsc implements Comparator<Employee>
						{
							@Override
							public int compare(Employee e1, Employee e2) {
								int diff=e1.empid-e2.empid;
								return diff;
							}
						}
						class SortDesc implements Comparator<Employee>
						{
							@Override
							public int compare(Employee e1, Employee e2) {
								int diff=-(e1.empid-e2.empid);
								return diff;
							}
						}
						if(sortid==1)
						{
							SortAsc asc=new SortAsc();
							employee.sort(asc);
							System.out.println(employee);
						}
						else if(sortid==2)
						{
							SortDesc desc=new SortDesc();
							employee.sort(desc);
							System.out.println(employee);
						}
						else
							System.out.println("Wrong Choice");
					break;
				case 5: System.out.println("Enter emp id to be modified: ");
						int id2 = sc.nextInt();
						Employee key = new Employee();
						key.setEmpid(id2);
						int index1 = employee.indexOf(key);
						if(index1 == -1)
						System.out.println("Employee not found.");
						else {
						Employee oldEmp = employee.get(index1);
						System.out.println("Employee Found: " + oldEmp);
						System.out.println("Enter new information for the Employee");
						Employee newEmp = new Employee();
						newEmp.accept();
						employee.set(index1, newEmp);
						}
					break;
				default:System.out.println("Wrong Input");
					break;
			}
			}while(choice!=0);
	}

}
