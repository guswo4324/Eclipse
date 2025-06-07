<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>

<%-- 브라우저에 요청 시 request, session, application 내장 객체에 회원 정보를 바인딩한 후 다시 member1.jsp로 포워딩 --%>

<%
	request.setCharacterEncoding("utf-8");

	//request 내장 객체에 바인딩 
	request.setAttribute("id", "hong");
	request.setAttribute("pwd", "1234");
	
	//session 내장 객체에 바인딩
	session.setAttribute("name", "박");
	
	//application 내장 객체에 바인딩
	application.setAttribute("email", "wow@wow.com");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>forward1</title>
	</head>
	<body>
		<jsp:forward page="member1.jsp" />
	</body>
</html>