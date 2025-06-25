<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.kh.model.vo.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>1. 스클립틀릿과 표현식을 이용하여 각 영역에 담긴 값을 추출하기</h3>
	<%-- <%
		// request scope
		String classRoom = (String)request.getAttribute("classRoom");
		Person student = (Person)request.getAttribute("student");
		
		// request scope
		String academy = (String)session.getAttribute("academy");
		Person teacher = (Person)request.getAttribute("teacher");
	%>
	<p>
		학원명 : <%= academy %><br>
		강의장 : <%= classRoom %><br>
		강사 정보 : <%= teacher.getName() %>, <%= teacher.getAge() %>, <%= teacher.getGender() %><br>
		수강생 정보 :
		<ul>
			<li>이름 : <%= student.getName() %></li>
			<li>나이 : <%= student.getAge() %></li>
			<li>성별 : <%= student.getGender() %></li>
		</ul>		
	</p> --%>
	
	<br><hr><br>

	<h3>2. EL을 이용해서 scope에 저장된 값들 출력하기</h3>
	
	<p>
		학원명 : ${academy} <br>
		강의장 : ${classRoom} <br>
		강사정보 : ${teacher.name}, ${teacher.age}, ${teacher.gender}
		수강생정보 :
		<!-- 
			EL식으로 teacher에 접근 시 teacher의 자료형은 Person.
			Person과 같은 VO클래스의 각 필드에 담긴 값을 출력하고자 한다면, 객체명.필드명으로 접근하면 된다.
			.필드명으로 작성 시, VO클래스의 getter메서드를 찾아서 데이터를 바인딩한다.
		 -->
		<ul>
			<li>${student.name}</li>
			<li>${student.age}</li>
			<li>${student.gender}</li>
		</ul>
	</p>
	
	<br><hr><br>
	
	<h3>3. EL사용 시 내장 객체들에 저장된 키 값이 동일한 경우</h3>
	<!-- 
		EL은 공유범위가 제일 작은 Scope에서부터 키 값을 검색해 나간다.
		page -> request -> session -> application
		내가 특별히 scope를 지정하지 않은 경우, 위 순서대로 각 스코프에서 내가 지정한
		키 값을 검색하여 존재하는 경우 해당 키 값을 화면 상에 바인딩 한다.
	-->
	
	scope 값 : ${scope}
	
	<br><br><br><hr><br>
	
	<h3>4. 직접 Scope영역에 접근하여 데이터 가져오기</h3>
	<%
		pageContext.setAttribute("scope", "page");
	%>
	pagescope에 담긴 값 : ${scope} 또는 ${pageScope.scope} <br>
	requestScope에 담긴 값 : ${requestScope.scope} <br> <!-- 저장된 값이 없는 경우 에러 X, 공백이 출력 -->
	sessionScope에 담긴 값 : ${sessionScope.scope} <br>
	applicationScope에 담긴 값 : ${applicationScope.scope} <br>
	
</body>
</html>