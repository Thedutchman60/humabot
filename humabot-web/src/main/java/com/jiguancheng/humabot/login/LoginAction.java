package com.jiguancheng.humabot.login;

import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.jiguancheng.humabot.common.BaseAction;
import com.jiguancheng.humabot.service.login.LoginService;
import com.opensymphony.xwork2.Action;

public class LoginAction extends BaseAction implements ServletRequestAware{

	static Logger logger = Logger.getLogger(LoginAction.class);

	private static final long serialVersionUID = 1L;
	@Resource(name="loginService")
	private LoginService loginService;
	private String username;
	private String password;
	private String msg;
	private HttpServletRequest request;
	private String language;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String execute() throws Exception {
		super.getRes(request.getSession());
		changeLanguage();
		if (loginService.doLogin(username, password)) {
			setMsg("登录成功！");
			return Action.SUCCESS;
		}else {
			setMsg("登录失败");
			logger.info(getMsg());
			return Action.INPUT;
		}
	}
	
	@Override
	public void setServletRequest(HttpServletRequest httpservletrequest){
		this.request = httpservletrequest;
	}
	
	public void changeLanguage(){
		String language = request.getParameter("language");
		System.out.println(language);
		if (language != null) {
            Locale locale = null;
            if (language.equals("zh_CN")) {
                locale = new Locale("zh", "CN");  
            } else if (language.equals("en_US")) {
                locale = new Locale("en", "US");  
            } else if (language.equals("ms")) {
                locale = new Locale("ms");
            } else {  
                locale = getLocale();
            }  
            request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,locale);  
        }  
    }  
	
}
