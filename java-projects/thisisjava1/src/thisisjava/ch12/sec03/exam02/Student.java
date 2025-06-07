package thisisjava.ch12.sec03.exam02;

public class Student {
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() { return no;}
	public String getName() { return name;}
	
	//hashCode()를 같게 해주는 코드
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
}
