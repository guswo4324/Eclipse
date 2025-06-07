package todolist;

import java.util.*;

public class TodoService {
	
	public static Map<String, String> getTodos() {
		Map<String, String> map = new HashMap<>();
		map.put("1", "리액트 공부하기");
		map.put("2", "useState 이해하기 (완료)");
		map.put("3", "투두리스트 만들기 (미완료)");
		return map;
	}
}
