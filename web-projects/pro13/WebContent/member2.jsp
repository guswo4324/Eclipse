<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	import="java.util.*,sec01.ex01.*"
%>

<%
	//useBean에 속성 값 설정하기 전에 한글 인코딩 작업
	
	//자바코드로 이루어진 자바 빈을 자주 사용할 경우 화면이 복잡해진다는 단점을 보완하기 위해 useBean 사용
	//useBean 액션 태그는 JSP 페이지에서 자바 빈을 대체하기 위한 태그로 사용 형식은
	//<jsp:useBean id = "빈 이름" class = "패키지 이름을 포함한 자바 빈 클래스" [scope = "접근범위"] />

	request.setCharacterEncoding("UTF-8");
%>
	
	<jsp:useBean id = "m" class = "sec01.ex01.MemberBean" scope = "page" />

<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	
	//자바 코드에서 MemberBean 객체를 생성하지 않습니다.
	//MemberBean m = new MemberBean(id, pwd, name, email); 

	/* member.jsp
	가져온 값을 bean객체에 담음 
	MemberBean m = new MemberBean(id, pwd, name, email);
	
	가져온 값으로 각각 insert, select 메서드 호출 
	
	MemberDAO memberDAO = new MemberDAO(); 
	memberDAO.addMember(m);
	List membersList = memberDAO.listMembers(); 
	*/
	
	//useBean에 전송된 회원정보를 설정
	m.setId(id);
	m.setPwd(pwd);
	m.setName(name);
	m.setEmail(email);
	
	//회원정보를 추가한 후 목록으로 출력
	MemberDAO memberDAO = new MemberDAO();
	memberDAO.addMember(m);
	List membersList = memberDAO.listMembers();
%>


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
			<%
				if (membersList.size() == 0) {
			%>
			<tr>
				<td colspan="5">
					<p align="center">
						<b><span style="font-size: 9pt;"> 등록된 회원이 없습니다.</span></b>
					</p>
				</td>
			</tr>
			<%
			} else {
			for (int i = 0; i < membersList.size(); i++) {	
				MemberBean bean = (MemberBean) membersList.get(i);
			%>
			<tr align="center">
				<td><%= bean.getId()%></td>
				<td><%= bean.getPwd()%></td>
				<td><%= bean.getName()%></td>
				<td><%= bean.getEmail()%></td>
				<td><%= bean.getJoinDate()%></td>
			</tr>
			<%
					} // end for
				} // end if
			%>
			<tr height="1" bgcolor="#99ccff">
				<td colspan="5"></td>
			</tr>
		</table>
	</body>
</html>