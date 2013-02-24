package com.jiguancheng.humabot.dao;

import java.util.List;
import com.jiguancheng.humabot.entity.UserInfo;

public interface UserDao {
	public UserInfo getUserByName(String name);
	public List<String> getAllUserName();
}
