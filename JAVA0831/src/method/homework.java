package method;

public class homework {

	public static void main(String[] args) {
		// 1. 정수 1개를 전달하면 "홀수", "짝수", "0" 을 판별하여 리턴하는 check() 메서드 호출
		// => 리턴되는 결과값을 전달받아 출력
		
//		String result = check(6);
		System.out.println("정답은 : " + check(79) );
		
		
		
		System.out.println("=========================");
		// 2.정수 2개를 전달하면 두 수 중 더 큰 수를 리턴하는 max() 메서드 호출
		// ex) 10, 20 전달 시 20 이 리턴됨
		// 단, 같을 경우 아무 숫자나 리턴(작거나 같다 또는 크거나 같다고 판별)
		
		System.out.println(" 정답은 : " + max(8,9));
		
		
		
		
	}//main()메서드 끝
	// 1. 정수 1개를 전달받아 "홀수", "짝수", "0" 을 판별하여 리턴하는 check() 메서드 정의
	public static String check(int num) {
		
		
		if(num == 0) {
			return "0";
		}else if (num %2 == 1) {
			return "홀수";
		}else {
			return "짝수";
		}
		
	}//check()메서드 끝
	
	
	
	
	// --------------------------------------------------------------------------------
	// 2. 정수 2개를 전달받아 더 큰 수를 리턴하는 max() 메서드 정의
	public static int max (int num1, int num2) {
		
		if (num1>num2) {
			return num1;
		} else if (num1<num2) {
			return num2;
		} else  {
		}   return num1;
	}// max()메서드 끝
	
	
	
	
	
}//homework 클래스 끝
