package thisisjava.ch05;

public class EqualsExample {

	public static void main(String[] args) {
		String strVar1 = "둘리";
		String strVar2 = "둘리";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음\n");
		}
		else {
			System.out.println("strVar1과 strVar2는 참조가 다름\n");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar과 strVar2는 문자열이 같음\n");
		}
		
		String strVar3 = new String("둘리");
		String strVar4 = new String("둘리");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar과 strVar2는 참조가 같음\n");
		}
		else {
			System.out.println("strVar1과 strVar2는 참조가 다름\n");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음\n");
		}
		
		String hobby = "";
        if(hobby.equals("")) {
           System.out.println("hobby 변수가 참조는 String 객체는 빈문자열");
        }
	}
}
