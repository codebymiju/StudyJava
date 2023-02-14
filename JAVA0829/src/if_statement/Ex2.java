package if_statement;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 *  2. if ~ else 문
		 *  - 조건식 판별 결과가 true 일 때와 false 일 때 서로 다른 블록을 실행
		 *  - 삼항연산자와 유사한 형태로 수행되나 삼항연산자보다 유연함
		 *    (조건식 판별 결과에 따라 실행 가능한 문장이 더 다양함)
		 *  
		 * < 기본 문법 >
		 * 문장 1; (무조건 수행)
		 * 
		 * if(조건식) {
		 * 		문장2; // 조건식 결과가 true 일 때 실행할 문장들...
		 * } else {
		 * 		문장3; // 조건식 결과가 false 일 때 실행할 문장들...
		 * }
		 *  
		 *  문장 4;
		 *  
		 *  -> 조건식 판별 결과 true  : 문장 1 -> 조건식 (true ) -> 문장 2 -> 문장 4
		 *  -> 조건식 판별 결과 false : 문장 1 -> 조건식 (false) -> 문장 3 -> 문장 4
		 *  
		 */
		
		// 정수 num에 대한 절대값 계산
		int num = -5; // 문장 1
		
		if(num < 0) { // 조건식
			// 조건식 결과가 true 일 때 실행할 문장들...
			System.out.println("num이 음수이므로 양수로 변환!"); // 문장2
			num = -num;
		} else { 
			// 조건식 결과가 false 일 때 실행할 문장들...
			System.out.println("num이 양수이므로 변환 생략!"); // 문장 3
		}
		
		System.out.println("num의 절대값 : " + num); // 문장 4
		
		System.out.println("==================================================");
		
		// 정수 num2에 대해 홀수, 짝수(0 포함) 판별
		int num2 = 10;
		
		// 홀수 : 정수 num2 를 2로 나눈 나머지가 1일 경우 (1과 같을 경우)
		// 짝수 : 정수 num2 를 2로 나눈 나머지가 0일 경우 (0과 같을 경우)
		
		// if문을 사용하여 홀수일 경우 "num은 홀수!" 출력하고
		// 아니면 (짝수일 경우) "num은 짝수!" 출력
		
		if(num2 % 2 == 1) { // num2가 홀수일 경우, num2 % 2 > 0 과 동일한 조건식 
			System.out.println(num2 + " : 홀수!");
		} else {
			System.out.println(num2 + " : 짝수!");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
