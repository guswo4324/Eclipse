package thisisjava.ch05;

public class Stringsplit {
	public static void main(String[] args) {
		String board = "1,자바학습,참조타입 String을 학습합니다.,심남희";
	        
	    //.split()
	    String[] tokens = board.split(",");        
	        
	    //인덱스별로 읽기
	    System.out.println("번호: " + tokens[0]);
	    System.out.println("제목: " + tokens[1]);
	    System.out.println("내용: " + tokens[2]);
	    System.out.println("쓴이: " + tokens[3]);
	    System.out.println();
	        
	    for(int i=0; i<tokens.length; i++) {
	    	System.out.print(tokens[i]+" ");
	    }
	    
	    System.out.println("");
	    String board2 = "1:자바학습:참조타입 String을 학습합니다.:둘리";
	    
	    String[] A = board2.split(":");
	    
	    for(int j = 0; j < A.length; j++) {
	    	System.out.println(A[j]);
	    }
	    

	}

}
