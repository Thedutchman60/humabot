package com.jiguancheng.humabot.service.webservice;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.jiguancheng.humabot.entity.UserInfo;

@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWS{
	public String greeting(String userName);
	
	public UserInfo getUserByName(@WebParam(name = "name") String name);
	
	public void setUser(UserInfo user);
}
