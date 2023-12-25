<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../layui/css/layui.css" media="all">
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../layui/layui.js"></script>
<style type="text/css">
	
	.layui-input{
	outline-style: none;border: 0 none;
	}
	.layui-table-cell{
 		height:auto;
	}
</style>
</head>
<body>
<form class="layui-form"  lay-filter="fmedit" action="" id="gaicomm">
	<input type="hidden" name="uid" value="${user.uid}">
	<input type="hidden" name="upwd" value="${user.upwd}">
  <div class="layui-form-item">
    <label class="layui-form-label">输入密码</label>
    <div class="layui-input-block" style="width: 120px">
      <input type="password" name="upwd2" id="upwd" required lay-verify="required" autocomplete="off" placeholder="请输入密码" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">输入新密码</label>
    <div class="layui-input-block" style="width: 120px">
      <input type="password" name="upwd3" id="upwd3" required lay-verify="required" autocomplete="off" placeholder="请输入密码" class="layui-input">
    </div>
  </div> 
  <div class="layui-form-item">
    <label class="layui-form-label">再次输入新密码</label>
    <div class="layui-input-block" style="width: 120px">
      <input type="password" name="upwd4" id="upwd4" required lay-verify="required" autocomplete="off" placeholder="请输入密码" class="layui-input">
    </div>
  </div> 
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="gaidemomen">修改</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
 </form>
</body>
<script>
layui.use(['table','form','layer','upload'], function(){
	  var table = layui.table,
	  form=layui.form,
	  $=layui.$,
	  layer=layui.layer,
	  upload=layui.upload;
form.on('submit(gaidemomen)', function(data){
    $.post("../user/uppwd",data.field,function(res){
	  if(res.code=="0"){
		  layer.msg(res.msg,function(){
			  layer.closeAll();
			  window.top.location.href="logines.jsp";
		  });
	  }else{
		  layer.msg(res.msg);
	  }
 },"json");
 return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
});
});
</script>
</html>