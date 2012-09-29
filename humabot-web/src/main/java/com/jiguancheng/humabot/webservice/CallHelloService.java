package com.jiguancheng.humabot.webservice;

import org.apache.log4j.Logger;

import com.jiguancheng.humabot.entity.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class CallHelloService extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HelloWS client;
	private String msg;
	User user;
	static Logger logger = Logger.getLogger(CallHelloService.class);
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
		user.setAddress("shanghai-China");
		client.setUser(user);
		return Action.SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
