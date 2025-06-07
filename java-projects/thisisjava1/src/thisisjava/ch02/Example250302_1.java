package thisisjava.ch02;

import java.util.Scanner;
public class Example250302_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX);
		
		String strY = sc.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x * y;
		
		System.out.println(result);
		sc.close();

	}
}