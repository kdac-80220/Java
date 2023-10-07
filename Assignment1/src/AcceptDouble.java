import java.util.*;
public class AcceptDouble {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double num1,num2;
		System.out.println("Enter first doule value:");
	
		num1=sc.nextDouble();
		System.out.println("Enter second doule value:");
		Scanner sc1=new Scanner(System.in);
		num2=sc1.nextDouble();
		if(sc.hasNextDouble() && sc1.hasNextDouble())
		System.out.println("Avarage: "+(num1+num2)/2);
		else
			System.out.println("I can only print avarage of double type values... Please Enter double type values");
		
	}
}
