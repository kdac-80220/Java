package com.shivshankar.assignment11q1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BookDetailsTest {

	public static void main(String[] args) {
		Set <BookDetails> list= new HashSet<>();
		list.add(new BookDetails("ABC123",600.20,"Shiva",2));
		list.add(new BookDetails("LMN326",980.20,"Baburao",3));
		list.add(new BookDetails("PQR123",350.20,"Shyam",4));
		list.add(new BookDetails("HIJ362",652.20,"Raju",5));
		list.add(new BookDetails("ABC123",180.20,"Munna",1));
		
		for(BookDetails b:list)
			System.out.println(b);
		
		Iterator <BookDetails> itr=list.iterator();
		while(itr.hasNext())
		{
			BookDetails b=itr.next();
			System.out.println(b);
		}
			
		//System.out.println(list);
	}

}
