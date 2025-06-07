<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ page import="java.util.*, java.io.*"%>

<%
	request.setCharacterEncoding("UTF-8");
	
	// 할 일 항목 생성
    Map<String, Object> item1 = new HashMap<>();
    item1.put("todo", "리액트 공부하기");
    item1.put("status", "미완료");
    item1.put("priority", "medium");
    item1.put("important", true);

    Map<String, Object> item2 = new HashMap<>();
    item2.put("todo", "useState 이해하기");
    item2.put("status", "완료");
    item2.put("priority", "low");
    item2.put("important", false);

    Map<String, Object> item3 = new HashMap<>();
    item3.put("todo", "ToDoList 만들기");
    item3.put("status", "미완료");
    item3.put("priority", "high");
    item3.put("important", true);
	
    List<Map<String, Object>> todoList = new ArrayList<>();
    todoList.add(item1);
    todoList.add(item2);
    todoList.add(item3);
	
    Map<String, Object> todoMap = new HashMap<>();
    todoMap.put("todoList", todoList);
	todoMap.put("title", "To Do List");
	todoMap.put("subTitle", "할 일 목록");
    
    request.setAttribute("todoList", todoList);
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title><%= todoMap.get("title") %></title>
		<link rel="stylesheet" href="./css/index.css" type="text/css">
	</head>
	<body>
	
		<h1><%= todoMap.get("title") %></h1>
		<h2><%= todoMap.get("subTitle") %></h2>
	
		<div class="App">
	
			<form class="add-form" id="addTodoForm">
				<input type="text" placeholder="새 할 일 입력" id="newTodo"> 
				<select name="priority" id="priority">
					<option value="low">낮음</option>
					<option value="medium">중간</option>
					<option value="high">높음</option>
				</select>
	
				<button type="submit">추가</button>
			</form>
	
			<div class="filters">
				<button data-filter="all" class="active">전체</button>
				<button data-filter="active">미완료</button>
				<button data-filter="completed">완료</button>
				<!-- <button data-filter="important">중요</button>  -->
			</div>
	
			<ul class="todo-list" id="todoList">
<%
			for (Map<String, Object> todo : todoList) {
				
			    String text = (String) todo.get("todo");
			    String status = (String) todo.get("status");
			    String priority = (String) todo.get("priority");
			    boolean important = (Boolean) todo.get("important");
			
			    String className = "";
			    if ("완료".equals(status)) className += " completed";
			    if (important) className += " important";
			    
			    //초기값 주황색
			    String priorityColor = "#ffb74d"; 
			    if ("high".equals(priority)) {
			        priorityColor = "#ff5252";
			    } else if ("low".equals(priority)) {
			        priorityColor = "#81c784";
			    }
			    
%>
	
				<li class="todo-item <%= className.trim() %>" data-priority="<%= priority %>">
					<input 
						type="checkbox" 
						class="checkbox" <%= "완료".equals(status) ? "checked" : "" %>
					/> 
					<span class="todo"><%= text %></span> 
					<div class="action-box">
						<span 
							class="priority-badge" 
							style="background-color: <%= priorityColor %>;"
						> 
							<%=
				        		"high".equals(priority) ? "높음" : 
				        		"medium".equals(priority) ? "중간" : "낮음" 
					    	%>
					    </span> 
					    <!-- <span class="status">(<%= status %>)</span>  --> 
					    <!-- <button class="star-btn <%= important ? "active" : "" %>">★</button> -->
						<button class="delete-btn">삭제</button>
					</div>
				</li>
	
<%
			}
%>
			</ul>
	
		</div>
	
		<script src="./js/test/index.js"></script>
	
	</body>
</html>
