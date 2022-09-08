package com.customerapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NeedOfLog4j {
	
	private static Logger logger=
			LoggerFactory.getLogger(NeedOfLog4j.class);
	
	public static void main(String[] args) {
		
		logger.info("this is log message");
		
		try {
			Integer val=Integer.parseInt("foo123");
		}catch(Exception e) {
			logger.error("some ex "+ e.getMessage());
		}
		
		
		//System.out.println("code is working till line no 14");
		
		
		
		
		
		
		System.out.println("code is working till line no 21");
		
	}

}
