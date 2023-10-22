package com.shivshankar.jdbcimplementation;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class UserDao implements AutoCloseable{
	private Connection con;
	public UserDao() throws Exception{
		con=Dbutil.getConnection();
	}
	
	public void close()
	{
		try {
			if(con!=null)
				con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	public int addUser(User u)
	{
		int cnt=0;
		String sql="insert into users values (default,?,?,?,?,?,false,?)";
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			pstmt.setString(1, u.getFirstName());
			pstmt.setString(2, u.getLastName());
			pstmt.setString(3, u.getEmail());
			pstmt.setString(4, u.getPassword());
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date uDate=sdf.parse(u.getDob());
			java.sql.Date sDate=new java.sql.Date(uDate.getTime());
			pstmt.setDate(5, sDate);
			pstmt.setString(6, u.getRole());
			pstmt.executeUpdate();
			cnt++;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return cnt;
	}
	
	public int readUser()
	{
		int cnt=0;
		String sql="Select *from users";
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				int id=rs.getInt("id");
				String fname=rs.getString("first_name");
				String lname=rs.getString("last_name");
				String email=rs.getString("email");
				String password=rs.getString("password");
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
				java.util.Date uDate=rs.getDate("dob");
				String date=sdf.format(uDate);
				boolean status=rs.getBoolean("status");
				String role=rs.getString("role");
				cnt++;
				System.out.println("Id: "+id+" Fname: "+fname+" Lname: "+lname+" Email:"+email+ "Password: "+password+"Date: "+date+" Status: "+status+" Roll: "+role);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return cnt;
	}
	
	public int deleteUser(int id)
	{
		int cnt=0;
		return cnt;
	}
	
}
