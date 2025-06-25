<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.text.SimpleDateFormat, java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Date date = new Date();
		String year = new SimpleDateFormat("yyyy").format(date);
	%>
	
	Copyright &copy; 1998-<%=year %> KH Information에 저작권 있음. <br>	
	파람값 : ${param.test}
</body>
</html>