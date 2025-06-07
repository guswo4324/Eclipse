package thisisjava.ch07.sec11;

//final함으로써(봉인)
//Employee클래스는 더이상 자식클래스를 만들 수 없다
public final class Employee extends Person{
	public void work() {
		System.out.println("제품을 생산합니다.");
	}
}
