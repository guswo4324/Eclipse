package thisisjava.ch12.sec05;

import java.util.Calendar;

public class Ex12_4 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("오늘 날짜는 " + year +"년 "+ month +"월 "+ day + "일\n");
		
		// 기본적으로 현재날짜와 시간으로 설정된다. 
        Calendar today = Calendar.getInstance(); 
        System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR)); 
        System.out.println("월(0~11, 0:1월): " + today.get(Calendar.MONTH)); 
        System.out.println("이 해의 몇 째 주: " + today.get(Calendar.WEEK_OF_YEAR)); 
        System.out.println("이 달의 몇 째 주: " + today.get(Calendar.WEEK_OF_MONTH)+"\n"); 
        
        // DATE와 DAY_OF_MONTH는 같다. 
        System.out.println("이 달의 몇 일: " + today.get(Calendar.DATE)); 
        System.out.println("이 달의 몇 일: " + today.get(Calendar.DAY_OF_MONTH)); 
        System.out.println("이 해의 몇 일: " + today.get(Calendar.DAY_OF_YEAR)+"\n");
        
        // 1:일요일, 2:월요일, ... 7:토요일 
        System.out.println("요일(1~7, 1:일요일): "    + today.get(Calendar.DAY_OF_WEEK)); 
        System.out.println("이 달의 몇 째 요일: "     + today.get(Calendar.DAY_OF_WEEK_IN_MONTH)); 
        System.out.println("오전_오후(0:오전, 1:오후): "    + today.get(Calendar.AM_PM)); 
        System.out.println("시간(0~11): " + today.get(Calendar.HOUR)); 
        System.out.println("시간(0~23): " + today.get(Calendar.HOUR_OF_DAY)); 
        System.out.println("분(0~59): " + today.get(Calendar.MINUTE)); 
        System.out.println("초(0~59): " + today.get(Calendar.SECOND)); 
        System.out.println("1000분의 1초(0~999): " + today.get(Calendar.MILLISECOND)+"\n"); 
        
        // 천분의 1초를 시간으로 표시하기 위해 3600000으로 나누었다.(1시간 = 60 * 60초) 
        System.out.println("TimeZone(-12~+12): " + (today.get(Calendar.ZONE_OFFSET)/(60*60*1000))); 
        System.out.println("이 달의 마지막 날: " + today.getActualMaximum(Calendar.DATE));
        System.out.println("\n-------------------------------------------------------------------\n");
        
        // 요일은 1부터 시작하기 때문에, DAY_OF_WEEK[0]은 비워두었다. 
        final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"}; 
        Calendar date1 = Calendar.getInstance(); 
        Calendar date2 = Calendar.getInstance(); 
        
        // month의 경우 0부터 시작하기 때문에 4월인 경우, 3로 지정해야한다. 
        // date1.set(2019, Calendar.APRIL, 29);와 같이 할 수도 있다. 
        
        // 2019년 4월 29일로 날짜를 설정한다. 
        date1.set(2019, 3, 29); 
        System.out.println("그날(date1)은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"요일이고,"); 
        System.out.println("오늘(date2)은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"요일입니다."); 
        // 두 날짜간의 차이를 얻으려면, getTimeInMillis() 천분의 일초 단위로 변환해야한다. 
        long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000; 
        System.out.println("그날(date1)부터 지금(date2)까지 " + difference +"초가 지났습니다."); 
        System.out.println("일(day)로 계산하면 "+ difference/(24*60*60) +"일입니다."); // 1일 = 24 * 60 * 60
        
        // 큰 단위를 앞에 놓는다. 
        final int[] TIME_UNIT = {3600, 60, 1}; 
        final String[] TIME_UNIT_NAME = {"시간 ", "분 ", "초 "}; 
        Calendar time1 = Calendar.getInstance(); 
        Calendar time2 = Calendar.getInstance(); 
        
        // time1을 10시 20분 30초로 설정 
        time1.set(Calendar.HOUR_OF_DAY, 10); 
        time1.set(Calendar.MINUTE, 20); 
        time1.set(Calendar.SECOND, 30);
        
        // time2을 20시 30분 10초로 설정 
        time2.set(Calendar.HOUR_OF_DAY, 20); 
        time2.set(Calendar.MINUTE, 30); 
        time2.set(Calendar.SECOND, 10); 
        
        System.out.println("\n-------------------------------------------------------------------\n");
       
        System.out.println("time1 :"+time1.get(Calendar.HOUR_OF_DAY)+"시 " 
                                    +time1.get(Calendar.MINUTE)+"분 "
        		                    +time1.get(Calendar.SECOND)+"초"); 
        System.out.println("time2 :"+time2.get(Calendar.HOUR_OF_DAY)+"시 " 
                                    +time2.get(Calendar.MINUTE)+"분 "
        		                    +time2.get(Calendar.SECOND)+"초"); 
        long difference2 = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis())/1000; 
        System.out.println("time1과 time2의 차이는 "+ difference2 +"초 입니다."); 
        
        String tmp = ""; 
//      final int[] TIME_UNIT = {3600, 60, 1}; 
//      final String[] TIME_UNIT_NAME = {"시간 ", "분 ", "초 "}; 
        for(int i=0; i < TIME_UNIT.length;i++) { 
            tmp += String.valueOf(difference2/TIME_UNIT[i]) + TIME_UNIT_NAME[i]; 
            difference2 %= TIME_UNIT[i]; 
        } 
        System.out.println("시분초로 변환하면 " + tmp + "입니다."); 
    } 
        
    public static String toString(Calendar date) { 
        return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1) +"월 " + date.get(Calendar.DATE) + "일 "; 
    }
}
	


