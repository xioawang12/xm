<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="utf-8" />
		<title>个人信息</title>
		<link rel="stylesheet" type="text/css" href="../qian/css/public.css"/>
		<link rel="stylesheet" type="text/css" href="../qian/css/mygrxx.css" />
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
					<p class="fl">
						<c:if test="${user==null}">
						<a href="../denglu/login" id="login">登录</a> <a href="../denglu/addusers" id="reg">注册</a>
					</c:if>
				<c:if test="${user!=null}">
				<a href="../MyginController/getUser?uid=${user.uid}">欢迎您：${user.uname}</a>
				</c:if>
					</p>
					<form action="#" method="get" class="fl">
						<input type="text" placeholder="搜索" /> <input
							type="button" />
					</form>
					<div class="btn fl clearfix">
						<a href="../MyginController/getUser?uid=${user.uid}"><img src="../qian/img/grzx.png" /></a> <a href="#"
							class="er1"><img src="../qian/img/ewm.png" /></a> <a href="../CartController/Gowu"><img
							src="../qian/img/gwc.png" /></a>
						<p>
							<a href="#"><img src="../qian/img/smewm.png" /></a>
						</p>
					</div>
				</div>
			</div>
			<ul class="clearfix" id="bott">
				<li><a href="../IndexController/getindex">首页</a></li>
				<li><a href="../PaintController/getpros">所有商品</a>
						<div class="sList">
							<div class="wrapper  clearfix">
								<c:forEach items="${list2}" var="list2">
								<a href="../flowerder/getpro?cateid=${list2.cateid }"> 
								<dl>
									<dd>${list2.catename}</dd>
									</dl></a>
								</c:forEach>
						</div>
					</div></li>
				<c:forEach items="${list}" var="list">
					<li class=""><a href="../flowerder/getpro?cateid=${list.cateid }">${list.catename}</a>
						</li>
				</c:forEach>
			</ul>
		</div>
	</div>
		<!------------------------------idea------------------------------>
		<div class="address mt">
			<div class="wrapper clearfix">
				<a href="../IndexController/getindex" class="fl">首页</a>
				<span>/</span>
				<a href="../MyginController/getUser?uid=${user.uid}" class="on">个人信息</a>
			</div>
		</div>
		
		<!------------------------------Bott------------------------------>
		<div class="Bott">
			<div class="wrapper clearfix">
				<div class="zuo fl">
					<h3>
						<a href="#"><img src="../images/${user.uimg}"   width="92px" height="92px"  style="border-radius: 50px""/></a>
						<p class="clearfix"><span class="fl">${user.uname}</span><a href="../denglu/login"><span class="fr">[退出登录]</span></a></p>
					</h3>
					<div>
						<h4>我的交易</h4>
						<ul>
							<li><a href="../CartController/Gowu?uid=${user.uid}">我的购物车</a></li>
							<li><a href="../MyorderqController/Myorderq?uid=${user.uid}">我的订单</a></li>
							<li><a href="../MyprodController/AllComments?uid=${user.uid}">评价晒单</a></li>
						</ul>
						<h4>个人中心</h4>
						<ul>
							<li><a href="../MyginController/getUser?uid=${user.uid}">我的中心</a></li>
							<li><a href="../AddressController/addres?uid=${user.uid}">地址管理</a></li>
						</ul>
						<h4>账户管理</h4>
						<ul>
							<li ><a href="../MygrxxController/getUser?uid=${user.uid}">个人信息</a></li>
							<li class="on"><a href="../denglu/uppwd">修改密码</a></li>
						</ul>
					</div>
				</div>
				<div class="you fl">
					<h2>修改密码</h2>
					<form action="../denglu/upupwd" method="get" class="remima">
					<input type="hidden" name="uid" value="${user.uid}">
						<input type="hidden"  name="upwd" id="upwd" value="${user.upwd}"/>
						<p><span>原密码：</span><input type="text"  name="upwd2"/></p>
						<p class="op">输入原密码</p>
						<p><span>新密码：</span><input type="text"  name="upwd3"/></p>
						<p class="op">6-16 个字符，需使用字母、数字或符号组合，不能使用纯数字、纯字母、纯符号</p>
						<p><span>重复新密码：</span><input type="text" name="upwd4" /></p>
						<p class="op">请再次输入密码</p>
						<input type="submit" value="提交" />
					</form>
				</div>
			</div>
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
			<a href="../MyginController/getUser?uid=${user.uid}">
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
</html>
