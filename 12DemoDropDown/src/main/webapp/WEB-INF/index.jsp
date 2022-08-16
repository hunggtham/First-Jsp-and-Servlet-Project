<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index Page</title>
</head>
<body>
	<%
	RequestDispatcher rd = request.getRequestDispatcher("HomeForward");
	rd.forward(request, response);
	%>
</body>
</html>