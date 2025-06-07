package thisisjava.ch02;

public class IntegerLiteralExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 0b1011; //2진수
		int var2 = 0206;   //8진수 = 2*8^2 + 6*8^0 = 134
		int var3 = 300;    //10진수
		int var4 = 0xB3;   //16진수 = 11(B)*16^1 + 3*16^0 = 179
		
		System.out.println("var1:"+var1);
		System.out.println("var2:"+var2);
		System.out.println("var3:"+var3);
		System.out.println("var4:"+var4);
	}

}
