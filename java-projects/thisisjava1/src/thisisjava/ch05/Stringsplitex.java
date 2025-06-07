package thisisjava.ch05;

public class Stringsplitex {

	public static void main(String[] args) {
		//.split
	    String board2 = "1:자바학습:참조타입 String을 학습합니다.:둘리";
	    
	    String[] A = board2.split(":");
	    
	    for(int j = 0; j < A.length; j++) {
	    	System.out.println(A[j]);
	    }

	}

}
