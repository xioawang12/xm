<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>详情页</title>
		<link rel="stylesheet" type="text/css" href="../qian/css/public.css"/>
		<link rel="stylesheet" type="text/css" href="../qian/css/proList.css"/>
	</head>
	<body>
		<!------------------------------head------------------------------>
		<div class="head">
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
		<!-----------------address------------------------------->
		<div class="address">
			<div class="wrapper clearfix">
				<a href="../IndexController/getindex">首页</a>
				<span>/</span>
				<c:forEach items="${pro}" var="pro" begin="0" end="0">
				<a href="../flowerder/getpro?cateid=${pro.category.cateid}">${pro.category.catename}</a>
				</c:forEach>
				<span>/</span>
				<c:forEach items="${pro}" var="pro" begin="0" end="0">
				<a href="#" class="on">${pro.pname}</a>
				</c:forEach>
			</div>
		</div>
		<!-----------------------Detail------------------------------>
		<div class="detCon">
			<div class="proDet wrapper">
				<div class="proCon clearfix">
					<div class="proImg fl">
					<c:forEach items="${proimg}" var="proimg" begin="0" end="0">
							<img class="det" src="../images/${proimg.imgurl}" />
						</c:forEach>
						
						<div class="smallImg clearfix">
						<c:forEach items="${proimg}" var="proimg" begin="0" end="2">
							<img src="../images/${proimg.imgurl}" data-src="../images/${proimg.imgurl}">
						</c:forEach>
							
							
						</div>
					</div>
					<div class="fr intro">
						<div class="title">
						<c:forEach items="${pro}" var="pro" begin="0" end="0">
							<h4>${pro.pname}</h4>
						</c:forEach>
						
							原价:<span id="yj"></span> 现价:<span id="xj"></span>
							
					
						</div>
						<div class="proIntro">
							<p>款式分类</p>
							<div class="smallImg clearfix categ">
								
				<div class="radio-style">
				<c:forEach items="${pros}" var="pros">
				<input type="hidden" name="pid" id="pid" value="${pros.pid }">
                   <p class="fl"><input type="hidden" id="sid" name="sid" value="${pros.specification.sid}"><img src="../images/${pros.pimg}" name='scolor' class="scolor" onclick="aa(this)" alt="${pros.specification.scolor}" data-src="../images/${pros.pimg}"></p>
            	</c:forEach>
            	</div>
            
            	
							</div>
							
							<p>数量&nbsp;&nbsp;<span id="kc" ></span>件</p>
						
						
							
							<div class="num clearfix">
								<input type="image" class="fl sub" onclick="jian()" src="../qian/img/temp/sub.jpg">
								<span class="fl" id="number" onblur="kucun()" contentEditable="true">1</span>
								<input type="image" class="fl add"  onclick="jia()" src="../qian/img/temp/add.jpg">
								<p class="please fl">请选择商品属性!</p>
							</div>
						</div>
						<div class="btns clearfix">
							<a href="#2"><p class="buy fl">立即购买</p></a>
							<c:if test="${user!=null}">
							<a href="#2"><p class="cart fr" onclick="addgo()">加入购物车</p></a>
							</c:if>
							<c:if test="${user==null}">
							<a href="#2"><p class="cart fr" onclick="add()">加入购物车</p></a>
							</c:if>
						</div>
					</div>
				</div>
			</div>
		</div>
			<script type="text/javascript">
            	function aa(obj) {
            	$(obj).attr("alt");
            	var pid=document.getElementById('pid').value;
            	var scolor=obj.alt;
            	$.post("../ProDetailController/getproses",{"pid":pid,"scolor":scolor},function(res){
            		if(res.code=="0"){
            			document.getElementById("kc").innerText="库存"+res.data[0].sstock;
            			document.getElementById("yj").innerText=""+res.data[0].soriginal;
            			document.getElementById("xj").innerText="￥"+res.data[0].soriginal*0.9;
            			document.getElementById("sid").value=""+res.data[0].sid;
            			}else{
            				alert(res.msg);
            			}
            	},"json");
				}
            	</script>
            	<script type="text/javascript">
            	function kucun(){
            		var num=document.getElementById('number').innerText;
            		var kc=document.getElementById('kc').innerText.substring(2);
            		console.log(num);
            		console.log(kc);
            		var pid=document.getElementById('pid').value;
            		var sid=document.getElementById('sid').value;
            		console.log(pid);
            		console.log(sid);
            		 $.post("../ProDetailController/getshisid",{"pid":pid,"sid":sid},function(res){
            			 console.log(res);
            			 if(res.data!=null&&res.data!=''){
            				 var nn=res.data[0].shopnumber;
            				 var uu=parseInt(kc)-parseInt(nn)
            				 if(parseInt(num)>parseInt(uu)){
                    			 $("#number").html(parseInt(uu));
                    			 alert("数量不能大于库存");
                    		}else if(num<1){
                    			$("#number").html(parseInt("1"));
                   			 alert("数量不能小于1");
                    		} 
            			 }else{
            				 if(parseInt(num)>parseInt(kc)){
                    			 $("#number").html(parseInt(kc));
                    			 alert("数量不能大于库存");
                    		}else if(num<1){
                    			$("#number").html(parseInt("1"));
                   			 alert("数量不能小于1");
                    		} 
            			 }
            		},"json");	
            	}; 
            	
            	function jia() {
            		var num = parseInt(document.getElementById('number').innerText);
            		var kc=document.getElementById('kc').innerText.substring(2);
            		var pid =document.getElementById('pid').value;
            		var sid =document.getElementById('sid').value;
            		num++;
            		$("#number").html(num);
            		console.log(pid);
            		console.log(sid);
            		  $.post("../ProDetailController/getshisid",{"pid":pid,"sid":sid},function(res){
            			 console.log(res);
            			 if(res.data!=null&&res.data!=''){
               				 var nn=res.data[0].shopnumber;
               				 var uu=parseInt(kc)-parseInt(nn)
               				 if(parseInt(num)>parseInt(uu)){
                       			 $("#number").html(parseInt(uu));
                       			 alert("数量不能大于库存");
                       		}
               			 }else{
               				 if(num>parseInt(kc)){
                       			 $("#number").html(parseInt(kc));
                       			 alert("数量不能大于库存");
                       		}
               			 }
            		 },"json");
            	}
				function jian() {
					var num = parseInt(document.getElementById('number').innerText);
					var kc=document.getElementById('kc').innerText.substring(2);
            		num--;
            		$("#number").html(num);
            		 if(num<1){
            			 $("#number").html(parseInt("1"));
               			 alert("数量不能小于1");
            		}
				}
            	</script>
		<script type="text/javascript">
		function addgo() {
			var uid=${user.uid};
			var pid=document.getElementById('pid').value;
			var sid=document.getElementsByClassName("fl on")[0].children[0].value;
			var shopprice=document.getElementById('yj').innerText;
			var shopnumber=document.getElementById('number').innerText;
			var xx=shopnumber*shopprice
			console.log(xx)
			 $.post("../ProDetailController/getpsid",{"pid":pid,"sid":sid},function(res){
        		if(res.code=="0"){
        			 console.log("获取data"+res)
          			var num1=res.data[0].shopnumber
          			console.log("获取数据库里的数量"+parseInt(num1))
          			var price1=res.data[0].shopprice
          			console.log("获取数据库里的价格"+parseInt(price1))
          			var num2=shopnumber
          			console.log("获取前端数量"+parseInt(num2))
          			var num=parseInt(num1)+parseInt(num2)
          			console.log("获取前端加数据库的数量"+num)
          			var shopid=res.data[0].shopid
          			console.log("获取数据库的id"+shopid)
          			var mm=parseInt(num2)*parseFloat(shopprice)
          			console.log("获取前端数量x价钱"+mm)
          			var he=parseFloat(mm)+parseFloat(price1)
          			console.log("获取前端加数据库的价钱"+he)
        			  $.post("../ProDetailController/updateshopp",{"shopprice":he,"shopnumber":num,"shopid":shopid},function(res){
                 		if(res.code=="0"){
                 			alert(res.msg);
                 			}else{
                 			alert(res.msg);
                 			}
                 	},"json"); 
        			}else{
        				  $.post("../ProDetailController/innershopp",{"uid":uid,"pid":pid,"sid":sid,"shopprice":xx,"shopnumber":shopnumber},function(res){
                     		if(res.code=="0"){
                     			alert(res.msg);
                     			}else{
                     			alert(res.msg);
                     			}
                     	},"json"); 
        			}
        	},"json");
			
		}
		</script>
			<script type="text/javascript">
		function add() {
			var scolor=document.getElementsByClassName("fl on")[0].children[0].alt;
			console.log(scolor)
			if(scolor!=null){
				alert("您还没有登录，请登录");
				var url="../denglu/login";
				location=url;
			}else{
				alert("请先选择规格！");
			}
		}
		</script>
		
		
        			
		
		
		
		<div class="introMsg wrapper clearfix">
			<div class="msgL fl">
				<div class="msgTit clearfix">
					<a class="on">商品详情</a>
					<a>所有评价</a>
				</div>
				<div class="msgAll">
					<div class="msgImgs">
						<c:forEach items="${proimg}" var="proimg" >
							<img src="../images/${proimg.imgurl}" width="940px" height="696px">
						</c:forEach>
					</div>
					<div class="eva">
						<c:forEach items="${com}" var="com" >
							<div class="per clearfix">
							<img class="fl" src="../images/${com.user.uimg}" width="40px" height="40px">
							<div class="perR fl">
								<p>${com.user.uname}</p>
								<p>${com.comcontet}</p>
								<div class="clearfix">
									<p><img src="../images/${com.comimgs}" width="40px" height="40px"></p>
								</div>
								<p><span><fmt:formatDate type="both" value="${com.comtime}"/></span><span>款式分类：${com.product.pstyle}</span></p>
							</div>
						</div>
						</c:forEach>
						
					</div>
				</div>
			</div>
			<div class="msgR fr">
				<h4>为你推荐</h4>
				<div class="seeList">
				<c:forEach items="${recomments}" var="recomment" begin="0" end="4">
					<a href="../ProDetailController/getDetail?pid=${recomment.product.pid}&cateid=${recomment.product.cateid}">
						<dl>
							<dt><img src="../images/${recomment.product.pimg}" width="161px" height="243px"></dt>
							<dd>${recomment.product.pname}</dd>
							<dd>￥193.20</dd>
						</dl>
					</a>
					</c:forEach>
				</div>	
				
			</div>
		</div>
		<div class="like">
			<h4>猜你喜欢</h4>
			<div class="bottom">
				<div class="hd">
					<span class="prev"><img src="../qian/img/temp/prev.png"></span>
					<span class="next"><img src="../qian/img/temp/next.png"></span>
				</div>
				<div class="imgCon bd">
					<div class="likeList clearfix">
						<div>
							
							<c:forEach items="${recomment}" var="recomment">
							<a href="../ProDetailController/getDetail?pid=${recomment.product.pid}&cateid=${recomment.product.cateid}">
								<dl>
									<dt><img src="../images/${recomment.product.pimg}"></dt>
									<dd>${recomment.product.pname}</dd>
									<dd>￥193.20</dd>
								</dl>
							</a>
							</c:forEach>
						</div>
						<div>
							<c:forEach items="${recomment}" var="recomment">
							<a href="../ProDetailController/getDetail?pid=${recomment.product.pid}&cateid=${recomment.product.cateid}">
								<dl>
									<dt><img src="../images/${recomment.product.pimg}"></dt>
									<dd>${recomment.product.pname}</dd>
									<dd>￥193.20</dd>
								</dl>
							</a>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--返回顶部-->
		<div class="gotop">
			<a href="../CartController/Gowu?uid=${user.uid}">
			<dl class="goCart">
				<dt><img src="../qian/img/gt1.png"/></dt>
				<dd>去购<br />物车</dd>
				<span>1</span>
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
		<script src="../qian/js/jquery.SuperSlide.2.1.1.js" type="text/javascript" charset="utf-8"></script>
		<script src="../qian/js/public.js" type="text/javascript" charset="utf-8"></script>
		<script src="../qian/js/nav.js" type="text/javascript" charset="utf-8"></script>
		<script src="../qian/js/pro.js" type="text/javascript" charset="utf-8"></script>
		<script src="../qian/js/cart.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			jQuery(".bottom").slide({titCell:".hd ul",mainCell:".bd .likeList",autoPage:true,autoPlay:false,effect:"leftLoop",autoPlay:true,vis:1});
		</script>
	</body>
</html>
