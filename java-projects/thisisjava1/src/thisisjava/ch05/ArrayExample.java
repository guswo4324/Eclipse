package thisisjava.ch05;

public class ArrayExample {

	public static void main(String[] args) {
		String[] season = {"Spring", "Summer", "Fall", "Winter"}; //바로선언하기
		for(int i = 0; i < season.length; i++) {
			System.out.println("season["+i+"] : "+season[i]);
		}
		System.out.println("");
		
		int[] scores = {83, 90, 87};
		int sum = 0;
		for(int j = 0; j < 3; j++) {
			sum += scores[j];
		} 
		System.out.println("총합 : "+sum);
		double avg = (double)sum/3;
		System.out.println("평균 : "+avg+"\n");
		
		int[] arr1 = new int[3];
		
		for(int k = 0; k < 3; k++) {
			arr1[k] = k;
			System.out.println("arr1["+k+"] : " + arr1[k]);
		}
		System.out.println("");
		
		double[] arr2 = new double[3]; //0으로 초기화
		arr2[0] = 0.1;
		arr2[1] = 0.3;
		arr2[2] = 0.5;
		for(int k = 0; k < 3; k++) {
			System.out.println("arr2["+k+"] : " + arr2[k]);
		}
		System.out.println("");
		
		String[] month = new String[3]; //String[] month = {"1월", "2월", "3월"};
		month[0] = "1월";
		month[1] = "2월";
		month[2] = "3월";
		for(int k = 0; k < 3; k++) {
			System.out.println("month["+k+"] : " + month[k]);
		}
		System.out.println("");
		
		int[] num = {100, 50, 80, 94};
		int num_sum = 0;
		for(int k = 0; k <num.length; k++) {
			num_sum += num[k];
		}
		System.out.println("총합 : "+num_sum);
		double result = (double)num_sum/num.length;
		System.out.println("평균 : "+result);
	}
		
}
