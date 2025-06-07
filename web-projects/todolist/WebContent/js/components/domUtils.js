//DOM 조작 관련 함수
//텍스트, 우선순위를 받아 DOM 요소를 생성하여 반환

export function createTodoElement(text, priority) {
	const li = document.createElement("li");
	
	//기본 클래스
	li.className = "todo-item";
	
	//우선순위 속성 부여
	li.setAttribute("data-priority", priority);
	
	//innerHTML로 li 내부 HTML 구성
	li.innerHTML = `
        <span class="todo">${text}</span>
        <span class="priority">(${priority})</span>
        <span class="status">(미완료)</span>
        <button class="important-btn">★</button>
        <button class="delete-btn">삭제</button>
    `;
	return li;
}
