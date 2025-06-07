package thisisjava.ch11.sec06;

public class InsufficientException extends Exception{
	//기본생성자
	public InsufficientException(){
	
	}
	//예외 메시지를 입력받는 생성자
	public InsufficientException(String message) {
		//string message
		super(message);
	}
}
