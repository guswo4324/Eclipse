package thisisjava.ch02;

public class FloatDoubleExample {

	public static void main(String[] args) {
		float var1 = 0.1234567890123456789f; //소수점 8자리(9자리에서 반올림)
		double var2 = 0.1234567890123456789; //소수점 17자리(18자리에서 반올림)
		
		System.out.println("var1: "+var1);
		System.out.println("var2: "+var2);
		
		double var3 = 3e6;
		float var4 = 3e6F; // == 3e6f
		double var5 = 2e-3;
		
		System.out.println("var3: "+var3);
		System.out.println("var4: "+var4);
		System.out.println("var5: "+var5);

	}

}
