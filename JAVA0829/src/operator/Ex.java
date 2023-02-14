package operator;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 비교 연산자 (관계 연산자) ( >, >=, <=, <, ==, !=)
		 *  - 두 피연산자 간의 대소 관계 등을 비교하여 true 또는 false 값을 리턴
		 *  != (=서로 다르면 true, 같으면 false)
		 */
		
		int a = 10, b = 5;
		
		System.out.println("a > b 인가? " + (a > b));
		System.out.println("a >= b 인가? " + (a >= b));
		System.out.println("a < b 인가? " + (a < b));
		System.out.println("a <= b 인가? " + (a <= b));
		System.out.println("a == b 인가? " + (a == b));
		System.out.println("a != b 인가? " + (a != b));
		
		boolean result = a > b; // a > b 의 결과(true)를 boolean 타입 result 에 저장
		System.out.println(result);
		
		
		System.out.println("====================================");
		
		
		// char 타입끼리 비교 시 int 타입으로 변환 후 비교 (유니코드 값 비교)
		System.out.println('A' > 'B'); //65 > 66 비교
		System.out.println('A' == 65); 
		
		// 주의! 실수 표현 double 타입과 float 타입 비교시
		// float 타입을 double 타입으로 변환 후 비교를 수행하는데
		// 실수 근사치 표현에 의해 잘못된 연산 결과가 발생할 수 있음.
		System.out.println(0.1);
		System.out.println(0.1f);
		System.out.println(0.1 == 0.1f); // 근사치 표현법에 의해 다른값으로 표현됨
		System.out.println((float)0.1 == 0.1f); // 타입을 float으로 동일하게 맞춰줌
		
		System.out.println("======================================");
		
		// 다른 연산과 관계 연산자를 결합하여 연산 결과의 대소 관계 판별 가능
		System.out.println(a + b > a - b); // 15 > 5 - true
		
		
		
		
		
		
		
	}

}
