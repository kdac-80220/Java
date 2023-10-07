package com.app.geometry;
import java.lang.Math;
public class Point2D {
	int x;
	int y;
	String stringxy;
	String result;
	double distance;
	double a,b;
	public Point2D()
	{
		
	}
	public Point2D(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public String getString()
	{
		 return this.stringxy=Integer.toString(x)+","+Integer.toString(y);
	}
	public String getDetails()
	{
		return getString();
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
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public boolean isEqual(Point2D p1,Point2D p2)
	{
		if(p1.x==p2.x && p1.y==p2.y)
		{
			return true;
		}
		return false;
	}
	public double calculateDistance(Point2D p1,Point2D p2)
	{
		a=p2.x-p1.x;
		b=p2.y-p1.y;
		distance=Math.sqrt(Math.pow(a,2)+Math.pow(b, 2));
		return distance;
	}
}
