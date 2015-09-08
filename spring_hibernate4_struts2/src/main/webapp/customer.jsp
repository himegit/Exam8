<%@page import="com.hand.model.Address"%>
<%@page import="java.util.List"%>
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
					<li class=""><a href="#section-1">DoshBoord</a></li>
					<li><a href="#section-2">应用设置</a></li>
					<li><a href="#section-3">管理设置</a></li>
					<li><a href="#section-4">数据配置</a></li>
					<li><a href="#section-5">主数据管理</a></li>
					<li><a href="#section-6">发货单管理</a></li>
				</ul>
			</div>

			<div class="col-xs-10  pull-left">
				<h2 id="section-1">用户管理</h2>


				<h2 id="section-2">创建Customer</h2>
				<hr style="width: 1; border: 1 dashed blue;">
				<h4>基本信息</h4>
				<form role="form" class="form-horizontal">
					<div class="form-group">
						<label class="col-sm-2 control-label">First Name</label>

						<div class="col-sm-10">
							<input type="text" class="form-control" placeholder="First Name">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">Last Name</label>

						<div class="col-sm-10">
							<input type="password" class="form-control"
								placeholder="Last Name">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">Email</label>

						<div class="col-sm-10">
							<input type="password" class="form-control" placeholder="Email">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">Address</label>
						<%
							DaoImp daoImp = new DaoImp();
								List<Address> lists = daoImp.showAddress();
						%>
						<div class="col-sm-10">
							<select class="selectpicker">
								<%
									for(Address add : lists){
										%>
										<option><%=add.getAddress() %></option>
										<%
									}
								%>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label"></label>
						<button type="submit" class="btn btn-primary col-sm-2 center">创建</button>
					</div>
					
				</form>
				<h2 id="section-3">管理设置</h2>
				<h2 id="section-4">数据配置</h2>
				<h2 id="section-5">主数据管理</h2>
				<h2 id="section-5">发货单管理</h2>
			</div>
		</div>
	</div>
	<%
		}
	%>

	<script type="text/javascript" src="jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="bootstrap.min.js"></script>
	<script type="text/javascript">
		$('.date').datetimepicker({
			format : yyyy - mm - dd,
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			forceParse : 0,
			showMeridian : 1
		})
	</script>
</body>
</html>