package com.shivshankar.assignment4;

public class Apple extends Fruit{

	public Apple() {
		super("Apple");
	}

	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}
	
	@Override
	public void accept() {
		super.accept();
	}
	
	@Override
	public String taste() {
		
		return "Sweet n Sour";
	}
	
	
	
}
