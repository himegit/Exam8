<%@page import="daoimp.DaoImp"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录成功</title>
<link rel="stylesheet" href="bootstrap.min.css" />
<style>
h3 {
	color: #ffffff;
}

#divleft {
	float: left;
	width: 20%;
	height: 700px;
	border: 1px solid black;
	margin: 100px 20px;
}

#divright {
	float: left;
	width: 70%;
	height: 700px;
	border: 1px solid black;
	margin: 100px 20px;
	overflow: auto;
}

th {
	width: 100px;
	font-size: 15px;
}
</style>
<script src="jquery-2.1.4.min.js"></script>
<script src="bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<h5 class="navbar-brand" href="#">8815 林家俊</h5>
		</div>
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="LoginServlet" class="text-center">退出</a></li>
			</ul>
		</div>
	</div>
	</nav>
	<div id="divleft">
		<div class="btn-group btn-group-xs">
			<button type="button" class="btn btn-default">
				Customer管理<span class="glyphicon glyphicon-align-right"></span>
			</button>
		</div>
		<br>
		<div class="btn-group btn-group-xs">
			<button type="button" class="btn btn-default">
				Film设置<span class="glyphicon glyphicon-align-right"></span>
			</button>
		</div>

	</div>
	<div id="divright">

		<h1>客户列表</h1>
		<hr>
		<a class="btn btn-default" href="NewFile.jsp">新建</a>
		<table style="border: 1px solid black; margin-left: 50px;">
			<tr>
				<th>操作</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>address</th>
				<th>CustomerId</th>
				<th>LastUpdate</th>
			</tr>


		<%
			DaoImp di = new DaoImp();
			ResultSet rs = di.showCustomerInfo();
			while (rs.next()) {
		%>
		<tr>
			<td><a href="#" onclick="a()">编辑</a>|<a href="#" onclick="b()">删除</a></td>
			<%
				out.print("<td>" + rs.getString(3) + "</td>");
				out.print("<td>" + rs.getString(4) + "</td>");
				out.print("<td>" + rs.getString(5) + "</td>");
				out.print("<td>" + rs.getInt(1) + "</td>");
				out.print("<td>" + rs.getDate(9) + "</td>");
			%>
		</tr>
		<%
			}
		%>
		</table>
		
		
	</div>
	
	<script type="text/javascript">
		function a(){
			alert("是否要编辑？");
		}
		function b(){
			alert("是否要删除？");
		}
	</script>
</body>
</html>