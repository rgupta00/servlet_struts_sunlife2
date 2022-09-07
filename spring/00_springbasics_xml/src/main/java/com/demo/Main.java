package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("beans.xml");
		
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
