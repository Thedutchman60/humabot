package com.jiguancheng.humabot.webservice;

import org.apache.log4j.Logger;

import com.jiguancheng.humabot.entity.UserInfo;
import com.jiguancheng.humabot.service.webservice.HelloWS;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class CallHelloServiceAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HelloWS client;
	private String msg;
	UserInfo user;
	static Logger logger = Logger.getLogger(CallHelloServiceAction.class);
	public void setClient(HelloWS client) {
		this.client = client;
	}

	public HelloWS getClient() {
		return client;
	}

	@Override
	public String execute() throws Exception {
		this.msg = client.greeting("struts action");
		logger.info("hello action run !!!");
		user = client.getUserByName("sj");
		System.out.println(user);
		user.setEmail("shanghai-China");
		client.setUser(user);
		return Action.SUCCESS;
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
