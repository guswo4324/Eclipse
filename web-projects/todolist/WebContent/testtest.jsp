<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	Map<String, String> map = TodoService.getTodos();
	request.setAttribute("todos", map);
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ToDoList</title>
		<Link rel="stylesheet" href="./css/index.css" type="text/css">
	</head>
	<body>
		<h1>To Do List</h1>
		<h2>할 일 목록</h2>
		<nav>
			<c:forEach var="todo" items="${todos}">
				<li onclick="toggleComplete(this)">${todo.value}</li>
			</c:forEach>
		</nav>
		
		<script src="./js/toggle.js"></script>
	</body>
</html>