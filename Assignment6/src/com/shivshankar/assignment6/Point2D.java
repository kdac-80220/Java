package com.shivshankar.assignment6;

public class Point2D {
	int x;
	int y;
	
	Point2D()
	{
		this.x=0;
		this.y=0;
	}
	
	Point2D(int x,int y)
	{
		this.x=x;
		this.y=y;
	}

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
	
	public String toString()
	{
		return "X: "+this.x+" Y:"+this.y;
	}
}
