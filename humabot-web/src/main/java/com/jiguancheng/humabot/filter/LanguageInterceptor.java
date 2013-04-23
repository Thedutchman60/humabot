package com.jiguancheng.humabot.filter;

import java.util.Locale;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
/**
 * 
 * @author songjie
 * 
 */
public class LanguageInterceptor extends AbstractInterceptor {
	/**
	 * i18n 拦截器
	 */
	private static final long serialVersionUID = 1L;
	private String locale;
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		if (getLocale()!=null) {
			String loc[]=getLocale().split("_");
			Locale locale=new Locale(loc[0],loc[1]);
			ServletActionContext.getRequest().getSession().setAttribute("WW_TRANS_I18N_LOCALE", locale);
			ServletActionContext.getRequest().getSession().setAttribute("language", locale.toString());
			//System.out.println("ddd"+locale.toString());
		}
		return arg0.invoke();
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}

	
}
