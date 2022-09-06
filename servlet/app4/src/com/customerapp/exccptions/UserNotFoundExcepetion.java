package com.customerapp.exccptions;

public class UserNotFoundExcepetion extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public UserNotFoundExcepetion(String message) {
		super(message);
	}

}
