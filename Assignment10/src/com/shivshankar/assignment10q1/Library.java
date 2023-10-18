package com.shivshankar.assignment10q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;import java.util.Set;

public class Library{
	public static void main(String[] args) {
		int choise=0;
		int deleteIndex;
		int getIndex=0;
		String isbn;
		ArrayList<BookDetails> b=new ArrayList<>();
		BookDetails book;
		for(Object a:b)
			System.out.println(a);
		Scanner sc=new Scanner(System.in);
		class SortByPrice implements Comparator<BookDetails>
		{
			public int compare(BookDetails b1, BookDetails b2) {
				return 0;
			}
		}
		do {
			System.out.println("0.Exit");
			System.out.println("1.Add Book");
			System.out.println("2.Display all books in forward order using random access");
			System.out.println("3.Search a book with given isbn");
			System.out.println("4.Delete a book at given index.");
			System.out.println("5.Delete a book with given isbn");
			System.out.println("6.Reverse the list");
			System.out.println("Enter choise");
			choise=sc.nextInt();
			switch(choise)
			{
				case 1: book=new BookDetails();
						book.acceptData();
						if(b.contains(book))
							{
							getIndex=b.indexOf(book);
							int getQty=book.getQuantity();
							int oldQty=b.get(getIndex).quantity;
							System.out.println(getQty);
							System.out.println(oldQty);
							
							int newQuantity=getQty+oldQty;
							
							b.get(getIndex).setQuantity(b.get(getIndex).getQuantity()+book.getQuantity());
							System.out.println("Books added");
							}
						else {
							b.add(book);
						}	
							
						break;
				case 2:	BookDetails book1=new BookDetails();
						
						for(int i=0;i<b.size();i++)
						{
							book1=b.get(i);
							System.out.println(book1);
						}
						break;
				case 3:	System.out.println("Enter ISBN");
						BookDetails key=new BookDetails();
						key.isbn=sc.next();
						for(int i=0;i<b.size();i++)
						{
							if(b.contains(key))
							{
								getIndex=b.indexOf(i);
								b.get(getIndex);
							}
						}
						
						break;
				case 4: System.out.println("Enter Index");
						int deleteindex=sc.nextInt();
						b.remove(deleteindex);
						break;
				case 5: System.out.println("Enter ISBN");
						BookDetails obj=new BookDetails();
						obj.isbn=sc.next();
						for(int i=0;i<b.size();i++)
						{
							if(b.contains(obj))
							{
								getIndex=b.indexOf(i);
								b.remove(getIndex);
							}
						}
						break;
				case 6:	Collections.reverse(b);
						BookDetails book2=new BookDetails();
						ListIterator<BookDetails> itr=b.listIterator(b.size());
						while(itr.hasPrevious())
						{
							book2=itr.previous();
							System.out.println(book2);
						}
						
						break;
				
				default:System.out.println("Wrong input");;
					break;
			}
		}while(choise!=0);
	}
	
	

}
