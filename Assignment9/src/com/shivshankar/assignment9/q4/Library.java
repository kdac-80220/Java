package com.shivshankar.assignment9.q4;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
class BookDetails{
	 String isbn;
	 double price; 
	 String authorName; 
	 int quantity;
	 
	public BookDetails()
	{}
	 
	public BookDetails(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
	public void acceptData() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ISBN");
		this.isbn = s.next();
		System.out.println("Enter Price");
		this.price = s.nextDouble();
		System.out.println("Enter Auther Name");
		this.authorName = s.next();
		System.out.println("Enter Quantity");
		this.quantity =s.nextInt();
	}
	
	@Override
	public String toString() {
		return "ISBN: "+this.isbn+" Price: "+this.price+" Auther Name: "+this.authorName+" Quantity: "+this.quantity;
	} 
}

public class Library{
	public static void main(String[] args) {
		int choise=0;
		int deleteIndex;
		String isbn;
		ArrayList<BookDetails> b=new ArrayList<>();
		
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
			System.out.println("2.Display All Books");
			System.out.println("3.Delete Book at Any Index");
			System.out.println("4.Check Book Available");
			System.out.println("5.Delete All Books");
			System.out.println("6.Total Number of Books");
			System.out.println("7.Sort By Price Desc");
			System.out.println("Enter choise");
			choise=sc.nextInt();
			switch(choise)
			{
				case 1:BookDetails bookdetails=new BookDetails();
						bookdetails.acceptData();
						b.add(bookdetails);
					break;
				case 2:for(Object obj:b)
						System.out.println(obj);
						break;
				case 3:System.out.println("Enter index");
						deleteIndex=sc.nextInt();
						b.remove(deleteIndex-1);
				case 4:System.out.println("Enter ISBN");
						isbn=sc.next();
						if(b.contains(isbn))
							System.out.println("Book :"+b.toString());
						else
							System.out.println("Not available");
						break;
				case 5:b.removeAll(b);
						System.out.println("All record deleted");
						break;
				case 6:System.out.println("Total Books: "+b.size());
						break;
				case 7:b.sort(null);;
						for(Object obj:b)
						System.out.println(obj);
					break;
				default:System.out.println("Wrong input");;
					break;
			}
		}while(choise!=0);
	}
	
	

}
