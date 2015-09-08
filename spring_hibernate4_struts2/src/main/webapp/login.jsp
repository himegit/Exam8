<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="bootstrap.min.css" type="text/css" />
<title>请登录</title>
<style type="text/css">
body {
	
}

.vertical-center {
	background-color: #ffffff;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	border: 1px solid gray;
	position: absolute;
}
</style>
</head>
<body background="img/background.jpg">
	<div class="container">
		<h1>8815 林家俊</h1>
	</div>
	<div class="container col-lg-4  vertical-center ">
		<h3>电影租凭管理系统</h3>
		<form action="LoginAction.action" method="post">
			<div class=" table table-responsive">
				<table class="table table-striped">
					<tr class="info">
						<td colspan="2"><label for="exampleInputPassword1">账号：</label>
							<input type="text" placeholder="UserName" class="form-control" name="user.name"
							value="<s:property value="user.getName()"/>"></td>
					</tr>
					<tr class="info">
						<td colspan="2"><label for="exampleInputPassword1">密码：</label>
							<input class="form-control" type="password" placeholder="password"
							name="user.password"></td>
					</tr>
					<tr>
						<td><button type="reset" class="btn btn-default col-lg-12">重置</button></td>
						<td><button type="submit" class="btn btn-default col-lg-12">提交</button></td>
					</tr>
					<tr>
						<td colspan="2" class="danger"><span
							class="label label-danger"><s:property value="errMsg" /></span></td>
					</tr>
				</table>
			</div>
		</form>
	</div>
</body>
</html>