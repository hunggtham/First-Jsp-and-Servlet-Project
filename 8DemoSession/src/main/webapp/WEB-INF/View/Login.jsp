<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>

	<h5>Login</h5>
	<h5><%=request.getAttribute("msgfail") != null ? request.getAttribute("msgfail") : ""%></h5>
	
	<form action="LoginController" method="POST">
		<input type="text" name="username" /> <br /> <input type="password"
			name="password" /> <br /> <input type="submit" value="Login" /> <br />
	</form>
	
</body>
</html>