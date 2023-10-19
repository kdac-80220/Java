package com.shivshankar.assignment11q2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class BookDetailsLinkedHashSet {

	public static void main(String[] args) {
		//insertion order maintained
		//hashcode and equals method required
		Set<BookDetails> list=new LinkedHashSet<>();
		list.add(new BookDetails("QWER789",523.06,"ShivajiSavant",5));// add:true
		list.add(new BookDetails("POUY456",365.76,"Yuvraj",6));// add:true
		list.add(new BookDetails("MNBV3652",456.02,"Rajesh",5));// add:true
		list.add(new BookDetails("RFVT6532",654.96,"Kiran",4));// add:true
		list.add(new BookDetails("IOPL4521",758.56,"Kusum",6));// add:true
		list.add(new BookDetails("IOPL4521",758.56,"Kusum",6));// add:false
		//add() returns false value 
		//becoz it add set has unique values
		//if we add first time then add return true					
		list.add(null);
		list.add(null);
		
		System.out.println(list);
		Iterator<BookDetails> itr=list.iterator();
		while(itr.hasNext())
		{
			BookDetails b=itr.next();
			System.out.println(b);
		}
	}

}
