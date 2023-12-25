<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="utf-8" />
		<title>最家</title>
		<link rel="stylesheet" type="text/css" href="../qian/css/public.css"/>
		<link rel="stylesheet" type="text/css" href="../qian/css/myorder.css" />
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
				<a href="index.html" class="fl">首页</a>
				<span>/</span>
				<c:forEach items="${ad}" var="ad" begin="0" end="0">
				<a href="../MyginController/getUser?uid=${ad.user.uid}" class="on">个人中心</a>
				</c:forEach>
				<span>/</span>
				<a href="../AddressController/addres?uid=${user.uid}" class="on">地址管理</a>
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
							<li><a href="../CartController/Gowu?uid=${user.uid}">我的购物车</a></li>
							<li class="on"><a href="#">我的订单</a></li>
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
							<li><a href="../denglu/uppwd">修改密码</a></li>
						</ul>
					</div>
				</div>

				<div class="you fl">
					<div class="my clearfix">
						<h2 class="fl">我的订单</h2>
						<a href="#" class="fl">请谨防钓鱼链接或诈骗电话，了解更多&gt;</a>
					</div>
					<div class="dlist clearfix">
						<ul class="fl clearfix" id="wa">
							<li class="on"><a href="../MyorderqController/Myorderq?uid=${user.uid}">全部有效订单</a></li>
							<li><a href="../MyorderqController/Myorderq?uid=${user.uid}&orderstate=0">待支付</a></li>
							<li><a href="../MyorderqController/Myorderq?uid=${user.uid}&orderstate=1">已支付</a></li>
							<li><a href="../MyorderqController/Myorderq?uid=${user.uid}&orderstate=2">待收货</a></li>
							<li><a href="../MyorderqController/Myorderq?uid=${user.uid}&orderstate=4">已收货</a></li>
						</ul>
						<form action="#" method="get" class="fr clearfix">
							<input type="text" name="" id="" value="" placeholder="请输入商品名称、订单号" />
							<input type="button" name="" id="" value="" />
						</form>
					</div>
	 	    <c:forEach items="${ors}" var="os">  
 				<div class="dkuang deng">
 				<c:if test="${os.orderstate==0}">
						<p class="one">待支付</p>
						</c:if>
						<c:if test="${os.orderstate==1}">
						<p class="one">已支付</p>
						</c:if>
					<c:if test="${os.orderstate==2}">
						<p class="one fl">待收货</p>
					</c:if>
					<c:if test="${os.orderstate==4}">
						<p class="one fl">已收货</p>
					</c:if>
						<div class="word clearfix">
							<ul class="fl clearfix">
								
								<li><fmt:formatDate value="${os.ordertime}" pattern="yyyy-MM-dd HH:mm:ss"/></li>
								<li>${os.user.uname}</li>
								<%-- <li>${os.oroddnum}</li> --%>
								<li>在线支付</li>
							</ul>
							<p class="fr">订单金额：<span>${os.totalprice}</span>元</p>
						</div>
						 <c:forEach items="${osers}" var="osers"> 
						 <c:if test="${os.orderid==osers.orders.orderid}">
						<div class="shohou clearfix">
							<a href="#" class="fl"><img src="../images/${osers.product.pimg}"/></a>
							<p class="fl"><a href="#">${osers.product.pname}</a><a href="#">¥${osers.price}×${osers.number}</a></p>
							
						</div>
						</c:if>
						 </c:forEach>
						 <input type="hidden" id="${os.orderid }" value="${os.orderid }">
						 <div class="shohou clearfix">
						 <p class="fr">
							<c:if test="${os.orderstate==0}">
						 <a href="../pay?sum=${os.totalprice}">立即支付</a>
						</c:if>
						<c:if test="${os.orderstate==1}">
						</c:if>
					   <c:if test="${os.orderstate==2}">
						<a href="#" onclick="oes(${os.orderid})">确认收货</a>
					    </c:if>
					   <c:if test="${os.orderstate==4}">
						<a href="../MyprodController/AllComments?uid=${user.uid}" >去评价</a>
					   </c:if>
						<a href="../OrderXqController/Orderxq?uid=${user.uid}&orderid=${os.orderid}">订单详情</a>
							</p>
							</div>
					</div>
					
              </c:forEach> 
					<div class="fenye clearfix">
						<a href="#"><img src="../qian/img/zuo.jpg"/></a>
						<a href="#">1</a>
						<a href="#"><img src="../qian/img/you.jpg"/></a>
					</div>
				</div>
			</div>
		</div>
		 	<script type="text/javascript">
		 	function oes(ida) {
		 		var a=ida;
		 		console.log(a); 
		 		console.log(ida); 
		 	 	$.post("../MyorderqController/Danbiao",{"orderid":a},function(res){
		 	 		var zt=res.data[0].orderstate;
		 	 		console.log(zt); 
		 	 		 $.post("../MyorderqController/QianxiuMy",{"orderstate":zt,"orderid":a},function(res){
		 	 			setTimeout('window.location.reload()',1);
			 	 	},"json"); 
		 	 	},"json");
			};
		 	</script>
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
			违法和不良信息举报电话：188-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</p>
		</div>
		<script src="../qian/js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="../qian/js/public.js" type="text/javascript" charset="utf-8"></script>
		<script src="../qian/js/user.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>
