package com.shivshankar.assignment10q1;

import java.util.Scanner;


class BookDetails{
	 String isbn;
	 double price; 
	 String authorName; 
	 int quantity;
	 
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

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
	
	public String getIsbn() {
		return isbn;
	}

	public double getPrice() {
		return price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public int getQuantity() {
		return quantity;
	}
	public boolean equals(Object obj)
	{
		BookDetails other=(BookDetails)obj;
		if(this==other)
			return true;
		if(this==null)
			return false;
		if(this.isbn.equals(other.isbn))
			return true;
		return false;
	}
	@Override
	public String toString() {
		return "ISBN: "+this.isbn+" Price: "+this.price+" Auther Name: "+this.authorName+" Quantity: "+this.quantity;
	} 
}

