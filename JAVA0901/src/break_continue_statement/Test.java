package break_continue_statement;

public class Test {

	public static void main(String[] args) {
		/*
		 *  1 ~ 100까지 정수의 합을 계산(total 변수에 저장)
		 *  ->단, 합계가 1000보다 클 경우 반복문을 종료하고 빠져나간 뒤
		 *  	1000보다 커지는 시점의 정수(x)를 출력
		 */
		
		int total = 0;
		int i;
		
		for(i = 1; i <= 100; i++) {
			total += i;
			
			if(total > 1000) {
				break; // 조건에 해당하면 멈추고 아니면 계속 반복 진행
			}
		}//for문
		
		System.out.println(" 1 ~  " + i + "까지 정수의 합 = " + total);
		
		System.out.println("=======================================");
		
		/*
		 *  1 + (-2) + 3 + (-4) + .....형식으로 계속 더할때
		 *  총합이 100이상이 되는 x값 출력 (break문 사용)
		 *  정수가 짝수일 때는 음수 형태로 변환하여 합계 누적
		 */
		
		int x = 1;
		total = 0;
			
		while(true) {
			if(x %2 == 0) {
				System.out.println(-x);
				total -= x; //음수값으로 변환하여 누적
			} else {
				System.out.println(x);
				total += x; //양수값 그대로 누적
			}
			if(total >= 100) {
				break;
			}
			x++;
		}
				
		System.out.println();
		System.out.println("x = " + x);
		System.out.println("total = " + total);
		
		
		
	}

}
