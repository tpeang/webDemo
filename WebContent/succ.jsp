<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName()+ ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传成功</title>
</head>
<body>
	上传成功！
	<br /> 文件标题：
	<s:property value=" + title" />
	<br /> 文件为:
	<!-- <img src="'upload/'+uploadFileName" /> -->
	<s:property value='savePath'/>
	<%-- <img src="<s:property value='savePath'/>\<s:property value='uploadFileName'/>"/> --%>
	  <img src="<%=basePath %>upload/<s:property value='uploadFileName'/>"/> 
</body>
</html>