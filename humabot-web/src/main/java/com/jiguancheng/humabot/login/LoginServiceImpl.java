package com.jiguancheng.humabot.login;

public class LoginServiceImpl implements LoginService {

	@Override
	public boolean doLogin(String username, String password) {
		if ("username".equals(username)&&"password".equals(password)) {
			return true;
		}
		return false;
	}

}
