package com.shivshankar.assignment6;

public class ExceptionLineTooLong extends Exception{
	String string;
	ExceptionLineTooLong(String string)
	{
		this.string=string; 
	}
	
	public String toString()
	{
		return super.toString()+"ERROR: 405 = Too Long String";
	}
}
