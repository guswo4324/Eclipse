package thisisjava.ch02;

public class VariableExchangeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		int y = 5;
		System.out.println("x:"+x+", y:"+y);
		//x, y 값 서로 교환
		int x1;
		x1 = x;
		x = y;
		
		System.out.println("x:"+x+", y:"+x1);

	}

}
