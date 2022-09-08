package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		//when magician doing magic after that audiance is doing clapping
	
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Magician magician=(Magician) ctx.getBean("m");
		
		System.out.println(magician.getClass());
		magician.doMagic();
	}
}
