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
<form class="layui-form" onsubmit="return false;">
	<div class="layui-form-item" style="margin:10px">
  <div class="layui-inline">
    <label class="layui-form-label">商品类型名</label>
    <div class="layui-input-inline" style="width: 100px;">
      <input type="text" name="catename" autocomplete="off" class="layui-input">
    </div>
  </div>
      <button class="layui-btn" lay-submit lay-filter="formDemo">搜索</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
</div>
</form>
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
<form class="layui-form" action="" id="addbiaodan">
  <div class="layui-form-item">
    <label class="layui-form-label">类型名字</label>
    <div class="layui-input-inline">
      <input type="text" name="catename" required lay-verify="required" autocomplete="off" placeholder="请输入商品类型" class="layui-input">
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
    <label class="layui-form-label">类型名字</label>
    <div class="layui-input-inline">
    <input type="hidden" name="cateid">
      <input type="text" name="catename" required lay-verify="required" autocomplete="off" placeholder="请输入商品类型" class="layui-input">
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
  

  $.post("../category/onefindall",function(res){
	  $("#parentid").empty();
	  $("#parentid").append(new Option("请选择","0"));
	  $.each(res,function(index,elem){
		  $("#parentid").append(new Option(elem.catename,elem.cateid))
	  });
  form.render();
},"json");
  
  
  //第一个实例
  table.render({
    elem: '#demo'
    ,toolbar: '#toolbarDemo'
    ,height: 630
    ,url: '../category/findall' //数据接口
    ,page: true //开启分页
    ,method:'post'
    ,cols: [[ //表头
    	{checkbox:true}
     ,{field: 'cateid', title: 'ID', width:80}
      ,{field: 'catename', title: '姓名', width:80}
      ,{title:"操作",templet: '#toolEventDemo', width: 200}
    ]]
  ,id:'productType'
  });
  
  form.on('submit(formDemo)', function(data){
	  table.reload('productType', {
		  where:data.field  
		});
	  return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
	});
  
  
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
  
  form.on('submit(adddemomen)', function(data){
	 	  $.post("../category/inserttype",data.field,function(res){
	 		  if(res.code=="0"){
	 			  layer.msg(res.msg,{icon:1,time:2000},function(){
	 				  table.reload('productType');
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
	    	 $.post("../category/deletetype",{"cateid":data.cateid},function(res){
				  if(res.code=="0"){
					  layer.msg(res.msg,{icon:1,time:2000},function(){
						  table.reload('productType');
						  layer.closeAll();
					  });
				  }else{
					  layer.msg(res.msg);
				  }
			  },"json");
	  
	    });
	  } else if(layEvent === 'edit'){ //编辑
		form.val('fmupdate', data);//赋值
	  	 $.post("../category/onefindall",function(res){
			  $("#parentid1").empty();
			  $("#parentid1").append(new Option("请选择","0"));
			  $.each(res,function(index,elem){
			  $("#parentid1").append(new Option(elem.catename,elem.cateid));
				  if(data.parentid==elem.cateid){
						$("#parentid1").children("option").eq(index+1).attr("selected",true); 
					 };
			  });
		  form.render();
	  },"json");
		  layer.open({
	    	  type:1,
	    	  title:"修改类型",
	    	  content:$("#updiv"),
	    	  area:["600px","400px"],
	    	  maxmin:true
	      });
		  
		  form.on('submit(updemomen)', function(data){
			  $.post("../category/updatetype",data.field,function(res){
				  if(res.code=="0"){
					  layer.msg(res.msg,{icon:1,time:2000},function(){
						  table.reload('productType');
						  layer.closeAll();
					  });
				  }else{
					  layer.msg(res.msg);
				  }
			  },"json");
			  return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
			});
	  }
	});
  
  
  
});
</script>
</html>