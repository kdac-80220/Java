package com.shivshankar.assignment6;

public class AcceptString {
	String string;
	AcceptString()
	{
		
	}
	
	AcceptString(String string) throws ExceptionLineTooLong
	{
		if(string.length()>80)
			throw new ExceptionLineTooLong("To Long String");
		this.string=string;
	}
	
	public String toString()
	{
		return "Entered String: "+this.string;
	}

}
