<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>登录</title>
		<link rel="stylesheet" type="text/css" href="../qian/css/public.css"/>
		<link rel="stylesheet" type="text/css" href="../qian/css/login.css"/>
	</head>
	<body>
		<!-------------------login-------------------------->
		<div class="login">
			<form action="../denglu/logins" method="get">
				<h1><img src="../images/logo.png" width="123px" height="42px" ></h1>
				<p></p>
				<div class="msg-warn hide"><b></b>公共场所不建议自动登录，以防账号丢失</div>
				<p><input type="text" name="uname" value="" placeholder="昵称/邮箱/手机号"></p>
				<p><input type="password" name="upwd" value="" placeholder="密码"></p>
				<p><input type="submit" value="登  录"></p>
				<p class="txt"><a class="" href="../denglu/addusers">免费注册</a><a href="forget.jsp">忘记密码？</a></p>
			</form>
		</div>
	</body>
</html>
