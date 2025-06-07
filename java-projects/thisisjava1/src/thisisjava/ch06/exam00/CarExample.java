package thisisjava.ch06.exam00;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("모델명:"+myCar.model);
		System.out.println("시동여부:"+myCar.start);
		System.out.println("현재속도:"+myCar.speed);
		
		myCar.model = "모닝";
		myCar.start = true;
		myCar.speed = 1218;

		System.out.println("=======================");
		System.out.println("모델명:"+myCar.model);
		System.out.println("시동여부:"+myCar.start);
		System.out.println("현재속도:"+myCar.speed);
	}

}
