package com.shivshankar.assignment6;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		String s;
		try (Scanner sc=new Scanner(System.in)){
			System.out.println("Enter String");
			s=sc.next();
			AcceptString a=new AcceptString(s);
			System.out.println(s);
		}
		catch(ExceptionLineTooLong e)
		{
			e.printStackTrace();
		}
		System.out.println("ThankYou");
		
	}

}
