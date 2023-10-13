package com.shivshankar.assignment6;

public class DimeterNotNegativeException extends Exception{
	String message;
	DimeterNotNegativeException(String message)
	{
		this.message=message;
	}
	
	public String toString()
	{
		return super.toString()+"Error:404- "+message;
	}
}
