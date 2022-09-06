package com.customerapp.dao;
//DTO
public class Customer {
	private int id ;
	private String name;
	private String address;
	private String phone;
	private String insuranceno;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getInsuranceno() {
		return insuranceno;
	}
	public void setInsuranceno(String insuranceno) {
		this.insuranceno = insuranceno;
	}
	public Customer(int id, String name, String address, String phone, String insuranceno) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.insuranceno = insuranceno;
	}
	public Customer(String name, String address, String phone, String insuranceno) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.insuranceno = insuranceno;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", insuranceno="
				+ insuranceno + "]";
	}
	
	
}
