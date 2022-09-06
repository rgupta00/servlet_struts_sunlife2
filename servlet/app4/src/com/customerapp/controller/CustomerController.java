package com.customerapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.customerapp.dao.customer.Customer;
import com.customerapp.service.CustomerService;
import com.customerapp.service.CustomerServiceImpl;

public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CustomerService customerService=new CustomerServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String insuranceno = request.getParameter("insuranceno");

		Customer customer = new Customer(name, address, phone, insuranceno);

		customerService.addCustomer(customer);
		
		RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
		request.setAttribute("customer", customer);
		rd.forward(request, response);
	}

}




