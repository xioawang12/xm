<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="utf-8" />
		<title>布艺软饰</title>
		<link rel="stylesheet" type="text/css" href="../qian/css/public.css"/>
		<link rel="stylesheet" type="text/css" href="../qian/css/proList.css"/>
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
					<li class=""><a
						href="../flowerder/getpro?cateid=${list.cateid }">${list.catename}</a>
						
						</li>
				</c:forEach>
			</ul>
		</div>
	</div>
		<!------------------------------banner------------------------------>
		<div class="banner">
			<a href="#"><img src="../qian/img/temp/bzbig.jpg"/></a>
		</div>
		<!-----------------address------------------------------->
		<div class="address">
			<div class="wrapper clearfix">
				<a href="index.html">首页</a>
				<span>/</span>
				<a href="decoration.html" class="on">布艺软饰</a>
			</div>
		</div>
		<!-------------------current---------------------->
		<div class="current">
			<div class="wrapper clearfix">
				<h3 class="fl">布艺软饰</h3> 
				<div class="fr choice">
					<p class="default">排序方式</p>
					<ul class="select">
						<li>新品上市</li>
						<li>销量从高到低</li>
						<li>销量从低到高</li>
						<li>价格从高到低</li>
						<li>价格从低到高</li>
					</ul>
				</div>
			</div>
		</div>
		<!----------------proList------------------------->
		<ul class="proList wrapper clearfix">
			<c:forEach items="${pro}" var="pr">
			<c:if test="${pr.cateid==2}">
			<li>
				<a href="">
					<dl>
						<dt><img src="../images/${pr.pimg}"></dt>
						<dd>${pr.pname}</dd>
					</dl>
				</a>
			</li>
			</c:if>
			</c:forEach>
		</ul>
		<!----------------mask------------------->
		<div class="mask"></div>
		<!-------------------mask内容------------------->
		<div class="proDets">
			<img class="off" src="../qian/img/temp/off.jpg" />
			<div class="tit clearfix">
				<h4 class="fl">【最家】非洲菊仿真花干花</h4>
				<span class="fr">￥17.90</span>
			</div>
			<div class="proCon clearfix">
				<div class="proImg fl">
					<img class="list" src="../qian/img/temp/proDet.jpg"  />
					<div class="smallImg clearfix">
						<img src="../qian/img/temp/proDet01.jpg" data-src="../qian/img/temp/proDet01_big.jpg">
						<img src="../qian/img/temp/proDet02.jpg" data-src="../qian/img/temp/proDet02_big.jpg">
						<img src="../qian/img/temp/proDet03.jpg" data-src="../qian/img/temp/proDet03_big.jpg">
						<img src="../qian/img/temp/proDet04.jpg" data-src="../qian/img/temp/proDet04_big.jpg">
					</div>
				</div>
				<div class="fr">
					<div class="proIntro">
						<p>颜色分类</p>
						<div class="smallImg clearfix categ">
							<p class="fl"><img src="../qian/img/temp/prosmall01.jpg" alt="白瓷花瓶+20支快乐花" data-src="../qian/img/temp/proBig01.jpg"></p>
							<p class="fl"><img src="../qian/img/temp/prosmall02.jpg" alt="白瓷花瓶+20支兔尾巴草" data-src="../qian/img/temp/proBig02.jpg"></p>
							<p class="fl"><img src="../qian/img/temp/prosmall03.jpg" alt="20支快乐花" data-src="../qian/img/temp/proBig03.jpg"></p>
							<p class="fl"><img src="../qian/img/temp/prosmall04.jpg" alt="20支兔尾巴草" data-src="../qian/img/temp/proBig04.jpg"></p>
						</div>
						<p>数量</p>
						<div class="num clearfix">
							<img class="fl sub" src="../qian/img/temp/sub.jpg">
							<span class="fl" contentEditable="true">1</span>
							<img class="fl add" src="../qian/img/temp/add.jpg">
							<p class="please fl">请选择商品属性!</p>
						</div>
					</div>
					<div class="btns clearfix">
						<a href="#2"><p class="buy fl">立即购买</p></a>
						<a href="#2"><p class="cart fr">加入购物车</p></a>
					</div>
				</div>
			</div>
			<a class="more" href="proDetail.html">查看更多细节</a>
		</div>
		<!--返回顶部-->
		<div class="gotop">
			<a href="../CartController/Gowu?uid=${user.uid}">
			<dl class="goCart">
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
			<a href="mygxin.html">
			<dl>
				<dt><img src="../qian/img/gt3.png"/></dt>
				<dd>个人<br />中心</dd>
			</dl>
			</a>
			<a href="#" class="toptop" style="display: none;">
			<dl>
				<dt><img src="../qian/img/gt4.png"/></dt>
				<dd>返回<br />顶部</dd>
			</dl>
			</a>
			<p>XXX</p>
		</div>
		<div class="msk"></div>	
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
		<script src="../qian/js/nav.js" type="text/javascript" charset="utf-8"></script>
		<script src="../qian/js/pro.js" type="text/javascript" charset="utf-8"></script>
		<script src="../qian/js/cart.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>
