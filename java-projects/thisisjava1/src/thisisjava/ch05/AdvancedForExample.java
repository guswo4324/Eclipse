package thisisjava.ch05;

public class AdvancedForExample {

	public static void main(String[] args) {
		int [] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) { //scores 첫번재부터 끝까지 변수 score에 들어간다
			System.out.println("점수 = " + score);
			sum += score;
		}
		System.out.println("점수총합 = " + sum);
	}

}
