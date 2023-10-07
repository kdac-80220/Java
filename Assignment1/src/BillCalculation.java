import java.util.*;
import java.util.Scanner;
public class BillCalculation {
	
	static int menu()
	{
		Scanner sc1=new Scanner(System.in);
		int choise;
		System.out.println("0.Exit");
		System.out.println("1.Dosa");
		System.out.println("2.Idli");
		System.out.println("3.Samosa");
		System.out.println("4.Vadapav");
		System.out.println("5.Calculate Bill");
		choise=sc1.nextInt();
		return choise;
	}
	public static void main(String[] args) {
		int choise;
		Scanner sc=new Scanner(System.in);
		int q1,q2,q3,q4;
		int p1=30,p2=25,p3=15,p4=10;
		int totalbill=0;
		
		while((choise=menu())!=0)
		{
			switch (choise) 
			{
			case 1:System.out.println("Enter Quantity of Dosa: ");
					q1=sc.nextInt();
					System.out.println("Dosa Quantity: "+q1+"*"+p1+"Bill: "+(q1*p1));
					totalbill=totalbill+(q1*p1);
					
					
				break;
			case 2:System.out.println("Enter Quantity of Idli: ");
					q2=sc.nextInt();
					System.out.println("Idli Quantity: "+q2+ "*"+p2+ " Bill: "+q2*p2);
					totalbill=totalbill+(q2*p2);
				break;
			case 3:System.out.println("Enter Quantity of Samosa: ");
					q3=sc.nextInt();
					System.out.println("Samosa Quantity: "+q3+ "*"+p3+ "Bill: "+q3*p3);
					totalbill=totalbill+(q3*p3);
				break;
			case 4:System.out.println("Enter Quantity of Vadapav: ");
					q4=sc.nextInt();
					System.out.println("Vadapav Quantity: "+q4+ "*"+p4+ "Bill: "+q4*p4);
					totalbill=totalbill+(q4*p4);
				break;
			case 5:System.out.println("Total Bill: "+totalbill);
				break;

			default:System.out.println("Wrong Choise...");
				break;
			}
		}
		
	}
}
