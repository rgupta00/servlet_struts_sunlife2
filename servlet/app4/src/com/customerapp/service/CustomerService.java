package com.customerapp.service;

import java.util.List;

import com.customerapp.dao.customer.Customer;

public interface CustomerService {

	public List<Customer> getAll();
	public void addCustomer(Customer customer);
	public void updateCustomer(int id, Customer customer);
	public void deleteCustomer(int id);
	public Customer getById(int id);
}
