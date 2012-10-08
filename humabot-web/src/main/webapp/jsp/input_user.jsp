<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>  
<head>  
    <title>测试ajax</title>  
    <script type="text/javascript" src="js/jquery-1.8.2.js"></script>  
    <script type="text/javascript" src="js/testAjax.js"></script>  
</head>  
<body>  
    <div>  
        请输入用户：  
    </div>  
    <div>  
        <form id="subUserForm">  
        <input type="text" name="userInfo.id" id="userid"/>  
        <input type="text" name="userInfo.name" id="username"/>
        <label id="info"></label>
        <input type="text" name="userInfo.address" id="useraddress"/>  
        </form>
    </div>  
    <div>  
        <input id="addUser" type="button" value="添加"/>  
         <input id="users" type="button" value="所有用户"/>  
    </div>  
<div id="allUser">  
input_user:  
</div>  

</br>
<a href="">Home</a>
</body>  
</html>  