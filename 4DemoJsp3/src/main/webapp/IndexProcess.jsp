<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import= "mypack.Users" %>
<%@page import= "mypack.DAO" %>
<%@page import= "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IndexProcess page</title>
</head>
<body>
<!--< %  Display user in table 
	
		
		request.setAttribute("listUser",DAO.ExportUsers());
		
		RequestDispatcher rd = request.getRequestDispatcher("Display.jsp");
		rd.forward(request,response);
	%> -->
	
	<%
		
		request.setAttribute("listStudent",DAO.ExportStudent());
		
		RequestDispatcher rd = request.getRequestDispatcher("Display.jsp");
		rd.forward(request,response);
		
	
	%>
</body>
</html>