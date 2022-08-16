<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LoginProcess</title>
</head>
<body>
	<%
	//get element
		String name = request.getParameter("username");
	//send name to attributeName to home jsp( by setAttribute)
		request.setAttribute("attributeName", name);
		RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
		
		rd.forward(request,response);
	%>
</body>
</html>