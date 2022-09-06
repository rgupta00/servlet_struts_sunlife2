package com.customerapp.service;

import com.customerapp.dao.user.User;
import com.customerapp.dao.user.UserDao;
import com.customerapp.dao.user.UserDaoImpl;
import com.customerapp.exccptions.UserNotFoundExcepetion;

public class UserServiceImpl implements UserService{

	private UserDao userDao;

	public UserServiceImpl() {
		userDao=new UserDaoImpl();
	}

	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	public User checkUser(String username, String password) {
		User user=userDao.checkUser(username, password);
		if(user==null)
			throw new UserNotFoundExcepetion("user not found");
		
		return user;
	}

}
