package thisisjava.ch02;

import java.util.Scanner;
public class Example250302_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String st1 = sc.nextLine();
		int pen = Integer.parseInt(st);
		int box = Integer.parseInt(st1);
		
		int result_pen1 = 1000*pen;
		int result_box2 = 12*1000*box + result_pen1;
		System.out.println("총가격 : "+result_box2);

		sc.close();

	}

}


