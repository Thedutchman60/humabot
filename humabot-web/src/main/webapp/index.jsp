<%@page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="struts-tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
	<title>My web service</title>
</head>
<body>
<center>
<h2>Hello World!123</h2>
<div>username : <sec:authentication property="name"/></div>
<s:property value="msg" />
<table align="center" border="1" style="border-collapse: collapse" cellspacing="0" borderColor=#000000>
	<tr><td>username</td><td>${user.name}</td></tr>
	<tr><td>id</td><td>${user.id}</td></tr>
	<tr><td>birthday</td><td>${user.birthday}</td></tr>
	<tr><td>email:</td><td>${user.email}</td></tr>
</table>
<br/>
<ol>
<li><a href="login.do">Test Login</a></li>
<li><a href="ws/helloWS?wsdl">Test CXF WebService</a></li>
<li><a href="callCxf.do">action call webservice</a></li>
<li><a href="input_user.do	">Test Jquery AJAX</a></li>
<li><a href="jsp/usermanage/user-list.jsp">query all users</a></li>
<li><a href="j_spring_security_logout">Logout</a></li>
</ol>
<a href="">Home</a>
</center>
</body>
</html>
