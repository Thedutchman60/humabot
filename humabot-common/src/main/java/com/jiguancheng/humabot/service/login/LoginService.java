package com.jiguancheng.humabot.service.login;


public interface LoginService {
	
	public boolean doLogin(String username, String password);
	public boolean checkName(String username);
}
