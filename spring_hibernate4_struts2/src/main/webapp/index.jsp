<%@page import="com.hand.dao.DaoImp"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="bootstrap.min.css" type="text/css" />
<script type="text/javascript"></script>
<title>登录成功</title>

<style type="text/css">
.divfloat {
	float: left;
}

.ma {
	margin-top: 150px;
}
</style>


</head>
<body>
	<script type="text/javascript" src="jquery-2.1.4.min.js"></script>
	<script type="text/javascript">
		function del(obj) {
			if (window.confirm('您确定要删除该记录吗？')) {
				//alert("确定");
				var customer_id = obj.attributes[2].nodeValue;
				$.post("/spring_hibernate4_struts2/Del", {
					customer_id : customer_id
				//city:"Duckburg"
				}, function(data, status) {
					alert("删除成功");
				});
				return true;
			} else {
				//alert("取消");
				return false;
			}
		}
	</script>
	<%
		Object admin = session.getAttribute("admin");
		if (admin == null) {
			out.println(session.getAttribute("admin"));
	%>
	<h3>登录超时，请重新登录</h3>
	<a href="login.jsp">请返回等录页面</a>
	<%
		} else {
	%>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<a href="#" class="navbar-brand active btn btn-drfault"><strong>WINHERE</strong></a>
		</div>
		<div id="navbar" class="collapse navbar-collapse pull-right">
			<ul class="nav navbar-nav ">
				<li><a href="LoginOut">退出</a></li>
			</ul>
		</div>
	</div>
	</nav>

	<div class="container ma">
		<div class="row">
			<div class="col-xs-2 divfloat" id="myScrollspy">
				<ul class="nav nav-tabs nav-stacked">
					<li class=""><a href="#section-1">Customer管理</a></li>
					<li><a href="#section-2">Film设置</a></li>
				</ul>
			</div>

			<div class="col-xs-10  pull-left">
				<h2 id="section-1">用户管理</h2>
				<hr style="width: 1; border: 1 dashed blue;">
				<h4>
					客户列表 <a class="btn btn-primary" href="customer.jsp">新建</a>
				</h4>
				<div class="table-responsive">
					<table class="table table-bordered table-condensed">
						<tr class="active">
							<th>操作</th>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Address</th>
							<th>Email</th>
							<th>Customer ID</th>
							<th>LastUppdate</th>
						</tr>
						<%
							DaoImp daoImp = new DaoImp();
								ResultSet rs = daoImp.showCustomer();
								while (rs.next()) {
						%>
						<tr class="success">
							<td><button class="btn btn-warning" type="button"
									value="<%=rs.getShort(5)%>" id="edit">编辑</button>
								<button class="btn btn-danger" type="button"
									value="<%=rs.getShort(5)%>" id="del" onclick="del(this)">删除</button></td>
							<td><%=rs.getString(1)%></td>
							<td><%=rs.getString(2)%></td>
							<td><%=rs.getString(3)%></td>
							<td><%=rs.getString(4)%></td>
							<td><%=rs.getShort(5)%></td>
							<td><%=rs.getDate(6)%></td>
						</tr>
						<%
							}
						%>
					</table>
				</div>
				<h2 id="section-2">Film管理</h2>

			</div>
		</div>
	</div>
	<%
		}
	%>
</body>
</html>