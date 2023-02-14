package constructor_overloading;

public class Test {

	public static void main(String[] args) {

		MyDate m = new MyDate();
		System.out.printf("%d/%d/%d\n", m.year,m.month,m.day);
		
		MyDate m1 = new MyDate(1999);
		System.out.printf("%d/%d/%d\n", m1.year,m1.month,m1.day);
		
		MyDate m2 = new MyDate(1999,12);
		System.out.printf("%d/%d/%d\n", m2.year,m2.month,m2.day);	
		
		MyDate m3 = new MyDate(1999,12);
		System.out.printf("%d/%d/%d\n", m3.year,m3.month,m3.day);	
	}

}//Test 클래스 끝


/*
 * 날짜를 관리하는 MyDate 클래스 정의
 * - 멤버변수 : 연도(year, 정수), 월(month, 정수), 일(day, 정수)
 * - 생성자
 *   1) 기본 생성자 : 2022년 9월 8일로 초기화
 *   2) 파라미터 생성자
 *      2-1. 연도(year)를 전달받아 초기화하고, 9월 8일로 초기화
 *      2-2. 연도(year), 월(month)을 전달받아 초기화하고 8일로 초기화
 *      2-3. 연도(year), 월(month), 일(day)을 전달받아 초기화
 */

class MyDate{
	int year;
	int month;
	int day;
	
//	public void date() {
//		System.out.println("2022년 9월 8일");
//	}
	
	public MyDate() {
		System.out.println("MyDate() 생성자 호출됨!");
		year = 2022;
		month = 9;
		day = 8;
//		System.out.printf("%d년 %d월 %d일\n", year, month, day);
	}
	
	public MyDate(int newYear) {
		System.out.println("MyDate(int) 생성자 호출됨!");
		year = newYear;
		month = 9;
		day = 8;
//		System.out.printf("%d년 %d월 %d일\n", newYear, month, day);
	}
	
	public MyDate(int newYear, int newMonth) {
		System.out.println("MyDate(int, int) 생성자 호출됨!");
		year = newYear;
		month = newMonth;
		day = 8;
//		System.out.printf("%d년 %d월 %d일\n", newYear, newMonth, day);
	}
	
	public MyDate(int newYear, int newMonth, int newDay) {
		System.out.println("MyDate(int, int, int) 생성자 호출됨!");
		year = newYear;
		month = newMonth;
		day = newDay;
//		System.out.printf("%d년 %d월 %d일\n", newYear, newMonth, newDay);
	}
	
	
	
	
	
}


