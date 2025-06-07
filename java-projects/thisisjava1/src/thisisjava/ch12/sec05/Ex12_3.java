package thisisjava.ch12.sec05;

public class Ex12_3 {

	public static void main(String[] args) {
		//int와 Integer는 객체 차이
		Integer num01 = new Integer(10);
		Integer num02 = Integer.valueOf(10);
		
		Double doubleNum01 = Double.valueOf(30.11);
	
		Character ch = Character.valueOf('A');
		
		System.out.println("정수형1 : " + num01);
		System.out.println("정수형2 : " + num02);
		System.out.println("실수형 : " + doubleNum01);
		System.out.println("문자형 : " + ch);
		
		System.out.println(num01 == num02);
		System.out.println(num01.equals(num02));
		System.out.println("---------------------------------------\n");
		
		String intStr = "70";
		String doubleStr = "60.5";
		
		int myScore = Integer.parseInt(intStr);
		double cutLineScore = Double.parseDouble(doubleStr);
		
		if(myScore >= cutLineScore) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}

}
