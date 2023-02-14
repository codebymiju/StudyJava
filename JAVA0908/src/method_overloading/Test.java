package method_overloading;

public class Test {

	public static void main(String[] args) {
		// PrintOverloading 인스턴스 생성
		// 참조변수명.메서드()활용
		
		PrintOverloading po = new PrintOverloading();
		po.print(8);
		po.print();
		po.print(1.41);
		po.print("추석이다헤헤");
		
		System.out.println("==============================");
		
		Calculator c = new Calculator();
		c.add(2,3);
		c.add(1, 2, 3);
		c.add(1, 2, 3, 4);
		System.out.println("====================");
		c.cal("+", 10, 20);
		c.cal("+", 10, 20, 30);
		c.cal("+", 10, 20, 30, 40);
		System.out.println("====================");
		c.cal("-", 100, 10);
		c.cal("-", 100, 10, 20);
		c.cal("-", 100, 10, 20, 30);
	
		
		
		
	}//main()메서드 끝

}//Test 클래스 끝

/*
 * 계산기 (Calculator) 클래스 정의
 * - 정수를 전달받아 덧셈만 수행하는 add()메서드 정의
 * 1. 정수 2개를 전달받아 덧셈 결과 출력
 * 2. 정수 3개를 전달받아 덧셈 결과 출력
 * 3. 정수 4개를 전달받아 덧셈 결과 출력
 */

class Calculator {
	
	public void add(int data1, int data2) {
		System.out.println("add(int, int) = "+ (data1 + data2));
	}
	
	public void add(int data1, int data2, int data3) {
		System.out.println("add(int, int, int) = " + (data1 + data2+ data3));
	}
	
	public void add(int data1, int data2, int data3, int data4) {
		System.out.println("add(int, int, int, int) = " + (data1 + data2 + data3 +data4));
	}
	
		// 연산자에 해당하는 연산을 수행하는 cal()메서드 정의
		// c.cal('+', 10, 20) -> 10 + 20 = 30 출력
		// c.cal('+', 10, 20, 30) -> 10 + 20 + 30 = 60 출력
		// c.cal('+', 10, 20, 30, 40) -> 10 + 20 + 30 + 40 = 100 출력	

		// c.cal('-', 100, 10) -> 100 - 10 = 90 출력
		// c.cal('-', 100, 10, 20) -> 100 - 10 - 20 = 70 출력
	
	
	public void cal(String data, int num1, int num2) {
		
		if ( data == "+") {//char타입일 경우 '+'로 정의
			System.out.printf("%d + %d = %d\n",num1, num2, num1+num2);
		} else if ( data == "-") {
			System.out.println(num1 - num2);
		}
		
		}// cal()메서드 끝
	
	public void cal(String data, int num1, int num2, int num3) {
		
		if ( data == "+") {
			System.out.println(num1 + num2 + num3);
		} else if ( data == "-") {
			System.out.println(num1 - num2 - num3);
		}
		
		}// cal()메서드 끝
	
	public void cal(String data, int num1, int num2, int num3, int num4) {
		
		if ( data == "+") {
			System.out.println(num1 + num2 + num3 + num4);
		} else if ( data == "-") {
			System.out.println(num1-num2-num3-num4);
		}
		
		}// cal()메서드 끝
	
	
	
	
	
	}//C클래스 끝






/*
 * 정수, 실수, 문자열 데이터 1개를 전달받아 출력하는 print() 메서드 오버로딩
 * 파라미터가 없는 메서드도 생성 -> "줄바꿈" 출력
 */

class PrintOverloading{
	
	public void print(int data) {
		System.out.println("정수는 : " + data );
	}
	public void print(){
		System.out.println("줄바꿈");
	}// 파라미터가 없는 메서드도 오버로딩에 해당됨
	
	public void print(double data) {
		System.out.println("실수는 : " + data);
	}
	
	public void print(String data) {
		System.out.println("문자는 : " + data);
	}
	
}
	




