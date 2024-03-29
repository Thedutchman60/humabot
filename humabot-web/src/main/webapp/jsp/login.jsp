<!doctype html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sp"%>
<%@taglib prefix="s" uri="struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="common/common.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:property value="%{getText('global.login.title')}"/>
</title>
<script type="text/javascript" src="<c:url value='/js/console.js'/>"></script>
<script type="text/javascript" src="<c:url value='/js/language-list.js'/>"></script>
<style>
		
	   .k-content {
			background: #fff url("${pageContext.request.contextPath}/img/world-map.png") ;
		}
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
             	 width:100%;
                 margin:0;
                 padding: 10px 0 30px 0;
             }
	}

</style>
</head>
<body style="background-repeat:no-repeat;">
<a class="offline-button" href="index.html"><s:property value="%{getText('global.button.back')}"/></a>
<div id="example" class="k-content">
	<form action="${pageContext.request.contextPath}/j_spring_security_check" method="post">
		<div id="login-view" class="k-header">
	                <div style="float:right" >
	                    <label for="culture"><s:property value="%{getText('global.language.select')}"/>  :</label>
	                    <input id="culture" />
	                </div>
	                <h2><s:property value="%{getText('label.login.userlogin')}"/> </h2>
	                <table id="fieldtable" >
	                	<tr>
	                		<td align="right" width="35%"><s:property value="%{getText('label.login.username')}"/>:</td>
	                		<td ><input type="text" class="k-textbox" name="j_username" value="${sessionScope['SPRING_SECURITY_LAST_USERNAME']}"/></td>
	                	</tr>
	                	<tr>
	                		<td align="right"><s:property value="%{getText('label.login.password')}"/>:</td>
	                		<td> <input type="password" class="k-textbox" name="j_password" />
	                		<span style="color:red">${sessionScope['SPRING_SECURITY_LAST_EXCEPTION'].message}</span>
	                		<c:remove var="SPRING_SECURITY_LAST_EXCEPTION" scope="session"/>
	                		</td>
	                	</tr>
	                	<tr>
	                		<td colspan="2" align="center"><s:property value="%{getText('label.login.rememberme')}"/>
	                		<input type="checkbox" name="_spring_security_remember_me">
	                		</td>
	                	</tr>
	                	<tr align="center">
	                		<td  colspan="2"><input type="submit" style="width: 150px" class="k-button" value="<s:property value="%{getText('button.login.logon')}"/>" />
	                		 <input type="reset" style="width: 150px" class="k-button" value="<s:property value="%{getText('button.login.reset')}"/>"/></td>
	                	</tr>
	                </table>
	            </div>
	            
	
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