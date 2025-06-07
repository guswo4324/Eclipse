package thisisjava.ch14;

public class Ex14_1 {
	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.println("현재 스레드 이름 : " +  threadName);
	}
}
