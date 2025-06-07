package thisisjava.ch08.sec02;

//abstract 없음
//public abstract interface RemoteControl X
public interface RemoteControl {
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//public 추상 메소드
	public void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//가져다 쓰는거 필수아님 public void setMute() { }
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
			setVolume(0);
		}
		else {
			System.out.println("무음 해제합니다");
		}
	}
	
	//정적 메소드
	static void changeBattery() {
		System.out.println("리모컨 건전지를 교환합니다");
	}
}
