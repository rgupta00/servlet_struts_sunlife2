package com.customerapp.dao;
import java.util.*;
public interface CustomerDao {
	public List<Customer>getAll();
	public void addCustomer(Customer customer);
}
