package com.shivshankar.stringarray;

public class StringArray {
	public static void main(String[] args) {
		String s1[]= {"Shiv","Raj","Vinu","Niraj"};
		String s2[]= {"Shankar","Raju","Vinu","Niraj"};
		String s="";
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(s1[i].equals(s2[j]))
				s=s+s1[i]+",";
			}
			
		}
		System.out.println(s);
	}
}
