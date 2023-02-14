package nested_while_statement;

public class Test {

	public static void main(String[] args) {
		/*
		 * 타이머(xx분xx초)
		 * - 분 (min) : 0 ~ 59분
		 * - 초 (sec) : 0 ~ 59초
		 * 
		 */
		
		int min = 0;
		while(min <= 59) {//초기식1
			
			int sec = 0;
			while(sec <= 59) {
				System.out.printf(" %d분 %d초\n", min, sec);
				sec++;
			}
			min++;
		}
		
		System.out.println("=================================");
		/*
		 * 중첩 while 문을 활용한 구구단 전체 출력 (2 ~ 9단)
		 * 
		 */
		
		// 특정 단의 구구단 출력
		
		int dan = 2;
		while(dan <= 9) {
			System.out.printf(" < %d단 > \n", dan);
			int i = 1;
			while (i <= 9) {
				System.out.println(dan + " * " + i + " = " + dan * i);
				i++;
			}
			dan++;
			System.out.println();
		}
		
		
		
		
		
	}//main()메서드 끝

}//Test 클래스 끝
