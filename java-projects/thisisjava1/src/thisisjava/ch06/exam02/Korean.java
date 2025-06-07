package thisisjava.ch06.exam02;

public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	
//	public Korean(String name, String ssn) {
//		name = name; //null값 
//		ssn = ssn; //
//	} 
//} 
// -> this 를 쓴다
// -> this.name = name;
// -> this.ssn = ssn;
	
	
	public Korean(String n, String s) {
		this.name = n; 
		this.ssn = s;
	}
	
	public Korean(String name) {
		this.name = name;
	}
}
