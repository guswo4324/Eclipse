package thisisjava.ch12.sec03.exam02;

public class HashCodeExample {

	public static void main(String[] args) {
		//hashcode 작성법
		//생성자 생성 시 키 값 입력
		Student s1 = new Student(1, "홍길동");
		Student s3 = new Student(1, "홍길동");
		System.out.println("s1.hashCode(): " + s1.hashCode());
		System.out.println("s3.hashCode(): " + s3.hashCode());
		
		
		if(s1.hashCode() == s3.hashCode()) {
			if(s1.equals(s3)) {
				System.out.println("동등 객체입니다.");
			}
			else {
				System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
			}
		}
		else {
			System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
		}

	}

}
