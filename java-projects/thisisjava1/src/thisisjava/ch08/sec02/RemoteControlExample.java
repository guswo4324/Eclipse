package thisisjava.ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		
		//rc 변수에 Television 객체를 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		System.out.println();
		rc.setMute(true);
		rc.setMute(false);
		System.out.println();
		
		//Audio 객체 생성하고 인터페이스 변수에 대입
		rc = new Audio();                  
		rc.turnOn();       
		rc.setVolume(3);
		rc.turnOff();
		
		System.out.println();
		RemoteControl.changeBattery();
		
//		System.out.println("리모콘 최대 볼륨 : " +  RemoteControl.MAX_VOLUME);
//		System.out.println("리모콘 최저 볼륨 : " + RemoteControl.MIN_VOLUME);
		
	}

}
