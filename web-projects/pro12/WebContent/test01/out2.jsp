<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String age = request.getParameter("age");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>out2 테스트</title>
</head>
<body>
<%
	if(name != null || name.length() != 0) {
%>
	<%-- name과 age를 표현식(<%= %>)으로 출력 --%>
	<h1><%= name %>, <%= age %></h1> 
<%
	} else {
%>
	<h1>이름을 입력하세요</h1>
<%
	}
%>

<% 
	if(name != null || name.length() != 0) { 
%>
	<%-- name과 age를 내장객체(<% %>)로 출력 --%>
	<h1><% out.println(name+", / "+age+"살"); %></h1> 
<%
	}
%>
</body>
</html>