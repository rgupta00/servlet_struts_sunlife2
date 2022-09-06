package com.customerapp.exccptions;

public class CustomerNotFoundExcepetion extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public CustomerNotFoundExcepetion(String message) {
		super(message);
	}

}
