package thisisjava.ch12.sec05;

public class Ex12_1 {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello");
		
		str.append(" World");
		System.out.println(str);
		System.out.println("문자열 길이 : " + str.length());
		
		str.delete(0, 6);
		System.out.println(str);
		System.out.println("문자열 길이 : " + str.length());
		
		str.insert(0,  "Hello");
		System.out.println(str);
		System.out.println("문자열 길이 : " + str.length());
		
		str.reverse();
		System.out.println(str);
		
	}

}
