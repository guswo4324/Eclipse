//todo 리스트 추가/삭제/상태 토글 로직

import { createTodoElement } from './domUtils.js';
import { applyFilter } from './filter.js';

//할 일 추가 및 각 항목 동작 정의 함수
export function setupTodoHandlers(formId, inputId, selectId, listId) {
	
	//폼 요소
    const form = document.getElementById(formId);
	//입력창
    const input = document.getElementById(inputId);
	//우선순위 셀렉트
    const priority = document.getElementById(selectId);
	//ul 리스트
    const list = document.getElementById(listId);
	
	//할 일 추가 핸들러(form 제출 시)
    form.addEventListener("submit", e => {
        e.preventDefault();
		//입력값
        const text = input.value.trim();
		//우선순위
        const prio = priority.value;
		
		//입력값 없으면 종료
        if (!text) return;
		
		//li 생성
        const li = createTodoElement(text, prio);
		//리스트에 추가
        list.appendChild(li);
	
		//입력창 초기화
        input.value = "";
		//우선순위 초기화(초기값 low)
        priority.value = "low";
    });
	
	//동적 요소에 대한 이벤트 위임(버블링)
    list.addEventListener("click", e => {
		//클릭된 li 찾기
        const li = e.target.closest("li");
        if (!li) return;
		
		//삭제 버튼
        if (e.target.classList.contains("delete-btn")) {
            li.remove();
			console.log("리스트 삭제");
            return;
        }
		
		//중요 버튼
        if (e.target.classList.contains("important-btn")) {
            li.classList.toggle("important");
			// 필터 재적용
            applyFilter();
			console.log("리스트 중요"); 
            return;
        }
		
		//완료 상태 토글
        li.classList.toggle("completed");
        const statusSpan = li.querySelector(".status");
        if (statusSpan) {
            const current = statusSpan.textContent.trim();
            statusSpan.textContent = current === "미완료" ? "완료" : "미완료";
			console.log("상태 : " + current);
        }
    });
}
