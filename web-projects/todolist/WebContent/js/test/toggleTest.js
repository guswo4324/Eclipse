/*function toggleComplete(el) {
	el.classList.toggle('completed');
}*/

//toggle 
document.addEventListener('DOMContentLoaded', function () {
	
	const items = document.querySelectorAll('li');
  
  	items.forEach(item => {
		item.addEventListener('click', function () {
	  		item.classList.toggle('completed');
		});
  	});
	
});


/*// 페이지에 있는 <li> 요소들에 대해 이벤트 리스너 등록
document.querySelectorAll("#todoList li").forEach(item => {
	item.addEventListener("click", () => {
		
		//클릭 시 완료 상태 토글
		item.classList.toggle("completed");
		
		//상태 텍스트("미완료" <-> "완료") 변경
		const statusSpan = item.querySelector(".status");
		const currentStatus = statusSpan.textContent.trim();
		
		statusSpan.textContent = currentStatus === "미완료" ? "완료" : "미완료";

	});
});*/