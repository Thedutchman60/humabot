package com.jiguancheng.humabot.webservice;

import java.util.Calendar;

import javax.jws.WebService;

@WebService(endpointInterface = "com.jiguancheng.humabot.webservice.HelloWS")
public class HelloWSImpl implements HelloWS {

	@Override
	public String greeting(String userName) {
		return "Hello " + userName +",WS current time is "+Calendar.getInstance().getTime();
	}

}
