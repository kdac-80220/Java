
public class Patterns2 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>=1;k--) 
			{
				if(k>i)
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			
			
			for(int h=4;h>i;h--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
