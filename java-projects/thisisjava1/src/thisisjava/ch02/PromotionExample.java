package thisisjava.ch02;

public class PromotionExample {

	public static void main(String[] args) {
		byte b1 = 10;
		int i1 = b1;
		System.out.println("int value: " + i1);
		
		char c1 = '가';
		i1 = c1;
		System.out.println("가의 유니코드: " + i1);
		
		i1 = 50;
		long l1 = i1;
		System.out.println("l1: " + l1);
		
		l1 = 50;
		float f1 = l1;
		System.out.println("f1: " + f1);
		
		f1 = 100.5f;
		double d1 = f1;
		System.out.println("d1: " + d1);

	}

}
