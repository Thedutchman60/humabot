package com.jiguancheng.humabot.service.login;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.jiguancheng.humabot.dao.UserDAO;
import com.jiguancheng.humabot.entity.UserInfo;

public class LoginServiceImpl implements LoginService {
	static Logger logger = Logger.getLogger(LoginServiceImpl.class);
	@Autowired
	public UserDAO userInfoDAO;
	
	@Override
	public boolean doLogin(String username, String password) {
		if (username != null) {
			UserInfo user = userInfoDAO.getUserByName(username);
			if (user!=null && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean checkName(String username) {
		List<String> list = userInfoDAO.getAllUserName();
		for (String name : list) {
			if (name.equals(username)) {
				return true;
			}
		}
		return false;
	}



}
