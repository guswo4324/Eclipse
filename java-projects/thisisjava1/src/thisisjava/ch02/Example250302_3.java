package thisisjava.ch02;

import java.util.Scanner;

public class Example250302_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("cm를 입력하세요 : ");
		String st = sc.nextLine();
		int a = Integer.parseInt(st);
		System.out.println("");
		
		int m = a/100;
		int cm = a%100;
		System.out.println(a+"cm는 " + m + "m " + cm + "cm입니다");

		sc.close();

	}
}
