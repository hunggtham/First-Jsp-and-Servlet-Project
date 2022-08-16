<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>display page</title>
</head>

<body>
	<!--  Display user in table 
	<table border="1">
		<c:forEach items = "${listUser }" var ="list">
			<tr>
				<td>${list.name}</td>
				<td>${list.job}</td>
			</tr>

		</c:forEach>
	</table>
	-->

	<!--  Display user in table -->
	<table border="1">
		<c:forEach items="${listStudent }" var="list">
			<c:if test="${list.num>3 && list.num<6 }">
				<tr>
					<td>${list.num}</td>
					<td>${list.name}</td>
				</tr>
			</c:if>
		</c:forEach>
	</table>


</body>
</html>