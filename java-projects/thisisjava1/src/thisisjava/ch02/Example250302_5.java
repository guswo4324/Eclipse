package thisisjava.ch02;

import java.util.Scanner;
public class Example250302_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1제곱미터 당 가격(원)을 입력하세요: ");
		String st = sc.nextLine();
		double a = Double.parseDouble(st); 
		
		System.out.print("윗변을 입력: ");
		String st1 = sc.nextLine();
		double b = Double.parseDouble(st1); 
		
		System.out.print("아랫변을 입력: ");
		String st2 = sc.nextLine();
		double c = Double.parseDouble(st2); 
		
		System.out.print("높이를 입력: ");
		String st3 = sc.nextLine(); 
		double d = Double.parseDouble(st3); 
		
		double result = ((b+c)*d/2)*a;
		System.out.println("총 비용 : " + result+"원");

		sc.close();

	}

}
