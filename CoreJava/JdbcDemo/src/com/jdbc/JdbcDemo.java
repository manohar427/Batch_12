package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcDemo {

	public static void main(String[] args) {

		try {
			
			//Step 1
			Class.forName("com.mysql.jdbc.Driver");
			
			//Step 2
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "Tester@123");
			 
			 //Step 3
			 Statement stmt = con.createStatement();
			 
			 //Step 4
			 ResultSet rs = stmt.executeQuery("select emp_id,first_name,last_name from employee");
			 
			 //Step5 : 
			 
			 while(rs.next()){
				 System.out.print("EMP_ID:"+rs.getString("emp_id"));
				 System.out.print(" First_Name:"+rs.getString("first_name"));
				 System.out.print(" Last_Name:"+rs.getString("last_name"));
				 System.out.println();
			 }
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
