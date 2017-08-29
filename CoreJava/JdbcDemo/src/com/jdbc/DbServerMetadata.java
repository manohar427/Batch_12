package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import java.sql.DatabaseMetaData;

public class DbServerMetadata {

	public static void main(String[] args) {

		try {

			// Step 1
			Class.forName("com.mysql.jdbc.Driver");

			// Step 2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Tester@123");

			DatabaseMetaData dm = con.getMetaData();

			System.out.println("Driver Name:" + dm.getDriverName());
			System.out.println("Driver Version:" + dm.getDriverVersion());
			System.out.println("Driver Version:" + dm.getDatabaseMajorVersion());
			String input[] = { "TABLE" };
			ResultSet rs = dm.getTables(null, null, null, input);
			while (rs.next()) {
				System.out.println(rs.getString(3));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
