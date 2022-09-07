package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//<bean id="v1" class="com.demo.Car"/>
@Primary
@Component(value = "v1")
public class Car implements Vehical{

	public void move() {
		System.out.println("moving in a car");
	}
}
