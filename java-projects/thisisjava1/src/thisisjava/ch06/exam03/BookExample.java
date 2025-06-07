package thisisjava.ch06.exam03;

public class BookExample {

	public static void main(String[] args) {
		Book b1 = new Book();
		System.out.println("b1.title : " + b1.title);
		System.out.println("b1.series : " + b1.series);
		System.out.println("b1.page : " + b1.page);
		System.out.println("");
		
		Book b2 = new Book("이것이 자바다");
		System.out.println("b1.title : " + b2.title);
		System.out.println("b1.series : " + b2.series);
		System.out.println("b1.page : " + b2.page);
		System.out.println("");
		
		Book b5 = new Book("Javascript+Css");
		System.out.println("b5.title : " + b5.title);
		System.out.println("b5.series : " + b5.series);
		System.out.println("b5.page : " + b5.page);
		System.out.println("");
		
		Book b3 = new Book("신데렐라", 170);
		System.out.println("b1.title : " + b3.title);
		System.out.println("b1.series : " + b3.series);
		System.out.println("b1.page : " + b3.page);
		System.out.println("");
		
		Book b4 = new Book(5, "노인과 바다");
		System.out.println("b1.title : " + b4.title);
		System.out.println("b1.series : " + b4.series);
		System.out.println("b1.page : " + b4.page);

	}

}
