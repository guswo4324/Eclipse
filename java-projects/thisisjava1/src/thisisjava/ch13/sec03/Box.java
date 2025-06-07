package thisisjava.ch13.sec03;

public class Box<T> {
	private T t;
	
	//Getter 메소드
	public T get() {
		return t;
	}
	
	//Setter 메소드
	public void set(T t) {
		this.t = t;
	}
}
