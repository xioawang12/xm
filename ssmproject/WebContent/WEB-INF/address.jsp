<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="utf-8" />
		<title>最家</title>
		<link rel="stylesheet" type="text/css" href="../qian/css/public.css"/>
		<link rel="stylesheet" type="text/css" href="../qian/css/mygxin.css" />
		<link rel="stylesheet" href="../layui/css/layui.css" media="all">
		<script type="text/javascript" src="../js/jquery.min.js"></script>
		<script type="text/javascript" src="../layui/layui.js"></script>
		<style type="text/css">
		.layui-table-body, .layui-table-main {
  overflow-y: hidden;
}
		</style>
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
				<a href="#" class="on">地址管理</a>
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
							<li><a href="../MyorderqController/Myorderq?uid=${user.uid}">我的订单</a></li>
							<li><a href="../MyprodController/AllComments?uid=${user.uid}">评价晒单</a></li>
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

				<div class="you fl">
					<h2>收货地址</h2>

						<table id="demo" lay-filter="test"></table>
						
						<script type="text/html" id="toolbarDemo">
  <div class="layui-btn-container">
    <button class="layui-btn layui-btn-sm" lay-event="add">添加</button>
  </div>
</script>
<script type="text/html" id="toolEventDemo">
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
	{{#  if(d.moren == 0){ }}
 		<a class="layui-btn layui-btn-danger layui-btn-xs layui-btn-warm" lay-event="mo">设默认</a>
	{{#  } }}
	{{#  if(d.moren == 1){ }}
		<a class="layui-btn layui-btn-xs  layui-btn-warm"  lay-event="morenyi">已默认</a>
	{{#  } }}
</script>
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
		<!-- 		添加div开始		 -->
<div style="display: none;" id="adddiv">
<form class="layui-form" action="" id="addbiaodan">
  <div class="layui-form-item">
    <label class="layui-form-label">收件人姓名</label>
    <div class="layui-input-inline">
      <input type="text" name="addname" required  lay-verify="fname"  autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">手机号</label>
    <div class="layui-input-inline">
      <input type="text" name="addphone" required    autocomplete="off" class="layui-input" lay-verify="phone">
    </div>
  </div>
   <div class="layui-inline">
    <label class="layui-form-label">省</label>
    <div class="layui-input-block" >
      <select  name="adprovince"  placeholder="" autocomplete="off" class="layui-input">
      <option >请选择</option>
      <option value="河南">河南</option>
      <option value="湖北">湖北</option>
      <option value="湖南">湖南</option>
      </select>
    </div>
  </div>
   <div class="layui-inline">
    <label class="layui-form-label">市</label>
    <div class="layui-input-block" >
      <select  name="adcity"  placeholder="" autocomplete="off" class="layui-input">
      <option>请选择</option>
      <option value="郑州">郑州</option>
      <option value="驻马店">驻马店</option>
      <option value="洛阳">洛阳</option>
      </select>
    </div>
  </div>
   <div class="layui-inline">
    <label class="layui-form-label">区</label>
    <div class="layui-input-block" >
      <select  name="addistrict"  placeholder="" autocomplete="off" class="layui-input">
      <option>请选择</option>
      <option value="二七">二七</option>
      <option value="金水">金水</option>
      <option value="中原">中原</option>
      </select>
    </div>
  </div>
  <div class="layui-inline">
    <label class="layui-form-label">街道</label>
    <div class="layui-input-block" >
      <select  name="addstreet"  placeholder="" autocomplete="off" class="layui-input">
      <option>请选择</option>
      <option value="林山赛">林山赛</option>
      <option value="嵩山路">嵩山路</option>
      <option value="陇海路">陇海路</option>
      </select>
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">详细地址</label>
    <div class="layui-input-inline">
      <input type="text" name="detailaddress" required  lay-verify="required"  autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="btnAdd">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>
</div>
<!-- 		添加div结束		 -->
<!-- 修改div 开始-->
	<div style="display: none" id="updatereAddress">
		<form class="layui-form" lay-filter="fmUpdate" action="" id="uppbiaodan">
  <div class="layui-form-item">
    <label class="layui-form-label">收件人姓名</label>
    <div class="layui-input-inline">
    <input type="hidden" name="adid">
      <input type="text" name="addname" required  lay-verify="fname"  autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">手机号</label>
    <div class="layui-input-inline">
      <input type="text" name="addphone" required  lay-verify="phone"  autocomplete="off" class="layui-input">
    </div>
  </div>
   <div class="layui-inline">
    <label class="layui-form-label">省</label>
    <div class="layui-input-block" >
      <select  name="adprovince"  placeholder="" autocomplete="off" class="layui-input">
      <option >请选择</option>
      <option value="河南">河南</option>
      <option value="湖北">湖北</option>
      <option value="湖南">湖南</option>
      </select>
    </div>
  </div>
   <div class="layui-inline">
    <label class="layui-form-label">市</label>
    <div class="layui-input-block" >
      <select  name="adcity"  placeholder="" autocomplete="off" class="layui-input">
      <option>请选择</option>
      <option value="郑州">郑州</option>
      <option value="驻马店">驻马店</option>
      <option value="洛阳">洛阳</option>
      </select>
    </div>
  </div>
   <div class="layui-inline">
    <label class="layui-form-label">区</label>
    <div class="layui-input-block" >
      <select  name="addistrict"  placeholder="" autocomplete="off" class="layui-input">
      <option>请选择</option>
      <option value="二七">二七</option>
      <option value="金水">金水</option>
      <option value="中原">中原</option>
      </select>
    </div>
  </div>
  <div class="layui-inline">
    <label class="layui-form-label">街道</label>
    <div class="layui-input-block" >
      <select  name="addstreet"  placeholder="" autocomplete="off" class="layui-input">
      <option>请选择</option>
      <option value="林山赛">林山赛</option>
      <option value="嵩山路">嵩山路</option>
      <option value="陇海路">陇海路</option>
      </select>
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">详细地址</label>
    <div class="layui-input-inline">
      <input type="text" name="detailaddress" required  lay-verify="required"  autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="btnUpdate">修改</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>
</div>
	<!-- 修改div 结束-->
	</div>
	</body>
	<script>
layui.use(['table','form','layer'], function(){
  var table = layui.table,
  layer=layui.layer,
   form = layui.form;
  
  //第一个实例
  table.render({
    elem: '#demo'
    ,toolbar: '#toolbarDemo'
    ,url: '../AddressController/getadd?uid='+${user.uid}//数据接口
    ,page: false //开启分页
    ,limit:Number.MAX_VALUE
    ,defaultToolbar: false
    ,skin:'nob'
    ,size:'lg'
    ,cols: [[ //表头
      {field: 'addname', title: '姓名', width: 80, sort: true}
      ,{field: 'addphone', title: '手机号', width: 80}
      ,{field: 'adprovince', title: '省', width:80}
      ,{field: 'adcity', title: '市', width:80, sort: true}
      ,{field: 'addistrict', title: '区', width:80} 
      ,{field: 'addstreet', title: '街道', width: 80}
      ,{field: 'detailaddress', title: '详细地址', width: 100, sort: true}
      ,{title: '操作', toolbar:'#toolEventDemo', width: 200}
    ]]
  ,id:"type"
  });
  //添加
  table.on('toolbar(test)', function(obj){
	   var checkStatus = table.checkStatus(obj.config.id);
	   switch(obj.event){
	     case 'add':
	   	 	    	$("#addbiaodan")[0].reset();//清空表单
	   	 	      layer.open({
	   	 	    	  type:1,
	   	 	    	  title:"添加类型",
	   	 	    	  content:$("#adddiv"),
	   	 	    	  area:["600px","400px"],
	   	 	    	  maxmin:true
	   	 	      });
	   		break;
	   };
	 });
//监听添加
  form.on('submit(btnAdd)', function(data){
	  console.log(data);
	 $.post('../AddressController/insertpro?uid='+${user.uid},data.field,function(res){
		 if(res.code==0){
			 layer.msg(res.msg,{icon:1,time:2000},function(){
				 layer.closeAll();//关闭弹窗
				 table.reload('type');//重置表格
			 });
		 }else{
			  layer.msg(res.msg);
		  }
	  },"json");
	  return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
	});
//单元格工具事件
  table.on('tool(test)', function(obj){ // 注：test 是 table 原始标签的属性 lay-filter="对应的值"
    var data = obj.data; //获得当前行数据
    var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
    var tr = obj.tr; //获得当前行 tr 的 DOM 对象（如果有的话）
   if(layEvent === 'del'){ //删除
      layer.confirm('确定删除吗？', function(index){
      $.post("../AddressController/deleteAddress",{"adid":data.adid},function(res){
    	  if(res.code==0){
 			 layer.msg(res.msg,{time:2000},function(){
 				 layer.closeAll();//关闭弹窗
 				 table.reload('type');//重置表格
 			 });
 		 }else{
 			  layer.msg(res.msg);
 		  }
 	  },"json");
      });
    } else if(layEvent === 'edit'){ //编辑
    	form.val('fmUpdate',data);//赋值
    	layer.open({
  		  type:1,
  		  title:"修改位置",
  		  content:$("#updatereAddress"),
  		  area:["500px","400px"],
  		  maxmin:true 
    	  });
    }else if(layEvent === 'mo'){
    	$.post('../AddressController/getMo',{"uid":data.uid},function(res){
    		console.log(res)
     		   if(res.code==0){
     			 $.post("../AddressController/Moren",{"adid":res.data[0].adid},function(res){
     		   		  if(res.code==0){
     		   			  layer.msg(res.msg,{icon:1,time:2000},function(){
     		   				  table.reload('type');
     		   				  layer.closeAll();
     		   			  });
     		   		  }else{
     		   			  layer.msg(res.msg);
     		   		  }
     		   	  },"json");
     			$.post("../AddressController/Morenyi",{"adid":data.adid},function(res){
     		   		  if(res.code==0){
     		   			  layer.msg(res.msg,{icon:1,time:2000},function(){
     		   				  table.reload('type');
     		   				  layer.closeAll();
     		   			  });
     		   		  }else{
     		   			  layer.msg(res.msg);
     		   		  }
     		   	  },"json");
     		   }else{
     			  $.post("../AddressController/Morenyi",{"adid":data.adid},function(res){
     		   		  if(res.code==0){
     		   			  layer.msg(res.msg,{icon:1,time:2000},function(){
     		   				  table.reload('type');
     		   				  layer.closeAll();
     		   			  });
     		   		  }else{
     		   			  layer.msg(res.msg);
     		   		  }
     		   	  },"json");
     		   } 
     	  },"json"); 
    	
   }
  });
//监听修改
  form.on('submit(btnUpdate)', function(data){
	  console.log(data);
	 $.post('../AddressController/updateAddress?uid='+${user.uid},data.field,function(res){
		 if(res.code==0){
			 layer.msg(res.msg,{icon:1,time:2000},function(){
				 layer.closeAll();//关闭弹窗
				 table.reload('type');//重置表格
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



