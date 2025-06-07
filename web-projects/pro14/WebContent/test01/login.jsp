<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>


<!-- 
pageContext 객체는 javax.servlet.jsp.PageContext 클래스를 상속해 
웹 컨테이너가 JSP 실행 시 자동으로 생성해서 제공하는 내장 객체.

<a>태그를 이요해 다른 서블릿이나 JSP를 요청하는 방법은 다음의 두 가지입니다.
1. 컨텍스트 이름(pro14) 직접 입력하는 방법(매번 바꿔야함)
ex) <a href="/pro14/test01/memberForm.jsp"> 회원가입하기<a/>

2. getContextPath() 메서드를 이용해 컨텍스트 이름을 가져오는 방법(화면 작업이 복잡해짐)
ex) <a href="<%=request.getContextPath() %>/test01/memberForm.jsp">회원가입하기</a>

3. 쉬운방법
ex) <a href="${pageContext.request.contextPath}/test01/memberForm.jsp">회원가입하기</a>
 -->

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인창</title>
	</head>
	<body>
		<form action="result.jsp">
			아이디 : <input type="text" size=20 /><br>
			비밀번호: <input type="password" size=20 /><br>
			<input type="submit" value="로그인" /> <input type="reset" value="다시입력" />
		</form>
		<br>
		<br>
		
		<!-- 직접 컨텍스트 이름을 입력해 요청 -->
		<!--  <a href="http://localhost:8090/pro14/test01/memberForm.jsp">회원가입하기</a> -->
		
		<!--  request의 getContextPath() 메서드를 이용해 컨텍스트 이름을 가져옴 -->
		<%--   <a href="<%=request.getContextPath() %>/test01/memberForm.jsp">회원가입하기</a>  --%>
		
		<a href="${pageContext.request.contextPath}/test01/memberForm.jsp">회원가입하기</a>
	</body>
</html>

