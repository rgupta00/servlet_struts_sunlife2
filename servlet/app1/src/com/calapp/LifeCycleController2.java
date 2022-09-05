package com.calapp;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LifeCycleController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       //how to pass parameters in servlet api?
	String city=null;
	String topic=null;
	//init parameters
	public LifeCycleController2() {
        System.out.println("it is a ctr of LifeCycleController2");
    }

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		city= config.getInitParameter("city");
		topic= config.getInitParameter("topic");
		
		System.out.println("init is called");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget of LifeCycleController "+ city+" : "+ topic);
	}
	

    @Override
	public void destroy() {
		System.out.println("destroy is called");
	}

}
