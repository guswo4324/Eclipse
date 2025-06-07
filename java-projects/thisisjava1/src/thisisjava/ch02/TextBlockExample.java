package thisisjava.ch02;

public class TextBlockExample {

	public static void main(String[] args) {
		String str1 = "" +
				"{\n" +
				"\t\"id\":\"winter\",\n" +
				"\t\"name\":\"눈송이\"\n" +
				"}";
		
		String str2 = """
		{
			"id":"winter",
			"name":"눈송이"
		}
		""";
		// """ : 이스케이프 없이 그대로 출력 java13
		
		String str3 ="""
		나는 자바를 \
		학습합니다.
		나는 자바 고수가 될 겁니다.
		""";
		// """ \는 줄바꿈 X 이어서 작성 java14
		
		
		System.out.println(str1);
		System.out.println("--------------------------");
		System.out.println(str2);
		System.out.println("--------------------------");
		System.out.println(str3);
	}

}
