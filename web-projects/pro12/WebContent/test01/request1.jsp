<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="javax.servlet.RequestDispatcher"
    pageEncoding="UTF-8"%>
    
<%
	//request 객체에 set -> name : 짱구, address : 목성 저장
	request.setAttribute("name", "짱구");
	request.setAttribute("address", "목성");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Request 테스트</title>
</head>
<body>

<%
	RequestDispatcher dispatch = request.getRequestDispatcher("request2.jsp");
	dispatch.forward(request, response);
	//request1 주소 입력하면 request2로 자동으로 넘어감
%>
</body>
</html>