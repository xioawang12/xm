<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="utf-8" />
		<title>最家</title>
		<link rel="stylesheet" type="text/css" href="../qian/css/public.css"/>
		<link rel="stylesheet" type="text/css" href="../qian/css/myorder.css" />
		<link rel="stylesheet" href="../layui/css/layui.css" media="all">
		<script type="text/javascript" src="../js/jquery.min.js"></script>
		<script type="text/javascript" src="../layui/layui.js"></script>
	</head>
	<body>
		<!------------------------------head------------------------------>
		<div class="head ding">
			<div class="wrapper clearfix">
				<div class="clearfix" id="top">
					<h1 class="fl"><a href="../IndexController/getindex"><img src="../images/logo.png" width="200px" height="70px"/></a></h1>
					<div class="fr clearfix" id="top1">
						
						<form action="#" method="get" class="fl">
							<input type="text" placeholder="搜索" />
							<input type="button" />
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
				<a href="../MyginController/getUser?uid=${user.uid}" class="on">个人中心</a>
				<span>/</span>
				<a href="#" class="on">待评价商品</a>
			</div>
		</div>
		
		
		<!------------------------------Bott------------------------------>
		<div class="Bott">
			<div class="wrapper clearfix">
					<div class="zuo fl">
						<h3>
							<a href="#"><img src="../images/${user.uimg} " width="92px" height="92px" style="border-radius: 100px"/></a>
							<p class="clearfix"><span class="fl">${user.uname}</span><a href="../denglu/login"><span class="fr">[退出登录]</span></a></p>
						<h3>
					<div>
						<h4>我的交易</h4>
						<ul>
							<li><a href="../CartController/Gowu?uid=${user.uid}">我的购物车</a></li>
							<li><a href="../MyorderqController/Myorderq?uid=${user.uid}">我的订单</a></li>
							<li><a href="../MyprodController/AllComments?uid=${user.uid}">评价晒单</a></li>
						</ul>
						<h4>个人中心</h4>
						<ul>
							<li  class="on"><a href="../MyginController/getUser?uid=${user.uid}">我的中心</a></li>
							<li><a href="../AddressController/addres?uid=${user.uid}">地址管理</a></li>
						</ul>
						<h4>账户管理</h4>
						<ul>
							<li><a href="../MygrxxController/getUser?uid=${user.uid}">个人信息</a></li>
							<li><a href="../denglu/uppwd">修改密码</a></li>
						</ul>
					</div>
				</div>
				<div class="you fl">
					<div class="my clearfix">
						<h2 class="fl">商品评价</h2>
					</div>
					<div class="dlist">
						<ul class="clearfix" id="pro">
							<li class="on"><a href="#2">待评价商品</a></li>
							<li><a href="#2">已评价商品</a></li>
						</ul>
					</div>
					
					<div class="sx clearfix">
					
						<div class="clearfix">
						<c:forEach items="${com}" var="com" >
							<c:if test="${com.orders.orderstate==4}">
							<span style="display: none;" id="orderid${com.orders.orderid}">${com.orders.orderid}</span>
							<span style="display: none;" id="pid${com.orders.orderid}">${com.product.pid}</span>
							<span style="display: none;" id="pimg${com.orders.orderid}">${com.product.pimg}</span>
							<dl class="fl">
								<dt><a href="#"><img src="../images/${com.product.pimg}" width="162px" height="200px"/></a></dt>
								<dd><a href="#">${com.product.pname}</a></dd>
								<dd>${com.price}</dd>
								<!-- <dd>1人评价</dd> -->
								
								<dd><a href="#2"  onclick="pingjia(${com.orders.orderid})">评价</a></dd>
							</dl> 
							</c:if>
							
						</c:forEach>
						</div>
						<script type="text/javascript">
						function pingjia(id){
							var orderid=document.getElementById('orderid'+id).innerText;
							var pid=document.getElementById('pid'+id).innerText;
							var pimg=document.getElementById('pimg'+id).innerText;
							console.log(orderid)
							console.log(pid)
							console.log(pimg)
							document.getElementById('orderid').value=orderid;
							document.getElementById('pid').value=pid;
							document.getElementById('pimg').value=pimg;
						}
						
						</script>
						<div class="clearfix">
							<c:forEach items="${coms}" var="com" >
							<c:if test="${com.orders.orderstate==5}">
							<span style="display: none;" id="pid${com.orders.orderid}">${com.product.pid}</span>
							<dl class="fl">
								<dt><a href="../ProDetailController/getDetail?pid=${com.product.pid}&cateid=${com.product.cateid}"><img src="../images/${com.product.pimg}" width="162px" height="200px"/></a></dt>
								<dd><a href="../ProDetailController/getDetail?pid=${com.product.pid}&cateid=${com.product.cateid}">${com.product.pname}</a></dd>
								<dd>${com.price}</dd>
								<!-- <dd>1人评价</dd> -->
								<dd><a href="#2" onclick="chakanpingjia(${com.orders.orderid})">查看评价</a></dd>
							</dl> 
							</c:if>
							
						</c:forEach>
						</div>
						<script type="text/javascript">
						function chakanpingjia(id){
							var pid=document.getElementById('pid'+id).innerText;
							console.log(pid)
							$.post("../MyprodController/Comments",{"pid":pid},function(res){
								if(res.code=="0"){
									document.getElementById('pingjia2').value=res.data[0].comcontet;
			        			}else{
			        				alert(res.msg);
			        				setTimeout('window.location.reload()',1);
			        			} 
							},"json");
						}
						
						</script>
						
					</div>
					
				</div>
			</div>
		</div>
		
			<!--<dl class="fl">
								<dt><a href="#"><img src="img/nav3.jpg"/></a></dt>
								<dd><a href="#">家用创意壁挂  釉下彩复古</a></dd>
								<dd>¥199.00</dd>
								<dd>16000人评价</dd>
								<dd><a href="#">待评价</a></dd>
							</dl>
							<dl class="fl">
								<dt><a href="#"><img src="img/nav3.jpg"/></a></dt>
								<dd><a href="#">家用创意壁挂  釉下彩复古</a></dd>
								<dd>¥199.00</dd>
								<dd>16000人评价</dd>
								<dd><a href="#">待评价</a></dd>
							</dl>-->
			
			<!--遮罩-->
			<div class="mask"></div>
			<!--评价弹框-->
			<div class="pj">
				<div class="clearfix"><a href="#" class="fr gb"><img src="../qian/img/icon4.png"/></a></div>
				<h3>商品评分</h3>
				<form action="#" method="get"  >
						<input type="hidden" id="orderid">
						<input type="hidden" id="pid">
						<input type="hidden" id="pimg">
						<input type="hidden" id="uid" value="${user.uid}">
      					<textarea name="" rows="" cols="" placeholder="请输入评价" id="pingjia"></textarea>
   		 				
					<div class="bc">
						<input type="button" onclick="pj()" value="评价"  />
						<input type="button" value="取消" /> 
					</div>
				</form>
			</div>
			<script type="text/javascript">
			function pj(){
				var orderid=document.getElementById('orderid').value;
				var pid=document.getElementById('pid').value;
				var uid=document.getElementById('uid').value;
				var pimg=document.getElementById('pimg').value;
				var pingjia=document.getElementById('pingjia').value;
				console.log(orderid)
				console.log(pid)
				console.log(uid)
				console.log(pimg)
				console.log(pingjia)
				$.post("../MyprodController/updateOrderss",{"orderid":orderid},function(res){
				},"json");
				$.post("../MyprodController/AddComments",{"pid":pid,"uid":uid,"comimgs":pimg,"comcontet":pingjia},function(res){
					if(res.code=="0"){
						alert(res.msg);
        				setTimeout('window.location.reload()',1000);
        			}else{
        				alert(res.msg);
        				setTimeout('window.location.reload()',1000);
        			} 
				},"json");
			}
			</script>
			<!--查看评价-->
			<div class="chak">
				<div class="clearfix"><a href="#" class="fr gb"><img src="../qian/img/icon4.png"/></a></div>
				<h3>商品评分</h3>
				<form action="#" method="get">
					<!-- <div class="clearfix">
						<p class="fl">请打分：</p>
						<p class="fl" id="xin">
							<a href="#2"><img src="../qian/img/hxin.png"/></a>
							<a href="#2"><img src="../qian/img/hxin.png"/></a>
							<a href="#2"><img src="../qian/img/hxin.png"/></a>
							<a href="#2"><img src="../qian/img/hxin.png"/></a>
							<a href="#2"><img src="../qian/img/hxin.png"/></a>
						</p>
					</div> -->
					<textarea name="" rows="" cols="" id="pingjia2" placeholder="请输入评价" ></textarea>
					<div class="bc">
						<input type="button" value="保存"  />
						<input type="button" value="取消" />
					</div>
				</form>
			</div>
			
			
			
			
		<!--返回顶部-->
		<div class="gotop">
			<a href="../CartController/Gowu?uid=${user.uid}">
			<dl>
				<dt><img src="../qian/img/gt1.png"/></dt>
				<dd>去购<br />物车</dd>
			</dl>
			</a>
			<a href="#" class="dh">
			<dl>
				<dt><img src="../qian/img/gt2.png"/></dt>
				<dd>联系<br />客服</dd>
			</dl>
			</a>
				<a href="../MyginController/getUser?uid=${user.uid}" class="on">
			<dl>
				<dt><img src="../qian/img/gt3.png"/></dt>
				<dd>个人<br />中心</dd>
			</dl>
			</a>
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
		
 
});
</script>
</html>
