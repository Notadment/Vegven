<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
	<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossOrigin="anonymous"></script>
	<link href="/vegven/css/templates.css" rel="stylesheet">
	<link href="/vegven/css/main.css" rel="stylesheet">
</head>
<body>
	<div class="m-1 d-flex" id="header">
		
		<form class='mr-auto' action="/vegven/">
			
			<div id="logo"><img src="/vegven/img/Vegven.png" style="width:200px;height:100%;"></div>
		</form>
		<form action="">
			<div class="btn" id='login'><span>login</span><i class="bi bi-person-circle mb-2 ml-1"></i></div>
		</form>
		<form action="">
			<div class="btn" id='cart'><span>購物車</span><i  class="bi bi-cart4 mb-2 ml-1"></i></div>		
		</form>
		<form action="">
			<div class="btn" id ='history'><span>購買紀錄</span><i  class="bi bi-clipboard-check mb-2 ml-1"></i></div>
		</form>
	</div>
	<div id='body'>
		<img id='horpic' src="/vegven/img/horizonPic.png">
		<div id='goods' class='mt-4'>商品列表
			<c:forEach var="product" items="${products}">
				<div class="container">
					<div class="name_font">${product.product}</div>
					<div><img class="img_font" alt="" src=""></div>
					<div class="d-flex">
						<div class="amount_font">數量：${product.amount}</div>
						<div class="price_font">${product.price}</div>
					</div>
				</div>
			</c:forEach>		
		</div>
	</div>
	<!--  <script src="/js/templates.js"></script>-->
</body>
</html>