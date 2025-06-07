package thisisjava.ch05;

public class Stringlength {

	public static void main(String[] args) {
		
		//.length()
		String ssn = "9506241230123";
		int length = ssn.length();
        System.out.println("length:"+length);
        if(length == 13) {
            System.out.println("주민번호 자리수가 맞습니다.");
        } else {
            System.out.println("주민번호 자리수가 틀립니다.");
        }

	}

}
