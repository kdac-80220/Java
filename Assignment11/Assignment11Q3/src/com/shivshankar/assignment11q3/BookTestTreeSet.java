package com.shivshankar.assignment11q3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BookTestTreeSet {

	public static void main(String[] args) {
		Set<BookDetails> list=new TreeSet<>();
		//it only require Comparable and compareTo() method override
		list.add(new BookDetails("QWER7892",523.06,"ShivajiSavant",5));
		list.add(new BookDetails("PERS3656",895.06,"Raju",1));
		list.add(new BookDetails("PERS3656",895.06,"Rajesh",2));
		list.add(new BookDetails("SQTA3652",456.06,"Krishna",6));
		list.add(new BookDetails("RASG5623",456.06,"Vishal",5));
		list.add(new BookDetails("QRUS5412",456.06,"KumarVishwas",2));
		//list.add(null);  //not allowed null
		Iterator<BookDetails> itr=list.iterator();
		while(itr.hasNext())
		{
			BookDetails b=itr.next();
			System.out.println(b);
		}
		//System.out.println(list);
	}

}
