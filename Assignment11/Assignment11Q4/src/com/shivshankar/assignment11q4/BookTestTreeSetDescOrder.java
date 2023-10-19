package com.shivshankar.assignment11q4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class BookTestTreeSetDescOrder {

	public static void main(String[] args) {
		TreeSet <BookDetails> list=new TreeSet<>();
		list.add(new BookDetails("QWER7892",523.06,"ShivajiSavant",5));
		list.add(new BookDetails("PERS3656",895.06,"Raju",1));
		list.add(new BookDetails("PERS3656",895.06,"Rajesh",2));
		list.add(new BookDetails("SQTA3652",456.06,"Krishna",6));
		list.add(new BookDetails("RASG5623",456.06,"Vishal",5));
		list.add(new BookDetails("QRUS5412",456.06,"KumarVishwas",2));
		
		class DescendingOrderOfTreeSet implements Comparator<BookDetails>
		{
			public int compare(BookDetails b1,BookDetails b2)
			{
				int diff=-Double.compare(b1.price, b2.price);
				return diff;
			}
		}
		
		DescendingOrderOfTreeSet desc=new DescendingOrderOfTreeSet();
		
		Set <BookDetails> list1=new TreeSet<>(desc);
		list1.add(new BookDetails("QWER7892",523.06,"ShivajiSavant",5));
		list1.add(new BookDetails("PERS3656",895.06,"Raju",1));
		list1.add(new BookDetails("PERS3656",895.06,"Rajesh",2));
		list1.add(new BookDetails("SQTA3652",456.06,"Krishna",6));
		list1.add(new BookDetails("RASG5623",456.06,"Vishal",5));
		list1.add(new BookDetails("QRUS5412",446.06,"KumarVishwas",2));

		Iterator<BookDetails> itr=list.iterator();
		while(itr.hasNext())
		{
			BookDetails b=itr.next();
			System.out.println(b);
		}
		System.out.println("------------Using Comparator");
		Iterator<BookDetails> itr1=list1.iterator();
		while(itr1.hasNext())
		{
			BookDetails b=itr1.next();
			System.out.println(b);
		}
		
		Iterator <BookDetails> reverseitr=list.descendingIterator();
		while(reverseitr.hasNext())
		{
			BookDetails d=reverseitr.next();
			System.out.println(d);
		}
			
		
		
	}

}
