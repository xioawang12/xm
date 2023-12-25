<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="utf-8" />
		<title>个人信息</title>
		<link rel="stylesheet" type="text/css" href="../qian/css/public.css"/>
		<link rel="stylesheet" type="text/css" href="../qian/css/myorder.css" />
	</head>
	<body>
		<!------------------------------head------------------------------>
		<div class="head ding">
			<div class="wrapper clearfix">
				<div class="clearfix" id="top">
					<h1 class="fl"><a href="../IndexController/getindex"><img src="img/logo.png"/></a></h1>
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
				<a href="index.html" class="fl">首页</a>
				<span>/</span>
				<a href="myorderq.html" class="on">我的订单</a>
				<span>/</span>
				<a href="#" class="on">订单详情</a>
			</div>
		</div>
		
		<!------------------------------Bott------------------------------>
		<div class="Bott">
			<div class="wrapper clearfix">
				<div class="zuo fl">

					<h3>
						<a href="#"><img src="../images/${user.uimg} "  width="92px" height="92px"  style="border-radius: 50px""/></a>
					<p class="clearfix"><span class="fl">${user.uname}</span><a href="../denglu/login"><span class="fr">[退出登录]</span></p></a>
					</h3>
				
					<div>
						<h4>我的交易</h4>
						<ul>
							<li><a href="../CartController/Gowu">我的购物车</a></li>
							<li><a href="myorderq.html">我的订单</a></li>
							<li><a href="myprod.html">评价晒单</a></li>
						</ul>
						<h4>个人中心</h4>
						<ul>
							<li><a href="../MyginController/getUser?uid=${user.uid}">我的中心</a></li>
							<li class="on"><a href="../AddressController/addres?uid=${user.uid}">地址管理</a></li>
						</ul>
						<h4>账户管理</h4>
						<ul>
							<li ><a href="../MygrxxController/getUser?uid=${user.uid}">个人信息</a></li>
							<li><a href="../denglu/uppwd">修改密码</a></li>
						</ul>
					</div>
				</div>
				<c:forEach items="${ors}" var="os">
				<div class="you fl">
					<div class="my clearfix">
						<h2>订单详情<a href="#">请谨防钓鱼链接或诈骗电话，了解更多&gt;</a></h2>
						<h3>订单号：<span>${os.oroddnum}</span></h3>
					</div>
					<div class="orderList">
						<div class="orderList1">
						<c:if test="${os.orderstate==0}">
						<h3>待支付</h3>
						</c:if>
						<c:if test="${os.orderstate==1}">
						<h3>待发货</h3>
						</c:if>
					<c:if test="${os.orderstate==2}">
						<h3>待收货</h3>
					</c:if>
					<c:if test="${os.orderstate==3}">
						<h3>已收货</h3>
					</c:if>
							<c:forEach items="${osers }" var="o">
							 <c:if test="${os.orderid==o.orders.orderid}">
							<div class="clearfix">
								<a href="#" class="fl"><img src="../images/${o.product.pimg}" width="100px" height="100px" / ></a>
								<p class="fl"><a href="#">${o.product.pname}</a><a href="#">¥${o.price}×${o.number}</a></p>
							</div>
							</c:if>
							</c:forEach>
						</div>
						<div class="orderList1">
							<h3>收货信息</h3>
							<p>姓 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：<span>${os.address.addname}</span></p>
							<p>联系电话：<span>${os.address.addphone}</span></p>
							<p>收货地址：<span>${os.address.adprovince} ${os.address.adcity} ${os.address.addstreet} ${os.address.detailaddress}</span></p>
						</div>
						<div class="orderList1">
							<h3>支付方式及送货时间</h3>
							<p>支付方式：<span>在线支付</span></p>
							<p>送货时间：<span>不限送货时间</span></p>
						</div>
						<div class="orderList1 hei">
							<h3><strong>商品总价：</strong><span>¥${os.totalprice}</span></h3>
							<p><strong>运费：</strong><span>¥0</span></p>
							<p><strong>订单金额：</strong><span>¥${os.totalprice}</span></p>
							<p><strong>实付金额：</strong><span>¥${os.totalprice}</span></p>
						</div>
						
					</div>
					
					
				</div>
				</c:forEach>
			</div>
		</div>
		<
		
		<!--返回顶部-->
		<div class="gotop">
			<a href="cart.html">
			<dl>
				<dt><img src="img/gt1.png"/></dt>
				<dd>去购<br />物车</dd>
			</dl>
			</a>
			<a href="#" class="dh">
			<dl>
				<dt><img src="img/gt2.png"/></dt>
				<dd>联系<br />客服</dd>
			</dl>
			</a>
			<a href="mygxin.html">
			<dl>
				<dt><img src="img/gt3.png"/></dt>
				<dd>个人<br />中心</dd>
			</dl>
			</a>
			<a href="#" class="toptop" style="display: none">
			<dl>
				<dt><img src="img/gt4.png"/></dt>
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
						<a href="#2" class="fl"><img src="img/foot1.png"/></a>
						<span class="fl">7天无理由退货</span>
					</div>
					<div class="clearfix">
						<a href="#2" class="fl"><img src="img/foot2.png"/></a>
						<span class="fl">15天免费换货</span>
					</div>
					<div class="clearfix">
						<a href="#2" class="fl"><img src="img/foot3.png"/></a>
						<span class="fl">满599包邮</span>
					</div>
					<div class="clearfix">
						<a href="#2" class="fl"><img src="img/foot4.png"/></a>
						<span class="fl">手机特色服务</span>
					</div>
				</div>
			</div>
			<p class="dibu">最家家居&copy;2020公司版权所有 京ICP备XXX备XXX号<br />
			违法和不良信息举报电话：XXX，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</p>
		</div>
		<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/user.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>
