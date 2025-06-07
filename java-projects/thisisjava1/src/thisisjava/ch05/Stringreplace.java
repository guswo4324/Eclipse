package thisisjava.ch05;

public class Stringreplace {

	public static void main(String[] args) {
		 //.replace()
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        String newStr = oldStr.replace("자바", "JAVA");
        
        System.out.println(oldStr);
        System.out.println(newStr);

	}

}
