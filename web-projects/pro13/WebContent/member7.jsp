<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	import="java.util.*,sec01.ex01.*"
%>

<%
	request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id = "m" class = "sec01.ex01.MemberBean" scope = "page" />
<!-- 전송된 매개변수 이름과 빈 속성을 비교한 후 동일한 빈에 값을 자동으로 설정 -->
<jsp:setProperty name = "m" property = "*" />
	
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>회원 목록창</title>
	</head>
	<body>
		<table align="center" width="100%">
			<tr align="center" bgcolor="#99ccff">
				<td width="7%">아이디</td>
				<td width="7%">비밀번호</td>
				<td width="5%">이름</td>
				<td width="11%">이메일</td>
				<td width="5%">가입일</td>
			</tr>
			<tr align="center">
				<td><jsp:getProperty name="m" property="id" /></td>
				<td><jsp:getProperty name="m" property="pwd" /></td>
				<td><jsp:getProperty name="m" property="name" /></td>
				<td><jsp:getProperty name="m" property="email" /></td>
			</tr>
			<tr height="1" bgcolor="#99ccff">
				<td colspan="5"></td>
			</tr>
		</table>
	</body>
</html>