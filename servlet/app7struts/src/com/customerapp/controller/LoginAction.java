package com.customerapp.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.customerapp.dao.user.User;
import com.customerapp.exccptions.UserNotFoundExcepetion;
import com.customerapp.forms.LoginForm;
import com.customerapp.service.UserService;
import com.customerapp.service.UserServiceImpl;

//Back controller ie replacement of servlet

public class LoginAction extends Action {

	private UserService userService = new UserServiceImpl();

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		LoginForm loginForm = (LoginForm) form;
		try {
			User user = userService.checkUser(loginForm.getUsername(), loginForm.getPassword());
			return mapping.findForward("success");
		} 
		catch (UserNotFoundExcepetion ex) {
			return mapping.findForward("failure");
		}
		
	}

}
