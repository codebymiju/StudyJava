package break_continue_statement;

public class Ex2 {

	public static void main(String[] args) {
		// 중첩 for문을 사용하여 구구단 2단 ~ 9단 출력
		// -> 단, 구구단의 단이 5단일 때 반복문 종료
//		for(int dan = 2; dan <= 9; dan++) {
//			System.out.println(" < " + dan + "단 >");
//			
//			// 현재 단이 5단일 때 반복문 종료
//			if(dan == 5) {
//				break;// 바깥쪽 for문 종료시키는 break;
//			}
//			
//			for(int i = 1; i <= 9; i++) {
//				if( dan == 5) {
//					// 현재 단이 5단일 때 반복문을 종료하는게 아니라
//					// 안쪽 for문을 빠져나가고 바깥쪽 for문의 다음 반복 진행
//					break;// 안쪽 for문을 종료시키는 break;
//				}
//				System.out.printf(" %d * %d = %d\n", dan, i, dan*i);
//			}// 안쪽 for문을 끝
//			System.out.println();
//		}// 바깥쪽 for문을 끝
//		
		
		System.out.println("===========================================");
		/*
		 * label 기능
		 * - 반복문의 앞에 위치하여 break 또는 continue의 동작 지점을 지정
		 * 
		 * < 기본 문법 >
		 * 레이블명 :
		 * 바깥쪽반복문(){
		 * 
		 * 		안쪽반복문(){
		 * 			if(조건식){
		 * 				break 레이블명; // 또는 continue 레이블명;
		 * 			}
		 * 
		 * 		}
		 * 
		 * }
		 */
		
		EXIT_FOR: //레이블
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println(" < " + dan + "단 >");
			
			for(int i = 1; i <= 9; i++) {
				if( dan == 5) {
					// 현재 단이 5단일 때 반복문을 종료하는게 아니라
					// 안쪽 for문을 빠져나가고 바깥쪽 for문의 다음 반복 진행
					break EXIT_FOR;// 안쪽 for문을 종료시키는 break;
				}
				System.out.printf(" %d * %d = %d\n", dan, i, dan*i);
			}// 안쪽 for문을 끝
			System.out.println();
		}// 바깥쪽 for문을 끝
		
		
		
		
	}

}
