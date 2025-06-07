package thisisjava.ch05;

public class Stringsubstring {

	public static void main(String[] args) {
		//.substring()
        String ssn = "880815-1234567";
        
        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);        
        
        String secondNum = ssn.substring(7);
        System.out.println(secondNum);

	}

}
