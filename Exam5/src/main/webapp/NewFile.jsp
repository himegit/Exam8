<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>创建customer</title>
<style type="text/css">
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
table{
	border:1px solid black:
}
td{
	width:150px;
	font-size: 20px;
}
</style>

</head>
<body>
	<%@ include file="in.html"%>
	<div id="divleft"></div>
	
	
	<div id="divright">
	<h3>基本信息</h3>
	<hr>
		<form action="LoginServlet" method="post" >
			<table>
				<tr>
					<td>FirstName</td>
					<td><input type="text" name="firstname"></td>
				</tr>
				<tr>
					<td>LastName</td>
					<td><input type="text" name="lastname"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address"></td>
				</tr>
			</table>
			<input type="submit" value="确定">
		</form>
	</div>
</body>
</html>