package com.jiguancheng.humabot.webservice;

import java.util.Calendar;
import java.util.Date;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.jiguancheng.humabot.entity.User;

@WebService(endpointInterface = "com.jiguancheng.humabot.webservice.HelloWS")
@SOAPBinding(style = Style.RPC)
public class HelloWSImpl implements HelloWS {

	@Override
	public String greeting(String userName) {
		return "Hello " + userName +",WS current time is "+Calendar.getInstance().getTime();
	}

	@Override
	public User getUserByName(String name) {
		User user = new User();
		user.setId(new Date().getTime());
		user.setName(name);
		user.setAddress("shanghai");
		user.setEmail(name + "@sina.com");
		return user;
	}

	@Override
	public void setUser(User user) {
		System.out.println("setUser: "+ user);
	}

}
