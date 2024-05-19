<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>	
		<meta charset="UTF-8">
		<title>註冊</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
		<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>	
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossOrigin="anonymous"></script>
		<link href="/vegven/css/regester.css" rel="stylesheet">
	</head>
	<body>
		<div id="regesterContainer">
			<div>
				<div>
					<form method="post" >
					<!--onkeyup="VerifyAccount()"  這是原放在input內的東西-->
						<span><input id="ac" type="text" name="account" placeholder="帳號" onblur="VerifyAccount()"></span>
						<br>
						<font id="errorAccount" color="red"></font>
						<font id="sucessAccount" color="green"></font>
						<br/>
						<br/><br/>
					</form>
							
				</div>
				 <div>
					<span><input id="pw" type="password" name="password" placeholder="密碼" onblur="VerifyPassword()"></span>
					<br>
					<font id="errorPassword" color="red"></font>
					<font id="successPassword" color="green"></font>
					<br/>
					<br/><br/>
				</div>
				 <div>
					<span><input type="text" name="gender" placeholder="性別"></span>
					<br>
					<br/>
					<br/><br/>
				</div>
				<div>
					<span><input type="date" name="birth" placeholder="生日"></span>
					<br>
					<br/>
					<br/><br/>
				</div>
				<div>
					<span><input type="email" name="googleMail" placeholder="電子郵件"></span>
					<br>
					<font color="red">${sameEmail }</font>
					<font color="green">${sucessEmail }</font>
					<br/>
					<br/><br/>
				</div>
				<div>
					<span><input type="tel" name="phoneNum" placeholder="手機"></span>
					<br>
					<font color="red">${samePhone }</font>
					<font color="green">${sucessPhone }</font>
					<br/>
					<br/><br/>
				</div>
				<div>
					<button>註冊</button>
				</div>
			</div>
		</div>
	</body>
	<script type="text/javascript" src="/vegven/js/regester.js"></script>
</html>