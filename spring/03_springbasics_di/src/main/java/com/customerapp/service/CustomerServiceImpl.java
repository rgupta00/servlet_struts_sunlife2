package com.customerapp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerapp.dao.Customer;
import com.customerapp.dao.CustomerDao;
import com.customerapp.dao.CustomerDaoImplCollection;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao;
	private Logger logger=LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	@Autowired
	public CustomerServiceImpl(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public List<Customer> getAll() {
		//BL
		List<Customer> customers=customerDao.getAll();
		return customers;
	}

	@Override
	public void addCustomer(Customer customer) {
		long start=System.currentTimeMillis();
		customerDao.addCustomer(customer);
		long end=System.currentTimeMillis();
		
		
		logger.info("method take "+ (end-start)+" ms to executed");
	}

}




