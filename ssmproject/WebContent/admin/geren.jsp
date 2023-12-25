<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<form class="layui-form"  lay-filter="fmedit" id="gaicomm">
<div class="layui-form-item">
    <label class="layui-form-label">头像</label>
    <div class="layui-input-block">
    <button type="button" class="layui-btn" id="test1">
  		<i class="layui-icon">&#xe67c;</i>上传图片
	</button>
		<img id="imgFace" style="width: 120px" src="../images/${user.uimg}"/><br />
		<input type="hidden" name="uimg" id="uimg" value="" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">账号</label>
    <div class="layui-input-block" style="width: 120px">
        <input type="hidden" name="uid" value="${user.uid}">
      <input type="text" name="uname" id="uname" value="${user.uname}"  readonly  lay-verify="required" autocomplete="off" placeholder="账号" class="layui-input">
    </div>
    </div>
  <div class="layui-form-item">
    <label class="layui-form-label">角色</label>
    <div class="layui-input-block" style="width: 120px">
		<c:choose>
		<c:when test="${user.urole==0}">
		<input type="hidden" name="urole" value="0" readonly lay-verify="required" autocomplete="off" placeholder="角色" class="layui-input">
		<input type="text" value="管理员" readonly lay-verify="required" autocomplete="off" placeholder="角色" class="layui-input">
		</c:when>
	</c:choose>
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">电话</label>
    <div class="layui-input-block" style="width: 120px">
      <input type="text" name="uphone"  value="${user.uphone}"  lay-verify="phone/number" autocomplete="off" placeholder="电话" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">邮箱</label>
    <div class="layui-input-block" style="width: 120px">
      <input type="text" name="uemail"  value="${user.uemail}"  lay-verify="email/number" autocomplete="off" placeholder="电话" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="gaidemomen">修改</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
 </form>
</body>
<script>
 layui.use(['table','form','layer','upload'], function(){
	  var table = layui.table,
	  form=layui.form,
	  $=layui.$,
	  layer=layui.layer,
	  upload=layui.upload; 
	  
	  
  
	//执行实例
	   var uploadInst = upload.render({
		    elem: '#test1' //绑定元素
		    ,url: '../upload' //上传接口
		    ,done: function(res){
		      //上传完毕回调
		    	if(res.code=="0"){
		    		//把返回的图片名，放到img标记的src里面
		    		$("#imgFace").attr("src","../images/"+res.msg);
		    		//把返回的图片名，保存在隐藏域里面
		    		$("#uimg").val(res.msg);
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
	     
 form.on('submit(gaidemomen)', function(data){
    $.post("../user/upuimg",data.field,function(res){
	  if(res.code=="0"){
		  layer.msg(res.msg,function(){
			  $(window.parent.document.getElementById("uimg")).attr("src","../images/"+$("#uimg").val());
			  layer.closeAll();
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