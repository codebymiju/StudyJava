package method_overloading;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 메서드 오버로딩(Method Overloading) = 메서드 다중 정의
		 * - 동일한 이름의 파라미터가 다른 메서드를 여러번 정의하는 것
		 * - 비슷한 기능을 수행하지만, 전달받은 데이터의 타입이 다른 경우
		 * 	 메서드 이름을 각각 따로 정의하지 않고, 동일한 이름으로 
		 * 	 파라미터만으로 구분되는 메서드를 여러개 정의하는 것
		 * 
		 * < 메서드 오버로딩 규칙(택1) >
		 * 1. 메서드 파라미터의 데이터타입이 달라야 함
		 * 2. 메서드 파라미터의 개수가 달라야 함
		 *    (같은 타입이라도 다른 개수는 오버로딩 가능 - int 1, int1&2)
		 */
		
		NormalMethod nm = new NormalMethod();
		
		nm.add(10,20);
//		nm.add(1.0,3.14); // (int,int)로 설정 해뒀기에 double, double 타입은 전달불가
		nm.addDouble(1.0, 3.14); //타입에 맞는 별도의 메서드를 호출해야 함!
		
		System.out.println("========================================");
		
		OverloadingMethod om = new OverloadingMethod();
		// 메서드 호출 시점에서 각 메서드가 구분되어야 오버로딩 성립됨
		
		om.add(10,20); //add(int, int) 호출됨
		om.add(1.5,3.14); //add(double, double) 호출됨
		om.add(1, 2, 3);
		
		
	}//main()메서드 끝

}//Ex클래스 끝
class OverloadingMethod{
	// 오버로딩 기능을 활용하여 두 수를 전달받아 덧셈 결과를 출력하는 메서드 정의
	// -> 동일한 이름의 파라미터 타입만 서로 다른 메서드를 여러번 정의
	// 1. int형 정수 2개를 전달받아 덧셈 수행
	public void add(int num1, int num2) {
		System.out.println("add(int, int) 호출됨");
		System.out.println(num1 + num2);
	}
	// 2. 실수 2개를 전달받아 덧셈 수행
	public void add(double num1, double num2) {
		System.out.println("add(double, double) 호출됨");
		System.out.println(num1 + num2);
	}
	// 3. 정수 3개를 전달받아 덧셈
	public void add(int num1, int num2, int num3) {
		System.out.println("add(int, int, int) 호출됨");
		System.out.println(num1 + num2 + num3);
	}
	
	// 주의! 파라미터의 변수명만 다를 경우 오버로딩 성립되지 않음 => 오류발생
//	public void add(int a, int b) { 
//		System.out.println("add(int, int) 호출됨");
//		System.out.println(num1 + num2);
//	}
//	->Duplicate method add(int, int) in type OverloadingMethod
	
	// 주의! 리턴타입만 다를 경우 오버로딩 성립되지 않음! -> 오류발생
//	public int add(int num1, int num2) {
//		System.out.println("add(int, int) 호출됨");
//		return num1 + num2;
//	}
	
}//overloading클래스 끝



class NormalMethod {
	// 두 수를 전달받아 덧셈 결과를 출력하는 메서드 정의
	// 1. int형 정수 2개를 전달받을 경우
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	// 2.double형 실수 2개를 전달받을 경우
	public void addDouble(double num1, double num2) {
		System.out.println(num1 + num2);
	}
	
	// 일반적으로 메서드명도 식별자에 해당하므로 중복이 불가능함
	// 따라서, add()와 addDouble() 메서드는 하는 일은 같지만
	// 서로 다른 파라미터를 전달받으므로 다른 이름으로 정의했음
	// -> 메서드 정의 시 메서드명을 달리해야하므로 호출 시 구분이 불편할 수 있음
	
	public void printInt(int num) {
		System.out.println(num);
	}
	
	public void printInt(String str) {
		System.out.println(str);
	}
}





