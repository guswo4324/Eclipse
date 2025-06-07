import { FILTERS } from './constants.js';

// 현재 필터 상태 저장 변수
let currentFilter = FILTERS.ALL;

// 필터 변경 함수 (외부에서 호출)
export function setFilter(filter) {
	currentFilter = filter;
	applyFilter(); // 변경된 필터 적용
}

// 필터 적용 함수
export function applyFilter() {
	document.querySelectorAll('#todoList li').forEach(li => {
		// 완료 여부
		const isCompleted = li.classList.contains("completed"); 
		// 중요 여부
		const isImportant = li.classList.contains("important"); 

		// 현재 필터에 따라 li의 표시 여부 결정
		const visible =
			currentFilter === FILTERS.ALL ||
			(currentFilter === FILTERS.COMPLETED && isCompleted) ||
			(currentFilter === FILTERS.ACTIVE && !isCompleted) ||
			(currentFilter === FILTERS.IMPORTANT && isImportant);

		li.style.display = visible ? "" : "none";
	});
}
