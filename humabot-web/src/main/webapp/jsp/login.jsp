<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://eos.primeton.com/tags/html" prefix="h"%>
<%@ taglib uri="http://eos.primeton.com/tags/logic" prefix="l"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="struts-tags"%>
<%@include file="common/common.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:property value="%{getText('global.login.title')}"/>
</title>
    <script type="text/javascript" src="js/console.js"></script>
    <script type="text/javascript" src="js/language-list.js"></script>
</head>
<body>
<a class="offline-button" href="index.html">Back</a>
<div id="example" class="k-content">
	<form action="${pageContext.request.contextPath}/j_spring_security_check" method="post">
		<div id="login-view" class="k-header">
	                <div style="float:right" >
	                    <label for="culture"><s:property value="%{getText('global.language.select')}"/>  :</label>
	                    <input id="culture" />
	                </div>
	                <h2><s:property value="%{getText('label.login.userlogin')}"/> </h2>
	                <table id="fieldtable" align="center">
	                	<tr>
	                		<td align="right"><s:property value="%{getText('label.login.username')}"/>:</td>
	                		<td><input type="text" class="k-textbox" name="j_username" value="${sessionScope['SPRING_SECURITY_LAST_USERNAME']}"/></td>
	                	</tr>
	                	<tr>
	                		<td align="right"><s:property value="%{getText('label.login.password')}"/>:</td>
	                		<td> <input type="password" class="k-textbox" name="j_password" /></td>
	                	</tr>
	                	<tr>
	                		<td colspan="2" align="center"><s:property value="%{getText('label.login.rememberme')}"/>
	                		<input type="checkbox" name="_spring_security_remember_me">
	                		</td>
	                	</tr>
	                	<tr>
	                		<td  colspan="2"><input type="submit" style="width: 150px" class="k-button" value="<s:property value="%{getText('button.login.logon')}"/>" />
	                		 <input type="reset" style="width: 150px" class="k-button" value="<s:property value="%{getText('button.login.reset')}"/>"/></td>
	                	</tr>
	                </table>
	            </div>
	             <style>
	                #example h2 {
						padding: 5px 0;
	                    font-weight: normal;
						border-bottom: 1px solid #999;
	                }
	                #login-view {
	                    border-radius: 10px 10px 10px 10px;
	                    border-style: solid;
	                    border-width: 1px;
	                    overflow: hidden;
	                    width: 400px;
	                    padding: 20px 20px 0 20px;
						margin: 30px auto;
	                    background-position: 0 -255px;
	                }
	
	                #fieldtable
	                {
	                    margin:0;
	                    padding: 10px 0 30px 0;
	                }
	
	                #fieldlist li
	                {
	                    list-style:none;
	                    padding:5px 0;
	                }
					#fieldlist label {
						display: inline-block;
						width: 120px;
						text-align: right;
					}
	
	            </style>
	
	            <script>
	                $(document).ready(function(e) {
	
	                    function languageChange(te) {
	                       var dataItem = this.dataItem(te.item.index());
		window.location.href="${pageContext.request.contextPath}/changeLanguage.do?language="+dataItem.fieldValue;
	                    }
	
	                    $("#culture").kendoDropDownList({
	                    	select : languageChange,
	                        dataTextField: "text",
	                        dataValueField: "fieldValue",
	                        dataSource: languages,
	                        index: switchIndex('${language==null?"en_US":language}')//初始化选择值
	                    });
	                });
	                
	               
	            </script>
	</form>
</div>
</body>
</html>