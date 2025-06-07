package thisisjava.ch05;

public class StringindexOf {

	public static void main(String[] args) {
//      String subject = "자바 프로그래밍";
//		int index = subject.indexOf("프로그래밍"); //3번
//		if(index == -1) {
//			System.out.println(index);
//		}
//		else {
//			System.out.println(index+1); //3번이기때문에 + 1한 값 출력
//		}
		
		//.length(),  
        String subject = "자바 프로그래밍 자바12345 자바 6";
        System.out.println("문자열의 길이:"+subject.length()+"\n");
        
        //.indexOf()
        int location = subject.indexOf("프로그래밍"); //location = 3
        System.out.println("프로그래밍이 있는 시작위치:"+location+"\n");
        
        //substring()
        String substring = subject.substring(location);
        System.out.println(substring+"\n");
        
        //.indexOf()
        location = subject.indexOf("자바"); //location = 0 (자바가 처음 시작하는 위치) -> 없으면 -1 값을 가짐
        System.out.println("자바가 있는 시작위치:"+location+"\n");
        
        if(location != -1) {
            System.out.println("자바와 관련된 책이군요\n");
        } else {
            System.out.println("자바와 관련없는 책이군요\n");
        }
        
        String pythonStr = subject.replace("자바", "Python");
        System.out.println("pythonStr:"+pythonStr);
           
	}

}
