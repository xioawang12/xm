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
<style>
.layui-table-cell {
	height: auto;
}
</style>
</head>
<body>
<form class="layui-form" onsubmit="return false;">
	<div class="layui-form-item" style="margin:10px">
  <div class="layui-inline">
    <label class="layui-form-label">商品名</label>
    <div class="layui-input-inline" style="width: 100px;">
      <input type="text" name="pname" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-inline">
    <label class="layui-form-label">商品类型</label>
    <div class="layui-input-block" >
      <select name="cateid" id="cateid"  placeholder="" autocomplete="off" class="layui-input">

      </select>
    </div>
  </div>
  <div class="layui-inline">
    <label class="layui-form-label">上下架</label>
    <div class="layui-input-block" >
      <select name="pstate" id="pstate"  placeholder="" autocomplete="off" class="layui-input">
      	<option value="">请选择</option>
		<option value="0">上架</option>
		<option value="1">下架</option>
      </select>
    </div>
  </div>
      <button class="layui-btn" lay-submit lay-filter="formDemo">搜索</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
</div>
</form>
<script type="text/html" id="toolbarDemo">
  <div class="layui-btn-container">
    <button class="layui-btn layui-btn-normal layui-btn-sm" lay-event="add">添加</button>
 	<button class="layui-btn layui-btn-normal layui-btn-sm" lay-event="pishang">批量上架</button>
	<button class="layui-btn layui-btn-normal layui-btn-sm" lay-event="pixia">批量下架</button>
  </div>
</script>
<table id="demo" lay-filter="test"></table>
<script type="text/html" id="toolEventDemo">
	<a class="layui-btn layui-btn-warm layui-btn-xs" lay-event="img">查看</a>
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
<div class="a">
	<a class="layui-btn layui-btn-normal layui-btn-xs" lay-event="tuijian">推荐</a>
	<a class="layui-btn layui-btn-warm layui-btn-xs" lay-event="guige">规格</a>
	{{#  if(d.pstate == 0){ }}
 		<a class="layui-btn layui-btn-danger layui-btn-xs layui-btn-warm" lay-event="xia">下架</a>
	{{#  } }}
	{{#  if(d.pstate == 1){ }}
		<a class="layui-btn layui-btn-xs layui-btn-warm" lay-event="shang">上架</a>
	{{#  } }}
</div>
</script>
<!-- 添加表 -->
<div style="display: none;" id="adddiv">
<form class="layui-form" action="" id="addbiaodan">
  <div class="layui-form-item">
    <label class="layui-form-label">商品名</label>
    <div class="layui-input-inline">
      <input type="text" name="pname" lay-verify="required" autocomplete="off" placeholder="请输入商品" class="layui-input">
    </div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">商品类型</label>
    <div class="layui-input-inline">
      <select name="cateid" id="cateid1">

      </select>
    </div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">图片</label>
    <div class="layui-input-block">
    <button type="button" class="layui-btn" id="img">
     <i class="layui-icon">&#xe67c;</i>上传图片
 	</button><br>
 	<img id="phose" style="width:120px" src=""/><br/>
      <input type="hidden" name="pimg" id="pimg" autocomplete="off" placeholder="请上传图片" class="layui-input">
    </div>
  </div>
<div class="layui-form-item layui-form-text">
    <label class="layui-form-label">商品简介</label>
    <div class="layui-input-inline">
      <textarea name="pintro" placeholder="请输入内容" class="layui-textarea"></textarea>
    </div>
  </div>
<div class="layui-form-item layui-form-text">
    <label class="layui-form-label">商品详情</label>
    <div class="layui-input-inline">
      <textarea name="pdetail" placeholder="请输入内容" class="layui-textarea"></textarea>
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">是否推荐</label>
    <div class="layui-input-block">
      <input type="radio" name="pischoice" value="0" title="推荐" checked>
      <input type="radio" name="pischoice" value="1" title="不推荐">
    </div>
  </div>
    <div class="layui-form-item">
    <label class="layui-form-label">是否上架	</label>
    <div class="layui-input-block">
      <input type="radio" name="pstate" value="0" title="上架" checked>
      <input type="radio" name="pstate" value="1" title="不上架">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">材料</label>
    <div class="layui-input-inline">
      <input type="text" name="pmaterial" lay-verify="" autocomplete="off" placeholder="请输入商品材料" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">款式</label>
    <div class="layui-input-inline">
      <input type="text" name="pstyle" lay-verify="" autocomplete="off" placeholder="请输入商品款式" class="layui-input">
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
    <label class="layui-form-label">商品名</label>
    <div class="layui-input-inline">
    <input type="hidden" name="pid">
      <input type="text" name="pname" lay-verify="required" autocomplete="off" placeholder="请输入商品" class="layui-input">
    </div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">商品类型</label>
    <div class="layui-input-inline">
      <select name="cateid" id="cateid2">

      </select>
    </div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">图片</label>
    <div class="layui-input-block">
    <button type="button" class="layui-btn" id="img1">
     <i class="layui-icon">&#xe67c;</i>上传图片
 	</button><br>
 	<img id="phose1" style="width:120px" src=""/><br/>
      <input type="hidden" name="pimg" id="pimg1" autocomplete="off" placeholder="请上传图片" class="layui-input">
    </div>
  </div>
<div class="layui-form-item layui-form-text">
    <label class="layui-form-label">商品简介</label>
    <div class="layui-input-inline">
      <textarea name="pintro" placeholder="请输入内容" class="layui-textarea"></textarea>
    </div>
  </div>
<div class="layui-form-item layui-form-text">
    <label class="layui-form-label">商品详情</label>
    <div class="layui-input-inline">
      <textarea name="pdetail" placeholder="请输入内容" class="layui-textarea"></textarea>
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">是否推荐</label>
    <div class="layui-input-block">
      <input type="radio" name="pischoice" value="0" title="推荐" checked>
      <input type="radio" name="pischoice" value="1" title="不推荐">
    </div>
  </div>
    <div class="layui-form-item">
    <label class="layui-form-label">是否上架	</label>
    <div class="layui-input-block">
      <input type="radio" name="pstate" value="0" title="上架" checked>
      <input type="radio" name="pstate" value="1" title="不上架">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">材料</label>
    <div class="layui-input-inline">
      <input type="text" name="pmaterial" lay-verify="" autocomplete="off" placeholder="请输入商品材料" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">款式</label>
    <div class="layui-input-inline">
      <input type="text" name="pstyle" lay-verify="" autocomplete="off" placeholder="请输入商品款式" class="layui-input">
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
<!-- 添加div 开始-->
<div style="display:none" id="addRecommentdiv">
<form class="layui-form" lay-filter="fmpid"  action="" id="addform">
      <div class="layui-inline">
    <label class="layui-form-label">推荐类型</label>
    <div class="layui-input-block" >
    <input type="hidden" name="pid">
      <select name="locid" id="locid"  placeholder="" autocomplete="off" class="layui-input">

      </select>
    </div>
  </div>
          <div class="layui-form-item">
        <label class="layui-form-label">权重值</label>
    <div class="layui-input-inline">
      <input type="text" name="rweight" required lay-verify="required" placeholder="请输入权重值" autocomplete="off" class="layui-input">
    </div>
      </div>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="btnAdd">推荐</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>
</div>
<!-- 添加div 结束-->
</body>
<script type="text/html" id="pischoice">
  {{# if(d.pischoice == 0){ }}
    推荐
  {{#  } else { }}
    不推荐
  {{#  } }}
</script>
<script type="text/html" id="sxj">
  {{# if(d.pstate == 0){ }}
    上架
  {{#  } else { }}
    下架
  {{#  } }}
</script>
<script>
layui.use(['table','form','layer','upload','tree'], function(){
  var table = layui.table,
  form=layui.form,
  layer=layui.layer,
  tree = layui.tree,
  upload = layui.upload;
  
  //第一个实例
  table.render({
    elem: '#demo'
    ,toolbar: '#toolbarDemo'
    ,height: 630
    ,url: '../product/findall' //数据接口
    ,page: true //开启分页
    ,method:'post'
    ,cols: [[ //表头
    	{checkbox:true}
     ,{field: 'pid', title: '商品id', width:80}
     ,{field: 'pname', title: '商品名称', width:80}
     ,{templet: "<div>{{d.category.catename}}</div>", title: '商品类型', width: 177}
     ,{templet: "<div><img src='../images/{{d.pimg}}'/></div>", title: '图片', width:80}
     ,{field: 'pintro', title: '商品简介', width:150}
     ,{field: 'pdetail', title: '商品详情', width:150}
     ,{templet: '#pischoice', title: '是否推荐', width: 177}
     ,{templet: '#sxj', title: '是否上下架', width: 177}
     ,{field: 'pmaterial', title: '材料', width:150}
     ,{field: 'pstyle', title: '款式', width:150}
     ,{title:"操作",templet: '#toolEventDemo', width: 200 ,}
    ]]
  ,id:'productType'
  });
  
  form.on('submit(formDemo)', function(data){
	  table.reload('productType', {
		  where:data.field  
		});
	  return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
	});
  
  $.post("../category/gettype",function(res){
	  $("#cateid").empty();
	  $("#cateid1").empty();
	  $("#cateid").append(new Option("请选择",""));
	  $("#cateid1").append(new Option("请选择",""));
	  $.each(res,function(index,elem){
		  $("#cateid").append(new Option(elem.catename,elem.cateid))
		  $("#cateid1").append(new Option(elem.catename,elem.cateid))
	  });
  form.render();
},"json");
  
  
  var uploadInst = upload.render({
	    elem: '#img' //绑定元素
	    ,url: '../upload' //上传接口
	    ,done: function(res){
	     if(res.code=="0"){
	    	 //把返回的图片名，放到img标记的src里面
	    	 $("#phose").attr("src","../images/"+res.msg);
	    	 //把返回的图片名，保存在隐藏域里面
	    	 $("#pimg").val(res.msg);
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
	   	 	      layer.open({
	   	 	    	  type:1,
	   	 	    	  title:"添加商品",
	   	 	    	  content:$("#adddiv"),
	   	 	    	  area:["500px","600px"],
	   	 	    	  maxmin:true
	   	 	      });
	   		break;
	     case 'pishang':
	    	 var data = table.checkStatus('productType').data;
		 	 var idArr=[];
		 	  if(data!=null&&data.length>0){
		 		  for(var i=0;i<data.length;i++){
		 			 idArr.push(data[i].pid); 
		 		  }
		 		  var ids=idArr.join(",");
		 		 layer.confirm("确定上架"+ids+"吗", function(index){
		 			 $.post("../product/pishang",{"ids":ids},function(res){
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
		 	  }else{
		 		  layer.msg("请先选择要上架的商品");
		 	  };
		break;
	     case 'pixia':
	    	 var data = table.checkStatus('productType').data;
		 	 var idArr=[];
		 	  if(data!=null&&data.length>0){
		 		  for(var i=0;i<data.length;i++){
		 			 idArr.push(data[i].pid); 
		 		  }
		 		  var ids=idArr.join(",");
		 		 layer.confirm("确定下架"+ids+"吗", function(index){
		 			 $.post("../product/pixia",{"ids":ids},function(res){
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
		 	  }else{
		 		  layer.msg("请先选择要下架的商品");
		 	  };
		break;
	   };
	 });
  
  
  form.on('submit(adddemomen)', function(data){
	 	  $.post("../product/insertpro",data.field,function(res){
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
	  sessionStorage.setItem("product",JSON.stringify(data));
	  console.log(data);
	  var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
	  var tr = obj.tr; //获得当前行 tr 的 DOM 对象（如果有的话）
	 
	   if(layEvent === 'del'){ //删除
	    layer.confirm('确定删除吗？', function(index){
	    	 $.post("../product/deletepro",{"pid":data.pid},function(res){
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
	  	$("#phose1").attr("src","../images/"+data.pimg);//单独赋值图片
	  	 $.post("../category/gettype",function(res){
			  $("#cateid2").empty();
			  $("#cateid2").append(new Option("请选择",""));
			  $.each(res,function(index,elem){
			  $("#cateid2").append(new Option(elem.catename,elem.cateid));
				  if(data.cateid==elem.cateid){
						$("#cateid2").children("option").eq(index+1).attr("selected",true); 
					 };
			  });
		  form.render();
	  },"json");
		  layer.open({
	    	  type:1,
	    	  title:"修改商品",
	    	  content:$("#updiv"),
	    	  area:["500px","600px"],
	    	  maxmin:true
	      });
		  
		  form.on('submit(updemomen)', function(data){
			  $.post("../product/updatepro",data.field,function(res){
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
		  
		  var uploadInst = upload.render({
			    elem: '#img1' //绑定元素
			    ,url: '../upload' //上传接口
			    ,done: function(res){
			     if(res.code=="0"){
			    	 //把返回的图片名，放到img标记的src里面
			    	 $("#phose1").attr("src","../images/"+res.msg);
			    	 //把返回的图片名，保存在隐藏域里面
			    	 $("#pimg1").val(res.msg);
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
	  }else if(layEvent === 'img'){
	    	 layer.open({
		    	  type:2,
		    	  title:"查看图片",
		    	  content:"proimg.jsp",
		    	  area:["700px","500px"],
		    	  maxmin:true
		   }); 
	    }else if(layEvent === 'shang'){
	    	 $.post("../product/shangjia",{"pid":data.pid},function(res){
		 		  if(res.code=="0"){
		 			  layer.msg(res.msg,{icon:1,time:2000},function(){
		 				  table.reload('productType');
		 				  layer.closeAll();
		 			  });
		 		  }else{
		 			  layer.msg(res.msg);
		 		  }
		 	  },"json");
	    }else if(layEvent === 'xia'){
	    	 $.post("../product/xiajia",{"pid":data.pid},function(res){
		 		  if(res.code=="0"){
		 			  layer.msg(res.msg,{icon:1,time:2000},function(){
		 				  table.reload('productType');
		 				  layer.closeAll();
		 			  });
		 		  }else{
		 			  layer.msg(res.msg);
		 		  }
		 	  },"json");
	    }else if(layEvent === 'guige'){
	    	 layer.open({
		    	  type:2,
		    	  title:"查看规格",
		    	  content:"specification.html",
		    	  area:["1000px","600px"],
		    	  maxmin:true
		   }); 
	    }else if(layEvent === 'tuijian'){
	    	$("#addform")[0].reset();
	    	form.val('fmpid', data);//赋值
			  layer.open({
				  type:1,
				  title:"添加推荐",
				  content:$("#addRecommentdiv"),
				  area:["500px","400px"],
				  maxmin:true
			  });
		   };
	});
  
  $.post("../RecommentlocationController/getrec",function(res){
	  $("#locid").empty();
	  $("#locid").append(new Option("请选择",""));
	  $.each(res,function(index,elem){
		  $("#locid").append(new Option(elem.location,elem.locid))
	  });
  form.render();
},"json");
  
  form.on('submit(btnAdd)', function(data){
	     $.post("../recomment/insertRecomment",data.field,function(res){
		  if(res.code==0){
			  layer.msg(res.msg,{time:2000},function(){
				  layer.closeAll();//关闭表格
				  table.reload('productType');//重载表格
			  });
			  
		  }else{
			  layer.alert(res.msg);
		  }
	  },"json");
	  return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
	});
  
  
});
</script>
</html>