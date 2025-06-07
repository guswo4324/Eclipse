package thisisjava.ch12.sec05;

import java.util.Calendar;
import java.util.Scanner;

public class Ex12_5 {
	public static void main(String[] args) {
		// Calendar 객체 생성 (오늘의 정보)
        Calendar cal = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("연도를 입력하세요");
        int year = sc.nextInt();
        
        System.out.println("월을 입력하세요");
        int month = sc.nextInt();
        
        // Calendar 클래스는 월의 시작이 0부터 시작
        cal.set(year, month - 1, 1);
        
        System.out.print("일\t월\t화\t수\t목\t금\t토\n");
        // 달의 마지막 날짜를 구함
        int lastOfDate = cal.getActualMaximum(Calendar.DATE);
        // 지정한 달의 시작하는 요일을 구함
        int week = cal.get(Calendar.DAY_OF_WEEK);
        
        //DAY_OF_WEEK = 3
        //WEEK = 3
        // 달력 시작 날의 주말 처리
        for(int i = 1; i < week; i++) {
            System.out.print("\t");
        }
        
        for(int i = 1; i <= lastOfDate; i++) {
            System.out.print(i+"\t");
            // 토요일에 날짜를 표시하고 줄 바꿈 하는 코드
            if(week % 7 == 0) {
                System.out.println();
            }
            week++;
        }
        
        sc.close();
	}
}
