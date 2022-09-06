package com.customerapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.customerapp.dao.user.User;
import com.customerapp.exccptions.UserNotFoundExcepetion;
import com.customerapp.service.UserService;
import com.customerapp.service.UserServiceImpl;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService userService = new UserServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		try {
			User user = userService.checkUser(username, password);
			
			response.sendRedirect("home.jsp");
			
		} catch (UserNotFoundExcepetion e) {
			System.out.println("invalid");
			response.sendRedirect("login.jsp");
		}

		
		
	}

}
