package com.jiguancheng.humabot.entity;

import java.util.ArrayList;
import java.util.List;



public class UserBean {
	
	private long userId;
	private String userAccount;
	private String userPassword;
	private String userName;
	private String userDesc;
	private String enabled;
	private String isSys;
	private List<String> authorities = new ArrayList<String>();
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getUserDesc() {
		return userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

	public List<String> getAuthorities() {
		return authorities;
	}
	
	public String getAuthority() {
        StringBuffer buff = new StringBuffer();

        for (String auth : authorities) {
            buff.append(auth).append(",");
        }

        if (!authorities.isEmpty()) {
            buff.deleteCharAt(buff.length() - 1);
        }

        return buff.toString();
    }
	public void setAuthorities(List<String> authorities) {
		this.authorities = authorities;
	}
	
	public void addAuthority(String authority) {
        if (authority != null) {
            authorities.add(authority);
        }
    }

	public String getIsSys() {
		return isSys;
	}

	public void setIsSys(String isSys) {
		this.isSys = isSys;
	}

	@Override
	public String toString() {
		return getUserName()+"#"+getUserId()+"#"+"#"+getUserDesc();
	}
	
	
}
