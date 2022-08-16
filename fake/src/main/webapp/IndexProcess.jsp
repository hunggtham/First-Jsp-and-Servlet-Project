<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import= "mypack.*" %>
<%@page import= "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IndexProcess page</title>
</head>
<body>
	<%
		
		request.setAttribute("listUser",DAO.ExportUsers());
		
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request,response);
		
	
	%>
</body>
</html>