package nested_for_statement;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 중첩 for문
		 * - for문 내부에 또 다른 for문을 기술하는 것
		 * - 바깥쪽 for문과 안쪽 for문으로 구분
		 * -> 바깥쪽 for문이 한바퀴 돌 때, 안쪽 for문은 여러바퀴를 돈다.
		 * 
		 * 
		 * < 기본 문법 > 
		 *  for (초기식1; 조건식1; 증감식1) { // 바깥쪽 for문
		 *  		문장 1; //  바깥쪽 for문의 조건식 1이 true 일 때 반복 실행되는 문장
		 *  
		 *  		for(초기식2; 조건식2; 증감식2){
		 *  		문장 2;
		 *  		// 반복횟수 = 안쪽 for문 반복횟수 * 바깥쪽 for문 반복횟수
		 *  
		 *  		}
		 *  
		 *  		문장3; // 안쪽 for문 반복이 종료된 후 실행되는 문장
		 *  }
		 * 
		 */
		
		// 바깥쪽 for문 : i값이 1 ~ 3까지 1씩 증가하면서 반복
		for(int i = 1; i <= 3; i++) { // 바깥쪽 for문
			System.out.println("i = " + i);
			
			for(int j = 1; j <= 2; j++) { // 안쪽 for문
				System.out.println("--------> j = " + j);
				// 반복횟수 = j횟수(2) * i횟수(3) = 6회
			}
			// 안쪽 for문 반복이 종료된 후 실행되는 문장
			System.out.println("----------안쪽 for문 반복 종료");
		}
		// 바깥쪽 for문 반복이 종료된 후 실행되는 문장
		System.out.println("바깥쪽 for문 반복 종료");
	}

}
