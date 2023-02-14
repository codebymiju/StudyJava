package while_statement;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 *  do ~ while 문
		 *  - whlie 문과 달리 처음부터 조건을 판별하지 않고
		 *    블록문 내의 실행 문장을 먼저 실행한 후 나중에 조건 검사를 통해 반복 여부 결정
		 * 
		 *  
		 *  < 기본 문법 >
		 *  
		 *  [초기식;]
		 *  
		 *  do {
		 *  	// 조건식 결과가 true 일 때 반복 실행할 문장들....
		 *   	[증감식;]
		 *  
		 *  } while (조건식);
		 *  
		 */
		
		int i = 11; // i가 10보다 크므로 조건식 판별 결과가 false가 되고
		
		while( i <= 10) { // while문 블록 내의 실행문은 단 한번도 실행되지 못하고 종료
			System.out.println(i + " : Hello, World!");
			i++;
		}
		
		System.out.println("while문 종료 후 i = " + i);
		System.out.println("===================================================");
		
		
		i = 11;
		
		do {
			System.out.println(i + " : Hello, World!");
			i++;
			
		} while ( i <= 10);
		
		System.out.println("while문 종료 후 i = " + i);
		System.out.println("======================================================");
		
	}

}
