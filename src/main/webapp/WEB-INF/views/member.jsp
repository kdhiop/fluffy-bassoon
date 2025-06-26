<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>이름</th>
			<th>나이</th>
			<th>성별</th>
		</tr>
		<c:forEach var="person" items="${list}">
			<tr>
				<td>${person.name}</td>
				<td>${person.age}</td>
				<td>${person.gender}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>