package thisisjava.ch12.sec05;

public class Ex12_2 {

	public static void main(String[] args) {
		
		//Math.ceil()
		System.out.println("3.51 올림 : " + Math.ceil(3.51));
		//Math.floor()
		System.out.println("13.61 버림 : " + Math.floor(13.61));
		//Math.round
		System.out.println("12.8 반올림 : " + Math.round(12.8));
		//Math.abs()
		System.out.println("절대값 1 : " + Math.abs(-4.55));
		System.out.println("절대값 2 : " + Math.abs(-59));    
		//Math.max(a,b) Math.min(a,b)
		System.out.println("40, 70 최소값 : " + Math.max(30, 60));
		System.out.println("30, 60 최대값 : " + Math.min(40,  70));
	}

}
