<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="utf-8" />
		<title>所有商品</title>
		<link rel="stylesheet" type="text/css" href="../qian/css/public.css"/>
		<link rel="stylesheet" type="text/css" href="../qian/css/proList.css"/>
<style>
        .pagination-container {
            text-align: center;
            margin-top: 20px; /* Adjust as needed */
        }

        .pagination {
            display: inline-block;
            padding: 0;
            list-style: none;
        }

        .pagination li {
            display: inline;
            margin-right: 5px;
        }

        .pagination a {
            text-decoration: none;
            padding: 5px 10px;
            border: 1px solid #ccc;
            background-color: #f8f8f8;
            color: #333;
        }

        .pagination a:hover {
            background-color: #e0e0e0;
        }

        .pagination .active {
            background-color: #4caf50;
            color: white;
        }
    </style>
		
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
					<form action="../PaintController/getpaint" method="get" class="fl">
						<input type="text" name="pname" placeholder="搜索" /> <input
							type="submit" value="" />
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
	
		<!-----------------banner------------------------------->
		<div class="banner">
			<a href="#"><img src="../images/l1.png" width="1080px" height="800px"/></a>
		</div>	
		<!-----------------address------------------------------->
		<div class="address">
			<div class="wrapper clearfix">
				<a href="../IndexController/getindex">首页</a>
			</div>
		</div>
		<!-----------------paintCon------------------------------->
		
		<div class="paintCon">
			<section class="wrapper">
				<h3><img src="../images/b4.jpg"></h3>
				<img src="../qian/img/temp/paint01.jpg" />
				<div class="paintList">
				<c:forEach items="${proquan }" var="proquan">
					<a href="../ProDetailController/getDetail?pid=${proquan.pid}&cateid=${proquan.cateid}">
						<dl>
							<dt><img src="../images/${proquan.pimg }"></dt>
							<dd>${proquan.pname} </dd>
						</dl>
					</a>
					</c:forEach>
				</div>
			</section>
			  <!-- 分页控件 -->
        <div class="pagination-container">
        <ul id="pagination" class="pagination"></ul>
    </div>
        <!-- 引入jQuery和Bootstrap的JavaScript文件 -->
    <script src="../js/jquery-3.6.2.js"></script>
    <script src="../js/bootstrap.bundle.min.js"></script>
<script type="text/javascript">
console.log("JavaScript 正在执行！");
    // Assume each page displays 10 items
    var itemsPerPage = 6;

    // Get the total number of items from the server-side
    var totalItems = ${proquan.size()};

    // Convert Java list to JavaScript array
    var proquanArray = [];

    <c:forEach items="${proquan}" var="item">
        proquanArray.push({
            pid: '${item.pid}',
            cateid: '${item.cateid}',
            pimg: '${item.pimg}',
            pname: '${item.pname}'
        });
    </c:forEach>

    // Calculate the total number of pages
    var totalPages = Math.ceil(totalItems / itemsPerPage);

    // Current page
    var currentPage = 1;

    // Function to show items for the given page
    function showPage(page) {
        var startIndex = (page - 1) * itemsPerPage;
        var endIndex = startIndex + itemsPerPage;

        var pageItems = proquanArray.slice(startIndex, endIndex);

        // Clear the existing content
        $(".paintList").empty();

        // Display items for the current page
        $.each(pageItems, function (index, item) {
            var itemHtml = '<a href="../ProDetailController/getDetail?pid=' + item.pid + '&cateid=' + item.cateid + '">' +
                '<dl>' +
                '<dt><img src="../images/' + item.pimg + '"></dt>' +
                '<dd>' + item.pname + '</dd>' +
                '</dl>' +
                '</a>';
            $(".paintList").append(itemHtml);
        });
    }

    // Function to generate pagination links
    function generatePagination() {
        var paginationHtml = '';

        for (var i = 1; i <= totalPages; i++) {
            paginationHtml += '<li><a href="#" onclick="changePage(' + i + ')">' + i + '</a></li>';
        }

        $("#pagination").html(paginationHtml);
    }

    // Function to change the current page
    function changePage(page) {
        currentPage = page;
        showPage(currentPage);
    }

    // Initialize the page
    showPage(currentPage);
    generatePagination();
</script>
    </div>
		</div>
		<!--返回顶部-->
		<div class="gotop">
			<a href="../CartController/Gowu">
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
		<div class="msk"></div>
		      <div class="setPageDiv">
        </div>
        
		<!--footer-->
		
		<jsp:include page="tail.jsp"></jsp:include>
		<!--<script src="js/pro.js" type="text/javascript" charset="utf-8"></script>-->
		<script src="../qian/js/jquery-1.12.4.min.js" type="text/javascript"charset="utf-8"></script>
	<script src="../qian/js/public.js" type="text/javascript"
		charset="utf-8"></script>
	<script src="../qian/js/nav.js" type="text/javascript" charset="utf-8"></script>
	<script src="../qian/js/jquery.flexslider-min.js"
		type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript">
		$(function() {
			$('#home_slider').flexslider({
				animation : 'slide',
				controlNav : true,
				directionNav : true,
				animationLoop : true,
				slideshow : true,
				slideshowSpeed : 2000,
				useCSS : false
			});

		});
	</script>

	<style>
.copyrights {
	text-indent: -9999px;
	height: 0;
	line-height: 0;
	font-size: 0;
	overflow: hidden;
}
</style>
<div class="copyrights">
	Collect from <a href="http://www.cssmoban.com/"  title="网站模板">金豆之家</a>
	<a href="https://www.chazidian.com/"  title="查字典">查字典</a>
</div>
		
	</body>
	<script type="text/javascript">
	
	
	</script>
</html>

