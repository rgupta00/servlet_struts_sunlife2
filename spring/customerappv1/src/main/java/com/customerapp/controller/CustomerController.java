package com.customerapp.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customerapp.dao.Customer;
import com.customerapp.service.CustomerService;

@RestController
@RequestMapping(path = "api")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	
	@GetMapping(path = "customers")
	public List<Customer>getAll(){
		return customerService.getAll();
	}
	
	@GetMapping(path = "customers/{id}")
	public Customer getById(@PathVariable  int id){
		return customerService.getById(id);
	}
	
	
	
//
//	@GetMapping("hello/{name}")
//	public String hello(@PathVariable  String name) {
//		return "hello "+ name;
//	}
//	
//	@GetMapping("hello2")
//	public String hello2(@RequestParam  String name,
//			@RequestParam  String city ) {
//		return "hello "+ name+"  "+city;
//	}
	
	
}


