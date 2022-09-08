package com.customerapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerapp.dao.Customer;
import com.customerapp.dao.CustomerDao;
import com.customerapp.exceptions.CustomerNotFoundException;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	
	@Override
	public List<Customer> getAll() {
		return customerDao.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return null;
	}

	@Override
	public Customer updateCustomer(int id, Customer customer) {
		return null;
	}

	@Override
	public Customer deleteCustomer(int id) {
		return null;
	}

	@Override
	public Customer getById(int id) {
		return customerDao.findById(id)
				.orElseThrow(()-> new CustomerNotFoundException("customer is not found"));
	}

}
