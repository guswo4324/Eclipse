package thisisjava.ch12.sec03.exam03;

public class RecordExample {

	public static void main(String[] args) {
		Member m = new Member("winter", "눈송이", 25);
		//Getter 메소드 호출
		System.out.println(m.id());
		System.out.println(m.name());
		System.out.println(m.age());
		
		System.out.println(m.toString());
		System.out.println();
		
		Member m1 = new Member("winter", "눈송이", 25);
		Member m2 = new Member("winter", "눈송이", 25);
		System.out.println("m1.hashCDode(): " + m1.hashCode());
		System.out.println("m2.hashCDode(): " + m2.hashCode());
		
		System.out.println("m1.equals(m2): " + m1.equals(m2));
		System.out.println("m2.equals(m1): " + m2.equals(m1));

	}

}
