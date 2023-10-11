package com.shivshankar.assignment4;

public class Orange extends Fruit{

	public Orange() {
		super("Orange");
	}

	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}
	
	@Override
	public void accept() {
		super.accept();
	}
	
	@Override
	public String taste() {
		return "sour";
	}
}
