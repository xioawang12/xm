<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="utf-8" />
		<title>首页</title>
		<link rel="stylesheet" type="text/css" href="../qian/css/public.css"/>
		<link rel="stylesheet" type="text/css" href="../qian/css/index.css" />
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
				<a href="../denglu/login" id="login">退出</a>
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
		<!-------------------------banner--------------------------->
		<div class="block_home_slider">
			<div id="home_slider" class="flexslider">
				<ul class="slides">
					<c:forEach items="${recomm1}" var="recomm" begin="0" end="2">
					<li>
						<div class="slide">
						<a href="../ProDetailController/getDetail?pid=${recomm.product.pid}&cateid=${recomm.product.cateid}">
							<img src="../images/${recomm.product.pimg}" width="1440px" height="500px" />
						</a>
						</div>
					</li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<!------------------------------thImg------------------------------>
		<div class="thImg">
			<div class="clearfix">
				<a href="../flowerder/getpro?cateid=6"><img src="../images/1.1.jpg" style="width: 260px;height: 350px;"/></a>
				<a href="../flowerder/getpro?cateid=4"><img src="../images/1.2.jpg"style="width: 260px;height: 350px;"/></a>
				<a href="../PaintController/getpros"><img src="../images/1.3.jpg"style="width: 260px;height: 350px;"/></a>
			</div>
		</div>
		<!------------------------------news------------------------------>
		<div class="news">
			<div class="wrapper">
				<h2><img src="../images/b1.jpg"/></h2>
				<div class="top clearfix">
				<c:forEach items="${recomm2}" var="recomm" begin="0" end="2">
				<a href="../ProDetailController/getDetail?pid=${recomm.product.pid}&cateid=${recomm.product.cateid}"><img src="../images/${recomm.product.pimg}" width="270px" height="310px"  /><p></p></a>
				</c:forEach>	
				</div>
				<div class="bott clearfix">
					<c:forEach items="${recomm2}" var="recomm" begin="3" end="5">
				<a href="../ProDetailController/getDetail?pid=${recomm.product.pid}&cateid=${recomm.product.cateid}"><img src="../images/${recomm.product.pimg}" width="270px" height="310px" /><p></p></a>
				</c:forEach>	
				</div>
				<h2><img src="../images/b2.jpg"/></h2>
				<div class="flower clearfix tran">
				<c:forEach items="${recomm3}" var="recomm" begin="0" end="2">
				
					<a href="../ProDetailController/getDetail?pid=${recomm.product.pid}&cateid=${recomm.product.cateid}" class="clearfix">
						<dl>
							<dt>
								<span class="abl"></span>
								<img src="../images/${recomm.product.pimg}"width="270px" height="310px" />
								<span class="abr"></span>
							</dt>
							<dd>${recomm.product.pname}</dd>
						</dl>
					</a>
					
					</c:forEach>
				</div>
				<div class="flower clearfix tran">
					<c:forEach items="${recomm3}" var="recomm" begin="3" end="5">
				
					<a href="../ProDetailController/getDetail?pid=${recomm.product.pid}&cateid=${recomm.product.cateid}" class="clearfix">
						<dl>
							<dt>
								<span class="abl"></span>
								<img src="../images/${recomm.product.pimg}"width="270px" height="310px" />
								<span class="abr"></span>
							</dt>
							<dd>${recomm.product.pname}</dd>
						</dl>
					</a>
				
					</c:forEach>
				</div>
			</div>
		</div>
		
		<!------------------------------ad------------------------------>
	<a href="#" class="ad"><img src="../images/首页下1.jpg"/></a>
		
		<!------------------------------people------------------------------>
		<div class="people">
			<div class="wrapper">
				<h2><img src="../images/b3.jpg"/></h2>
				<div class="pList clearfix tran">
				<c:forEach items="${recomm4}" var="recomm" begin="0" end="2">
		
				
					<a href="../ProDetailController/getDetail?pid=${recomm.product.pid}&cateid=${recomm.product.cateid}">
						<dl>
							<dt>
								<span class="abl"></span>
								<img src="../images/${recomm.product.pimg}"width="270px" height="310px" interval="100px"/>
								<span class="abr"></span>
							</dt>
							<dd>${recomm.product.pname}</dd>
						</dl>
					</a>
					
					</c:forEach>
				</div>
				<div class="pList clearfix tran">
					<c:forEach items="${recomm4}" var="recomm" begin="3" end="5">
				
				
					<a href="../ProDetailController/getDetail?pid=${recomm.product.pid}&cateid=${recomm.product.cateid}">
						<dl>
							<dt>
								<span class="abl"></span>
								<img src="../images/${recomm.product.pimg}"width="270px" height="310px" interval="100px"/>
								<span class="abr"></span>
							</dt>
							<dd>${recomm.product.pname}</dd>
						</dl>
					</a>
				
					
					</c:forEach>
				</div>
 				<div class="pList clearfix tran">
					<c:forEach items="${recomm4}" var="recomm" begin="6" end="8">
				
					<a href="../ProDetailController/getDetail?pid=${recomm.product.pid}&cateid=${recomm.product.cateid}">
						<dl>
							<dt>
								<span class="abl"></span>
								<img src="../images/${recomm.product.pimg}"width="270px" height="310px" interval="100px"/>
								<span class="abr"></span>
							</dt>
							<dd>${recomm.product.pname}</dd>
						</dl>
					</a>
					
					</c:forEach>
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
		<!-------------------login-------------------------->
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
		
		<script src="../qian/js/jquery-1.12.4.min.js" type="text/javascript"
		charset="utf-8"></script>
	<script src="../qian/js/public.js" type="text/javascript"
		charset="utf-8"></script>
	<script src="../qian/js/nav.js" type="text/javascript" charset="utf-8"></script>
	<script src="../qian/js/jquery.flexslider-min.js"
		type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript">
		$(function() {
			$('#home_slider').flexslider({
				animation : 'slide',
				controlNav : true,
				directionNav : true,
				animationLoop : true,
				slideshow : true,
				slideshowSpeed : 2000,
				useCSS : false
			});

		});
	</script>

	<style>
.copyrights {
	text-indent: -9999px;
	height: 0;
	line-height: 0;
	font-size: 0;
	overflow: hidden;
}
</style>
<div class="copyrights">
	Collect from <a href="http://www.cssmoban.com/"  title="网站模板">金豆之家</a>
	<a href="https://www.chazidian.com/"  title="查字典">查字典</a>
</div>
	</body>
</html>