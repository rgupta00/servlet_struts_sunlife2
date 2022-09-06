package com.customerapp.controller;
import java.util.*;

import com.customerapp.dao.Customer;
import com.customerapp.service.CustomerService;
import com.customerapp.service.CustomerServiceImpl;
public class Main {

	
	public static void main(String[] args) {
		CustomerService customerService=new CustomerServiceImpl();
		//getting all customers
		
//		List<Customer> customers=customerService.getAll();		
//		customers.forEach(c-> System.out.println(c));
		
		//insert operation
//		Customer customer=new Customer("sunita", "delhi", "5754466660", "DER123");
//		customerService.addCustomer(customer);
		
		//update operation
//		
//		Customer customer=new Customer("sunita", "Banglore", "5754466669", "DER123");
//	
//		customerService.updateCustomer(4, customer);
	
		
		//delete operation
		customerService.deleteCustomer(4);
		
	}
}
