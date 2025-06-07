package thisisjava.ch07.sec11;

//부모 클래스 Manager는 non-sealed로 봉인해제함으로써
//Director 클래스는 Manager클래스를 상속받을 수 있다
public class Director extends Manager{
	public void work() {
		System.out.println("제품을 기획합니다.");
	}
}
