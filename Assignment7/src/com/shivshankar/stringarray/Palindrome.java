package com.shivshankar.stringarray;

public class Palindrome {

	public static void main(String[] args) {
		String name="nayan";
		String rstring="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rstring=rstring+name.charAt(i);
		}
		
		if(name.equals(rstring))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
