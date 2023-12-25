<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="utf-8" />
		<title>个人信息</title>
		<link rel="stylesheet" type="text/css" href="../qian/css/public.css"/>
		<link rel="stylesheet" type="text/css" href="../qian/css/mygrxx.css" />
		<link rel="stylesheet" href="../layui/css/layui.css" media="all">
		<script type="text/javascript" src="../js/jquery.min.js"></script>
		<script type="text/javascript" src="../layui/layui.js"></script>
	</head>
	<body>
		<!------------------------------head------------------------------>
	<div class="head ding">
			<div class="wrapper clearfix">
				<div class="clearfix" id="top">
				<h1 class="fl">
					<a href="../IndexController/getindex"><img src="../images/logo.png" width="200px" height="70px"/></a>
				</h1>
				<div class="fr clearfix" id="top1">
					
					<form action="#" method="get" class="fl">
						<input type="text" placeholder="搜索" /> <input
							type="button" />
					</form>
				</div>
			</div>
		
		</div>
	</div>
		<!------------------------------idea------------------------------>
		<div class="address mt">
			<div class="wrapper clearfix">
				<a href="../IndexController/getindex" class="fl">首页</a>
				<span>/</span>
				<c:forEach items="${user}" var="user" >
				<a href="../MyginController/getUser?uid=${user.uid}" class="on">个人中心</a>
				</c:forEach>
			</div>
		</div>
		
		<!------------------------------Bott------------------------------>
		<div class="Bott">
			<div class="wrapper clearfix">
			<c:forEach items="${user}" var="user" >
				<div class="zuo fl">
					<h3>
						<a href="#"><img src="../images/${user.uimg} " width="92px" height="92px" style="border-radius: 100px"/></a>
						<p class="clearfix"><span class="fl">${user.uname}</span><a href="../denglu/login"><span class="fr">[退出登录]</span></p></a>
					</h3>
					<div>
						<h4>我的交易</h4>
						<ul>
							<li><a href="../CartController/Gowu?uid=${user.uid}">我的购物车</a></li>
							<li><a href="../MyorderqController/Myorderq?uid=${user.uid}">我的订单</a></li>
							<li><a href="../MyorderqController/Myorderq?uid=${user.uid}">评价晒单</a></li>
						</ul>
						<h4>个人中心</h4>
						<ul>
							<li><a href="../MyginController/getUser?uid=${user.uid}">我的中心</a></li>
							<li><a href="../AddressController/addres?uid=${user.uid}">地址管理</a></li>
						</ul>
						<h4>账户管理</h4>
						<ul>
							<li  class="on"><a href="../MygrxxController/getUser?uid=${user.uid}">个人信息</a></li>
							<li><a href="../denglu/uppwd">修改密码</a></li>
						</ul>
					</div>
				</div>
				<table id="demo" lay-filter="test"></table>
				<div class="you fl">
					<h2>个人信息</h2>
					<div class="gxin">
						<div class="tx"><a href="#"><img src="../images/${user.uimg} " width="92px" height="92px" style="border-radius: 50px"/><p id="avatar">修改头像</p></a></div>	
						<div class="xx">
							<h3 class="clearfix"><strong class="fl">基础资料</strong><a href="#" class="fr" id="edit1">编辑</a></h3>
							<div>姓名：${user.uname}</div>
							<div>生日：<fmt:formatDate value="${user.ubirthday}"/> </div>
							<div>性别：${user.usex}</div>
							<h3>高级设置</h3>
							<!--<div><span class="fl">银行卡</span><a href="#" class="fr">管理</a></div>-->
							<div><span class="fl">账号地区：中国</span><a href="#" class="fr" id="edit2">修改</a></div>
						</div>
					</div>			
				</div>
				
			</div>
		</div>
		<!--遮罩-->
		<div class="mask"></div>
		<!--编辑弹框-->
		<div class="bj">
			<div class="clearfix"><a href="#" class="fr gb"><img src="../qian/img/icon4.png"/></a></div>
			<h3>编辑基础资料</h3>
			<form action="#" method="get" class="layui-form" lay-filter="feedit">
				<p><input type="hidden"  name="uid" value="${user.uid}" readOnly/></p>
				<p><label>生日：</label><input type="text"  name="ubirthday" id="begin" value="<fmt:formatDate type="both" value="${user.ubirthday}"/>"  /></p>
			    <p><label>性别：</label>
					<select name="usex">
					<option value="男">男</option>
					<option value="女">女</option>
					</select>
				</p>
				<div class="bc">
					<button class="layui-btn" lay-submit lay-filter="update">修改</button>
					<input type="button" value="取消" />
				</div>
			</form>
		</div>
		
		<!--高级设置修改-->
		<div class="xg">
			<div class="clearfix"><a href="#" class="fr gb"><img src="../qian/img/icon4.png"/></a></div>
			<h3>切换账号地区</h3>
			<form action="#" method="get">
				<p><label>地区：</label><input type="text"  value="六六六" /></p>
				<div class="bc">
					<input type="button" value="保存" />
					<input type="button" value="取消" />
				</div>
			</form>
		</div>
		<!--修改头像-->
		<div class="avatar">
			<div class="clearfix"><a href="#" class="fr gb"><img src="../qian/img/icon4.png"/></a></div>
			<h3>修改头像</h3>
			<form action="#" class="layui-form" lay-filter="fmupdate">
				<p><input type="hidden"  name="uid" value="${user.uid}" readOnly/></p>
				<div class="layui-form-item">
    			<label class="layui-form-label">图片</label>
    			<div class="layui-input-block">
    			<button type="button" class="layui-btn" id="img">
     			<i class="layui-icon">&#xe67c;</i>上传图片
 				</button><br>
 				<img id="phose" style="width:120px" src="../images/${user.uimg}"/><br/>
      			<input type="hidden" name="uimg" id="uimg" autoco mplete="off" placeholder="请上传图片" class="layui-input">
    			</div>
  				</div>
				 <button class="layui-btn" lay-submit lay-filter="updemomen">修改</button>	 
			</form>
		</div>
		
		</c:forEach>
		<!--返回顶部-->
		<div class="gotop">
		<c:forEach items="${user}" var="user" >
			<a href="../CartController/Gowu?uid=${user.uid}">
			<dl>
				<dt><img src="../qian/img/gt1.png"/></dt>
				<dd>去购<br />物车</dd>
			</dl>
			</a>
			</c:forEach>
			<a href="#" class="dh">
			<dl>
				<dt><img src="../qian/img/gt2.png"/></dt>
				<dd>联系<br />客服</dd>
			</dl>
			</a>
			<c:forEach items="${user}" var="user" >
			<a href="../MygrxxController/getUser?uid=${user.uid}">
			<dl>
				<dt><img src="../qian/img/gt3.png"/></dt>
				<dd>个人<br />中心</dd>
			</dl>
			</a>
			</c:forEach>
			<a href="#" class="toptop" style="display: none">
			<dl>
				<dt><img src="../qian/img/gt4.png"/></dt>
				<dd>返回<br />顶部</dd>
			</dl>
			</a>
			<p>XXX</p>
		</div>
		<!--footer-->
		<div class="footer">
			<div class="top">
				<div class="wrapper">
					<div class="clearfix">
						<a href="#2" class="fl"><img src="../qian/img/foot1.png"/></a>
						<span class="fl">7天无理由退货</span>
					</div>
					<div class="clearfix">
						<a href="#2" class="fl"><img src="../qian/img/foot2.png"/></a>
						<span class="fl">15天免费换货</span>
					</div>
					<div class="clearfix">
						<a href="#2" class="fl"><img src="../qian/img/foot3.png"/></a>
						<span class="fl">满599包邮</span>
					</div>
					<div class="clearfix">
						<a href="#2" class="fl"><img src="../qian/img/foot4.png"/></a>
						<span class="fl">手机特色服务</span>
					</div>
				</div>
			</div>
			<p class="dibu">最家家居&copy;2020公司版权所有 京ICP备XXX备XXX号<br />
			违法和不良信息举报电话：XXX，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</p>
		</div>
		<script src="../qian/js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="../qian/js/public.js" type="text/javascript" charset="utf-8"></script>
		<script src="../qian/js/user.js" type="text/javascript" charset="utf-8"></script>
	</body>
	<script>
	layui.use(['table', 'form','laydate','laypage','upload'], function(){
		var table = layui.table,
		form = layui.form,
		upload =layui.upload,
		laydate=layui.laydate,
		laypage = layui.laypage,
		$=layui.$;
		//日期时间范围选择
		laydate.render({ 
		  elem: '#begin'
		  ,type: 'datetime'
		});
		  var uploadInst = upload.render({
			    elem: '#img' //绑定元素
			    ,url: '../upload' //上传接口
			    ,done: function(res){
			     if(res.code=="0"){
			    	 //把返回的图片名，放到img标记的src里面
			    	 $("#phose").attr("src","../images/"+res.msg);
			    	 //把返回的图片名，保存在隐藏域里面
			    	 $("#uimg").val(res.msg);
			    	 layer.msg('新图片上传成功',{
			    		 icon:6,
			    		 time:1500
			    	 });
			     }
			    }
			    ,error: function(){
			      //请求异常回调
			    }
			  });
		  form.on('submit(update)', function(data){
		 	  $.post("../UpdateMygrxxController/updateUser",data.field,function(res){
		 		  if(res.code=="0"){
		 			  layer.msg(res.msg,{icon:1,time:2000},function(){
		 				 setTimeout('window.location.reload()',1000);
		 			  });
		 		  }else{
		 			  layer.msg(res.msg);
		 		  }
		 	  },"json");
		 	  return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
		 	});
		  form.on('submit(updemomen)', function(data){
			  
		 	  $.post("../UpdateMygrxxController/updateUimg",data.field,function(res){
		 		  if(res.code=="0"){
		 			  layer.msg(res.msg,{icon:1,time:2000},function(){
		 				 setTimeout('window.location.reload()',1000);
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


