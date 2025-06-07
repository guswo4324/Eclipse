package thisisjava.ch14;

public class Bank {
	private int money;
	
	public int getMoney() {
		return money;
	}
	
//	public void addMoney(int money) {
//		this.money += money;
//	}
	//쓰레드 동기화 시키는 addmoney
	public synchronized void addmoney(int money) {
		this.money += money;
	}
}
