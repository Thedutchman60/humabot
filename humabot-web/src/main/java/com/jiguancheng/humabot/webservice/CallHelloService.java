package com.jiguancheng.humabot.webservice;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class CallHelloService extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HelloWS client;
	private String msg;
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
		return Action.SUCCESS;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
