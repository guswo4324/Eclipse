<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("utf-8");
%> 

<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>마리오깜놀</title>
</head>
<body>
  	안녕하세요. 버섯이 JSP 시작입니다!!! 
	<br>
	<jsp:include page="main_mario_image.jsp" flush="true" >
		<jsp:param name="name" value="마리오깜놀" />
		<jsp:param name="imgName" value="마리오깜놀.jfif" />
	</jsp:include>
	<br>
  	안녕하세요. 버섯이 JSP 끝 부분입니다.!!! 
</body>
</html>