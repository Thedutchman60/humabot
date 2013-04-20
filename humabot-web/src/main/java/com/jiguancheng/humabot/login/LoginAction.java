package com.jiguancheng.humabot.login;

import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.jiguancheng.humabot.common.BaseAction;
import com.jiguancheng.humabot.service.login.LoginService;
import com.opensymphony.xwork2.Action;

public class LoginAction extends BaseAction{

	static Logger logger = Logger.getLogger(LoginAction.class);

	private static final long serialVersionUID = 1L;
	@Resource(name="loginService")
	private LoginService loginService;
	private String username;
	private String password;
	private String msg;
	
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
	@Override
	public String execute() throws Exception {
		
		//super.getRes();
		if (loginService.doLogin(username, password)) {
			setMsg("登录成功！");
			return Action.SUCCESS;
		}else {
			setMsg("登录失败");
			logger.info(session);
			return Action.INPUT;
		}
	}
	
	
	public String changeLanguage() {
		String language = request.getParameter("language");
		if (!StringUtils.isNotEmpty(language)) {
			Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                	if ("language".equalsIgnoreCase(cookie.getName())) {
						language=cookie.getValue();
					}
                }
            }
		}
		if (language != null) {
            Locale locale = getTargetLocal(language);
            
            request.getSession().setAttribute("WW_TRANS_I18N_LOCALE",locale);
            request.getSession().setAttribute("language",language);
            Cookie languageCookie = new Cookie("language",language);
            languageCookie.setMaxAge(60 * 60 * 24 * 14);// cookie保存两周  
            response.addCookie(languageCookie);
        }else {
        	request.setAttribute("language",getLocale().toString());
		}
		return LOGIN;
	}
	
	private Locale getTargetLocal(String language){
		if (StringUtils.isNotEmpty(language)) {
			String tmp[] = language.split("_");
			if (tmp.length==2) {
	            return new Locale(tmp[0], tmp[1]);
			}
		}
		return getLocale();
	}
	
	public String languageLocale(){
		return LOGIN;
	}
	
}
