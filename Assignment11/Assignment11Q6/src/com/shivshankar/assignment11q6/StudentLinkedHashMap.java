package com.shivshankar.assignment11q6;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;


public class StudentLinkedHashMap {

	public static void main(String[] args) {
		Map<Integer,Student> student=new LinkedHashMap<>();
		
		int choice=0;
		Student s;
		int rollno;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("----*---***---*----");
			System.out.println("0.EXIT");
			System.out.println("1.ADD STUDENT");
			System.out.println("2.SEARCH STUDENT");
			System.out.println("3.DISPLAY STUDENT");
			System.out.println("4.DISPLAY ROLLNUMBER");
			System.out.println("5.DISPLAY ROLLNO-INFO");
			System.out.println("----*---***---*----");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: s=new Student();
					s.acceptData();
					student.put(s.getRollNo(), s);
				break;
			case 2: System.out.println("Enter Roll number: ");
					rollno=sc.nextInt();
					System.out.println(student.get(rollno)); 
				break;
			case 3: Collection <Student>val=student.values();
					Iterator<Student> x=val.iterator();
					while(x.hasNext())
					{
						Student temp=x.next();
						System.out.println(temp);
					}
						
				break;
			case 4: Set<Integer> key=student.keySet();
					for(Integer i:key)
					{
						System.out.println(i);
					}
				break;
			case 5: Set<Entry<Integer,Student>>entries=student.entrySet();
					System.out.println(entries);
				break;
			default:System.out.println("Wrong Input");
				break;
			}
		}while(choice!=0);
		
	}

}
