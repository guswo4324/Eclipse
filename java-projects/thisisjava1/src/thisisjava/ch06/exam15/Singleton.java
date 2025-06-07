package thisisjava.ch06.exam15;

public class Singleton {
	
	//private 접근 권한을 갖는 정적 필드 선언과 초기
	private static Singleton singleton = new Singleton();
	private int count = 0;
	
	//private 접근 권한을 갖는 생성자 선언
	private Singleton() {
		System.out.println("Singleton Constructor count : " + count+"\n");
	}
	
	//public 접근 권한을 갖는 정적 메소드 선언
	public static Singleton getInstance() {
		System.out.println("getInstance count before : " + singleton.count);
		singleton.count++;
		System.out.println("getInstance count after: " + singleton.count);
		return singleton;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount() {
		this.count++;
	}
}
