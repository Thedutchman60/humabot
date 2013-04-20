package com.jiguancheng.humabot.common;

import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import freemarker.ext.beans.BeansWrapper;
import freemarker.ext.beans.ResourceBundleModel;

public class BaseAction extends ActionSupport  implements ServletRequestAware,ServletResponseAware,SessionAware{

	private static final long serialVersionUID = -5082395263471136399L;
	protected ActionContext context = ActionContext.getContext();  
    protected HttpServletRequest request ;
    protected HttpServletResponse response ;
    protected Map<String,Object> session ;
    
	public void getRes(){
		ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle("i18n/messages");
		ResourceBundleModel rsbm = new ResourceBundleModel(RESOURCE_BUNDLE, new BeansWrapper());
		session.put("bundle", rsbm);
	}

	@Override
	public void setServletResponse(HttpServletResponse httpservletresponse) {
		response = httpservletresponse;
	}

	@Override
	public void setServletRequest(HttpServletRequest httpservletrequest) {
		request = httpservletrequest;
	}

	@Override
	public void setSession(Map<String, Object> map) {
		session = map;
	}
	
}
