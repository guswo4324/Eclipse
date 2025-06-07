package thisisjava.ch05;


public class MainStringArrayArgument {

	public static void main(String[] args) {
		
		if(args.length != 2) { //입력된 데이터가 2개가 아닐때
			System.out.println("프로그램 입력 값 확인해 주세요");
			System.exit(0); //프로그램 강제 종료
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
		
		
		int [] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) { //scores 첫번재부터 끝까지 변수 score에 들어간다
			System.out.println("점수 = " + score);
			sum += score;
		}
		System.out.println("점수총합 = " + sum);
	}

}
