package com.jiguancheng.humabot.login;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.jiguancheng.humabot.entity.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	private static final long serialVersionUID = -8486508105163528894L;
	static Logger logger = Logger.getLogger(LoginAction.class);
	public String inputUser() {
	    return "INPUT_USER";
	}
	
	public String loadUserInfoList() {
	    userList = new ArrayList<User>();
	
	    User u1 = new User();
	    u1.setId(1);
	    u1.setName("取得userInfo1");
	
	    User u2 = new User();
	    u2.setId(2);
	    u2.setName("取得userInfo2");
	
	    User u3 = new User();
	    u3.setId(3);
	    u3.setName("取得userInfo3");
	
	    userList.add(u1);
	    userList.add(u2);
	    userList.add(u3);
	    return "userInfoList";
	}
	
	
	public String addUser() {
	    /*userInfo = new UserInfo();
	    userInfo.setId(7);
	    userInfo.setName("张7");*/
	
	    //如果是异步提交json格式，必须先在js中对提交的表单form进行序列化
	    //var params = $("subUserForm").serialize();
//	    us.addUser(userInfo);
	
//	    userList = us.getUser();
		this.loadUserInfoList();
		userList.add(userInfo);
	    return "ADD_SUCCESS";
	}
	
	public String loadAllUser() {
	
		this.loadUserInfoList();
	
	    return "USER";
	}
	public String checkName(){
		if (loginService.checkName(userInfo.getName())) {
			setMsg("用户名合法！");
		}else{
		setMsg("用户名不存在！");
		}
		logger.info(getMsg());
		return Action.SUCCESS;
	}
	
	public List<User> getUserList() {
	    return userList;
	}
	public void setUserList(List<User> userList) {
	    this.userList = userList;
	}
	public User getUserInfo() {
	    return userInfo;
	}
	public void setUserInfo(User userInfo) {
	    this.userInfo = userInfo;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	private User userInfo;
	private String msg;
	private static List<User> userList;
	private LoginService loginService;
}
