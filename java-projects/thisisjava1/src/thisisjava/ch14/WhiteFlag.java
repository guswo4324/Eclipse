package thisisjava.ch14;

public class WhiteFlag implements Runnable{
	public void run() {
		int i = 0;
		while(true) {
			if(i > 100) break;
			System.out.println(i+ " 백기 올려");
			i++;
		}
		String threadName = Thread.currentThread().getName();
		System.out.println("WhiteFlag 현재 스레드 이름 : " + threadName);
	}
	
}
