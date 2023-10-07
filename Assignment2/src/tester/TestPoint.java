package tester;
import java.util.Scanner;

import com.app.geometry.*;
public class TestPoint {
	public static void main(String[] args) {
		int x1,y1,x2,y2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Values for x1 & y1");
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.println("Enter Values for x2 & y2");
		x2=sc.nextInt();
		y2=sc.nextInt();
		
		Point2D p1=new Point2D(x1,y1);
		Point2D p2=new Point2D(x2,y2);
		System.out.println("x1:"+p1.getX()+" y1:"+p1.getY());
		System.out.println("x2:"+p2.getX()+" y2:"+p2.getY());
		System.out.println(p1.getString());
		System.out.println(p2.getString());
		boolean check=p1.isEqual(p1, p2);
		if(check)
		{
			System.out.println("Both are at same point");
			System.out.println("X: "+p1.getX());
			System.out.println("X: "+p1.getY());
		}
		else {
			System.out.println("Distance between Co-ordinnates: "+p1.calculateDistance(p1, p2)); 
		}
	}
}
