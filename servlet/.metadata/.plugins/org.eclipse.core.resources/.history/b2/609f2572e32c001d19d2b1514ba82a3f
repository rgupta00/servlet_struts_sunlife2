package com.calapp;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		int sum=x+y;
		
		out.print(sum);
	}

}
