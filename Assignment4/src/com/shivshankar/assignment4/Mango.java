package com.shivshankar.assignment4;

public class Mango extends Fruit{

	public Mango() {
		super("Mango");
	}

	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}
	
	@Override
	public void accept()
	{
		super.accept();
	}
	
	@Override
	public String taste() {
		return "Sweet";
	}
}
