package com.demo;

//SOLID
public class Passanger {
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

	public void setVehical(Vehical vehical) {
		this.vehical = vehical;
	}

	public void travel() {
		System.out.println("name : " + name);
		vehical.move();
	}
}
