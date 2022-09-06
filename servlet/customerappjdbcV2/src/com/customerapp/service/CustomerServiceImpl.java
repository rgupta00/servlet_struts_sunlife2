package com.customerapp.service;

import java.util.List;

import com.customerapp.dao.Customer;
import com.customerapp.dao.CustomerDao;
import com.customerapp.dao.CustomerDaoImpl;
import com.customerapp.exccptions.CustomerNotFoundExcepetion;

public class CustomerServiceImpl implements CustomerService{

	private CustomerDao customerDao;
	
	
	public CustomerServiceImpl() {
		this.customerDao = new  CustomerDaoImpl();;
	}

	@Override
	public List<Customer> getAll() {
		return customerDao.getAll();
	}

	@Override
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

	@Override
	public void updateCustomer(int id, Customer customer) {
		customerDao.updateCustomer(id, customer);
	}

	@Override
	public void deleteCustomer(int id) {
		customerDao.deleteCustomer(id);
	}

	@Override
	public Customer getById(int id) {
		Customer customer=customerDao.getById(id);
		if(customer==null)
			throw new CustomerNotFoundExcepetion("customer is not found");
		return customer;
	}

}
