package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		HttpSession httpSession=request.getSession();
		
		out.print("session is new?:"+ httpSession.isNew());
		out.print("session getCreationTime:"+ httpSession.getCreationTime());
		out.print("session id?:"+ httpSession.getId());
		out.print("session is new?:"+ httpSession.getLastAccessedTime());
		out.print("session is new?:"+ httpSession.getMaxInactiveInterval());
		//httpSession.invalidate();
		
		
	}


}
