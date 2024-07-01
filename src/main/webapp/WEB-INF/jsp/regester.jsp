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
			
				<form method="post" action="/vegven/RegesterUser">
					<div>
						<!--onkeyup="VerifyAccount()"  這是原放在input內的東西-->
						<span><input id="ac" type="text" name="account" placeholder="帳號" onblur="VerifyAccount()" required="required"></span>
						<br>
						<font id="errorAccount" color="red">${sameAccount}</font>
						<font id="sucessAccount" color="green"></font>
						<br/>
						<br/><br/>
					</div>
					 <div>
						<span><input id="pw" type="password" name="password" placeholder="密碼" onblur="VerifyPassword()" required="required"></span>
						<br>
						<font id="errorPassword" color="red">${samePassword}</font>
						<font id="successPassword" color="green"></font>
						<br/>
						<br/><br/>
					</div>
					<div>
						<span><input id="againPW" type="password" name="passwordAG" placeholder="請再輸入一次密碼" onblur="matchAgainPassword()" required="required"></span>
						<br>
						<font id="errorMatchPassword" color="red">${NonMatchPW}</font>
						<font id="successMatchPassword" color="green"></font>
						<br/>
						<br/><br/>
					</div>
					 <div>				
					 	<fieldset class="border p-2 border-dark">
					 		<legend class="w-auto">性別</legend>				 		
							<input id="woman" type="radio" name="gender" value = "1" > 
							<label for="woman">女性</label>
							<input id="man" type="radio" name="gender" value = 2 > 
							<label for="man">男性</label>
							<input id="hide" type="radio" name="gender" value = 3 > 
							<label for="hide">不公開</label>
					 	</fieldset>
						<br><br/>
					</div>
					<div>
						<span><input type="date" name="birth" placeholder="生日" required="required"></span>
						<br>
						<br/>
						<br/><br/>
					</div>
					<div>
						<span><input id="mails" type="email" name="mail" placeholder="電子郵件" onblur="VerifyEmail()" required="required"></span>
						<br>
						<font id="errorMail" color="red">${sameEmail}</font>
						<font id="successMail" color="green"></font>
						<br/>
						<br/><br/>
					</div>
					<div>
						<span><input id="phone" type="tel" name="phone" placeholder="手機" onblur="VerifyPhone ()" required="required"></span>
						<br>
						<font id="errorPhone" color="red">${samePhone}</font>
						<font id="successPhone" color="green"></font>
						<br/>
						<br/><br/>
					</div>
					<div>
						<button type="submit">註冊</button>
						<!-- <button>註冊</button> -->
					</div>
				</form>
			
		</div>
	</body>
	<script type="text/javascript" src="/vegven/js/regester.js"></script>
</html>