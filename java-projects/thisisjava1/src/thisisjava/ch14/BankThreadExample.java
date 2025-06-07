package thisisjava.ch14;

class AddThread implements Runnable{
	private Bank b;
	private String name;
	
	public AddThread(String name, Bank b) {
		this.name = name;
		this.b = b;
	}
	
	public void run() {
		try {
			for(int i = 0; i < 10; i++) {
				Thread.sleep(1000); //sleep(1000) ->1초동안 / sleep(1) -> 1ms
				b.addmoney(1000);
				System.out.println(this.name + "현재 잔고 : " + b.getMoney());
				String threadName = Thread.currentThread().getName();
				System.out.println("AddThread 스레드 이름 : " + threadName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class BankThreadExample {

	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.println("1현재 스레드 이름 : " + threadName);
		
		Bank b = new Bank();
		Thread th1 = new Thread(new AddThread("1번 ", b));
		threadName = th1.getName();
		System.out.println("2현재 스레드 이름 : " + threadName);
		
		Thread th2 = new Thread(new AddThread("2번 ", b));
		threadName = th2.getName();
		System.out.println("3현재 스레드 이름 : " + threadName);
		
		th1.start();
		th2.start();
	}

}
