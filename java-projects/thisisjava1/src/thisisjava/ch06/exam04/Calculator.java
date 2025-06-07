package thisisjava.ch06.exam04;

public class Calculator {
	//리턴값이 없는 메소드 선언
	void powerOn(){
		System.out.println("전원을 켭니다");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	//int 타입 값을 리넡하는 메소드 선언
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
}
