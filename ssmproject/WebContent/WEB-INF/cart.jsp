<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="utf-8" />
		<title>cart</title>
		<link rel="stylesheet" type="text/css" href="../qian/css/public.css"/>
		<link rel="stylesheet" type="text/css" href="../qian/css/proList.css" />
		<style type="text/css">
		.niceButton{
    display: inline-block;
    padding: 8px 10px;
    font-size: 15px;
    cursor: pointer;
    text-align: center;
    text-decoration: none;
    outline: none;
    color:#fff;
    background-color: rgb(16, 185, 214);
    border: none;
    border-radius: 15px;
    box-shadow: 0 9px #999;
}
.niceButton:hover{
background-color: #1795bb;
}
.niceButton:active{
    background-color: #1795bb;
    box-shadow: 0 5px #666;
    transform:translateY(4px);
}

		.niceButtonc{
    display: inline-block;
    padding: 8px 10px;
    font-size: 15px;
    cursor: pointer;
    text-align: center;
    text-decoration: none;
    outline: none;
    color:#fff;
    background-color: rgb(220,20,60);
    border: none;
    border-radius: 15px;
    box-shadow: 0 9px #999;
}
.niceButtonc:hover{
background-color: #C71585;
}
.niceButtonc:active{
    background-color: #C71585;
    box-shadow: 0 5px #666;
    transform:translateY(4px);
}

</style>
	</head>
	<c:forEach items="${sho}" var="sho" >
	<body onload="jisuan(${sho.shopid})">
	</c:forEach>
	
		<!--------------------------------------cart--------------------->
		<div class="head ding">
			<div class="wrapper clearfix">
				<div class="clearfix" id="top">
					<h1 class="fl"><a href="../IndexController/getindex"><img src="../images/logo.png" width="200px" height="70px"/></a></h1>
					<div class="fr clearfix" id="top1">
						<p class="fl">
							<a href="login.html" id="login">登录</a>
							<a href="reg.html" id="reg">注册</a>
						</p>
						<form action="#" method="get" class="fl">
							<input type="text" placeholder="搜索" />
							<input type="button" />
						</form>
						<div class="btn fl clearfix">
							<a href="mygxin.jsp"><img src="../qian/img/grzx.png"/></a>
							<a href="#" class="er1"><img src="../qian/img/ewm.png"/></a>
							<a href="cart.jsp"><img src="../qian/img/gwc.png"/></a>
							<p><a href="#"><img src="../qian/img/smewm.png"/></a></p>
						</div>
					</div>
				</div>
				<ul class="clearfix" id="bott">
					<li><a href="../IndexController/getindex">首页</a></li>
					<li>
						<a href="../PaintController/getpros">所有商品</a>
						<div class="sList">
							<div class="wrapper  clearfix">
								<c:forEach items="${list2}" var="list2">
								<a href="../flowerder/getpro?cateid=${list2.cateid }"> 
									<dl>
										<dd>${list2.catename}</dd>
									</dl>
								</a>
									</c:forEach>
							</div>
						</div>
					</li>
					<c:forEach items="${list}" var="list">
					<li class=""><a
						href="../flowerder/getpro?cateid=${list.cateid }">${list.catename}</a>
						<div class="sList2">
							<div class="clearfix">
								<c:forEach items="${pros}" var="pros">
								<a href="../TopController/getindex&cateid=${pros.cateid}">${pros.pname}</a>
								</c:forEach>
							</div>
						</div>
						</li>
				</c:forEach>
					
				</ul>
			</div>
		</div>
		<div class="cart mt">
			<!-----------------logo------------------->
			<!--<div class="logo">
				<h1 class="wrapper clearfix">
					<a href="index.html"><img class="fl" src="img/temp/logo.png"></a>
					<img class="top" src="img/temp/cartTop01.png">
				</h1>
			</div>-->
			<!-----------------site------------------->
			<div class="site">
				<p class=" wrapper clearfix">
					<span class="fl">购物车</span>
					<img class="top" src="../qian/img/temp/cartTop01.png">
					<a href="../IndexController/getindex" class="fr">继续购物&gt;</a>
				</p>
			</div>
			<!-----------------table------------------->
			<div class="table wrapper">
				<div class="tr">
					<div>商品</div>
					<div>单价</div>
					<div>数量</div>
					<div>小计</div>
					<div>操作</div>
				</div>
				<c:forEach items="${sho}" var="sho">
				
				<div class="th">
					<div class="pro clearfix">
						<label class="fl">
							<input type="checkbox" id="checkboxs" class="checkboxs" name="shopids" value="${sho.shopid}" onchange="heji()"/>
    						<span></span>
    						
						</label>
						<a class="fl" href="#">
							<dl class="clearfix">
							
								<dt class="fl"><img src="../images/${sho.product.pimg}"width="120px" height="120px" alt="${sho.product.pimg}"></dt>
								<dd class="fl">
								
									<p>${sho.product.pname}</p>
									<p>颜色分类:</p>
									<p>${sho.specification.scolor}</p>
									<span style="display: none;" id="sid${sho.shopid}">${sho.specification.sid}</span>
								</dd>
							</dl>
						</a>
					</div>
					<div class="price" id="jiage${sho.shopid}">${sho.specification.soriginal}</div>
					<input type="hidden" id="kc${sho.shopid}" class="kc" value="${sho.specification.sstock}">
					<div class="number">
						<p class="num clearfix">
							<span style="display: none;" id="pid${sho.shopid}">${sho.product.pid}</span>
							<span style="display: none;" id="shopid${sho.shopid}">${sho.shopid}</span>
							<input type="hidden" name="uid" id="uid${sho.shopid}" value="${sho.user.uid}">
							<input type="image" class="fl sub" onclick="jian(${sho.shopid})" src="../qian/img/temp/sub.jpg">
							<span class="fl" id="shuliang${sho.shopid}" onblur="kucun(${sho.shopid})" contentEditable="true">${sho.shopnumber}</span>
							<input type="image" class="fl add" onclick="jia(${sho.shopid})" src="../qian/img/temp/add.jpg" >
						</p>
					</div>
					<div class="xiaoji" id="xiaoji${sho.shopid}" >${sho.shopprice}</div> 
					<div class="caozuo"><input  type="button" onclick="shanchu(this)" alt="${sho.shopid}" value="删除" class="niceButtonc">  </div>
				</div>
				</c:forEach>
				<script type="text/javascript">
					/*
					单独删除
					*/
					function shanchu(obj){
						/* var nameid;
						for (var i =0; i <10; i++) {
							nameid=document.getElementsByName("shopid")[i].value
							console.log(nameid)
						} */
						/* console.log(obj)
						var id=document.getElementById("shopid").value;
						console.log(id) */
						var altid=obj.alt;
						console.log(altid)
						if (confirm("确定删除吗")) {
							$.post("../CartController/deletcart",{"shopid":altid},function(res){
			            		if(res.code=="0"){
			            				alert(res.msg);
			            				setTimeout('window.location.reload()',1);
			            			}else{
			            				alert(res.msg);
			            				setTimeout('window.location.reload()',1);
			            			} 
			            	},"json");
							} 
						
						
					}
					function kucun(id){
						var num=document.getElementById('shuliang'+id).innerText;
	            		var kc=document.getElementById('kc'+id).value;
	            		var jiage = parseFloat(document.getElementById('jiage'+id).innerText);
	            		var shopid=parseInt(document.getElementById("shopid"+id).innerText);
	            		var jisuan=0;
	            		console.log(num);
	            		console.log(kc);
	            		 if(parseInt(num)>parseInt(kc)){
	            			 $("#shuliang"+id).html(parseInt(kc));
	            			 alert("数量不能大于库存");
	            			 num=parseInt(kc);
	            			 jisuan=num*jiage;
	            			 document.getElementById('xiaoji'+id).innerText=jisuan;
	            			 
	            			 $.post("../CartController/updatesho",{"shopprice":jisuan,"shopnumber":num,"shopid":shopid},function(res){
							  },"json");
	            		}else if(num<1){
	            			$("#shuliang"+id).html(parseInt("1"));
	           			 alert("数量不能小于1");
	           			num=1;
	           			jisuan=num*jiage;
           			 	document.getElementById('xiaoji'+id).innerText=jisuan;
	           			$.post("../CartController/updatesho",{"shopprice":jisuan,"shopnumber":num,"shopid":shopid},function(res){
						  },"json");
	            		} 
	            		 if (num==0) {
								num=1;
								 $.post("../CartController/updatesho",{"shopprice":jisuan,"shopnumber":num,"shopid":shopid},function(res){
								  },"json");
								 $("#shuliang"+id).html(num);
				            		jisuan=num*jiage;
								 document.getElementById('xiaoji'+id).innerText=jisuan;
							}
	            		 $("#shuliang"+id).html(num);
		            		jisuan=num*jiage;
		            		document.getElementById('xiaoji'+id).innerText=jisuan;
		            		$.post("../CartController/updatesho",{"shopprice":jisuan,"shopnumber":num,"shopid":shopid},function(res){
							  },"json");
	            	}; 
	            	function jisuan(id){
	            		var num = parseInt(document.getElementById('shuliang'+id).innerText);
	            		var jiage = parseFloat(document.getElementById('jiage'+id).innerText);
	            		var jisuan=0;
	            		$("#shuliang"+id).html(num);
	            		jisuan=num*jiage;
	            		document.getElementById('xiaoji'+id).innerText=jisuan;
	            	}
					function jia(id) {
	            		var num = parseInt(document.getElementById('shuliang'+id).innerText);
	            		var kc=parseInt(document.getElementById('kc'+id).value);
	            		var jiage = parseFloat(document.getElementById('jiage'+id).innerText);
	            		var shopid=parseInt(document.getElementById("shopid"+id).innerText);
	            		var jisuan=0;
	            		var data=$("input[name='shopids']:checked");
						var ids=[];//取到选中值得di
						let num2=[];//取到选中值的数量 
						var shuliang=[];
						var heji=0;
						var zongshu=0;
	            		num++;
	            		$("#shuliang"+id).html(num);
	            		jisuan=num*jiage;
	            		document.getElementById('xiaoji'+id).innerText=jisuan;
	            		
	            		for(var i=0;i<data.length;i++){
							ids.push(data[i].value);
							num2.push($("#xiaoji"+data[i].value).html());
							shuliang.push($("#shuliang"+data[i].value).html());
						} 
						 for(var i=0;i<num2.length;i++){
							 var num3=parseFloat(num2[i]);
							heji+=num3;
							} 
						for(var i=0;i<shuliang.length;i++){
							 var shuliang2=parseInt(shuliang[i]);
							 zongshu+=shuliang2;
								
							}
						
						 document.getElementById("all").innerText=heji;
						 document.getElementById("sl").innerText=zongshu;
	            		 if(num>kc){
	            			 $("#shuliang"+id).html(kc);
	            			 alert("数量不能大于库存");
	            			 num=kc;
	            			 jisuan=num*jiage;
	 	            		document.getElementById('xiaoji'+id).innerText=jisuan;
	            			 $.post("../CartController/updatesho",{"shopprice":jisuan,"shopnumber":num,"shopid":shopid},function(res){
							  },"json");
	            		}else{
	            			 $.post("../CartController/updatesho",{"shopprice":jisuan,"shopnumber":num,"shopid":shopid},function(res){
							  },"json");
	            		}
	            		 
	            		 console.log("数量"+num);
	            		 console.log("库存"+kc);
	            		 console.log("价格"+jiage);
	            		 console.log("计算"+jisuan);
	            		 console.log("shopid"+shopid);
	            		
							 
	            		 
	            		
					}
					function jian(id) {
						var num = parseInt(document.getElementById('shuliang'+id).innerText);
						var kc=parseInt(document.getElementById('kc'+id).value);
						var jiage = parseFloat(document.getElementById('jiage'+id).innerText);
						var shopid=parseInt(document.getElementById("shopid"+id).innerText);
	            		var jisuan=0;
	            		var data=$("input[name='shopids']:checked");
						var ids=[];//取到选中值得di
						let num2=[];//取到选中值的数量 
						var shuliang=[];
						var heji=0;
						var zongshu=0;
	            		num--;
	            		$("#shuliang"+id).html(num);
	            		jisuan=num*jiage;
	            		 document.getElementById('xiaoji'+id).innerText=jisuan;
	            		 
	            		 for(var i=0;i<data.length;i++){
								ids.push(data[i].value);
								num2.push($("#xiaoji"+data[i].value).html());
								shuliang.push($("#shuliang"+data[i].value).html());
							} 
							 for(var i=0;i<num2.length;i++){
								 var num3=parseFloat(num2[i]);
								heji+=num3;
								} 
							for(var i=0;i<shuliang.length;i++){
								 var shuliang2=parseInt(shuliang[i]);
								 zongshu+=shuliang2;
									
								}
							
							 document.getElementById("all").innerText=heji;
							 document.getElementById("sl").innerText=zongshu;
	            		 
	            		 if(num<1){
	            			 $("#shuliang"+id).html(1);
	               			 alert("数量不能小于1");
	               			 if(num==0){
	               				 num=1
	               				jisuan=num*jiage;
	    	            		 document.getElementById('xiaoji'+id).innerText=jisuan;
	               				 $.post("../CartController/updatesho",{"shopprice":jisuan,"shopnumber":num,"shopid":shopid},function(res){
								  },"json");
	               			 }
	            		}else{
	            			 $.post("../CartController/updatesho",{"shopprice":jisuan,"shopnumber":num,"shopid":shopid},function(res){
							  },"json");
	            		}
	            		 console.log("数量"+num);
	            		 console.log("库存"+kc);
	            		 console.log("价格"+jiage);
	            		 console.log("计算"+jisuan);      
					}
        		</script>
				<div class="goOn">空空如也~<a href="../IndexController/getindex">去逛逛</a></div>
				<div class="tr clearfix">
					<label class="fl">
						<input class="checkAll" type="checkbox" onchange="heji()"  />
						<span tabindex=""></span>
					</label>
					<p class="fl">
						<a href="#">全选</a>
						<input type="button" value="删除" onclick="shanchus(this)" class="niceButtonc">
					</p>
					
					<script type="text/javascript">
						function heji(){
							var data=$("input[name='shopids']:checked");
							console.log(data)	
							var ids=[];//取到选中值得di
							let num=[];//取到选中值的数量 
							var shuliang=[];
							var heji=0;
							var zongshu=0;
							 for(var i=0;i<data.length;i++){
								ids.push(data[i].value);
								num.push($("#xiaoji"+data[i].value).html());
								shuliang.push($("#shuliang"+data[i].value).html());
							} 
							 for(var i=0;i<num.length;i++){
								 var num2=parseFloat(num[i]);
								heji+=num2;
								} 
							for(var i=0;i<shuliang.length;i++){
								 var shuliang2=parseInt(shuliang[i]);
								 zongshu+=shuliang2;
									
								}
							 ids=ids.join(",");
							 num=num.join(",");
							 console.log(ids)	
							 console.log(num)	
							 console.log(heji)	
							 console.log(zongshu)	
							 document.getElementById("all").innerText=heji;
							 document.getElementById("sl").innerText=zongshu;
						}
						/* 
						全部删除
						*/
						function shanchus(obj){
							var arr=[];//1 2 3 4-->1,2,3,4
							/* var data=document.getElementsByClassName('checkboxs'); */
							var data=$("input[name='shopids']:checked");
							console.log(data)	
							/* console.log(data)	 */
							/* var shopid=document.getElementsByName('shopids')[0].value;
							console.log(shopid) */	
							for (var i = 0; i < data.length; i++) {
								arr.push(data[i].value)	
								console.log(arr)
							}
							var ids=arr.join(",");//1,2,3,4
							console.log(ids)
							if(ids!=null&&ids!=''){
								if(confirm("确定删除"+ids+"吗")){
									  $.post("../CartController/deleteAllShoppingcart",{"ids":ids},function(res){
										  if(res.code=="0"){
											  alert(res.msg)
												  setTimeout('window.location.reload()',1);
											  
										  }else{
											  alert(res.msg);
											  setTimeout('window.location.reload()',1);
										  }
									  },"json");
								  };
							}else{
								 alert("请先选择要删除的商品");
							}
							
							  
						}
					</script>
					<c:forEach items="${sho}" var="sho" begin="0" end="0">
					<p class="fr">
						<span>共<small id="sl">0</small>件商品</span>
						<span>合计:<small id="all">0.00</small></span>
						
						<input  type="button" onclick="jiesuan(${sho.shopid})" value="结算" class="niceButton">
					</p>
					</c:forEach>	
					<script type="text/javascript">
						function jiesuan(id){
							var dats=$("input[name='shopids']:checked");
							var uid=document.getElementById("uid"+id).value;//取到uid
							var pid=parseInt(document.getElementById("pid"+id).innerText);//取到pid
							var guige=parseInt(document.getElementById("sid"+id).innerText);//取到sid
							var shuliang= parseInt(document.getElementById('shuliang'+id).innerText);//取到数量
							var jiage = parseFloat(document.getElementById('jiage'+id).innerText);//取到价格
							var sum=$("#all").html();//取到合计的值
							var ids=[];//取到选中值得di
							let num=[];//取到选中值的数量 
						
							  for(var i=0;i<dats.length;i++){
								ids.push(dats[i].value);
								num.push($("#shuliang"+dats[i].value).html());
							} 
							 ids=ids.join(",");
							 num=num.join(",");
							 console.log(sum)	
							 console.log(uid)	
							 console.log(pid)	
							 console.log(guige)
							 console.log(shuliang)	
							 console.log(jiage)
							 	location.href="../OrderContrller/getorder?ids="+ids+"&sum="+sum+"&uid="+${user.uid}
						/*if(sum!=""&&ids!=""&&sum!=null&&ids!=null){
								$.post("../CartController/insertOrders",{"uid":uid,"totalprice":sum},function(res){
			                 		if(res.code=="0"){
			                 			$.post("../CartController/getshoppord",{"uid":uid},function(res){
					                 		if(res.code=="0"){
					                 			var pid2=[];
					                 			var orderid=[];
					                 			var sid2=[];
					                 			var shuliang2=[];
					                 			var jiage2=[];
					                 			var ids2=[];//取到选中值得di
					                 			 for(var i=0;i<dats.length;i++){
					                 				pid2.push($("#pid"+dats[i].value).html());
					                 				orderid.push(res.data[i].orderid);
					                 				sid2.push($("#sid"+dats[i].value).html());
					                 				shuliang2.push($("#shuliang"+dats[i].value).html());
					                 				jiage2.push($("#jiage"+dats[i].value).html());
					                 				ids2.push(dats[i].value);
					                 				console.log(ids2)
					                 				console.log("pid2"+pid2)	
					                 				console.log("orderid"+orderid)
					                 				console.log("sid2"+sid2)
					                 				console.log("shuliang2"+shuliang2)
					                 				console.log("jiage2"+jiage2)
					                 				 $.post("../CartController/insertOrdersDetail",{"pid":pid2[i],"orderid":orderid[i],"sid":sid2[i],"number":shuliang2[i],"price":jiage2[i]},function(res){
							                 			
							                 		},"json");
					 							}; 
					                 			location.href="../OrderContrller/getorder?ids="+ids+"&sum="+sum+"&uid="+${user.uid}
					                 			}else{
					                 			alert(res.msg);
					                 			}
					                 	},"json");
			                 			}else{
			                 			alert(res.msg);
			                 			}
			                 	},"json"); 
							
							
							
						}else{
							alert("请先选择商品！")
						} */
							 /* if (data.length!=0) {
									$.post("../CartController/insertOrders",{"uid":uid,"totalprice":heji},function(res){
				                 		if(res.code=="0"){
				                 			
				                 			}else{
				                 			alert(res.msg);
				                 			}
				                 	},"json"); 
								$.post("../CartController/getshoppord",{"uid":uid},function(res){
				                 		if(res.code=="0"){
				                 			console.log(res)
				                 			var orderid=res.data[0].orderid
				                 			console.log(orderid)
				                 			
				                 			$.post("../CartController/insertOrdersDetail",{"pid":pid,"orderid":orderid,"sid":guige,"number":shuliang,"price":jiage},function(res){
						                 			if(res.code=="0"){
						                 				var arr=[];//1 2 3 4-->1,2,3,4
						    							var data=document.getElementsByClassName('checkboxs');
						    							var data=$("input[name='shopids']:checked");
						    							console.log(data)	
						    							console.log(data)	
						    							var shopid=document.getElementsByName('shopids')[0].value;
						    							console.log(shopid)	
						    							for (var i = 0; i < data.length; i++) {
						    								arr.push(data[i].value)	
						    								console.log(arr)
						    							}
						    							var ids=arr.join(",");//1,2,3,4
						    							console.log(ids)
						    							if(ids!=null&&ids!=''){
						    									  $.post("../CartController/deleteAllShoppingcart",{"ids":ids},function(res){
						    										  if(res.code=="0"){
						    												  setTimeout('window.location.reload()',1);
						    										  }else{
						    											  setTimeout('window.location.reload()',1);
						    										  }
						    									  },"json");
						    							}else{
						    								 alert("请先选择要删除的商品");
						    							}
						                 				}else{
						                 				alert(res.msg);
						                 				}
						                 		},"json");
				                 			}else{
				                 			alert(res.msg);
				                 			}
				                 	},"json");
								}else{
									alert("请先选择要结算的商品");
								} */
						}
						</script>
				
			</div>
		</div>
		<div class="mask"></div>
		<div class="tipDel">
			<p>确定要删除该商品吗？</p>
			<p class="clearfix">
				<a class="fl cer" href="#">确定</a>
				<a class="fr cancel" href="#">取消</a>
			</p>
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
			<a href="#" class="toptop" style="display: none;">
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
		<!----------------mask------------------->
		<div class="mask"></div>
		<!-------------------mask内容------------------->
		<div class="proDets">
			<img class="off" src="../qian/img/temp/off.jpg" />
			<div class="proCon clearfix">
				<div class="proImg fr">
					<img class="list" src="../qian/img/temp/proDet.jpg"  />
					<div class="smallImg clearfix">
						<img src="../qian/img/temp/proDet01.jpg" data-src="img/temp/proDet01_big.jpg">
						<img src="../qian/img/temp/proDet02.jpg" data-src="img/temp/proDet02_big.jpg">
						<img src="../qian/img/temp/proDet03.jpg" data-src="img/temp/proDet03_big.jpg">
						<img src="../qian/img/temp/proDet04.jpg" data-src="img/temp/proDet04_big.jpg">
					</div>
				</div>
				<div class="fl">
					<div class="proIntro change">
						<p>颜色分类</p>
						<div class="smallImg clearfix">
							<p class="fl on"><img src="../qian/img/temp/prosmall01.jpg" alt="白瓷花瓶+20支快乐花" data-src="img/temp/proBig01.jpg"></p>
							<p class="fl"><img src="../qian/img/temp/prosmall02.jpg" alt="白瓷花瓶+20支兔尾巴草" data-src="img/temp/proBig02.jpg"></p>
							<p class="fl"><img src="../qian/img/temp/prosmall03.jpg" alt="20支快乐花" data-src="img/temp/proBig03.jpg"></p>
							<p class="fl"><img src="../qian/img/temp/prosmall04.jpg" alt="20支兔尾巴草" data-src="img/temp/proBig04.jpg"></p>
						</div>
					</div>
					<div class="changeBtn clearfix">
						<a href="#2" class="fl"><p class="buy">确认</p></a>
						<a href="#2" class="fr"><p class="cart">取消</p></a>
					</div>
				</div>
			</div>
		</div>
		<div class="pleaseC">
			<p>请选择宝贝</p>
			<img class="off" src="../qian/img/temp/off.jpg" />
		</div>
		<script src="../qian/js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="../qian/js/public.js" type="text/javascript" charset="utf-8"></script>
		<script src="../qian/js/pro.js" type="text/javascript" charset="utf-8"></script>
		<script src="../qian/js/cart.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>




