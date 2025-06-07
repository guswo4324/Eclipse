// 현재 선택된 필터 상태
let currentFilter = 'all';

const form = document.getElementById("addTodoForm");
const input = document.getElementById("newTodo");
const prioritySelect = document.getElementById("priority");
const ul = document.getElementById("todoList");

// 우선순위 색상 지정
const getPriorityColor = (priority) => {
	switch (priority) {
		case 'high': 
			return '#ff5252';
		case 'medium': 
			return '#ffb74d';
		case 'low': 
			return '#81c784';
		default: 
			return '#ffb74d';
	}
};

//우선순위 텍스트 지정
const getPriorityText = (priority) => {
	switch (priority) {
		case 'high': 
			return '높음';
		case 'medium': 
			return '중간';
		case 'low': 
			return '낮음';
		default: 
			return '중간';
	}
};

// 할 일 항목(li) 생성 함수
function createTodoItem(text, priority, status = "미완료", important = false) {
	
	const color = getPriorityColor(priority);
	const priorityText = getPriorityText(priority);

	const li = document.createElement("li");
	li.className = "todo-item";
	li.dataset.priority = priority;

	if (status === "완료") li.classList.add("completed");
	if (important) li.classList.add("important");

	const checked = status === "완료" ? "checked" : "";

	li.innerHTML = `
		<input type="checkbox" class="checkbox" ${checked}/>
	    <span class="todo">${text}</span>
	    <span class="priority-badge" style="background-color:${color};">${priorityText}</span>
	    <button class="delete-btn">삭제</button>
  `;

	return li;
}

// 폼 제출 시 할 일 추가
form.addEventListener("submit", e => {
	e.preventDefault();

	const todoText = input.value.trim();
	const priority = prioritySelect.value;

	if (!todoText) return;

	const li = createTodoItem(todoText, priority);
	ul.appendChild(li);
	input.value = "";

	applyFilter();
});


ul.addEventListener("click", e => {
	
	const li = e.target.closest("li");
	if (!li) return;

	// 삭제 버튼 클릭 시
	if (e.target.classList.contains("delete-btn")) {
		li.remove();
		return;
	}

	// 체크박스 클릭 시
	if (e.target.classList.contains("checkbox")) {
		
		li.classList.toggle("completed");
		const checkbox = li.querySelector('.checkbox');
		
		if (checkbox) {
			checkbox.checked = li.classList.contains("completed");
		}
		
		applyFilter();
		return;
	}

	// li 내부 클릭 시(다른 버튼 제외)
	if (	!e.target.classList.contains("delete-btn") &&	!e.target.classList.contains("checkbox")	) {
		
		li.classList.toggle("completed");
		const checkbox = li.querySelector('.checkbox');
		
		if (checkbox) {
			checkbox.checked = li.classList.contains("completed");
		}
		
		applyFilter();
		return;
	}

	/*
	// 중요 표시 버튼 클릭 시
	if (e.target.classList.contains("star-btn")) {
		li.classList.toggle("important");
		e.target.classList.toggle("active");
		applyFilter();
		return;
	}
	*/
});

//필터 버튼에 클릭 이벤트 연결
document.querySelectorAll(".filters button").forEach(btn => {
	
	btn.addEventListener("click", () => {
		
		setFilter(btn.dataset.filter);
	});
});

// 필터 버튼 클릭 처리 함수
function setFilter(filter) {
	currentFilter = filter;
	applyFilter();

	// 버튼에 active 스타일 반영
	document.querySelectorAll(".filters button").forEach(btn => {
		
		btn.classList.toggle("active", btn.dataset.filter === filter);
	});
}

// 필터링 적용 함수
function applyFilter() {
	document.querySelectorAll('#todoList li').forEach(li => {
		
		const isCompleted = li.classList.contains("completed");
		const isImportant = li.classList.contains("important");

		const show =
			currentFilter === 'all' ||
			(currentFilter === 'completed' && isCompleted) ||
			(currentFilter === 'active' && !isCompleted) ||
			(currentFilter === 'important' && isImportant);

		li.style.display = show ? '' : 'none';
	});
}

//페이지 로딩 시 필터 한 번 적용
applyFilter();

