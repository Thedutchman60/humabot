<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统登录</title>
    <script type="text/javascript" src="/js/jquery-1.8.2.js"></script>  
    <script type="text/javascript" src="/js/testAjax.js"></script> 
</head>
<body>
	<table align="center" borderColor=#000000 border="1" cellpadding="2"
		style="border-collapse: collapse" cellspacing="0">
		<tr>
			<td align="center">用户登录</td>
		</tr>
		<tr>
			<td>
			<s:form id="id" action="login" method="post" >
					<s:textfield name="username" label="用户名" id="username"/>
					<s:password name="password" label="密码" id="password" />
					<s:submit value="登录" />
				</s:form>
			</td>
		</tr>
	</table>
	</br>
<a href="">Home</a>
</body>
</html>