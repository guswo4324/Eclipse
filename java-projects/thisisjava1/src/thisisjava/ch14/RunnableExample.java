package thisisjava.ch14;

public class RunnableExample {
	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.println("1현재 스레드 이름 : " + threadName);
		
		Thread white = new Thread(new WhiteFlag());
		threadName = white.getName();
		System.out.println("2현재 스레드 이름 : " + threadName);
		white.start();
	}
}
