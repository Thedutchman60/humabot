package com.jiguancheng.humabot.dao;

import java.util.List;

import com.jiguancheng.humabot.entity.UserBean;
import com.jiguancheng.humabot.entity.UserInfo;

public interface UserDAO {
	public UserInfo getUserByName(String name);
	public List<String> getAllUserName();
	public List<UserBean> queryAllUsers();
}
