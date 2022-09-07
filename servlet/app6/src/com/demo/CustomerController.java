package com.demo;
import java.util.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		List<Customer> customers=getAll();
		
		
		RequestDispatcher rd=request.getRequestDispatcher("all.jsp");
		request.setAttribute("customers", customers);
		
		rd.forward(request, response);
		
	}


	public List<Customer> getAll(){
		List<Customer> customers=new ArrayList<Customer>();
		customers.add(new Customer(121, "raj", "delhi", "466445000", "AWS33"));
		customers.add(new Customer(11, "ekta", "banglore", "466445000", "RDE30"));
		customers.add(new Customer(1, "geeta", "delhi", "466445000", "ISMS3"));
		return customers;
	}
}
