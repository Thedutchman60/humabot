package com.jiguancheng.humabot.service.webservice;

import java.util.Calendar;
import java.util.Date;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.jiguancheng.humabot.entity.UserInfo;

@WebService(endpointInterface = "com.jiguancheng.humabot.service.webservice.HelloWS")
@SOAPBinding(style = Style.RPC)
public class HelloWSImpl implements HelloWS {

	@Override
	public String greeting(String userName) {
		return "Hello " + userName +",WS current time is "+Calendar.getInstance().getTime();
	}

	@Override
	public UserInfo getUserByName(String name) {
		UserInfo user = new UserInfo();
		user.setId(new Date().getTime());
		user.setName(name);
//		user.setBirthday(Calendar.getInstance().getTime());
		user.setEmail(name + "@sina.com");
		return user;
	}

	@Override
	public void setUser(UserInfo user) {
		System.out.println("setUser: "+ user);
	}

}
