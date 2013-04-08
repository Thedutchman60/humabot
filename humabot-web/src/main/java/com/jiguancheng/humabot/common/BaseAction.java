package com.jiguancheng.humabot.common;

import java.util.ResourceBundle;

import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ActionSupport;

import freemarker.ext.beans.BeansWrapper;
import freemarker.ext.beans.ResourceBundleModel;

public class BaseAction extends ActionSupport {

	private static final long serialVersionUID = -5082395263471136399L;
	
	public void getRes(HttpSession session){
		ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle("i18n/messages");
		ResourceBundleModel rsbm = new ResourceBundleModel(RESOURCE_BUNDLE, new BeansWrapper());
		session.setAttribute("bundle", rsbm);
	}
	
}
