<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>include 지시어</h1>
	<p>include 지시어를 통해 다른 페이지의 html을 현재 jsp에 추가할 수 있다.</p>
	
	<%@ include file="header.jsp" %>
	
	<h1>Content</h1>
	<p><%= name %>님 안녕하세요</p>
	<a href="another.jsp">다른 jsp</a>
	<script>
	$(function(){
		$("h1").css("color","pink");
	});
	</script>
	
	<%@ include file="footer.jsp" %>

</body>
</html>