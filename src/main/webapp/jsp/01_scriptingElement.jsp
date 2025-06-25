<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립팅 원소</title>
</head>
<body>
	<!-- HTML 주석 -->
	<%-- JSP주석 : 개발자 도구에 노출되지 않음 --%>
	
	<h1>스크립팅 원소</h1>
	<%
		// 스크립틀릿 : 일반적인 자바 코드 작성
		int sum = 0;
		for(int i=1; i<100; i++){
			sum += i;
		}
		System.out.println("덧셈결과 : "+sum);
	%>
	
	<p>
		화면상에 자바 변수를 출력하고자 한다면<br>
		1. 스클립틀릿 활용 : <% out.println(sum); %> <br>
		2. 표현식(출력식) : <%= sum %>
	</p>
	
	<%
		String[] names = {"심은성","강동현","서혜림","안정현"};
	%>
	<h5>배열의 길이 : <%= names.length %></h5>
	<h4>jsp에서 반복문 활용하기</h4>
	
	<ul>
	<% for(String name : names){ %>
		<li><%= name %>
	<% } %>
	</ul>
	
</body>
</html>