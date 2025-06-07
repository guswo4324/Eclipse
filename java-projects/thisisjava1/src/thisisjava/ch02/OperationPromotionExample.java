package thisisjava.ch02;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte result = 10 + 20;
		System.out.println("result: "+result);
		
		byte b1 = 10;
		byte b2 = 20;
		//byte result2 = b1 + b2; -> 컴파일 에러
		//피연산자로 받으면 안됨 
		//b1, b2는 int 타입으로 변환되어 연산 결과도 int 타입으로 생성
		//-> int 타입으로 생성됐는데 byte 타입으로 변수에 저장할수 없다
		int result3 = b1 + b2;
		//byte result4 = b1 + 20; -> 컴파일 에러
		//byte result5 = 20 + b2; -> 컴파일 에러
		//System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);
		//System.out.println("result4: "+result4); -> 컴파일 에러
		//System.out.println("result5: "+result5); -> 컴파일 에러
		
		short s1 = 10;
		short s2 = 20;
		short result6 = 10 + 20;
		//short result7 = s1 + s2; 
		int result8 = s1 + s2;
		//short result9 = s1 + 20;
		//short result10 = 30 + s1;
		System.out.println("result6: "+result6);
		//System.out.println("result7: "+result7);
		System.out.println("result8: "+result8);
		//System.out.println("result9: "+result9);
		//System.out.println("result10: "+result10);
		
		byte b3 = 10;
		int i1 = 100;
		int sum = b3 + i1;
		System.out.println("sum: "+sum);
		
		
		System.out.println("-----------------------------");
		
		byte v1 = 10;
		int v2 = 100;
		long v3 = 1000L;
		
		//int result100 = v1 + v2 + v3; v3가 int보다 범위 초과 -> 컴파일 에러
		long result101 = v1 + v2 + v3; //섞어도 되는데 선언부가 범위에 맞아야함
		System.out.println("result101: "+result101);
		
		int v4 = 10;
		int result102 = v4/4;
		System.out.println("result102: "+result102);
		
		System.out.println("-----------------------------");
		
		int v5 = 10;
		//int result103 = v5/4.0; ->컴파일 에러
		double result104 = v5/7; 
		//v5가 int형 뒤 숫자도 인트형 -> 1.428인데 int형이라 1로 출력 -> double result104라 1.0으로 출력
		double result105 = (double)v5/7;
		//double로 받고 double result105라서 소수점 그대로 출력
		//System.out.println("result103: "+result102);
		System.out.println("result104: "+result104);
		System.out.println("result105: "+result105);
		

	}

}
