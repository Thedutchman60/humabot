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
</head>
<body>
<a class="offline-button" href="index.html">Back</a>
<div id="example" class="k-content">
	<form action="${pageContext.request.contextPath}/j_spring_security_check" method="post">
		<div id="login-view" class="k-header">
	                <div class="right" >
	                    <label for="culture"><s:property value="%{getText('global.language.select')}"/> :</label>
	                    <input id="culture" />
	                </div>
	                <h2><s:property value="%{getText('label.login.userlogin')}"/>  </h2>
	                <ul id="fieldlist">
	                    <li>
	                    <label ><s:property value="%{getText('label.login.userlogin')}"/>:</label>
	                    <input type="text" class="k-textbox" name="j_username" value="${sessionScope['SPRING_SECURITY_LAST_USERNAME']}"/>
	                    </li>
	                    <li>
	                    <label for="endDate"><s:property value="%{getText('label.login.password')}"/>:</label>
	                    <input type="password" class="k-textbox" name="j_password" />
	                    </li>
	               		<li>
		                 <label for="endDate"><s:property value="%{getText('label.login.rememberme')}"/>:</label>
		                 <input type="checkbox" name="_spring_security_remember_me">
	                    </li>
	                <li>
		    			<input type="submit" style="width: 200px" class="k-button" value="<sp:message code="button.login.logon"/>" />
		    			<input type="reset" style="width: 200px" class="k-button" value="<sp:message code="button.login.reset" />"/>
	    			</li>
	                </ul>
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
	
	                .right
	                {
	                    float:right;
	                }
	
	                #fieldlist
	                {
	                    width: 100%;
	                    float:left;
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
	                $(document).ready(function() {
	
	                    function languageChange() {
	                        kendo.culture(this.value());
		window.location.href="${pageContext.request.contextPath}/login.do?language="+this.value();
	                    }
	
	                    $("#culture").kendoDropDownList({
	                        change: languageChange,
	                        dataTextField: "text",
	                        dataValueField: "value",
	                        dataSource: [{text: "简体中文",value:"zh_CN"},
	                        {text: "en-US",value:"en-US"}]
	                    });
	                });
	            </script>
	</form>
</div>
</body>
</html>