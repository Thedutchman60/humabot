package com.jiguancheng.humabot.webservice;

import javax.jws.WebService;

@WebService
public interface HelloWS{
	public String greeting(String userName);
}
