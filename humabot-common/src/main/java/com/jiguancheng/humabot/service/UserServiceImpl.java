package com.jiguancheng.humabot.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.logging.LogFactory;

import com.jiguancheng.humabot.dao.UserDAO;
import com.jiguancheng.humabot.entity.UserBean;

public class UserServiceImpl implements UserService {

	@Resource(name="userDAO")//注解方式注入
	private UserDAO userDao;
	
	@Override
	public List<UserBean> queryAllUsers() {
		LogFactory.useLog4JLogging();
		return this.userDao.queryAllUsers();
	}

}
