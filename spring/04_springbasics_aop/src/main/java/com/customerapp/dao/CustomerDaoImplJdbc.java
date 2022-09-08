package com.customerapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Profile(value = "test")
@Repository
//@Primary
public class CustomerDaoImplJdbc implements CustomerDao{
	@Override
	public List<Customer> getAll() {
		System.out.println("using jdbc...");
		List<Customer> customers=new ArrayList<Customer>();
		customers.add(new Customer(1, "raj", "delhi", "77557566"));
		customers.add(new Customer(3, "ekta", "delhi", "77557506"));
		
		return customers;
	}
	

	@Override
	public void addCustomer(Customer customer) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		System.out.println("add customer using jdbc");
	}
	

}
