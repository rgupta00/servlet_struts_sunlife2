package com.customerapp.service;

import java.util.List;

import com.customerapp.dao.Customer;

public interface CustomerService {
	public List<Customer> getAll();

	public Customer addCustomer(Customer customer);

	public Customer updateCustomer(int id, Customer customer);

	public Customer deleteCustomer(int id);

	public Customer getById(int name);

}
