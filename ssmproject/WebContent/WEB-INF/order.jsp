<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="utf-8" />
		<title>order</title>
		<link rel="stylesheet" type="text/css" href="../qian/css/public.css"/>
		<link rel="stylesheet" type="text/css" href="../qian/css/proList.css" />
		<link rel="stylesheet" type="text/css" href="../qian/css/mygxin.css" />
	</head>
		<style type="text/css">
	.niceButton3{
    display: inline-block;
    padding: 5px 12px;
    font-size: 10px;
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
.niceButton3:hover{
background-color: #1795bb;
}
.niceButton3:active{
    background-color: #1795bb;
    box-shadow: 0 5px #666;
    transform:translateY(4px);
}
.niceButton4{
    display: inline-block;
    padding: 5px 12px;
    font-size: 10px;
    cursor: pointer;
    text-align: center;
    text-decoration: none;
    outline: none;
    color:#fff;
    background-color: rgb(255,192,203);
    border: none;
    border-radius: 15px;
    box-shadow: 0 9px #999;
}
.niceButton4:hover{
background-color: #FF77FF;
}
.niceButton4:active{
    background-color: #1795bb;
    box-shadow: 0 5px #666;
    transform:translateY(4px);
}
.niceButtons{
    display: inline-block;
    padding: 5px 12px;
    font-size: 10px;
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
.niceButtons:hover{
background-color: #FF0000 ;
}
.niceButtons:active{
    background-color: #FF0000 ;
    box-shadow: 0 5px #666;
    transform:translateY(4px);
}
.niceButtonb{
    display: inline-block;
    padding: 5px 12px;
    font-size: 10px;
    cursor: pointer;
    text-align: center;
    text-decoration: none;
    outline: none;
    color:#fff;
    background-color: rgb(0,128,0);
    border: none;
    border-radius: 15px;
    box-shadow: 0 9px #999;
}
.niceButtonb:hover{
background-color: #2E8B57;
}
.niceButtonb:active{
    background-color: #CCFF33 ;
    box-shadow: 0 5px #666;
    transform:translateY(4px);
    }
/* Border styles */
table thead, table tr {
border-top-width: 1px;
border-top-style: solid;
border-top-color: rgb(235, 242, 224);
}
table {
border-bottom-width: 1px;
border-bottom-style: solid;
border-bottom-color: rgb(235, 242, 224);
}
 
/* Padding and font style */
tabletd, table th {
padding: 5px 10px;
font-size: 12px;
font-family: Verdana;
color: rgb(149, 170, 109);
}
 
/* Alternating background colors */
table tr:nth-child(odd) {
background: #FFF
}
table tbody {
   max-height: 500px;
   display: block;
   overflow-y: auto;
}
table thead, table tbody tr {
   width: 100%;
   display: table;
   table-layout: fixed;
}
table thead {
   width: calc(100% - 3px); /*减去默认滚动条的宽度，让thead 与tbody 对齐*/
}
table tbody::-webkit-scrollbar { width: 3px;}  /*设置滚动条的宽度，让thead 与tbody 对齐*/
 
/*改变滚动条的宽度和样式*/
table tbody::-webkit-scrollbar { width: 3px;}
table tbody::-webkit-scrollbar-track{background-color:#f0f0f0；}
table tbody::-webkit-scrollbar-thumb{background-color:#CCCCCC;}
table tbody::-webkit-scrollbar-thumb:hover {background-color:#CCCCCC；}
table tbody::-webkit-scrollbar-thumb:active {background-color:#CCCCCC；}
table thead, tbody tr {
display:table;
width:100%;
table-layout:fixed;
}
/* Note that you only needs to edit the config to customize the button! */

.plusButton {
margin-left:75px;
  /* Config start */
  --plus_sideLength: 2.5rem;
  --plus_topRightTriangleSideLength: 0.9rem;
  /* Config end */
  position: relative;
  display: flex;
  justify-content: center;
  align-items: center;
  border: 1px solid white;
  width: var(--plus_sideLength);
  height: var(--plus_sideLength);
  background-color: #000000;
  overflow: hidden;
}

.plusButton::before {
  position: absolute;
  content: "";
  top: 0;
  right: 0;
  width: 0;
  height: 0;
  border-width: 0 var(--plus_topRightTriangleSideLength) var(--plus_topRightTriangleSideLength) 0;
  border-style: solid;
  border-color: transparent white transparent transparent;
  transition-timing-function: ease-in-out;
  transition-duration: 0.2s;
}

.plusButton:hover {
  cursor: pointer;
}

.plusButton:hover::before {
  --plus_topRightTriangleSideLength: calc(var(--plus_sideLength) * 2);
}

.plusButton:focus-visible::before {
  --plus_topRightTriangleSideLength: calc(var(--plus_sideLength) * 2);
}

.plusButton>.plusIcon {
  fill: white;
  width: calc(var(--plus_sideLength) * 0.7);
  height: calc(var(--plus_sideLength) * 0.7);
  z-index: 1;
  transition-timing-function: ease-in-out;
  transition-duration: 0.2s;
}

.plusButton:hover>.plusIcon {
  fill: black;
  transform: rotate(180deg);
}

.plusButton:focus-visible>.plusIcon {
  fill: black;
  transform: rotate(180deg);
}
		</style>
		
	
	<body onload="yinchang()">
	
		<!----------------------------------------order------------------>
		<div class="head ding">
			<div class="wrapper clearfix">
				<div class="clearfix" id="top">
					<h1 class="fl"><img src="../images/logo.png" width="200px" height="70px"/></h1>
				</div>
			</div>
		</div>
		<div class="order cart mt">
			<!-----------------site------------------->
			<div class="site">
				<p class="wrapper clearfix">
					<span class="fl">订单确认</span>
					<img class="top" src="../qian/img/temp/cartTop02.png">
				</p>
			</div>
			<!-----------------orderCon------------------->
			<div class="orderCon wrapper clearfix">
				<div class="orderL fl">
					<!--------h3---------------->
					<h3>收件信息</h3>
					<!--------addres---------------->
					<div class="addres clearfix" id="tas">
					<table>
					<thead>
						<tr>
							<td width="20" height="50" style="text-align:center" ><h3>选择</h3></td>
							<td width="20" height="50" style="text-align:center" ><h3>姓名</h3></td>
							<td width="20" height="50" style="text-align:center" ><h3>电话</h3></td>
							<td width="20" height="50" style="text-align:center" ><h3>省份</h3></td>
							<td width="20" height="50" style="text-align:center" ><h3>城市</h3></td>
							<td width="20" height="50" style="text-align:center" ><h3>县</h3></td>
							<td width="25" height="50" style="text-align:center" ><h3>配送区域</h3></td>
							<td width="25" height="50" style="text-align:center" ><h3>详细地址</h3></td>
							<td width="70" height="50" style="text-align:center" ><form action="">
							<a href="#2" id="addxad"><div tabindex="0" class="plusButton">
  <svg class="plusIcon" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 30 30">
    <g mask="url(#mask0_21_345)">
      <path d="M13.75 23.75V16.25H6.25V13.75H13.75V6.25H16.25V13.75H23.75V16.25H16.25V23.75H13.75Z"></path>
    </g>
  </svg>
</div>
					</a>
							</form></td>
						</tr>
					</thead>
						<c:forEach items="${ad }" var="ad">
							<tr id="tr">
							<td width="20" height="50" style="text-align:center"><input type="radio" id="adid" name="adid"  value="${ad.adid}" ></td>
							<td width="20" height="50" style="text-align:center">${ad.addname }</td>
							<td width="20" height="50" style="text-align:center">${ad.addphone }</td>
							<td width="20" height="50" style="text-align:center">${ad.adprovince }</td>
							<td width="20" height="50" style="text-align:center">${ad.adcity }</td>
							<td width="20" height="50" style="text-align:center">${ad.addistrict }</td>
							<td width="25" height="50" style="text-align:center">${ad.addstreet }</td>
							<td width="25" height="50" style="text-align:center">${ad.detailaddress }</td>
							<td width="70" height="50" style="text-align:center" ><p class="fr">&emsp;&emsp;
							<form action="" id="mns">
									<a href="#" ><input type="button" value="删除" onclick="shanchu(this)" alt="${ad.adid}"  style="background-color:white;"></a>
									&ensp;
									<a href="#" ><input type="button" id="btn" onclick="xiu(this)"  alt="${ad.adid}"  value="编辑"   style="background-color:white;"></a>
									&ensp;
									<a href="#" ><input type="button" onclick="moren(this)" id="mr"  alt="${ad.adid}"  value="默认"  style="background-color:white;"></a>
									
									</form>
								</td>
							</tr>
							</c:forEach>
					</table>
			
					<form action="#" method="get" id="fm" style="height: 300px;font-size: 18px">
				姓名：<input type="text" name="addname"  class="on"   id="name" style="height: 50px;border: 1px solid #040404;width: 230px"/><br/>
				<input type="hidden"  name="adid" id="id" style="height: 50px"/> 
				<input type="hidden"  name="moren" id="moren" style="height: 50px"/> 
				电话：<input type="text"  name="addphone" id="phone" style="height: 50px;border: 1px solid #040404;width: 230px" /><br/>
				省份/自治区：<select  id="province" style="height: 70px;background-color: #fff;width: 230px">
						<option value="省份/自治区">省份/自治区</option>
						<option value="河南">河南</option>
                        <option value="湖北">湖北</option>
                        <option value="湖南">湖南</option>
					</select><br/>
					城市/地区：<select  id="city" style="height: 50px;background-color: #fff;width: 230px">
						<option value="城市/地区">城市/地区</option>
							<option value="郑州">郑州</option>
                             <option value="驻马店">驻马店</option>
                           <option value="洛阳">洛阳</option>
					</select><br/>
					区/县：<select  id="istrict" style="height: 50px;background-color: #fff;width: 230px">
						<option value="区/县">区/县</option>
						<option value="二七">二七</option>
                        <option value="金水">金水</option>
                        <option value="中原">中原</option>
					</select><br/>
					配送区域：<select  id="street" style="height: 50px;background-color: #fff;width: 230px">
						<option value="配送区域">配送区域</option>
						<option value="林山赛">林山赛</option>
                         <option value="嵩山路">嵩山路</option>
                        <option value="陇海路">陇海路</option>
					</select><br/>
				详细地址：<textarea name="detailaddress" rows="" cols=""  id="tailaddress" placeholder="详细地址" style="height: 50px";width: 230px></textarea><br/>
				
					<br/>
					<input type="button" onclick="xiugai()"  value="保存" style="font-size: 25px;background-color: #fff" />&emsp;&emsp;&emsp;&emsp;
					<input type="button" onclick="quxiao()" value="取消" style="font-size: 25px;background-color: #fff" />
			</form>	
			</div>
			<script type="text/javascript">
			function moren(obj) { 
				var uid=document.getElementById("uid").value;
				console.log(uid); 
          		var idaa=obj.alt;
          		console.log(idaa); 
          		$.post("../OrderContrller/getMo",{"uid":uid},function(res){
	            		if(res.code=="0"){
	            			 $.post("../OrderContrller/Moren",{"adid":res.data[0].adid},function(res){
	            		   		  if(res.code==0){
		            				setTimeout('window.location.reload()',1);
		            			}else{
		            				setTimeout('window.location.reload()',1);
		            			} 
	            		   	  },"json");
	            			 $.post("../OrderContrller/Morenyi",{"adid":idaa},function(res){
	            		   		  if(res.code==0){
	            		   			alert(res.msg);
		            				setTimeout('window.location.reload()',1);
		            			}else{
		            				alert(res.msg);
		            				setTimeout('window.location.reload()',1);
		            			} 
	            		   	  },"json");
	            		}else{
	            			 $.post("../OrderContrller/Morenyi",{"adid":idaa},function(res){
	            		   		  if(res.code==0){
	            		   			alert(res.msg);
		            				setTimeout('window.location.reload()',1);
		            			}else{
		            				alert(res.msg);
		            				setTimeout('window.location.reload()',1);
		            			} 
	            		   	  },"json");
	            		}
	            	},"json");
          		
          		}
			</script>
	              	<script type="text/javascript">
	              	function tj() {
						var addname=document.getElementById("addname").value;
						var uid=document.getElementById("uid").value;
						console.log(uid)
						var addphone=document.getElementById("addphone").value;
						var adprovince=document.getElementById("adprovince").value;
						var adcity=document.getElementById("adcity").value;
						var addistrict=document.getElementById("addistrict").value;
						var addstreet=document.getElementById("addstreet").value;
						var detailaddress=document.getElementById("detailaddress").value;
						$.post("../OrderContrller/insertpro",{"uid":uid,"addname":addname,"addphone":addphone,"adprovince":adprovince,"adcity":adcity,"addistrict":addistrict,"addstreet":addstreet,"detailaddress":detailaddress},function(res){
		            		if(res.code=="0"){
		            			console.log(res)
		            				alert(res.msg);
		            				setTimeout('window.location.reload()',1);
		            			}else{
		            				alert(res.msg);
		            				setTimeout('window.location.reload()',1);
		            			} 
		            	},"json");
					}
	              	</script>
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
						console.log(obj)
						var id=document.getElementById("id").value;
						console.log(id)
						var altid=obj.alt;
						console.log(altid)
						if (confirm("确定删除吗")) {
							$.post("../OrderContrller/deleteAddress",{"adid":altid},function(res){
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
	              	</script>
	              	<script type="text/javascript">
	              	function xiu(obj) {
	              		document.getElementById("fm").style.display='';
	              		$("#tas").attr("style","height:950px;");
	              		var idaa=obj.alt;
	              		console.log(idaa);
	              		document.getElementById("id").value=idaa;
	              		$.post("../OrderContrller/danAddress",{"adid":idaa},function(res){
								if(res.code=="0"){
									console.log(res);
									var addname=res.data[0].addname;
									document.getElementById("name").value=addname;
									console.log(addname);
									 var addphone=res.data[0].addphone;
									document.getElementById('phone').value=addphone;
									var adprovince=res.data[0].adprovince;
									document.getElementById('province').value=adprovince;
									var adcity=res.data[0].adcity;
									document.getElementById('city').value=adcity;
									var addistrict=res.data[0].addistrict;
									document.getElementById('istrict').value=addistrict;
									var addstreet=res.data[0].addstreet;
									document.getElementById('street').value=addstreet;
									var detailaddress=res.data[0].detailaddress;
									document.getElementById('tailaddress').value=detailaddress; 
									var moren=res.data[0].moren;
									document.getElementById('moren').value=moren; 
		            			}
								},"json");
					}
	              	</script>
	              	<script type="text/javascript">
	              	function xiugai(obj) {
	              		document.getElementById("fm").style.display='none';
	              		$("#tas").attr("style","height:auto;");
						var addname=document.getElementById("name").value;
						console.log(addname);
						var adid=document.getElementById("id").value;
						console.log(adid);
						var uid=document.getElementById("uid").value;
						console.log(uid);
						var addphone=document.getElementById("phone").value;
						console.log(addphone);
						var adprovince=document.getElementById("province").value;
						console.log(adprovince);
						var adcity=document.getElementById("city").value;
						console.log(adcity);
						var addistrict=document.getElementById("istrict").value;
						console.log(addistrict);
						var addstreet=document.getElementById("street").value;
						console.log(addstreet);
						var detailaddress=document.getElementById("tailaddress").value;
						console.log(detailaddress);
						var moren=document.getElementById("moren").value;
						console.log(moren);
						$.post("../OrderContrller/updateAddress",{"uid":uid,"adid":adid,"addname":addname,"addphone":addphone,"adprovince":adprovince,"adcity":adcity,"addistrict":addistrict,"addstreet":addstreet,"detailaddress":detailaddress,"moren":moren},function(res){
		            		if(res.code=="0"){
		            			console.log(res)
		            				alert(res.msg);
		            				setTimeout('window.location.reload()',1);
		            			}else{
		            				alert(res.msg);
		            				setTimeout('window.location.reload()',1);
		            			} 
		            	},"json");
					}
	              	function quxiao() {
	              		document.getElementById("fm").style.display='none';
	              		$("#tas").attr("style","height:auto;");
					}
	              	</script>
	              	<script type="text/javascript">
	              	function yinchang(){
	              		 document.getElementById("fm").style.display='none';
	              		var uid=document.getElementById("uid").value;
	              		var dats=$("input[name='adid']:checked");
	              		 var input = document.getElementById('adid');
	                     input.checked=true;
	                     
	              		$.post("../OrderContrller/getMo",{"uid":uid},function(res){
	              			if(res.code==0){
	              				$("#tr").attr("style","background-color: #FAF9DE;");
	              				$("#mr").attr("style","background-color:red;");
	              				document.getElementById("mr").value="           ";
	              				$("#mr").attr("disabled",ture);
	              				
	              				checked=true;
	              				/* var s="";
	              				s+="<input type='button'value='默认'  style='background-color:yellow; disable'/>";
	              				$("#mns").html(s); */
	              			}
	              		},"json");
	              	}
	              	</script>
					<h3>支付方式</h3>
					<!--------way---------------->
					<div class="way clearfix">
						<img class="on" src="../qian/img/temp/way01.jpg"> 
						<img src="../qian/img/temp/way02.jpg"> 
						<img src="../qian/img/temp/way03.jpg"> 
						<img src="../qian/img/temp/way04.jpg"> 
					</div>
					<h3>选择快递</h3>
					<!--------dis---------------->
					<div class="dis clearfix">
						<span class="on">顺风快递</span>
						<span>百世汇通</span>
						<span>圆通快递</span>
						<span>中通快递</span>
					</div>
				</div>
				<div class="orderR fr">
					<div class="msg">
						<h3>订单内容<a href="../CartController/Gowu?uid=${user.uid}" class="fr">返回购物车</a></h3>
						<!--------ul---------------->
						<c:forEach items="${pro}" var="pro">
						<ul class="clearfix">
							<li class="fl">
							<input type="hidden" name="pidss" value="${pro.pid}">
							<input type="hidden" id="ids" value="${pro.shoppingcart.shopid}">
								<img src="../images/${pro.pimg}" width="150px" height="125px" >
							</li>
							<li class="fl">
								<p>${pro.pname}</p>
								<p class="scolor">分类：${pro.specification.scolor}</p>
								<p class="number">数量：${pro.shoppingcart.shopnumber}</p>
							</li>
							<li class="fr" >￥${pro.shoppingcart.shopprice}</li>
						</ul>
						</c:forEach>
					</div>
					<!--------tips---------------->
					<div class="tips">
						<p><span class="fl">商品金额：</span><span class="fr">￥${sum}</span></p>
						<p><span class="fl">优惠金额：</span><span class="fr">￥0.00</span></p>
						<p><span class="fl">运费：</span><span class="fr">免运费</span></p>
					</div>
					<!--------tips count---------------->
					<div class="count tips">
						<p><span class="fl">合计：</span><span class="fr">￥${sum}</span></p>
					</div>
					<!--<input type="button" name="" value="去支付"> -->
					<a href="../pay?sum=${sum}" class="pay" onclick="zhifu()">去支付</a>

				</div>
			</div>
		</div>
		<script type="text/javascript">
			function zhifu(){
				 var arr=[${ids}];//1 2 3 4-->1,2,3,4
				 var ids=arr.join(",");//1,2,3,4
				 var sum=${sum};
				 var dats=$("input[name='adid']:checked");
				 var adid=[];
				for (var i = 0; i < arr.length; i++) {
					  var pid=document.getElementsByName("pidss")[i].value;
					  var scolor=document.getElementsByClassName("scolor")[i].innerText.substring(3);
					  var number=document.getElementsByClassName("number")[i].innerText.substring(3);
					   $.post("../OrderContrller/getsname",{"pid":pid,"scolor":scolor},function(res){
						if(res.code=="0"){
							 var sid=res.data[0].sid;
							var sstock=res.data[0].sstock;
							var nnmm=sstock-number;
							console.log(sstock);
							 console.log(nnmm);
							   $.post("../OrderContrller/upsstock",{"sstock":nnmm,"sid":sid},function(res){
							 },"json"); 
						 }
					  },"json");
				}
				for(var i=0;i<dats.length;i++){
					adid.push(dats[i].value);
				} 
					 adid=adid.join(",");
					 console.log(arr);
					 console.log(ids);
					 console.log(adid);
					 var pid2=[];
					 var sid2=[];
					 var shuliang2=[];
					 var jiage2=[];
					 var uid2=${user.uid}
					 $.post("../OrderContrller/getcate",{"ids":ids},function(res){
	                 		if(res.code=="0"){
	                 			console.log(res);
	                 			for (var i = 0; i < arr.length; i++) {
	                 				pid2.push(res.data[i].pid);
	                 				sid2.push(res.data[i].specification.sid);
	                 				shuliang2.push(res.data[i].shoppingcart.shopnumber);
	                 				jiage2.push(res.data[i].shoppingcart.shopprice);
								} 
	                 			
	                 			console.log(pid2);
	                 			console.log(sid2);
	                 			console.log(shuliang2);
	                 			console.log(jiage2);
	                 			$.post("../OrderContrller/insertOrders",{"uid":uid2,"adid":adid,"totalprice":sum},function(res){
		                 		if(res.code=="0"){
		                 			console.log(res);
		                 			$.post("../OrderContrller/getshoppord",{"uid":uid2},function(res){
		                 				if(res.code=="0"){
		                 					$.post("../OrderContrller/getshoppord2",{"orderid":res.data[0].orderid},function(res){
						                 		if(res.code=="0"){
						                 			console.log(res);
						                 			var orderid2=[];
						                 			 for(var i=0;i<ids.length;i++){
						                 				orderid2.push(res.data[i].orderid);
						                 					$.post("../OrderContrller/insertOrdersDetail",{"pid":pid2[i],"orderid":orderid2[i],"sid":sid2[i],"number":shuliang2[i],"price":jiage2[i]},function(res){
								                 			
								                			},"json");
						                 					 $.post("../OrderContrller/deleteAllShoppingcart",{"ids":ids},function(res){
						              					  },"json");
						 							}; 
						 							
						                 		}else{
						                 		alert(res.msg);
						                 		}
						                 	},"json");
		                 				}else{
					                 		alert(res.msg);
					                 		}
		                 				
		                 			},"json"); 
		                 			
		                 			}else{
		                 			alert(res.msg);
		                 			}
		                 	},"json");
	                 			}else{
	                 			alert(res.msg);
	                 			}
	                 	},"json");
					
						  
			}
		</script>
		<!--编辑弹框-->
		<!--遮罩-->
			
		
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
		<script src="../qian/js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="../qian/js/public.js" type="text/javascript" charset="utf-8"></script>
		<script src="../qian/js/pro.js" type="text/javascript" charset="utf-8"></script>
		<script src="../qian/js/user.js" type="text/javascript" charset="utf-8"></script>
				<!-- 		添加div开始		 -->
		<div class="adddz">
			<form action="" method="get">
				<input type="text" name="addname" id="addname" placeholder="姓名" class="on" />
				<input type="hidden" name="uid"  id="uid" value="${user.uid}" />
				<input type="text" name="addphone" id="addphone" placeholder="手机号" />
				<div class="city">
					<select name="adprovince" id="adprovince">
						<option value="省份/自治区">省份/自治区</option>
						<option value="河南">河南</option>
                        <option value="湖北">湖北</option>
                        <option value="湖南">湖南</option>
					</select>
					<select name="adcity" id="adcity">
						<option value="城市/地区">城市/地区</option>
							<option value="郑州">郑州</option>
                             <option value="驻马店">驻马店</option>
                           <option value="洛阳">洛阳</option>
					</select>
					<select name="addistrict" id="addistrict">
						<option value="区/县">区/县</option>
						<option value="二七">二七</option>
                        <option value="金水">金水</option>
                        <option value="中原">中原</option>
					</select>
					<select name="addstreet" id="addstreet">
						<option value="配送区域">配送区域</option>
						<option value="林山赛">林山赛</option>
                         <option value="嵩山路">嵩山路</option>
                        <option value="陇海路">陇海路</option>
					</select>
				</div>
				<textarea name="detailaddress" id="detailaddress" rows="" cols="" placeholder="详细地址"></textarea>
				<div class="bc">
					<input type="button" onclick="tj()"  value="保存" />
					<input type="button" value="取消" />
				</div>
			</form>
		</div>
		
	</body>
	
</html>

