package thisisjava.ch02;

public class StringExample {

	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다."; //"출력 \"
		System.out.println(str);
		
		str = "번호\t이름\t직업";  //tap 이스케이프 \t
		System.out.println(str);
		
		System.out.print("\n나는\n"); //개행 \n
		System.out.print("자바를\n");
		System.out.print("배웁니다\n\n");
		
		System.out.println("나는"); 
		System.out.println("자바를");
		System.out.println("배웁니다");
		
		

	}

}
