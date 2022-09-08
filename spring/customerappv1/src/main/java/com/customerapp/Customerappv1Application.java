package com.customerapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.customerapp.dao.Customer;
import com.customerapp.dao.CustomerDao;

@SpringBootApplication
public class Customerappv1Application implements CommandLineRunner{

	@Autowired
	private CustomerDao customerDao;
	
	
	public static void main(String[] args) {
		ApplicationContext ctx=  SpringApplication.run(Customerappv1Application.class, args);
	
//		String beansNames[]=ctx.getBeanDefinitionNames();
//		for(String name: beansNames) {
//			System.out.println(name);
//		}
	
	}

	@Override
	public void run(String... args) throws Exception {
//		customerDao.save(new Customer("ravi", "noida", "565755777"));
//		customerDao.save(new Customer("keshav", "DC", "565755077"));
		
	}

}




