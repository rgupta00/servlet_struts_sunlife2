package com.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//what is the problem with scriptlent better option EL and jSTL
		
		Customer customer=new Customer(1, "raj", "delhi", "657575656", "44DE");
		
		RequestDispatcher rd=request.getRequestDispatcher("demo.jsp");
		request.setAttribute("customer", customer);
		
		rd.forward(request, response);
}

}
