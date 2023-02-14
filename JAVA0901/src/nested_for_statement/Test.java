package nested_for_statement;

public class Test {

	public static void main(String[] args) {
		// 바깥쪽 for문 i값이 1 ~ 10까지 반복할 동안
		// 안쪽 for문 j값을 1 ~ 5까지 반복하면서 i와 j값을 출력
		
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("바깥쪽 ---> " + i);
			for(int j = 1; j <= 5; j++ ) {
				System.out.println("안쪽 --->" + j);
			}//안쪽 for문
		}//바깥쪽 for문
		
		System.out.println("=================================");
		
		/*
		 * 타이머(xx분xx초)
		 * - 시 (hour) : 0 ~ 23시
		 * - 분 (min) : 0 ~ 59분
		 * - 초 (sec) : 0 ~ 59초
		 * 
		 */
		
			for (int min = 0; min <= 59; min++) { // 바깥쪽 for문 min
				for(int sec = 0; sec <= 59; sec++) {// 안쪽 for문 sec
					System.out.println( min + "분" + sec + "초" );
				}
			}
			System.out.println("===============================");
			
			/*
			 * 중첩 for문을 활용한 구구단 전체 출력 (2 ~ 9단)
			 * 
			 */
			
			// 특정 단의 구구단 출력
			
			for(int dan = 2; dan <= 9; dan++) {// 2단 ~ 9단 반복문
				System.out.println(" < " + dan + " 단>");
				
				for(int i = 1; i <= 9; i++) { // 바깥쪽 단
					System.out.println( dan + " * " + i  + " = " + dan*i);
//					System.out.printf("%d * %d = *d" dan, i , dan*i)
				}//안쪽
				System.out.println();
			}// 바깥
			
			System.out.println("=============================");
			
			/* 주사위 2개 굴려서 주사위 눈의 합이 6일 때 두 주사위 값을 출력
			 * 
			 * 주사위 눈 : 1 ~ 6
			 * 주사위 (dice1, dice2) 변수 값을 1 ~ 6까지 1씩 증가하면서 반복
			 * 주사위 눈의 합계가 6인지 판별하여 6일 때 주사위 눈의 겂을 출력
			 * 
			 */
			
			
			for(int dice1 = 1; dice1 <= 6; dice1++) {
				for(int dice2 =1; dice2 <= 6; dice2++)
				if( dice1 + dice2 == 6 ) { // 주사위 눈의 합이 6인지 판별
					System.out.printf("%d + %d = %d\n", dice1, dice2, (dice1+dice2));
				}// if문
			}// 바깥
			
			System.out.println("====================================");
			// 방정식 4x + 5y = 60의 해를 구해서 출력하기
			// 단, x와 y는 0 <= x, y <=10
			
			for(int x = 0; x <= 10; x++) {
				for(int y = 0; y <= 10; y++) {
				if( (4*x + 5*y) == 60) {
					System.out.printf(" x = %d , y = %d\n", x, y);
				}//if문
				}// 안쪽 for
			}// 바깥 for
			
			
	}//main()메서드 끝

}
