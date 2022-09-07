package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component(value = "p")
public class Passanger {
	
	@Value(value = "raj")
	private String name;
	
	
	private Vehical vehical;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehical getVehical() {
		return vehical;
	}

	@Autowired
	public void setVehical(Vehical vehical) {
		this.vehical = vehical;
	}

	public void travel() {
		System.out.println("name : " + name);
		vehical.move();
	}
}
