
public class Patterns3 {
	public static void main(String []args)
	{
		for(int i=1;i<=6;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=6;j++)
			{
				if(j<=i)
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
