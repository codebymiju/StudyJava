package method;

public class Test4 {

	public static void main(String[] args) {
		// 4. 전달인자도 있고, 리턴값도 있는 메서드 호출 연습
		// 정수 1개(x)를 전달하면 1 ~ x 까지의 합을 리턴하는 sum()메서드 호출
		// ex) sum() 메서드에 10 전달 시 1 ~ 10 까지의 합 리턴
		
		
		// 내가 한 것
		int s = 5;
		System.out.println(sum(s));
		
		// 정답
		int result = sum(100);
		System.out.println(result);
		
		
	} // main() 메서드 끝
	
	// 4. 전달인자도 있고, 리턴값도 있는 메서드 정의 연습
	// 정수 1개(x)를 전달받아 변수 num에 저장 후 
	// 1 ~ num 까지의 합을 리턴하는 sum() 메서드 정의
	
	public static int sum(int num) { //정수 x개를 전달받을것이라 int num
		int total = 0;
		
		for(int i = 1; i <= num; i++) {
			total += i;
		} 
		
		 return total;
		 
	}// sum() 메서드 끝
	
	
}// Test 4 클래스 끝
