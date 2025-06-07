package thisisjava.ch06.exam13;

public class B {
	public void method() {
		A a = new A();
		
		a.field1 = 1;
		a.field2 = 1;
		//private 필드 접근이라서 불가

//		a.field3 = 1;


		a.method1();
		a.method2();
//		private 필드 접근이라서 불가

//		a.method3();

	}
	
}
