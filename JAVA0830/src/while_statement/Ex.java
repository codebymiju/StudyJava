package while_statement;

public class Ex {

	public static void main(String[] args) {
		/*
		 *  2. while문 
		 *  - for문과 동일하나 초기식, 증감식의 위치가 유동적인 반복문
		 *  - 조건식은 위치만 고정
		 *  - for문은 주로 반복 횟수가 정해져 있는 반복에 활용되는 반면
		 *  - while문은 주로 반복 횟수가 정해져 있지 않은(상황에 따른) 반복에 활용
		 *  
		 *  < 기본 문법 >
		 *  [초기식;]
		 *  
		 *  while(조건식) {
		 *  	 [증감식;]
		 *  
		 *  	 // 조건식 결과가 true 일 때 반복 실행할 문장들...
		 *  
		 *  	 [증감식;]
		 *  
		 *  }
		 */
		
		// for문을 사용하여 "Hello, World!" 문자열 출력 10번 반복
		
		for(int i = 1; i <= 10; i++) {
			System.out.println( i + " : Hello, World!");
		}
		
		
		System.out.println("=============================================");
		
		 // while문을 사용하여 "Hello, World!" 문자열 출력 10번 반복
		int i = 1;
		while(i <= 10) {
			System.out.println( i + " : Hello, World!");
			i++;
		}
		 
		System.out.println("============================================");
		
		// while문을 사용해서 제어변수 i가 
		// 1 ~ 10까지 1씩 증가하면서 i 값 출력 ( 1 2 3 4 5 6 7 8 9 10)
		// 단, 위의 while 문 윗쪽에서 변수 i를 선언했으므로 변수값 변경을 통해 사용
		i = 1; // int만 제거하면 됨
		
		while (i <= 10 ) {
			System.out.print(i + " "); // 나타나게 할 표기 형식
			i++;
		}
		System.out.println();
		System.out.println("==========================================");
		
		
		// 제어변수 i가 1 ~10까지 2씩 증가하면서 i값 출력 ( 1 3 5 7 9 = 홀수 출력)
		
		i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
		
		System.out.println();
		System.out.println("==========================================");
		
		
		// 제어변수 i가 2 ~10까지 2씩 증가하면서 i값 출력 ( 2 4 6 8 10 = 짝수 출력)
		
		i = 2;
		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
			
		System.out.println();
		System.out.println("==========================================");
		
		// 제어변수 i가 10 ~1까지 1씩 감소하는 i값 출력
		
		i = 10;
		while(i >= 1) {
			System.out.print(i + " ");
			i--;
		}
		
		System.out.println();
		System.out.println("==========================================");
		
		
	}

}
