package com.jiguancheng.humabot.service.login;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.jiguancheng.humabot.dao.UserDao;
import com.jiguancheng.humabot.entity.UserInfo;

public class LoginServiceImpl implements LoginService {
	static Logger logger = Logger.getLogger(LoginServiceImpl.class);
	
	@Resource(name="userDao")//注解方式注入
	public UserDao userInfoDao;
	
	@Override
	public boolean doLogin(String username, String password) {
		if (username != null) {
			UserInfo user = userInfoDao.getUserByName(username);
			if (user!=null && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean checkName(String username) {
		List<String> list = userInfoDao.getAllUserName();
		for (String name : list) {
			if (name.equals(username)) {
				return true;
			}
		}
		return false;
	}



}
