<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>
</head>

<body>
	<table border="1">

		<tr>
			<th>UserName</th>
			<th>Password</th>
		</tr>
		<c:forEach items="${listaccount }" var="display">
			<tr>
				<td>${display.uname}</td>
				<td>${display.pass}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>