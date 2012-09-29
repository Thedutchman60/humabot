package com.jiguancheng.humabot.testhelloservice;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.jiguancheng.humabot.webservice.HelloWS;


public class HelloWSClient {
	//在tomcat上运行本工程后执行此方法
	public static void main(String args[]){
		//创建WebService客户端代理工厂
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		 //注册WebService接口
		factory.setServiceClass(HelloWS.class);
		//设置WebService地址
		factory.setAddress("http://localhost:8080/humabot-online/ws/HelloWS");
		HelloWS hws= (HelloWS) factory.create();
		System.out.println("message:"+hws.greeting("sj"));
	}
}
