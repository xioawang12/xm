<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script src="../qian/js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
</head>
<body onload="jiazai()">
<input type="button" value="按钮显示" onclick="ji()">
<form action="" id="fm" >
价格<input type="text" value="1">
价格<input type="text" value="1">
价格<input type="text" value="1">
价格<input type="text" value="1">
价格<input type="text" value="1">
价格<input type="text" value="1">
<input type="button" value="按钮隐藏" onclick="jian()">
</form>
</body>
<script type="text/javascript">
function jian() {
	document.getElementById('fm').style.display='none';
}
function ji() {

	document.getElementById('fm').style.display='';
}
function jiazai() {

	document.getElementById('fm').style.display='none';
} 
</script>
</html>