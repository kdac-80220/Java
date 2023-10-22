package com.shivshankar.jdbcimplementation;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbutil {
	public static final String DB_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String DB_URL="jdbc:mysql://localhost:3306/test";
	public static final String USERNAME="kd3_80220_shivshankar";
	public static final String PASSWORD="manager";
	
	static {
		try {
			Class.forName(DB_DRIVER);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws Exception{
		Connection con=DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
		return con;
	}
}
