<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div >
			<div>
				<span><input type="text" name="username" placeholder="帳號"></span>
				<br>
				<font color="red">${sameuser }</font>
				<br/>
				<br/><br/>
			</div>
			<div>
				<span><input type="password" name="username" placeholder="密碼"></span>
				<br>
				<font color="red">${samepassword }</font>
				<br/>
				<br/><br/>
			</div>
			<div>
				<span><input type="" name="username" placeholder="性別"></span>
			</div>
			<div>
				<span><input type="text" name="username" placeholder="生日"></span>
				<br>
				<font color="red">${errorMsg }</font>
				<br/>
				<br/><br/>
			</div>
			<div>
				<span><input type="email" name="username" placeholder="電子郵件"></span>
				<br>
				<font color="red">${sameemail }</font>
				<br/>
				<br/><br/>
			</div>
			<div>
				<span><input type="text" name="username" placeholder="手機"></span>
				<br>
				<font color="red">${samephone }</font>
				<br/>
				<br/><br/>
			</div>
		</div>
	</body>
</html>