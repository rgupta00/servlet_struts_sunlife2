package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext vs AnnotationConfigApplicationContext
		ApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Passanger passanger=(Passanger) applicationContext.getBean("p");
		
		passanger.travel();
		
		System.out.println(passanger.hashCode());
		Passanger passanger2=(Passanger) applicationContext.getBean("p");
		
		System.out.println(passanger2.hashCode());
		
		
//		Vehical vehical=new Car();
//		
//		Passanger passanger=new Passanger();
//		passanger.setName("raj");
//		passanger.setVehical(vehical);
		
	
	}
}
