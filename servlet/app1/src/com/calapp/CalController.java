package com.calapp;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.calapp.model.Calculator;

public class CalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CalController() {
      System.out.println("it is a ctr");
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		//what u wnat to to do
		int x=Integer.parseInt(request.getParameter("x"));
		int y=Integer.parseInt(request.getParameter("y"));
		
		//int sum=x+y;
		int sum=Calculator.add(x, y);
		HttpSession httpSession=request.getSession();
		
		httpSession.setAttribute("sum", sum);
		//i want to write a jsp to show the data
		//RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
		
		//RequestDispatcher vs sendRedirect
		
		//rd.forward(request, response);
		response.sendRedirect("show.jsp");
		
	}

}





