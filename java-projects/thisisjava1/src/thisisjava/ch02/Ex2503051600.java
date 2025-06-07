package thisisjava.ch02;

import java.util.Scanner;
public class Ex2503051600 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String strinput = sc.nextLine();
		int input = Integer.parseInt(strinput);
			
		int a = 11;
		int b = 14;
			
		if(input == 0) {
			a = 5;
		}
		else {
			b = a + 3;
		}
		System.out.println("a,b 출력: "+a+" "+b);

		sc.close();
	}

}

