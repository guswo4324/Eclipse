<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    
//스코프 우선순위
/*
	request, session, application 내장 객체에서는 데이터를 바인딩해서 다른 JSP로 전달
	그런데 각 내장 객체에 바인딩하는 속성 이름이 같은 경우 
	JSP에서는 각 내장 객체에 지정된 출력 우선순위에 따라 순서대로 속성에 접근
	
	request에 address를 바인딩한 후 다시 member4.jsp로 포워딩
*/
    
<%
	session.setAttribute("address", "부산");
%>

<html>
	<head>
		<meta charset="UTF-8">
		<title>회원 정ㅂ조 출력창</title>
	</head>
	<body>
		<table border="1" align="center">
			<tr align="center" bgcolor="#99ccff">
				<td width="20%"><b>아이디</b></td>
				<td width="20%"><b>비밀번호</b></td>
				<td width="20%"><b>이름</b></td>
				<td width="20%"><b>이메일</b></td>
			</tr>
				
			<tr align=center>
				<td>${ id }</td>
				<td>${ pwd }</td>
				<td>${ name }</td>
				<td>${ email }</td>
				<td>${ address }</td> 
			</tr>
		</table>
	</body>
</html>