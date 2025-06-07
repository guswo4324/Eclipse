<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%
	//session과 application에 저장한 name과 address를 getAttribute를 통해서 가져옴
	String name = (String)session.getAttribute("name");
	String address = (String)application.getAttribute("address");
	//session은 해당 브라우저에서만 가능, application은 모든 브라우저에 가능
%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>내장 객체 스코프 테스트2</title>
</head>
<body>
	<h1>이름은 <%= name %>입니다.</h1>
	<h1>주소는 <%= address %>입니다.</h1>
</body>
</html>

