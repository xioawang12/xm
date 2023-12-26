<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../layui/css/layui.css" media="all">
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../layui/layui.js"></script>
</head>
<body>
<script type="text/html" id="toolbarDemo">
  <div class="layui-btn-container">
    <button class="layui-btn layui-btn-normal layui-btn-sm" lay-event="add">添加</button>
  </div>
</script>
<table id="demo" lay-filter="test"></table>
<script type="text/html" id="toolEventDemo">
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<!-- 添加表 -->
<div style="display: none;" id="adddiv">
<form class="layui-form" lay-filter="feedit" action="" id="addbiaodan">
<div class="layui-form-item">
    <label class="layui-form-label">图片</label>
    <div class="layui-input-block">
    <button type="button" class="layui-btn" id="img">
     <i class="layui-icon">&#xe67c;</i>上传图片
 	</button><br>
 	<img id="phose" style="width:120px" src=""/><br/>
      <input type="hidden" name="imgurl" id="imgurl" autocomplete="off" placeholder="请上传图片" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">所属商品名字</label>
    <div class="layui-input-inline">
    <input type="hidden" name="pid">
      <input type="text" name="pname" id="pname" readonly lay-verify="required" autocomplete="off" placeholder="请输入商品名字" class="layui-input">
    </div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">权重值</label>
    <div class="layui-input-inline">
      <input type="number" name="iweight" lay-verify="required" autocomplete="off" placeholder="请输入权重值" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="adddemomen">添加</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
 </form>
</div>

<!-- 修改表 -->
<div style="display: none;" id="updiv">
<form class="layui-form" lay-filter="fmupdate" action="" id="upbiaodan">
<div class="layui-form-item">
    <label class="layui-form-label">图片</label>
    <div class="layui-input-block">
    <button type="button" class="layui-btn" id="img1">
     <i class="layui-icon">&#xe67c;</i>上传图片
 	</button><br>
 	<img id="phose1" style="width:120px" src=""/><br/>
 	<input type="hidden" name="imgid">
 	<input type="hidden" name="pid">
      <input type="hidden" name="imgurl" id="imgurl1" autocomplete="off" placeholder="请上传图片" class="layui-input">
    </div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">权重值</label>
    <div class="layui-input-inline">
      <input type="number" name="iweight" lay-verify="required" autocomplete="off" placeholder="请输入权重值 " class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="updemomen">修改</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
 </form>
</div>
</body>
<script>
layui.use(['table','form','layer','upload'], function(){
  var table = layui.table,
  form=layui.form,
  layer=layui.layer,
  upload = layui.upload;
  
  
  var data=JSON.parse(sessionStorage.getItem("product"))
  //第一个实例
  table.render({
    elem: '#demo'
    ,toolbar: '#toolbarDemo'
    ,height: 630
    ,url: '../proimg/findall' //数据接口
    ,page: true //开启分页
    ,method:'post'
    ,cols: [[ //表头
    	{checkbox:true}
     ,{field: 'imgid', title: 'ID', width:80}
     ,{templet: "<div>{{d.product.pname}}</div>", title: '所属商品	', width: 177}
     ,{templet: "<div><img src='../images/{{d.imgurl}}'/></div>", title: '图片', width:80}
      ,{field: 'iweight', title: '权重值', width:150}
      ,{title:"操作",templet: '#toolEventDemo', width: 200}
    ]]
  	,id:'productimg'
	,where:{"pid":data.pid}
  });
  
  form.on('submit(formDemo)', function(data){
	  table.reload('productimg', {
		  where:data.field  
		});
	  return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
	});
  
  var uploadInst = upload.render({
	    elem: '#img' //绑定元素
	    ,url: '../upload' //上传接口
	    ,done: function(res){
	     if(res.code=="0"){
	    	 //把返回的图片名，放到img标记的src里面
	    	 $("#phose").attr("src","../images/"+res.msg);
	    	 //把返回的图片名，保存在隐藏域里面
	    	 $("#imgurl").val(res.msg);
	    	 layer.msg('新图片上传成功',{
	    		 icon:6,
	    		 time:1500
	    	 });
	     }
	    }
	    ,error: function(){
	      //请求异常回调
	    }
	  });
  
  
  table.on('toolbar(test)', function(obj){
	   var checkStatus = table.checkStatus(obj.config.id);
	   switch(obj.event){
	     case 'add':
	   	 	    	$("#addbiaodan")[0].reset();//清空表单
	   	 	    	form.val("feedit",data);
	   	 	    	$("#pname").attr(data.pname)
	   	 	      layer.open({
	   	 	    	  type:1,
	   	 	    	  title:"添加图片",
	   	 	    	  content:$("#adddiv"),
	   	 	    	  area:["600px","400px"],
	   	 	    	  maxmin:true
	   	 	      });
	   		break;
	   };
	 });
 
 
 form.on('submit(adddemomen)', function(data){
	 	  $.post("../proimg/insertimg",data.field,function(res){
	 		  if(res.code=="0"){
	 			  layer.msg(res.msg,{icon:1,time:2000},function(){
	 				  table.reload('productimg');
	 				  layer.closeAll();
	 			  });
	 		  }else{
	 			  layer.msg(res.msg);
	 		  }
	 	  },"json");
	 	  return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
	 	});
  
 table.on('tool(test)', function(obj){ // 注：test 是 table 原始标签的属性 lay-filter="对应的值"
	  var data = obj.data; //获得当前行数据
	  var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
	  var tr = obj.tr; //获得当前行 tr 的 DOM 对象（如果有的话）
	 
	   if(layEvent === 'del'){ //删除
	    layer.confirm('确定删除吗？', function(index){
	    	 $.post("../proimg/deleteimg",{"imgid":data.imgid},function(res){
				  if(res.code=="0"){
					  layer.msg(res.msg,{icon:1,time:2000},function(){
						  table.reload('productimg');
						  layer.closeAll();
					  });
				  }else{
					  layer.msg(res.msg);
				  }
			  },"json");
	  
	    });
	  } else if(layEvent === 'edit'){ //编辑
		form.val('fmupdate', data);//赋值
	  	$("#phose1").attr("src","../images/"+data.imgurl);//单独赋值图片
		  layer.open({
	    	  type:1,
	    	  title:"修改图片",
	    	  content:$("#updiv"),
	    	  area:["600px","400px"],
	    	  maxmin:true
	      });
		  
		  form.on('submit(updemomen)', function(data){
			  $.post("../proimg/updateimg",data.field,function(res){
				  if(res.code=="0"){
					  layer.msg(res.msg,{icon:1,time:2000},function(){
						  table.reload('productimg');
						  layer.closeAll();
					  });
				  }else{
					  layer.msg(res.msg);
				  }
			  },"json");
			  return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
			});
		  
		  var uploadInst = upload.render({
			    elem: '#img1' //绑定元素
			    ,url: '../upload' //上传接口
			    ,done: function(res){
			     if(res.code=="0"){
			    	 //把返回的图片名，放到img标记的src里面
			    	 $("#phose1").attr("src","../images/"+res.msg);
			    	 //把返回的图片名，保存在隐藏域里面
			    	 $("#imgurl1").val(res.msg);
			    	 layer.msg('新图片上传成功',{
			    		 icon:6,
			    		 time:1500
			    	 });
			     }
			    }
			    ,error: function(){
			      //请求异常回调
			    }
			  }); 
	  }
	});
  
});
</script>
</html>