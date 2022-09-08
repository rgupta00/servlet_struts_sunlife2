package com.customerapp.service;

import java.util.List;

import com.customerapp.dao.Customer;

public interface CustomerService {
	public List<Customer>getAll();

	public void addCustomer(Customer customer);
}
