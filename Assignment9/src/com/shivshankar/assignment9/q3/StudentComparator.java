package com.shivshankar.assignment9.q3;

import java.util.Arrays;
import java.util.Comparator;

public class StudentComparator {

	public static void main(String[] args) {
		Student s[]=new Student[5];
		
		s[0]=new Student(81,"Shivshankar","Kolhapur",96.08);
		s[1]=new Student(51,"Juber","Ganeshwadi",90.30);
		s[2]=new Student(85,"Sumeru","Ichalkaranji",86.30);
		s[3]=new Student(71,"Vikas","Rajarampuri",58.08);
		s[4]=new Student(69,"Vrushabh","Kolhapur",99.08);
		
		class StudentCompare implements Comparator<Student>{
			@Override
			public int compare(Student s1, Student s2) {
				int diff=-s1.getCity().compareTo(s2.getCity());   //city desc hense "-" is used
				if(diff==0)
				  diff=-Double.compare(s1.marks, s2.marks);  //s1.getMarks().compareTo(s2.getMarks())
				if(diff==0)
					diff=s1.getName().compareTo(s2.getName());
				return diff;
			}
		}
		
		StudentCompare comparator=new StudentCompare();
		
		
		Arrays.sort(s,comparator);
		for(Student s1:s)
			System.out.println(s1);
	}

}
