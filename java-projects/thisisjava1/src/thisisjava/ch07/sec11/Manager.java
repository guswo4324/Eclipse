package thisisjava.ch07.sec11;

//non-sealed를 함으로써(봉인해제) 
//manager클래스는 자식클래스를 만들수있다
public non-sealed class Manager extends Person{
	public void work() {
		System.out.println("생산 관리를 합니다.");
	}
}
