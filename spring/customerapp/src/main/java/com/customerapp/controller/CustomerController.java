package com.customerapp.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.customerapp.dao.Customer;
import com.customerapp.service.CustomerService;

@RestController 
@RequestMapping(path = "api")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping(path="customers")
	public List<Customer>getAll(){
		return customerService.getAll();
	}
	
}






