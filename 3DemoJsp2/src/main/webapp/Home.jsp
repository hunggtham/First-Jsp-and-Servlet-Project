<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
</head>
<body>

<!-- get Atribute was send from LoginProcess.jsp  -->
	Wellcome <%= request.getAttribute("attributeName")%>
	
</body>
</html>