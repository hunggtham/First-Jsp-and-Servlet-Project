<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>display page</title>
</head>

<body>
	<table border='1'>
		<c:forEach items ="listUser" var ="item">
			<tr>
				<td>${item.name}</td>
				<td>${item.job}</td>
			</tr>

		</c:forEach>

	</table>
</body>
</html>