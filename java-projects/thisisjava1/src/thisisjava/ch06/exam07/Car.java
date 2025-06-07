package thisisjava.ch06.exam07;

public class Car {
	//필드
	String model;
	int speed;
	
	//생성자
	Car(String model){
		this.model = model;
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		this.setSpeed(100);
		System.out.println(model + "가 달립니다. ( 시속 : " + speed + "km/h");
	}
	

}
