<%@ page language="java" contentType="text/html; charset=UTF-8"
     import="java.util.*"
    pageEncoding="UTF-8"
    isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- 
<c:redirect>태그는 지정된 JSP 페이지로 리다이렉트할 때 사용

response.sendRedirect() 기능과 동일하여 <c:redirect> 태그로 리다이렉트할 때 매개변수를 전달할 수 있다 

<c:redirect url="redirect할 URL">
	<c:param name="매개변수이름" value="전달값" />
	...
</c:redirect>
--%>

<%
	request.setCharacterEncoding("UTF-8");
%>  

<html>
	<head>
		<meta charset=”UTF-8">
		<title>리다이렉트 페이지</title>
	</head>
	<body>
	<!-- 리다이렉트할 페이지 설정& 리다이렉트할 페이지로 전달할 매개변수 설정-->
		<c:redirect  url="/test01/member1.jsp"  >
			<c:param  name="id" value="${'hong'}" />
			<c:param  name="pwd" value="${'1234'}" />
			<c:param  name="name" value="${'홍길동'}" />
			<c:param  name="email" value="${'hong@test.com'}" />
		</c:redirect>
	</body>
</html>
