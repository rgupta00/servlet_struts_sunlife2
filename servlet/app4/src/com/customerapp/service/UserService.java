package com.customerapp.service;

import com.customerapp.dao.user.User;

public interface UserService {
	public void addUser(User user);
	public User checkUser(String username, String password);
}
