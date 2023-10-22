package com.shivshankar.jdbcimplementation;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int choice=0;
		do {
			System.out.println("0.Exit");
			System.out.println("1.Add user");
			System.out.println("2.Show users");
			System.out.println("3.Delete user");
			System.out.println("4.Show specific user user");
			System.out.println("5.Update specific user user");
			System.out.println("Enter choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:	User u=new User();
					u.accept();
					try(UserDao ud=new UserDao())
					{
						int cnt=ud.addUser(u);
						System.out.println("Row Added: "+cnt);
					}catch(Exception e)
					{
							e.printStackTrace();
					}
				break;
			case 2: try(UserDao ud=new UserDao())
					{
						int cnt=ud.readUser();
						System.out.println("Row Selected: "+cnt);
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				break;
			case 3:	try(UserDao dou=new UserDao())
					{
						System.out.println("Enter the id you want to delete");
						int id=sc.nextInt();
						int cnt=dou.deleteUser(id);
						System.out.println("One record deleted");
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				break;
			case 4: try(UserDao dou=new UserDao())
					{
						int cnt=0;
						System.out.println("Enter id to see Details:");
						int id=sc.nextInt();
						cnt=dou.showUser(id);
						System.out.println("Rows Selected: "+cnt);
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				break;
			case 5: try(UserDao dao=new UserDao())
					{
						System.out.println("Enter id: ");
						int id=sc.nextInt();
						System.out.println("Enter First Name: ");
						String fname=sc.next();
						System.out.println("Enter Last Name: ");
						String lname=sc.next();
						System.out.println("Enter Password: ");
						String password=sc.next();
						int cnt=dao.updateUser(id, fname, lname, password);
						System.out.println("Row Updated: "+cnt);
						
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				break;
			default:System.out.println("Wrong input");
				break;
			}
		}while(choice!=0);
		
		
		
		
		
		
		
		
				
	}

}
