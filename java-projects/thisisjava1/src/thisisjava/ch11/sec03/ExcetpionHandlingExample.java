package thisisjava.ch11.sec03;
//Exception e 모든 에러
public class ExcetpionHandlingExample {

	public static void main(String[] args) {
		String[] array = {"100", "1oo"};
		
		for(int i = 0; i <= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]: " + value);
			} catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			} catch(NullPointerException e) {
				System.out.println("데이터 문제: " + e.getMessage());
			} catch(Exception e) {
				System.out.println("에러: " + e.getMessage());
			}

		}

	}
}