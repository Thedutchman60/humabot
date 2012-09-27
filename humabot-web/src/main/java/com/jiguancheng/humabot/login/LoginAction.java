package com.jiguancheng.humabot.login;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	static Logger logger = Logger.getLogger(LoginAction.class);

	private static final long serialVersionUID = 1L;
	private LoginService loginService;
	private String username;
	private String password;
	private String msg;
	public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String execute() throws Exception {
		if (loginService.doLogin(username, password)) {
			setMsg("登录成功！");
			return Action.SUCCESS;
		}else {
			setMsg("登录失败");
			logger.info(getMsg());
			return Action.INPUT;
		}
	}
	
	
}
