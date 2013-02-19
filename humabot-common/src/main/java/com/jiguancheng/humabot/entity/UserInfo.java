package com.jiguancheng.humabot.entity;

import java.util.Date;



public class UserInfo {
	
	private long id;
	private String name;
	private Date birthday;
	private String email;
	private String password;
	
	public UserInfo() {
		super();
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserInfo(long id, String name, Date birthday, String email) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthDay) {
		this.birthday = birthDay;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return getName()+"#"+getId()+"#"+getBirthday()+"#"+getEmail();
	}
	
	
}
