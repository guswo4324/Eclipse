package thisisjava.ch02;

import java.util.Scanner;
public class Example250302_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 길이를 입력하세요 : ");
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX);
	
		System.out.print("세로 길이를 입력하세요 : ");
		String strY = sc.nextLine();
		int y = Integer.parseInt(strY);
		
		System.out.print("높이 길이를 입력하세요 : ");
		String strZ = sc.nextLine();
		int z = Integer.parseInt(strZ);
		System.out.println("");
		
		int result = x*y*z;
		System.out.println("사각기둥의 부피는 : "+result+"입니다");

		sc.close();

	}

}
