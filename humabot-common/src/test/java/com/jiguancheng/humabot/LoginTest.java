package com.jiguancheng.humabot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.jiguancheng.humabot.login.LoginService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-test.xml")
@TransactionConfiguration
public class LoginTest {
	@Autowired
	private LoginService loginSer;
	
	@Test
	public void testLogin(){
		loginSer.doLogin("username", "password1");
	}
}
