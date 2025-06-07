package thisisjava.ch02;

public class Example250302_8 {

	public static void main(String[] args) {
	
		double pizza20 = 3.141592 * 20 * 20*2;
		double pizza30 = 3.141592 * 30 * 30;
		System.out.println("20cm 피자 2개의 면적은"+pizza20);
		System.out.println("30cm 피자 1개의 면적은"+pizza30);
		String result = (pizza20 < pizza30) ? "30cm 피자 1개를 주문 하는게 더 좋아요~~~" : ("20cm 피자 2개를 주문하는건 손해에요~~~~~");
		System.out.println(result);

	}

}
