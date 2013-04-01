<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="struts-tags"%>
<%@include file="../jsp/common/common.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统登录</title>
    <script type="text/javascript" src="/js/jquery-1.8.2.js"></script>  
    <script type="text/javascript" src="/js/testAjax.js"></script> 
</head>
<body>
<div id="k-content" class="k-content">
	<div class="error ${param.error == true ? '' : 'hide'}">
	  登陆失败<br>
	  ${sessionScope['SPRING_SECURITY_LAST_EXCEPTION'].message}
	</div>
<div id="login-view" class="k-header">
                <div class="right" >
                    <label for="culture">Choose culture:</label>
                    <input id="culture" value="en-US" />
                </div>
                <h2>Product promotion</h2>
                <ul id="fieldlist">
                    <li>
                    <label for="startDate">Discount start date:</label>
                    <input id="startDate" />
                    <input id="startTime" value="12:00 AM" />
                    </li>
                    <li>
                    <label for="endDate">Discount end date:</label>
                    <input id="endDate" />
                    <input id="endTime" value="12:00 AM" />
                    </li>
                    <li>
                    <label for="initial">Initial price:</label>
                    <input id="initial" value="10" min="1"/>
                    </li>
                    <li>
                    <label for="discount">Discount:</label>
                    <input id="discount" value="0.05" min="0" max="0.5" step="0.01"/>
                    </li>
                </ul>
            </div>

	<table align="center" borderColor=#000000 border="1" cellpadding="2"
		style="border-collapse: collapse" cellspacing="0">
		<tr>
			<td align="center">用户登录</td>
		</tr>
		<tr>
			<td>
			<s:form id="id" action="login" method="post" style="width:260px;text-align:center;">
			<legend>登录</legend>
					<s:textfield name="username" label="用户名" id="username"/>
					<s:password name="password" label="密码" id="password" />
					<input type="checkbox" name="_spring_security_remember_me" />两周之内不必登陆<br />
					<s:submit value="登录" /><s:reset>重置</s:reset>
				</s:form>
			</td>
		</tr>
	</table>
	<br/>
</body>
</html>