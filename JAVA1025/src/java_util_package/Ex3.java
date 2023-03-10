package java_util_package;

import java.util.Calendar;
import java.util.Date;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * Calendar 클래스
		 * - 주로 날짜 및 시각을 조작하는 용도의 클래스(표현도 가능)
		 * - 추상클래스이므로 인스턴스 생성없이 제공되는 인스턴스를
		 *   static 메서드인 getInstance() 메서드로 리턴받아 사용
		 * - get() 메서드로 날짜 및 시각 정보를 조회하고,
		 *   set() 메서드로 날짜 및 시각 정보를 설정(조작)함
		 *   => 파라미터로 날짜 및 시각 모두 설정을 위한 상수 사용
		 */
		
//		Calendar cal = new Calendar(); // 추상클래스라 인스턴스 생성 불가
		Calendar cal = Calendar.getInstance();
		// -> 현재 시스템 날짜 및 시각 정보 리턴
		System.out.println(cal);
		
		// Calendar 인스턴스의 get() 메서드를 사용하여 정보 조회
		// 
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // 0 ~11 까지 사용이라 +1 필요
//		int day = cal.get(Calendar.DATE); // 아래와 동일
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "년" + month + "월"  + day +"일");
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.println(hour + "시" + min + "분" + sec + "초");
		
		// Calendar <-> Date 상호 변환
		// 1. Calendar -> Date 로 변환 시
		//    Calendar 객체의 getTime() 메서드를 호출하여 Date 타입 리턴
		
		Date date = cal.getTime();
		System.out.println(date);
		
		// 2. Date -> Calendar 로 변환 시
		//    Calendar 객체가 존재하는 상태에서 setTime() 메서드를 호출하여
		//    Date 타입 객체를 파라미터로 전달
		Calendar cal2 = Calendar.getInstance();
	   cal2.setTime(date);
	    
		System.out.println("====================================================");
		
		// set() 메서드를 사용하여 날짜 및 시각 정보 설정
		cal2.set(1999, 11, 31); // 연, 월, 일 직접 전달
		// -> 월은 0 ~ 11 값을 사용하므로 설정할 때는 -1 필요
		System.out.println(cal2.getTime());
		
//		각 항목을 별도로 변경할 때는 set(int field, int value) 메서드 사용
		// -> field 항목은 get() 메서드와 마찬가지로 Calendar.XXX 상수 사용
		 cal2.set(Calendar.YEAR, 2010); // 2010년으로 설정
		 cal2.set(Calendar.MONTH, 4); // 5월로 설정
		 
		 Date date2 = cal2.getTime();
		 System.out.println(date2);
		
	}

}
