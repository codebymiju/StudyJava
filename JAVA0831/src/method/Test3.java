package method;

public class Test3 {

	public static void main(String[] args) {
		//3. 전달인자만 있고, 리턴값은 없는 메서드 호출 연습
		// 문자열 1개를 전달하여 해당 문자열을 10번 반복 출력하는 print() 메서드 출력
		
		print("JAVA"); // "JAVA" 문자열 10번 출력
		print("홍길동");
		
		System.out.println("=========================================");
		
		//----------------------------------------------------------
		// 정수 1개를 전달하여 전달한 정수값만큼 
		// "Hello, World!" 문자열을 출력하는 hello() 메서드 호출
		
		hello(10); // "Hello, World!" 문자열 10번 반복 출력
		hello(5); 
		
		System.out.println("=========================================");
		
		// 정수 1개를 전달하여 전달한 정수에 해당하는 구구단을 출력하는 
		// gugudan() 메서드 호출
		
		gugudan(2); // 구구단 2단 호출
		gugudan(5); // 구구단 5단 호출
			
	}// main() 메서드 끝
	
	//3. 전달인자만 있고, 리턴값은 없는 메서드 정의 연습
	// 문자열 1개를 전달하여 해당 문자열을 10번 반복 출력하는 print() 메서드 출력
	
	public static void print(String str) {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(str);
		}
	}
	// 정수 1개를 전달하여 전달한 정수값만큼 
	// "Hello, World!" 문자열을 출력하는 hello() 메서드 호출
	
	public static void hello(int hi) {//외부에서 반복 횟수(hi)결정
		
		for(int i = 1; i <= hi; i++) {
			System.out.println(i + " : Hello, World!");
		}
	} // hello() 메서드 끝
	
	//------------------------------------------------------------
	//정수 1개를 전달받아 전달받은 정수에 해당하는 구구단을 출력하는 gugudan() 메서드 정의
	public static void gugudan(int dan) {
		System.out.println(" < " + dan + "단 >");
		for(int i = 1 ; i <= 9; i++) {
			System.out.println( dan + " * " + i + " = " + (dan * i));
		}
		
	} // gugudan()메서드 끝
	
	
}//Test 3 클래스 끝
