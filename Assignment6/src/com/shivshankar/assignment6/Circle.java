package com.shivshankar.assignment6;

public class Circle {
	int x;
	int y;
	double diameter;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Circle()
	{
		this.x = 0;
		this.y = 0;
		this.diameter=100;
	}
	public Circle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Circle(double d) throws DimeterNotNegativeException
	{
		if(d<0)
			throw new DimeterNotNegativeException("Diameter Can't Be Negative");
		this.diameter=d;
	}
	public Circle(int x, int y, double d) throws DimeterNotNegativeException{
		this.x = x;
		this.y = y;
		if(d<0)
			throw new DimeterNotNegativeException("Diameter Can't Be Negative");
		this.diameter=d;
	}
	
	public String toString()
	{
		return "X: "+this.x+" Y: "+this.y+" Diameter: "+this.diameter;
	}
	
}
