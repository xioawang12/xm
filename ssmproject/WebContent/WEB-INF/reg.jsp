<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>注册</title>
		<link rel="stylesheet" type="text/css" href="../qian/css/public.css"/>
		<link rel="stylesheet" type="text/css" href="../qian/css/login.css"/>
		<script type="text/javascript" src="../js/jquery-3.6.2.js"></script>
		<style type="text/css">
		.yx{
	    outline: 0;
	    cursor:pointer;
	      position: relative;
}
    .an{
    position: absolute;
    /* 具体位置视情况而定 */
    top: 10px;
    right:120px;
     background-color:transparent;
            border-style:none;
    
}
     #span_password,#span_username{
            color: red;
        }
		</style>
	</head>
	<body>
		<!-------------------reg-------------------------->
		
		<div class="reg">
			<form action="../denglu/adduser" method="get" onsubmit="return aa()">
				<h1><img src="../images/logo.png" width="123px" height="42px" ></h1>
				<p>用户注册</p>
				<p><input type="text"  name="uname" id="uname" value="" placeholder="请输入用户名" onblur="puname()"/>
				<br/><span id="unames" style="height: 10px">.</span></p>
				<p><input type="password"   name="upwd" id="upwd" value="" placeholder="请输入密码" onblur="pupwd()" ></p>
				<span id="upwdd" class="s">.</span>
				<p><input type="password"   name="upwd2" id="upwd2" value="" placeholder="请确认密码" onblur="pupwd2()" ></p>
				<span id="pwdError" >.</span>
				<p><input type="text"   name="uphone" value="" id="uphone" onblur="phone()" placeholder="请输入手机号"></p>
				<span id="phones" class="s">.</span>
				<p class="yx"> <input type="text" name="uemail" id="uemail" onblur="email()" placeholder="输入邮箱" /><button id="btnGetVcode" class="an" style="cursor:pointer">获取验证码</button></p>
				<span id="emailError" class="s">.<span id="emailses" ></span></span> 
				<p class="txtL txt"><input class="code" type="text"  name="" value="" placeholder="请输入邮箱验证码"></p>
				<p><input type="submit" id="tt" value="注册"></p>
				<p class="txt"><a href="../denglu/login"><span></span>已有账号登录</a></p>
				<!--<a href="#" class="off"><img src="img/temp/off.png"></a>-->
			</form>
		</div>
		
		<script type="text/javascript">
		


		function puname() {
	    	var uname=document.getElementById('uname').value;
	    	 $.post("../denglu/getuname",{"uname":uname},function(res){
	    		if(res.code=="0"){
	    			document.getElementById("unames").innerText=""+res.msg;
	    		var color=document.getElementById("unames");
	    		color.style.color='red';
	    		document.getElementById("tt").disabled=true;
	    		var tt=document.getElementById("tt");
	    		tt.style.background='#ccc';
	    		}else if(uname==''){
	    			document.getElementById("unames").innerHTML = "您用户名没有填";
	            	var color=document.getElementById("unames");
		    		color.style.color='red';
		    		document.getElementById("tt").disabled=true;
		    		var tt=document.getElementById("tt");
		    		tt.style.background='#ccc';
	    		}else{
	    				document.getElementById("unames").innerText=""+res.msg;
		    			var color=document.getElementById("unames");
			    		color.style.color='green';
			    		document.getElementById("tt").disabled=false;
			    		var tt=document.getElementById("tt");
			    		tt.style.background='#cd0000';
	    			}
	    	},"json");
			} 
		
		function pupwd() {
	    	var upwd=document.getElementById('upwd').value;
            var re =/^(?=.*[a-z])(?=.*\d)[^]{5,16}$/;
            var result =  re.test(upwd);
            if(!result) {
                document.getElementById("upwdd").innerHTML = "密码必须包含数字,字母,且不少于5位";
                var color=document.getElementById("upwdd");
	    		color.style.color='red';
	    		return false;
            }else{
            	document.getElementById("upwdd").innerHTML = "密码可以使用";
                var color=document.getElementById("upwdd");
	    		color.style.color='green';
	    		return true;
            }

			} 
		
		function phone() {
	    	var uphone=document.getElementById('uphone').value;
            var re = /^(?:\+?86)?1\d{10}$/  
            var result =  re.test(uphone);
            if(!result) {
                document.getElementById("phones").innerHTML = "手机号码填写错误";
                var color=document.getElementById("phones");
	    		color.style.color='red';
	    		return false;
            }else{
            	document.getElementById("phones").innerHTML = "手机号码可以使用";
                var color=document.getElementById("phones");
	    		color.style.color='green';
	    		return true;
            }

			} 
		
		function email() {
	    	var uemail=document.getElementById('uemail').value;
            var re = /^[A-Za-z\d]+([-_.][A-Za-z\d]+)*@([A-Za-z\d]+[-.])+[A-Za-z\d]{2,4}$/ 
            var result =  re.test(uemail);
            if(!result) {
                document.getElementById("emailses").innerHTML = "邮箱号码填写错误";
                var color=document.getElementById("emailses");
	    		color.style.color='red';
	    		return false;
            }else{
            	document.getElementById("emailses").innerHTML = "邮箱号码可以使用";
                var color=document.getElementById("emailses");
	    		color.style.color='green';
	    		return true;
            }

			} 
		
		function pupwd2() {
			var upwd=document.getElementById('upwd').value;
	    	var upwd2=document.getElementById('upwd2').value;
	    	 if(upwd==upwd2){
	    		 if(pupwd()){
	    			 document.getElementById("pwdError").innerHTML = "密码可以使用";
		    		  var color=document.getElementById("pwdError");
			    		color.style.color='green';
			    		return true;
	    		 }else{
	    			 document.getElementById("pwdError").innerHTML = "你的密码填写错误";
		    		 var color=document.getElementById("pwdError");
			    		color.style.color='red';
			    		return false;
	    		 }
	    		
		    		
	    	 }else if(upwd()==''&&upwd2()==''){
	    		 document.getElementById("pwdError").innerHTML = "您密码没有填";
	    		 var color=document.getElementById("pwdError");
		    		color.style.color='red';
		    		return false;
	    	 }else{
	    		 document.getElementById("pwdError").innerHTML = "与密码不一致";
	    		  var color=document.getElementById("pwdError");
		    		color.style.color='red';
		    		return false;
	    	 }
			} 

function aa() {
	if(pupwd()&&pupwd2()&&phone()&&email()){

		return true;
	}else{

		alert("您的页面填写错误")
		return false;
	}
}
	

		</script>
    <script type="text/javascript">
    var time0 = 60;
    var time = time0;  
    var t;  // 用于验证按钮的60s计时

    /* $(document).ready(function() { */

    	// 获取验证码按钮
    	$("#btnGetVcode").click(function() {
    		var btnGet = document.getElementById("btnGetVcode");
    		btnGet.disabled = true;  // 为了防止多次点击
    		$.ajax({
    			url: '../EmailServlet?method=getVCode',
    			type: 'post',
    			data: {uemail: $("input[name='uemail']").val()},
    			dataType: 'text',
    			success: function(msg) {
    				if(msg == -1){
    					window.alert("请输入正确的邮箱！");
    					btnGet.disabled = false;
    				}
    				else{
    					useChangeBTN();  // 控制下一次重新获取验证码
    				}
    			},
    			error:function(msg){
    			}
    		});
    	});
    	
    	// 验证按钮
    	$("#btnVerify").click(function() {
    		var message = document.getElementById("message");  // 显示提示信息
    		$.ajax({
    			url: '../EmailServlet?method=verify',
    			type: 'post',
    			data: {vcode: $("input[name='vcode']").val()},
    			dataType: 'text',
    			success: function(msg) {
    				if(msg == 1){
    					message.innerHTML = "验证码正确！";
    					$("#message").css("color","green");
    				}
    				else{
    					message.innerHTML = "验证码错误！";
    					$("#message").css("color","red");
    				}
    			},
    			error:function(msg){
    			}
    		});
    	});

    //修改按钮，控制验证码重新获取
    function changeBTN(){
    	if(time > 0){
    		$("#btnGetVcode").text("("+time+"s)"+"重新获取");
    		time = time - 1;
    	}
    	else{
    		var btnGet = document.getElementById("btnGetVcode");
    		btnGet.disabled = false;
    		$("#btnGetVcode").text("获取验证码");
    		clearInterval(t);
    		time = time0;
    	}
    }
     function useChangeBTN(){
    	$("#btnGetVcode").text("("+time+"s)"+"重新获取");
    	time = time - 1;
    	t = setInterval("changeBTN()", 1000);  // 1s调用一次
    }
   /*  var username=/^[A-Za-z0-9]{6,12}$/;
    //输入用户名为大写字母A-Z或者小写字母a-z或者0-9 并且位数在6-12就匹配

    var ele=document.getElementById('uname');
    var span = document.querySelector('#unamee');
    // ele.blur(function(){
    //     var str = ele.value;
    //     console.log(666);  //blur方法无效？  
    // })
    ele.onblur=function(){
        if(username.test(ele.value)){
            span.className="right";
            span.innerHTML="<span style=\"color:green;\">√</span>";
        }else{
            span.className="wrong";
            span.innerHTML="<span style=\"color:red;\">x</span>";
        } */
   /*  } */
    
    
    
   
    </script> 
 
	</body>
</html>
