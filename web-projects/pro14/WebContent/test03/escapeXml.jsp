<%@ page language="java" contentType="text/html; charset=UTF-8"
     import="java.io.*"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--

<c:out> 태그는 화면에 지정한 값을 출력해주는 태그

<c:out value="출력값" default="기본값" escapeXml="boolean값"/>

value는 출력할 값을, default는 value 속성에 지정된 값이 없을 때 출력할 기본값
escpaeXml은 escape 문자를 변환하는 역할

--%>


<%
	request.setCharacterEncoding("UTF-8");
%>

<!DOCTYPE html >
<html>
	<head>
		<meta charset=”UTF-8">
		<title>escapeXml 실습하기</title>
	</head>
	<body>
		<h2>escapeXml 변환하기</h2>
		<h2>
			<pre>
			
				<%--
					특수문자	변환된 문자
					<		&lt
					>		&gt
					&		&amp
					'		&#039
					"		&#034
				 --%>
			
				<%--escapeXml 속성이 true이므로  value의 &lt는 그대로 출력 --%>
				<c:out  value="&lt;" escapeXml="true" />
				<%-- escpaeXml 속성이 false이므로 value의 &lt는 특수문자로 변환되어 화면에 출력 --%>
				<c:out  value="&lt;" escapeXml="false" />
 
				<c:out  value="&gt;" escapeXml="true" />
				<c:out  value="&gt;" escapeXml="false" />
				 
				<c:out  value="&amp;" escapeXml="true" />
				<c:out  value="&amp;" escapeXml="false" />
				
				<c:out  value="&#039;" escapeXml="true" />
				<c:out  value="&#039;" escapeXml="false" />
				
				<c:out  value="&#034;" escapeXml="true" />
				<c:out  value="&#034;" escapeXml="false" />
			</pre>
		</h2>
	/body>
</html>
