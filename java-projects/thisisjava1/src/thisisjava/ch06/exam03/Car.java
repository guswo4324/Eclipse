package thisisjava.ch06.exam03;

public class Car {
	String company = "현대자동차"; //고정값
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		
	}
	
	Car(String model){
		this(model, "은색", 200); //Car(String model, String color, int maxSpeed) 이걸 불러온다
		//this.model = model;
		//this.color = "은색"
		//this.maxSpeed = 200;
		System.out.println("1개 파라미터로 구성한 생성자 호출했을 때");
	}
	
	Car(String model, String color){
		this(model, color, 250);
		//this.model = model;
		//this.color = color;
		System.out.println("2개 파라미터로 구성한 생성자 호출했을 때");
		
	}
	
	Car(String model, String color, int maxSpeed){
//		this(model, color, maxSpeed);
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
//		위에 3개랑 똑같은 표현
		System.out.println("3개 파라미터로 구성한 생성자 호출");
	}
	Car(String model, int maxSpeed){
		this(model, "빨강", maxSpeed);
//		this.model = model;
//		this.maxSpeed = maxSpeed;
	}
}
