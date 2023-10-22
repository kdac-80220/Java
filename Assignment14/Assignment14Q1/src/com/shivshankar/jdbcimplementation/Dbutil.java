package com.shivshankar.jdbcimplementation;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbutil {
	public static final String DB_Driver="com.mysql.cj.jdbc.Driver";
	public static final String DB_URL="jdbc:mysql://localhost:3306/test";
	public static final String DB_USER="kd3_80220_shivshankar";
	public static final String DB_PASSWORD="manager";
	
	static {
		try{
			Class.forName(DB_Driver);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws Exception{
		Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
		return con;
	}
}
