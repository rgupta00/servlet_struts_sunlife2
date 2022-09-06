package com.customerapp.dao.user;

public interface UserDao {
	public void addUser(User user);
	public User checkUser(String username, String password);
}
