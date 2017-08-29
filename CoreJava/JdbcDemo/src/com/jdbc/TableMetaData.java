package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.ResultSetMetaData;

public class TableMetaData {

	public static void main(String[] args) {

		try {

			// Step 1
			Class.forName("com.mysql.jdbc.Driver");

			// Step 2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Tester@123");

			// Step 3
			PreparedStatement pstmt = con
					.prepareStatement("select * from employee");
			
			ResultSet rs =pstmt.executeQuery();
			
			ResultSetMetaData rsm= rs.getMetaData();
			
			int colNo = rsm.getColumnCount();
			
			int x = 1;
			
			while(x<=colNo){
				System.out.println("Column Name:"+rsm.getColumnName(x)+",Data Type:"+rsm.getColumnTypeName(x));
				x++;
			}

		

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
