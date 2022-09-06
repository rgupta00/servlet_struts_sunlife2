package com.demo;

import java.sql.*;

public class UpdateCustomer {

	public static void main(String[] args) {
		try {
			Connection connection=ConnectionFactory.getConnection();
			
			//Statement vs PrepareStatement vs CallableStatement
			//address, phone
			PreparedStatement stmt =
					connection
					.prepareStatement("update customer set address=?, phone=? where id=?");
		
			stmt.setString(1, "chennai");
			stmt.setString(2, "78856500677");
			stmt.setInt(3, 3);
			
			int executeUpdate = stmt.executeUpdate();
			System.out.println(executeUpdate);
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// statement and display all records

	}

}
