package thisisjava.ch02;

import java.util.Scanner;
public class Example250302_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		String st1 = sc.nextLine();
		int a = Integer.parseInt(st1);
		
		System.out.print("영어 점수를 입력하세요 : ");
		String st2 = sc.nextLine();
		int b = Integer.parseInt(st2);
		
		System.out.print("수학 점수를 입력하세요 : ");
		String st3 = sc.nextLine();
		int c = Integer.parseInt(st3);
		System.out.println("");
		
		int result = (a+b+c)/3;
		System.out.println("국어 : "+a+" 영어 : "+b+" 수학 : "+c+" 평균 : "+result);

		sc.close();

	}

}
