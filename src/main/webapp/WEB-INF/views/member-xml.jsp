<%@ page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, com.kh.model.vo.Person" %>
<%
	List<Person> list = (List<Person>) request.getAttribute("list");
%>
<members>
	<% for(Person p : list){ %>
	<member>
		<name><%=p.getName() %></name>
		<age><%=p.getAge() %></age>
		<gender><%=p.getGender() %></gender>
	</member>
	<% } %>
</members>