package com.jiguancheng.humabot;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.jiguancheng.humabot.service.login.LoginService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-test.xml")
@TransactionConfiguration
public class LoginTest {
	@Resource(name="loginService")
	private LoginService loginSer;
	
	@Test
	public void testLogin(){
		loginSer.doLogin("username", "password1");
	}
}
