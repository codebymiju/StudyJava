package for_statement;

public class Test2 {

	public static void main(String[] args) {
		// 1 ~ 10까지 1씩 증가하면서, 정수 중 짝수의 합만 계산
		
//		int x = 0;
//		for (int i = 1; i <= 10 ; i++) {
//			if ( i %2 == 0) {
//				System.out.println(i + " : 짝수의 누적된 합, "+ (x += i));
//			} else {
//				System.out.println( i + " : 홀수이므로 누적 X");
//			}
//		}
//		
//		System.out.println();
//		System.out.println(" 1 ~ 10까지 정수 중 짝수의 합은 : " + x);
		
		System.out.println("================================================");
		
//		int total = 0;
//		for (int i = 1; i <=10; i++) {
//			// 짝수일 경우에만 누적변수에 제어변수 i의 현재값 누적
//			if(i % 2 == 0) {// 짝수판별
//				// 짝수일 때 누적 수행
//				total += i;
//				System.out.println("i = " + i + ", total = " + total);
//			} else {
//				System.out.println( i + " : 홀수이므로 누적 X");
//			}
//			
//		}
//		
//		System.out.println(" 1 ~ 10까지 정수 중 짝수의 합은 : " + x);
		
		System.out.println("====================================================");
		
		// 1 ~ 10까지 정수 중 홀수의 합 계산 후 출력
		// 누적변수 초기화 
		
		int total = 0;
		for (int i = 1; i <=10; i++) {
			// 홀수일 경우에만 누적변수에 제어변수 i의 현재값 누적
			if(i % 2 == 1) {// 홀수판별
				// 홀수일 때 누적 수행
				total += i;
				System.out.println("i = " + i + ", total = " + total);
			} else { // 짝수일때
				System.out.println( i + " : 짝수이므로 누적 X");
			}
			
		}
		
		System.out.println(" 1 ~ 10까지 정수 중 홀수의 합은 : " + total);
		
		System.out.println("==============================================");
		// 1 ~ 10까지 1씩 증가하면서 홀수, 짝수의 합을 각각 누적 후 출력
		int oddTotal = 0;
		int evenTotal = 0;
		
		for (int i = 1; i <=10; i++) {
			if(i % 2 == 1) {// 홀수판별
				// 짝수의 합을 저장하는 변수 oddTotal에 i값을 누적
				oddTotal += i;
			} else { // 홀수가 아닐때 
				// 짝수의 합을 저장하는 변수 evenTotal에 i값을 누적
				evenTotal += i;
			}
			
		}
		
		System.out.println(" 1 ~ 10까지 정수 중 짝수의 합 = " + evenTotal);
		System.out.println(" 1 ~ 10까지 정수 중 홀수의 합 = " + oddTotal);
		
		
		
	}

}
