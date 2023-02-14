package if_statement;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 *  if ~ else if 문 (= 다중 else if문)
		 *  - 두 가지 이상의 조건식을 차례대로 판별하면서
		 *    세 가지 이상의 경우의 수를 판별하는 조건문
		 *   ** 마지막 else 문은 생략가능
		 *    
		 *  < 기본 문법 >
		 *  if (조건식1) {
		 *   	// 조건식 1의 결과가 true 일 때 실행할 문장들...
		 *   	문장 1;
		 *   } else if (조건식2) {
		 *   	문장 2;
		 *   	// 조건식 1의 결과가 False 이고, 조건식 2의 결과가 true 일 때 실행할 문장들..
		 *   } else if (조건식n) {
		 *   	문장 n;
		 *   	// 조건식 1,2의 결과가 False 이고, 조건식 n의 결과가 true 일 때 실행할 문장들..
		 *   } else {
		 *   	// 위의 모든 조건식 판별 결과가 false 일 때 실행할 문장들...(옵션)
		 *   	문장 x;
		 *   }
		 */
		
		
		// 정수 num 이 5보다 크다 or 5보다 작다 or 5와 같다 판별
		int num = 5;
		
		if(num > 5) {
			System.out.println("num 이 5보다 크다!");
		} else if(num < 5) {
			System.out.println("num이 5보다 작다!");
		} else if(num == 5) {
			System.out.println("num이 5와 같다!");
		}
		
		//----------------위의 코드와 결과는 같지만 다른 코드 ------------------------
		
		
		if(num > 5) {
			System.out.println("num 이 5보다 크다!");
		} else if(num < 5) {
			System.out.println("num이 5보다 작다!");
		} else  { // 크지도 않고 작지도 않을 경우 = 같을 경우 
			System.out.println("num이 5와 같다!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
