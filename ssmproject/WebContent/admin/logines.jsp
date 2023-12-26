<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }
        html {
            height: 100%;
        }
        body {
            height: 100%;
        }
        .container {
            height: 100%;
            background-image: linear-gradient(to right, #fbc2eb, #a6c1ee);
        }
        .login-wrapper {
            background-color: #fff;
            width: 358px;
            height: 588px;
            border-radius: 15px;
            padding: 0 50px;
            position: relative;
            left: 50%;
            top: 50%;
            transform: translate(-50%, -50%);
        }
        .header {
            font-size: 38px;
            font-weight: bold;
            text-align: center;
            line-height: 200px;
        }
        .input-item {
            display: block;
            width: 100%;
            margin-bottom: 20px;
            border: 0;
            padding: 10px;
            border-bottom: 1px solid rgb(128, 125, 125);
            font-size: 15px;
            outline: none;
        }
        .input-item:placeholder {
            text-transform: uppercase;
        }
        .btn {
            /* text-align: center; */
            margin:-30px;
            padding: 10px;
            width: 80%;
            margin-top: 40px;
            background-image: linear-gradient(to right, #a6c1ee, #fbc2eb);
            color: #fff;
        }
        .msg {
            text-align: center;
            line-height: 88px;
        }
        a {
            text-decoration-line: none;
            color: #abc1ee;
        }
    </style>
<link rel="stylesheet" href="../layui/css/layui.css" media="all">
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../layui/layui.js"></script>
</head>
<body>
    <div class="container">
        <div class="login-wrapper">
            <div class="header">靠谱水果店登录</div>
            <div class="form-wrapper">
                <form class="layui-form" method="post" id="container">
  <div class="layui-form-item">
    <label class="layui-form-label">账号</label>
    <div class="layui-input-inline">
      <input type="text" name="uname"  lay-verify="required" placeholder="请输入账号" autocomplete="off" class="input-item">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">密码</label>
    <div class="layui-input-inline">
      <input type="password" name="upwd"  lay-verify="required" placeholder="请输入密码" autocomplete="off" class="input-item">
    </div>
  </div>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="btn" lay-submit lay-filter="denglu">登录</button>
    </div>
  </div>
</form>
            </div>
        </div>
    </div>
</body>
<script type="text/javascript">
layui.use(['layer','table','form','laydate','upload'], function(){
	  var table = layui.table,
	  form=layui.form,
	  layer=layui.layer,
	  laydate=layui.laydate,
	  upload=layui.upload,
	  $=layui.$;
	  
	  form.on('submit(denglu)', function(data){
		  $.post("../user/login",
				  data.field,function(res){
			  	if(res.code=="0"){
			  		layer.msg(res.msg,{icon:1,time:2000},function(){
			  			location.href="index.jsp";
						  layer.closeAll();
			  		});
			  	}else{
			  		layer.msg(res.msg,{time:2000},function(){
			  			location.href="logines.jsp";
						  layer.closeAll();
			  		});
			  	
			  	}
		  },"json"); 
		  return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
	  });  
}); 
</script>
</html>
