package com.shivshankar.jdbcimplementation;

public class UserMain {

	public static void main(String[] args) {
		User u=new User();
		u.accept();
		try(UserDao ud=new UserDao())
		{
			int cnt=ud.addUser(u);
			System.out.println("Row Added: "+cnt);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try(UserDao ud=new UserDao())
		{
			int cnt=ud.readUser();
			System.out.println("Row Selected: "+cnt);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
