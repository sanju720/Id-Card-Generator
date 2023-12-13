package com.generator.first;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	static Connection con;
	public static Connection setConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","vaishu@123");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
		
}
