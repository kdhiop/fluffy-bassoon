<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error500.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>페이지 지시어</title>
</head>
<body>
	<%
		// ArrayList
		ArrayList<String> list = new ArrayList<>();
		list.add("servlet");
		list.add("jsp");
	%>
	
	<p>
		리스트의 길이 : <%= list.size() %><br>
		0번 인덱스 값 : <%= list.get(0) %><br>
		1번 인덱스 값 : <%= list.get(1) %><br>
		10번 인덱스 값 : <%= list.get(10) %><br>
	</p>
</body>
</html>