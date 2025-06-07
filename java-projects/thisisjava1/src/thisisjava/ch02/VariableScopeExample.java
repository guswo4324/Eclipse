package thisisjava.ch02;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		System.out.println("v1: "+ v1+"\n");
		
		if(v1>10) {
			int v2 = v1 - 10;
			System.out.println("v1: "+v1);
			System.out.println("v2: "+v2+"\n");
		}
		System.out.println("v1: "+v1+"\n");
		
		int v3 = 100;
		System.out.println("v3: "+v3);

	}

}
