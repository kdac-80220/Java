package com.shivshankar.assignment10q2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class FindStringHighestLength {
		
	
	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
	list.add("Shiva");
	int maxlength=0;
	int lengthOfWord;
	String maxWord="";
	Collections.addAll(list, "Shiva","Vinayak","Shambho","Rahul","Kiran");
	String test=list.get(0);
	maxlength=test.length();
	for(int i=0;i<list.size();i++)
	{
		if(maxlength<list.get(i).length())
		{
			maxlength=list.get(i).length();
			maxWord=list.get(i);
		}
	}
	
	
	class FindMax implements Comparator<String>
	{
		@Override
		public int compare(String s1, String s2) {
			int diff=s1.length()- s2.length();
			return diff;
		}
	}
	FindMax fm=new FindMax();
	String m=Collections.max(list,fm);
	System.out.println(m);
}
}
