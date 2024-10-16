<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>網站管理頁面</title>
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
		<div class="row">
			<div class="col-3">
			    <div class="nav flex-column nav-pills" id="v-pills-tab" role="tablist" aria-orientation="vertical">
			      <button class="nav-link active" id="v-pills-home-tab" data-toggle="pill" data-target="#v-pills-home" type="button" role="tab" aria-controls="v-pills-home" aria-selected="true">新增商品</button>
			      <button class="nav-link" id="v-pills-profile-tab" data-toggle="pill" data-target="#v-pills-profile" type="button" role="tab" aria-controls="v-pills-profile" aria-selected="false">會員後台</button>
			      <button class="nav-link" id="v-pills-messages-tab" data-toggle="pill" data-target="#v-pills-messages" type="button" role="tab" aria-controls="v-pills-messages" aria-selected="false">網站收益</button>
			      <button class="nav-link" id="v-pills-settings-tab" data-toggle="pill" data-target="#v-pills-settings" type="button" role="tab" aria-controls="v-pills-settings" aria-selected="false">Settings</button>
			    </div>
			  </div>
			  <div class="col-9">
			    <div class="tab-content" id="v-pills-tabContent">
			      <div class="tab-pane fade show active" id="v-pills-home" role="tabpanel" aria-labelledby="v-pills-home-tab">
			      	<h5>新增商品</h5>
			      	<form action="/vegven/postProduct">
			      		<div class="d-flex">
					      	<label for="product">商品名稱</label>
				      		<input name="product" placeholder="請輸入商品名稱">
			      		</div>
			      		<div class="d-flex">
							<label for="nums">圖片上傳</label>
							<input type="file" accept="img/jpeg, img/png" name="nums" placeholder="請輸入數量">
							<br>
							<img id="nums_Pic" src="#">
						</div>
						<div class="d-flex">
							<label for="nums">商品數量</label>
							<input name="nums" placeholder="請輸入數量">
						</div>
						<div class="d-flex">
							<label for="nums">商品規格</label>
							<input name="nums" placeholder="請描述規格">
						</div>
						<div class="d-flex">
							<label for="nums">商品描述</label>
							<input name="nums" placeholder="請輸入數量">
						</div>
						<div class="d-flex">
							<label for="outlook">預覽</label>
							<input name="outlook">							
							<button type="submit">上架商品</button>
						</div>
			      	</form>
			      </div>
			      <div class="tab-pane fade" id="v-pills-profile" role="tabpanel" aria-labelledby="v-pills-profile-tab">
			      	<form action="">
			      		<div>
					      	<label for="product">商品名稱</label>
				      		<input name="product" placeholder="請輸入商品名稱">
			      		</div>
			      		<div>
							<label for="nums">圖片上傳</label>
							<input name="nums" placeholder="請輸入數量">
						</div>
						<div>
							<label for="nums">商品數量</label>
							<input name="nums" placeholder="請輸入數量">
						</div>
						<div>
							<label for="nums">商品規格</label>
							<input name="nums" placeholder="請描述規格">
						</div>
						<div>
							<label for="nums">商品描述</label>
							<input name="nums" placeholder="請輸入數量">
						</div>
			      	</form>
			      </div>
			      <div class="tab-pane fade" id="v-pills-messages" role="tabpanel" aria-labelledby="v-pills-messages-tab">3</div>
			      <div class="tab-pane fade" id="v-pills-settings" role="tabpanel" aria-labelledby="v-pills-settings-tab">4</div>
			    </div>
	  		</div>
		</div>
	</body>
</html>