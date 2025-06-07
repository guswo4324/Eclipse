package thisisjava.ch02;

import java.util.Scanner;
public class Ex2503051700 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strinput = sc.nextLine();
		int input = Integer.parseInt(strinput);
		
		if(input < 0) {
			input *=-1;
		}
		System.out.println(input);

		sc.close();

	}
}
