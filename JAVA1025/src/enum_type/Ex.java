package enum_type;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 상수를 사용하여 한정된 데이터를 관리하는 경우
		 * 간편한 선언을 통해 관리할 수 있다는 장점이 있으나
		 * 해당 값의 범위를 벗어나느 값을 사용할 경우 컴파일 시점에서
		 * 오류 발견이 불가능!
		 * 추가적인 작업을 통해 범위 내의 값인지 판별하는 작업이 별도로 필요함!
		 * => 이를 해결하기 위해 열거형(enum type) 필요
		 * 
		 *  열거형(Enumeration Type = Enum 타입)
		 * - 상수를 좀 더 확실한 형태로 다루기 위한 객체의 일종
		 * - 데이터타입이 일치하면 다른 데이터라도 사용 가능한 상수의 단점을 해결
		 * - enum 타입은 내부적으로 java.lang.Enum 클래스를 상속받음
		 * 
		 * < 열거타입 정의 방법 >
		 * [접근제한자] enum 열거타입명 {
		 * 		// 열거타입에서 사용할 값(상수)을 차례대로 나열
		 * 		상수1, 상수2, ... 상수 n
		 * }
		 * 
		 * - 기본적으로 클래스, 인터페이스 정의 문법과 유사함
		 *   단, 열거타입 중괄호 내에는 상수로 사용될 이름만 지정 
		 *   
		 * < 열거타입 사용방법 >
		 * 1. 열거타입 변수 선언 방법(클래스, 인터페이스와 동일)
		 *    열거타입명 변수명
		 *    ex) EnumWeek today
		 *    
		 * 2. 열거타입 비교 방법
		 * - if문을 사용 시 동등비교 연산자 사용(==)
		 * - switch문 사용 가능 (단, case 문에서 열거타입명 없이 상수만 지정 필수!)
		 *   switch(열거타입변수) {
		 *   	case 열거타입상수1 : 수행할 작업들...;
		 *   	case 열거타입상수2 : 수행할 작업들...;
		 *   	case 열거타입상수n : 수행할 작업들...;
		 * 	 }
		 *   
		 */
		
		BadWeek badWeek = new BadWeek();
		
		// Setter를 호출하여 파라미터로 요일 전달 시 정확한 정수값을 몰라도
		// 상수 호출만으로 해당 정수사용 및 전달 가능
		badWeek.setMyWeek(BadWeek.WEEK_TUESDAY); // 화요일(1) 설정
	
		if(badWeek.getMyWeek() == BadWeek.WEEK_TUESDAY) {
			System.out.println("오늘은 화요일 입니다!");
		}
		
		// 요일 정보를 상수로 관리하는 경우의 문제점
		// 10이라는 정수값을 갖는 요일이 없으나 int 타입 파라미터 이므로
		// 컴파일 시점에서는 아무런 문제가 발생하지 않음!
		badWeek.setMyWeek(10);
		
		System.out.println("----------------------------------------------------------");
		
		// 열거타입 변수 today 선언 및 초기화 후 호출
		EnumWeek today = EnumWeek.FRIDAY;
		System.out.println(today);
		
		// 열거 타입을 활용하는 클래스 사용
		GoodWeek gw = new GoodWeek();
		gw.setMyWeek(today);
		System.out.println("오늘의 요일 : " + gw.getMyWeek());
		
		gw.setMyWeek(EnumWeek.FRIDAY);
		System.out.println("오늘의 요일 : " + gw.getMyWeek());
		
		// EnumWeek 타입 객체는 Enum 클래스의 서브 클래스 타입 객체인지 판별
		if(today instanceof Enum) {
			System.out.println("Enum 클래스의 서브클래스이다!");
		} else {
			System.out.println("Enum 클래스의 서브클래스가 아니다!");
		}
		
		if(today instanceof Object) {
			System.out.println("Object 클래스의 서브클래스이다!");
		} else {
			System.out.println("Object 클래스의 서브클래스가 아니다!");
		}
		
		System.out.println("----------------------------------------------------------");
		
		// 열거 타입 사용시 장점
		// -> 정의 시 지정된 상수 외의 다른값은 절대 전달 불가능!!
//		gw.setMyWeek(5);
//		gw.setMyWeek("MONDAY");
		// 반드시 '열거타입명.상수명' 으로 지정된 값만 전달 할 수 있음!
		gw.setMyWeek(EnumWeek.SATURDAY); // 열거타입명.상수명 형태로만 전달 가능
		
		
	}// main

}// Ex 클래스

// 열거타입 정리
//열거형 정의 시 중괄호 내에는 값을 갖는 상수 이름만 나열함 (별도의 값을 지정하지 않는다!)
enum EnumWeek {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum EnumMonth {
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

// 열거타입을 사용하는 클래스 정의
class GoodWeek {
	EnumWeek myWeek; // 열거타입명 로컬변수로 변수 선언 가능

	public EnumWeek getMyWeek() {
		return myWeek;
	}

	public void setMyWeek(EnumWeek myWeek) {
		this.myWeek = myWeek;
	}
	
}


// 요일 정보를 관리하는 BadClass 클래스 정의
// -> 요일은 7가지로 정해져 있으므로 상수로 처리 가능
// 요일 정보를 상수로 관리 : 외부에서 실제 데이터를 정확하게 알지 못해도
//							상수명(변수명)만으로 접근 가능, 
//							또한 값 변경 불가해서 안전
class BadWeek {
	
	public static final int WEEK_MONDAY = 0;
	public static final int WEEK_TUESDAY = 1;
	public static final int WEEK_WEDNESDAY = 2;
	public static final int WEEK_THURSDAY = 3;
	public static final int WEEK_FRIDAY = 4;
	public static final int WEEK_SATURDAY = 5;
	public static final int WEEK_SUNDAY = 6;
	
	private int myWeek;

	public int getMyWeek() { // alt + shift + s + r
		return myWeek;
	}

	public void setMyWeek(int myWeek) { // -21 ~ 21억 범위내의 숫자면 오류나지 않음
//		this.myWeek = myWeek;
		
		// 요일에 대한 정상 범위 판별 없이 저장작업을 수행할 경우
		// 실제 저장된 요일을 꺼내서 사용하는 시점에서는 문제가 발생할 수 있다!
		// 따라서, 조건문 등을 사용하여 전달받은 파라미터에 대한 검증이 추가적으로 필요함
		
		if(myWeek >= WEEK_MONDAY && myWeek <= WEEK_SUNDAY) { // 조건 설정
			this.myWeek = myWeek;
		} else { // 별도의 처리과정 필요
			System.out.println("요일 입력 에러!");
		}
		
	}// setMyWeek
	
}// BadWeek 클래스

































