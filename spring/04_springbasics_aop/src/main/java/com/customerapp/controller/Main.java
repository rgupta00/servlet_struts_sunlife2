package com.customerapp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.customerapp.config.AppConfig;
import com.customerapp.dao.Customer;
import com.customerapp.service.CustomerService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService customerService=(CustomerService) ctx.getBean("customerService");
	
		//List<Customer> customers=customerService.getAll();
		//customers.forEach(c-> System.out.println(c));
		Customer customer=new Customer(1, "ram", "delhi", "65777777");
		customerService.addCustomer(customer);
	}
}
