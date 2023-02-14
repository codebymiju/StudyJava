package method;

public class Test2 {

	public static void main(String[] args) {
		// 2. 전달인자는 없고, 리턴값만 있는 메서드 호출 연습
		// 1 ~ 10 까지의 합(55)을 계산하여 리턴하는 메서드 sum()을 호출하여
		// 리턴되는 결과값을 변수에 저장하여 출력하거나 직접 출력
		
		int result = sum(); // sum()메서드 호출 후 리턴값을 전달받아 result 변수에 저장
		System.out.println("1 ~ 10 까지의 합 = " + result);
		
		
		System.out.println("=========================================");
		
		// 자신의 이름을 리턴하는 getName() 메서드를 호출하여 리턴되는 이름을 
		// 전달받아 출력
		
		
		String name = getName();
		System.out.println("내 이름은 : " + name);
		
		
	} // main method() 끝
	
	
	// 2. 전달인자는 없고, 리턴값만 있는 메서드 정의 연습
	// 1 ~ 10 까지의 합(55)을 계산하여 리턴하는 메서드 sum() 정의
	// -> 정수를 리턴하므로 리턴타입에 int 타입 명시
	
	public static int sum() {
		
		int total = 0;
		
		for(int i = 1; i <= 10; i++) {
			total += i;
		} 
		return total; // 출력문 대신 return으로 바꿈
		// return 값을 가지고 호출한 곳 sum()으로 이동
	} // sum() 메서드 끝
	
	//==========================================================
	// 자신의 이름을 리턴하는 getName() 메서드 정의
	
	public static String getName() {
		String name = "김미주";
		return name;
	}
		
	
} // Test2 클래스 끝
