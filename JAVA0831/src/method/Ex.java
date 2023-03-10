package method;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 메서드(Method)
		 * - 객체의 동작을 나타내는 최소 단위
		 * 
		 * < 메서드 정의 기본 문법 >
		 * [제한자] 리턴타입 메서드명([매개변수...]) {
		 * 		// 메서드가 호출되었을 때 실행할 코드들...
		 * }
		 * 
		 * 
		 */
		
		//-----------main() 메서드는 현재 Caller 역할을 수행---------
		// 1. 전달인자가 없고, 리턴값도 없는 메서드 호출
		// -> 메서드 호출 시 메서드 이름을 정확하게 명시
		// -> 전달인자가 없으므로, 메서드 호출 시 소괄호()안에 아무 데이터도 명시하지 않음
		System.out.println("동생아! 불 좀 꺼라!");
		sister_1(); // 정의된 sister_1() 메서드 호출
		// -> 메서드 호출 시 코드의 흐름이 메서드 쪽으로 변경됨(일시적)
		// -> 메서드 내부 코드 실행 후 메서드가 종료되면 다시 흐름이 호출한 곳으로 복귀됨
		
		System.out.println("동생이 불을 껐다!");
		
		
		
	} // main() 메서드 끝
	//-------------------Worker 역할의 메서드 정의 위치-----------
	// 1. 전달인자가 없고, 리턴값도 없는 메서드 정의
	// -> 리턴값이 없으므로 리턴타입은 void 라는 특수한 데이터타입을 명시
	// -> void : 메서드 선언부에만 사용가능, 리턴값이 없다는 의미
	public static void sister_1() {
		// sister_1() 메서드가 호출되면 실행할 코드들을 기술...
		System.out.println("동생 : 언니가 불 끄라고 시켜서 불을 껐다!");
	} // 메서드가 종료되면 호출한 곳으로 흐름이 복귀(sister_1() 호출 위치로 되돌아감)
	
	
	
	
	
} // Ex 클래스 끝
