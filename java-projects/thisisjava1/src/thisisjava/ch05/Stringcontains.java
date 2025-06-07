package thisisjava.ch05;

public class Stringcontains {

	public static void main(String[] args) {
		//.replace()
		String subject = "자바 프로그래밍 자바12345 자바 6";
		String example = subject.replace("자바", "뿌직"); 
		//example.contains("자바") 하면 false
		//자바와 똑같은 글자는 전부다 뿡으로 바꿈
		System.out.println(example+"\n");
		
		//contains
		boolean result = subject.contains("12");
        if(result) {
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련없는 책이군요");
        }
        

	}

}
