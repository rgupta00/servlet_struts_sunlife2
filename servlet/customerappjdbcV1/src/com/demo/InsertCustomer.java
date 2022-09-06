package com.demo;

import java.sql.*;

public class InsertCustomer {

	public static void main(String[] args) {
		try {
			Connection connection=ConnectionFactory.getConnection();
			
			//Statement vs PrepareStatement vs CallableStatement
			
			PreparedStatement stmt =
					connection
					.prepareStatement("insert into customer(name, address, phone, insuranceno) values(?,?,?,?)");
			
			stmt.setString(1, "umesh");
			stmt.setString(2, "hydrabad");
			stmt.setString(3, "7885655677");
			stmt.setString(4, "MVR456");
			
			int executeUpdate = stmt.executeUpdate();
			System.out.println(executeUpdate);
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// statement and display all records

	}

}
