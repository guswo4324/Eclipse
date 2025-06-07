package thisisjava.ch08.sec11.exam02;

public class Driver {
	//구현객체가 대입될 수 있도록 
	//매개변수를 인터페이스 타입으로 선언
	void drive(Vehicle vehicle) {
		//인터페이스 메소드 호출
		vehicle.run();
	}
}
