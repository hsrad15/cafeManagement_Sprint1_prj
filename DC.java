package com.cafe.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DC {
	static Connection conn;
	public static Connection getDC() throws ClassNotFoundException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/miniproject","root","MySQL@123");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return conn;

	}
	
}
