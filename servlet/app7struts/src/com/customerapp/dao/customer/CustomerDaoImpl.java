package com.customerapp.dao.customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.customerapp.util.ConnectionFactory;

public class CustomerDaoImpl implements CustomerDao {

	private Connection connection;

	public CustomerDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public List<Customer> getAll() {
		List<Customer> customers = new ArrayList<Customer>();
		try {
			Connection connection = ConnectionFactory.getConnection();

			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from customer");
			while (rs.next()) {
				customers.add(
						new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customers;
	}

	@Override
	public void addCustomer(Customer customer) {
		try {
			Connection connection = ConnectionFactory.getConnection();

			// Statement vs PrepareStatement vs CallableStatement

			PreparedStatement stmt = connection
					.prepareStatement("insert into customer(name, address, phone, insuranceno) values(?,?,?,?)");

			stmt.setString(1, customer.getName());
			stmt.setString(2, customer.getAddress());
			stmt.setString(3, customer.getPhone());
			stmt.setString(4, customer.getInsuranceno());
			stmt.executeUpdate();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateCustomer(int id, Customer customer) {
		try {
			Connection connection = ConnectionFactory.getConnection();

			// Statement vs PrepareStatement vs CallableStatement
			// address, phone
			PreparedStatement stmt = connection.prepareStatement("update customer set address=?, phone=? where id=?");

			stmt.setString(1, customer.getAddress());
			stmt.setString(2, customer.getPhone());
			stmt.setInt(3, id);

			stmt.executeUpdate();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// statement and display all records

	}

	@Override
	public void deleteCustomer(int id) {
		try {
			Connection connection = ConnectionFactory.getConnection();

			// Statement vs PrepareStatement vs CallableStatement

			PreparedStatement stmt = connection.prepareStatement("delete from customer where id=?");

			stmt.setInt(1, id);

			stmt.executeUpdate();
	

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Customer getById(int id) {
		Customer customer = null;
		try {
			Connection connection = ConnectionFactory.getConnection();

			PreparedStatement stmt = connection.prepareStatement("select * from customer where id=?");

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				customer = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return customer;
	}

}
