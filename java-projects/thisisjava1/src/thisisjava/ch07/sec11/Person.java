package thisisjava.ch07.sec11;

//Person클래스에 대해 Employee, Manager 클래스에게 봉인을 부여함
//Employee와 Manager 클래스는 봉인을 할건지 안할건지 결정한다
//final 또는 non-sealed로 
//봉인을 하고싶으면 fianl
//하고싶지 않으면 non-sealed
public sealed class Person permits Employee, Manager {
	//필드
	public String name;
	
	//메소드
	public void work() {
	System.out.println("하는 일이 결정되지 않았습니다.");
	
	}
}
