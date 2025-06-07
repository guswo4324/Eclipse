<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%-- 
	<%@%> : 페이지 속성 지정
	<%!%> : 변수, 메소드 선언
	<%=%> : 결과값 출력
	<% %> : JAVA 코드 삽입	
--%>
<%! 
	String name = "둘리";
	public String getName() { return name; }
%>

<%
	String age=request.getParameter("age");
	
%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>선언문 연습</title>
</head>
<body>
	<h1>안녕하세요 <%=name %>님!!</h1>
	<h1>나이는 <%=age %>살입니다!!</h1>
</body>
</html>