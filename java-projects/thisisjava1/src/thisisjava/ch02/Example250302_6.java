package thisisjava.ch02;

import java.util.Scanner;
public class Example250302_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫번째 수를 입력하세요: ");
		String st1 = sc.nextLine();
		int a = Integer.parseInt(st1);
		
		System.out.print("두번째 수를 입력하세요: ");
		String st2 = sc.nextLine();
		int b = Integer.parseInt(st2);
		
		if(a <= b) {
			System.out.println("두수의 차는 : "+(b-a));
		}
		else {
			System.out.println("두수의 차는 : "+(a-b));
		}

		sc.close();

	}

}