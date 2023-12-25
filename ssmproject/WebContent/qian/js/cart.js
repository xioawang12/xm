$(function(){
	/**************数量加减***************/
/*	$(".num .sub").click(function(){
		var num = parseInt($(this).siblings("span").text());
		if(num<=1){
			$(this).attr("disabled","disabled");
		}else{
			num--;
			$(this).siblings("span").text(num);
			//获取除了货币符号以外的数字
			var price = $(this).parents(".number").prev().text().substring(1);
			//单价和数量相乘并保留两位小数
			$(this).parents(".th").find(".sAll").text('￥'+(num*price).toFixed(2));
			zg();
		}
	});*/
	//计算总共几件商品
	/*function zg(){
		var zsl = 0;
		var index = $(".th input[type='checkbox']:checked").parents(".th").find(".num span");
		var len =index.length;
		if(len==0){
			$("#sl").text(0);
		}else{
			index.each(function(){
				zsl+=parseInt($(this).text());
				$("#sl").text(zsl);
			})
		}
		if($("#sl").text()>0){
			$(".count").css("background","#c10000");
		}else{
			$(".count").css("background","#8e8e8e");
		}
	}*/
	/*****************商品全选***********************/
	$("input[type='checkbox']").on('click',function(){
		var sf = $(this).is(":checked");
		var sc= $(this).hasClass("checkAll");
		if(sf){
			if(sc){
				 $("input[type='checkbox']").each(function(){  
	                this.checked=true;  
	           }); 
				zg();
			}else{
				$(this).checked=true; 
	            var len = $("input[type='checkbox']:checked").length;
	            var len1 = $("input").length-1;
				if(len==len1){
					 $("input[type='checkbox']").each(function(){  
		                this.checked=true;  
		            }); 
				}
				zg();
			}
		}else{
			if(sc){
				 $("input[type='checkbox']").each(function(){  
	                this.checked=false;  
	           }); 
				zg();
			}else{
				$(this).checked=false;
				var len = $(".th input[type='checkbox']:checked").length;
	            var len1 = $("input").length-1;
				if(len<len1){
					$('.checkAll').attr("checked",false);
				}
				zg();
			}
		}
		
	});
	/****************************proDetail 加入购物车*******************************/
	
	
/*	$(".num .sub").click(function(){
		var num = parseInt($(this).siblings("span").text());
			num--;
			$(this).siblings("span").text(num);
			
		
	});
	$(".num .add").click(function(){
		var num = parseInt($(this).siblings("span").text());
			num++;
			$(this).siblings("span").text(num);
	});*/
	
	//改变商品规格
//	$(".pro dd").hover(function(){
//		var html='';
//		html='<span class="edit">修改</span>';
//		$(this).addClass("on").append(html).parents(".th").siblings(".th").find(".pro dd").removeClass("on").find('.edit').remove();
//		$(".edit").each(function(i){
//			$(this).attr("id",'edit'+i);
//			$("#edit"+i).click(function(){
//				$(".proDets").show();
//				$(".mask").show();
//				$(".changeBtn .buy").attr("data-id",i);
//			})
//		})
//	},function(){
//		$(this).removeClass("on");
//	})
//	$(".changeBtn .buy").click(function(){
//		var index = $(this).attr("data-id");
//		var result = $(".smallImg .on").find("img").attr("alt");
//		$("#edit"+index).prev().text(result);
//		$(".proDets").hide();
//		$(".mask").hide();
//		$("#edit"+index).parent("dd").removeClass("on").find(".edit").remove();
//	});
//	$(".changeBtn .cart").click(function(){
//		$(".proDets").hide();
//		$(".mask").hide();
//	})
})
