package com.shivshankar.assignment13q3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class StoreText {
	public static void writeFile()
	{
		Scanner sc=new Scanner(System.in);
		
		try(FileWriter fwr=new FileWriter("Opinion.txt"))
		{
			try(BufferedWriter bwr=new BufferedWriter(fwr))
			{
				for(int i=0;i<4;i++)
				{
					System.out.println("Enter line:");
					String line=sc.nextLine();
					bwr.write(line);
					bwr.newLine();
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		/*try(FileOutputStream fout=new FileOutputStream("Shayari.txt"))
		{
			try(BufferedOutputStream bout=new BufferedOutputStream(fout))
			{
				try(DataOutputStream dout=new DataOutputStream(bout))
				{
					System.out.println("Enter four lines");
					for(int i=0;i<4;i++)
					{
						String line=sc.nextLine();
						dout.writeUTF(line);
					}
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
	}
	
	public static void readFile()
	{
		try(FileReader fwr=new FileReader("Opinion.txt"))
		{
			try(BufferedReader bwr=new BufferedReader(fwr))
			{
				String line;
				while((line=bwr.readLine())!=null)
				{
					System.out.println(line);
					
				}
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		/*try(FileInputStream fout=new FileInputStream("Shayari.txt"))
		{
			try(BufferedInputStream bin=new BufferedInputStream(fout))
			{
				try(DataInputStream din=new DataInputStream(bin))
				{
					//require object to store
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
	}
	public static void main(String[] args) {
		writeFile();
		//readFile();
	}

}
