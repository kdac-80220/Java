package com.shivshankar.assignment11q5;

import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class BookDetailsHashMap {

	public static void main(String[] args) {
		//we are passing value as String type(Primitive type) for key so we don't Required any hashMap or equals method
		//do not require any comparable method
		Map<String,BookDetails> map=new HashMap<>();
		BookDetails b;
		String isbn="";
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("----*---***---*----");
			System.out.println("0.EXIT");
			System.out.println("1.ADD BOOK");
			System.out.println("2.SEARCH");
			System.out.println("3.DISPLAY VALUES");
			System.out.println("4.DISPLAY KEYS");
			System.out.println("5.DISPLAY KEY-VALUES");
			System.out.println("----*---***---*----");
			choice=sc.nextInt();
			
			
			switch(choice)
			{
			case 1: b=new BookDetails();
					b.acceptData();
					map.put(b.getIsbn(), b);
				break;
			case 2: System.out.println("Enter ISBN: ");
					isbn=sc.next();
					System.out.println(map.get(isbn)); 
				break;
			case 3: Collection <BookDetails> value=map.values();
					System.out.println(value);
				break;
			case 4: Set <String> key=map.keySet();
					System.out.println(key);
					break;
			case 5: Set<Entry<String,BookDetails>>entries=map.entrySet();
					System.out.println(entries);
					break;
			default:System.out.println("Wrong Input");
			}
		}while(choice!=0);
		
	}

}
