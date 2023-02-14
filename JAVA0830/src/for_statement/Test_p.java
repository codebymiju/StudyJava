package for_statement;

public class Test_p {

	public static void main(String[] args) {
		/*
		 *  정수형 변수 visitCount가 0일 때,
		 *  "처음 오셨군요. 방문해 주셔서 감사합니다." 를 출력
		 * 
		 * 	visitCount와 상관없이 "방문횟수는 xx번 입니다." 출력하는 코드
		 * 
		 * 	출력결과	
		 * 	visitCount = 0
		 * 	
		 *  처음 오셨군요. 방문해 주셔서 감사합니다.
		 *  방문횟수는 0번 입니다.
		 *  
		 *  visitCount = 5
		 *  방문횟수는 5번 입니다.
		 * 
		 */
		
		
		int visitCount = 0 ;
		
		if (visitCount == 0) { // if 조건문 true or false, 조건이 참일 경우 실행
			System.out.println("처음 오셨군요. 방문해 주셔서 감사합니다.");
		} 
		// if문과 관계없이 항상 실행될 문장
//		System.out.println("방문횟수는 " + visitCount + "번 입니다.");
		System.out.printf("방문횟수는 %d번 입니다.\n", visitCount);
		
		
		
		/*
		 * 정수형 변수 num을 선언
		 * num의 값이 3의 배수 이거나 5의 배수 이면
		 * "3의 배수이거나 5의 배수 입니다." 를 출력
		 * 아니면 "3의 배수이거나 5의 배수가 아닙니다."를 출력
		 * 
		 */
		
		
		/*
		 * AND (&&) : 두 비교 연산 관계를 ~이고, ~이면서, 그리고
		 * OR  (||) : ~ 이거나, 또는
		 */
		
		int num = 2;
		if( num % 3 == 0 || num % 5 == 0) {
			System.out.println("3의 배수이거나 5의 배수 입니다.");
		} else {
			System.out.println("3의 배수이거나 5의 배수가 아닙니다.");
		}
		
		System.out.println("==========================================");
		
		/*
		 * 영문자인지 확인하는 코드
		 * if문 하나만 사용해서 영문자인지 아닌지 판별
		 *  A(65) ~ Z(90), a(97) ~ z(122)
		 */
		
		char ch = 68;
		if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
			System.out.println("영문자입니다.");
		} else {
			System.out.println("영문자가 아닙니다.");
		}
		
		char ch2 = 90;
		if((ch2 >= 65 && ch2 <= 90) || (ch2 >= 97 && ch2 <= 122 )) {
			System.out.println("영문자입니다.");
		} else {
			System.out.println("영문자가 아닙니다.");
		}
	}

}
