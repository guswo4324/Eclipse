package thisisjava.ch06.exam03;

public class Book {
	String title;
	int series = 1;
	int page = 100;
	
	Book(){
		this.title = "제목없음";
	}
	
	Book(String title){
		this.title = title;
	}
	Book(String title, int page){
		this.title = title;
		/*
		 * this(title); 
		 * 이랑 같은거 
		 * Book(String title){ 
		 * this.title = title; 
		 * 함수가 있기대문
		 */
		this.page = page;
	}
	Book(int series, String title){
		this.title = title;
		this.series = series;
	}
}
