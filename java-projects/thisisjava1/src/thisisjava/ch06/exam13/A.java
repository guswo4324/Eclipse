package thisisjava.ch06.exam13;

public class A {
	//public 접근 제한을 갖는 필드 선언
	public int field1;
	
	//default 접근 제한을 갖는 필드 선언
	int field2;
	
	//private 접근 제한을 갖는 필드 선언
	private int field3;
	
	
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
		
	}
	
	public void method1() {
		
	}
	
	void method2() {
		
	}
	
	private void method3() {
		
	}
}
