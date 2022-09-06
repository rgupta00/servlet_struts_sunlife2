package com.customerapp.dao.customer;

import java.util.*;

public interface CustomerDao {

	public List<Customer> getAll();

	public void addCustomer(Customer customer);

	public void updateCustomer(int id, Customer customer);

	public void deleteCustomer(int id);

	public Customer getById(int id);

}
