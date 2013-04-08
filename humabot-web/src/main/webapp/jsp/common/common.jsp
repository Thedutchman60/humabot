<%@ taglib uri="http://eos.primeton.com/tags/bean" prefix="b"%>
<%@taglib uri="http://eos.primeton.com/tags/html" prefix="h"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<link href="css/kendo.common.min.css" rel="stylesheet">
<link href="css/kendo.default.min.css" rel="stylesheet">
<link href="css/examples-offline.css" rel="stylesheet">
<script src="js/jquery.min.js"></script>
<script src="js/kendo.web.min.js"></script>
