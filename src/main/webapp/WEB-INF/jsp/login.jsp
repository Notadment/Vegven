<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<link href="/css/login.css" rel="stylesheet">
	</head>
	<body>
		<div id="loginContainer">
			<div id="innerContainer">
				<form method="post">
						<!-- <div id="leftContainer">
						</div> -->
						<div id="rightContainer">
						<h1>登入</h1>
						<div>
							<span><input type="text" name="userId" placeholder="請輸入帳號"></span>
							<br>
							<font color="red">${errorMsg }</font>
							<br/>
							<br/><br/>
						</div>
						<div>
							<input type="password" name="password" placeholder="請輸入密碼">
							<br>
							<font color="red">${wrongPassword }</font>
							<br/>
							<br/><br/>
						</div>							
						<div><span>忘記帳號?</span></div>
						<div class="d-flex">
							<a class="ml-auto" href="/signUp">成為會員</a>
							<button>下一步</button>
						</div>
					</div>			
				</form>				
			</div>
		</div>
	</body>
</html>