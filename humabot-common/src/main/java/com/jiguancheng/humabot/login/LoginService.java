package com.jiguancheng.humabot.login;


public interface LoginService {
	
	public boolean doLogin(String username, String password);
	public boolean checkName(String username);
}
