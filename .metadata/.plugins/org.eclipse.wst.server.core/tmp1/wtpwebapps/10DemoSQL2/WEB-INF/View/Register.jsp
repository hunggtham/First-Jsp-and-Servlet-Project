<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
</head>
<body>
	<h2> <%=request.getAttribute("msgRegister") != null ? request.getAttribute("msgRegister"): ""  %></h2>
	
	<form action="RegisterController" method="POST">
		Username: <input type="text" name="uname" /> 
		<br/> 
		Password: <input type="text" name="pass" />
		<br/> 
		<input type="submit" value="Register" />
	</form>
</body>
</html>