package test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dang_dateFormat {

	public static void main(String[] args) {
		 // 현재 날짜 구하기
        LocalDate now = LocalDate.now();
 
        // 포맷 정의
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMdd00");
        
 
        // 포맷 적용
//        String formatedNow = now.format(formatter);
        int formatedNow = Integer.parseInt(now.format(formatter));
        
        // 결과 출력
        System.out.println(formatedNow);  // 2021/06/17
        int order_number = (formatedNow+4+5+0);
        System.out.println(order_number); //230105+9
        
        
        
        
	}

}
