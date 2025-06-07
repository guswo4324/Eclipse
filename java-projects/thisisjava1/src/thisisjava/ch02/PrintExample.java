package thisisjava.ch02;

public class PrintExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		System.out.printf("상품의 가격: %-6d원\n", value);
		System.out.printf("상품의 가격: %06d원\n", value);
		
		double area = 3.1415 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f%%\n", 10, area);
		
		String name = "둘리";
		String job = "백수";
		System.out.printf("%6d | %-10s | %10s \n", 1, name, job);
		

	}

}
