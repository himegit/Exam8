<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录成功</title>
</head>
<body>
<%
	Object admin = session.getAttribute("admin");
	if(admin==null){
	 	out.println(session.getAttribute("admin")); 
		%>
		<h3>登录超时，请重新登录</h3>
		<a href="login.jsp">请返回等录页面</a>
		<%
	}else{
%>
	<H1>登录成功</H1>
	<h4>你的ID号为：<%=session.getId() %></h4>
	<%=session.getAttribute("admin") %>
	<a href="LoginOut">退出</a>
	<%} %>
</body>
</html>