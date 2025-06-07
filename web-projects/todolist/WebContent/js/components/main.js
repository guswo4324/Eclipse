//메인 초기화 및 이벤트 바인딩

import { setupTodoHandlers } from './todoList.js';
import { setFilter } from './filter.js';

document.addEventListener("DOMContentLoaded", () => {
    setupTodoHandlers("addTodoForm", "newTodo", "priority", "todoList");

    document.querySelector(".filters").addEventListener("click", e => {
        if (e.target.tagName === "BUTTON") {
            const filter = e.target.textContent.trim();
            const map = {
                전체: "all",
                완료: "completed",
                미완료: "active",
                중요: "important"
            };
            setFilter(map[filter] || "all");
        }
    });
});
