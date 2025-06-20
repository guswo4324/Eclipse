package study;

public class StringStudy {

	public static void main(String[] args) {
		String ssn = "9506241230123";

		// .charAt()
		char sex = ssn.charAt(6);
		System.out.println("ssn.charAt(6): " + sex);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다");
			break;
		}

		// .length
		int length = ssn.length();
		System.out.println("length:" + length);
		if (length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}

		// .replace()
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");

		System.out.println(oldStr);
		System.out.println(newStr);

		// .substring()
		ssn = "880815-1234567";

		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);
		System.out.println(secondNum);

		// .substring()
		String subject = "자바 프로그래밍 자바12345 자바 6";
		System.out.println("문자열의 길이:" + subject.length());
		int location = subject.indexOf("프로그래밍");
		System.out.println("프로그래밍 이 있는 시작위치:" + location);
		String substring = subject.substring(location);
		System.out.println(substring);

		// .indexOf()
		location = subject.indexOf("자바");
		System.out.println("자바가 있는 시작위치:" + location);
		if (location != -1) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}

		String pythonStr = subject.replace("자바", "Python");
		System.out.println("pythonStr:" + pythonStr);

		// .contains()
		boolean result = subject.contains("자바");
		if (result) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}

		String board = "1,자바학습,참조타입 String을 학습합니다.,심남희";

		// .split()
		String[] tokens = board.split(",");

		// 인덱스별로 읽기
		System.out.println("번호: " + tokens[0]);
		System.out.println("제목: " + tokens[1]);
		System.out.println("내용: " + tokens[2]);
		System.out.println("쓴이: " + tokens[3]);
		System.out.println();

		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}

}
