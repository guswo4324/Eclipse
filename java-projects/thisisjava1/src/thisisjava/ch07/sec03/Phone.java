package thisisjava.ch07.sec03;

public class Phone {
	//필드선언
	public String model;
	public String color;
	
	//매개변수를 갖는 생성장 선언
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone(Strinhg model, String color) 생성자 실행");
	}
}
