package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreoaredStmtDemo {

	public static void main(String[] args) {

		try {

			// Step 1
			Class.forName("com.mysql.jdbc.Driver");

			// Step 2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Tester@123");

			// Step 3
			PreparedStatement pstmt = con
					.prepareStatement("insert into employee(emp_id,first_name,last_name) values(?,?,?)");

			// Step 4
			pstmt.setInt(1, 8768);
			pstmt.setString(2, "Course-1");
			pstmt.setString(3, "Founder-1");

			// Step5 :
			pstmt.execute();

			// Step 4
			pstmt.setInt(1, 8769);
			pstmt.setString(2, "Course-2");
			pstmt.setString(3, "Founder-2");

			// Step5 :
			pstmt.execute();
			// Step 4
			pstmt.setInt(1, 8770);
			pstmt.setString(2, "Course-3");
			pstmt.setString(3, "Founder-3");

			// Step5 :
			pstmt.execute();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
