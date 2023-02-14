package variable;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 변수(Variable)
		 * - 프로그램에서 사용되는 데이터를 저장하는 임시 메모리 공간
		 * - 변수(메모리 공간)는 한 번에 하나의 데이터만 저장 가능하며,
		 *   새로운 데이터를 저장하면 기존의 데이터는 제거됨
		 * - 변수를 사용하기 위해서는 반드시 변수를 선언한 후에 데이터 저장 가능
		 * - 변수에 데이터를 저장하는 작업을 변수 초기화라고 함
		 *   => 변수 초기화 작업 없이는 변수 사용 불가능
		 * - 변수 선언 과정에서 변수명은 식별자 작성 규칙을 따름
		 * 
		 * < 변수 선언 기본 문법 >
		 * 데이터타입 변수명;   
		 * 
		 * < 변수 초기화 기본 문법 >
		 * 변수명 =t이터; // 우변의 데이터를 좌변의 변수에 저장(= 대입 = 초기화)
		 * 
		 * < 변수 사용법 >
		 * 변수 사용을 위해서는 특정 작업에 변수명을 지정하면
		 * 해당 변수에 저장된 값을 사용할 수 있다!
		 */
		
		// 변수 선언
		int a; // int형 데이터(정수)를 저장할 공간을 생성하고, 공간의 이름을 a 로 지정
		// => 메모리 공간에 a 라는 공간이 생성되므로 데이터 저장이 가능해진다!
		
		// 변수 초기화(반드시 변수 선언 후에 초기화 가능)
		a = 10; // int형 변수 a 에 정수형 데이터(= 리터럴) 10 을 저장(대입) = 초기화
		// => 주의! 변수 선언(int a;) 없이 초기화 또는 접근 시 오류 발생!
		//    (오류메세지 : a cannot be resolved to a variable)
		
		// 변수에 접근하여 저장된 값을 출력하기(반드시 초기화 후에 사용 가능) 
		System.out.println(a); // 정수 10 출력됨
		// => 주의! 초기화를 수행하지 않은 채로 변수 값에 접근 시 오류 발생!
		//    (오류 메세지 : The local variable a may not have been initialized)
		
		// ------------------------------------------------------------------------
		// 변수에 새로운 값(데이터)을 저장하면 기존의 값(데이터)은 제거됨
		a = 99; // 기존에 저장된 정수 10을 버리고, 새로운 정수 99 로 교체(= 초기화)
		System.out.println(a); // 교체된 정수 99 출력됨
		
		// ========================================================================
		/*
		 * 식별자 작성 규칙
		 * < 필수 >
		 * 1. 첫 글자는 숫자로 시작할 수 없음(7eleven 사용 불가)
		 * 2. 특수문자는 $ 와 _ 만 사용 가능(my-name 사용 불가)
		 * 3. 대소문자 구별(name 과 NAME 은 서로 다른 이름으로 사용 가능)
		 * 4. 예약어(키워드, Keyword) 사용 불가
		 *    => 자바에서 미리 선점(예약)해 놓은 이름
		 * 5. 공백 포함 불가
		 * 6. 길이 제한 없음
		 * 
		 * < 선택 >
		 * 1. 의미가 있는 단어 사용
		 * 2. 단어의 조합을 사용할 경우 두번째 단어부터 첫 글자는 모두 대문자 사용
		 *    => Camel-case 표기법
		 *    ex)학생이름을 변수로 작성 시 studentName
		 * 3. 한글 사용은 가능하지만 사용하지 않음.
		 *   
		 */
		
		
		
	}

}










