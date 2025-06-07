<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
	request.setAttribute("address", "부산");
%>

<html>
	<head>
		<meta charset=”UTF-8">
		<title>forward</title>
	</head>
	<body>
		<jsp:forward page="member5.jsp"></jsp:forward>
	</body>
</html>