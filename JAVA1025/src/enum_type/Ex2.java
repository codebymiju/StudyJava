package enum_type;

public class Ex2 {

	public static void main(String[] args) {
		/*
		* enum 상수 연산 및 메서드
		 * - enum 상수 값은 동등비교연산자(==)로 일치 여부 비교 가능하며,
		 *   switch ~ case 문에서도 enum 타입 비교가 가능함.
		 * - enum 타입 상수에는 각각 ordinal(순서번호) 값이 자동 부여됨
		 *   => 0부터 부여됨
		 *   => enum 객체의 ordinal() 메서드를 통해 얻을 수 있음.
		 */
		
		// 같은 패키지 안에 있어서 사용 가능 (접근제한자 붙이지 않음 = default)
		EnumWeek today = EnumWeek.FRIDAY; 
		
		if(today == EnumWeek.FRIDAY) {
			System.out.println("금요일입니다.");
		} else {
			System.out.println("금요일이 아닙니다.");
		}
		
		// enum 타입 객체는 switch 문에 전달 가능함
		switch (today) {
			// 주의! EnumWeek.Monday (enum타입명.상수명)이 아닌 상수 자체를 비교
			case MONDAY : System.out.println("월요일입니다!"); break;
			case TUESDAY : System.out.println("화요일입니다!"); break;
			case WEDNESDAY : System.out.println("수요일입니다!"); break;
			case THURSDAY : System.out.println("목요일입니다!"); break;
			case FRIDAY : System.out.println("금요일입니다!"); break;
			case SATURDAY : System.out.println("토요일입니다!"); break;
			case SUNDAY : System.out.println("일요일입니다!"); break;
		}// switch
		
		System.out.println("---------------------------------------------------------------");
		
		// ordinal() : 상수의 순서번호를 정수로 리턴
		System.out.println("오늘의 ordinal 값 : " + today.ordinal()); // today = friday로 지정해서 4로 나옴
		
		if(today.ordinal() < 4) {
			System.out.println("주말은 언제 올까?");
		} else if(today.ordinal() == 4) {
			System.out.println("오늘은 금요일! 불금!");
		} else {
			System.out.println("주말이다주말이다주말이다");
		}
		
		// name() : 상수명을 문자열로 리턴
		//Enum타입과 string타입이라 String 타입 변수에 넣으려면 변환필요
		String strToday = today.name();
		System.out.println(strToday);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// main()
}// Ex2 클래스
