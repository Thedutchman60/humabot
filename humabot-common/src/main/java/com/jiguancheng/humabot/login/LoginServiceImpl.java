package com.jiguancheng.humabot.login;

import org.apache.log4j.Logger;

public class LoginServiceImpl implements LoginService {
	static Logger logger = Logger.getLogger(LoginServiceImpl.class);
	@Override
	public boolean doLogin(String username, String password) {
		if ("username".equals(username)&&"password".equals(password)) {
			return true;
		}
		return false;
	}
	@Override
	public boolean checkName(String username) {
		if ("username".equals(username)) {
			return true;
		}
		return false;
	}



}
