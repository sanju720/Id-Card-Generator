package com.generator.first;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Process {
	static Scanner sc=new Scanner(System.in);
	static Signin si=new Signin();
	static Idinformation re=new Idinformation();
	static Connection con=Connect.setConnection();
	public static void Signin() {
		System.out.println("Enter Username:");
		String Username=sc.next();
		System.out.println("Enter Contactno:");
		int Contactno=sc.nextInt();
		System.out.println("Enter Email:");
		String Email=sc.next();
	    System.out.println("Enter Password");
	    String Password=sc.next();
	    Signin si = new Signin(Username,Contactno, Email, Password);
	    
	    try
		{
			PreparedStatement pr=con.prepareStatement("insert into Signin(Username,Contact_No,Email,Password)values(?,?,?,?)");
	           pr.setString(1, Username);
	           pr.setString(2, String.valueOf(Contactno));
	          //pr.setInt(3, contact_no);
	           pr.setString(3, Email);
	           pr.setString(4, Password);
	           pr.executeUpdate();
	           System.out.println("signin successful");
	           con.close();
	           }
	    catch (SQLException e) {
	    	e.printStackTrace();
		}
	    
	}
}
