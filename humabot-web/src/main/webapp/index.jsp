<%@page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
	<title>My web service</title>
</head>
<body>
<center>
<h2>Hello World!123</h2>
<s:property value="msg" />
<table align="center" border="1" style="border-collapse: collapse" cellspacing="0" borderColor=#000000>
	<tr><td>username</td><td>${user.name}</td></tr>
	<tr><td>id</td><td>${user.id}</td></tr>
	<tr><td>adress</td><td>${user.address}</td></tr>
	<tr><td>email:</td><td>${user.email}</td></tr>
</table>
</center>
</body>
</html>
