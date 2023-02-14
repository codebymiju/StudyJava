package nested_class;

import nested_class.Outer.Inner;

public class Ex {

	public static void main(String[] args) {
		/*
		 *  중첩클래스(Nested class)
		 * - 보통 자신의 클래스 내에서만 접근 가능하도록
		 *   전용 클래스로 정의할 때 사용
		 *   -> 주로 GUI 구현 시 이벤트 처리를 위한 핸들러 클래스 정의 시 사용
		 * - 외부클래스와 내부클래스로 구분됨
		 * 
		 * - 클래스 정의 위치에 따라 다음과 같이 구분됨
		 * 
		 *   1) 인스턴스 멤버(내부) 클래스
		 *      - 멤버변수 및 메서드와 동일한 레벨에 정의한 클래스
		 *      - static 키워드를 지정하지 않은 클래스
		 *      - 반드시 외부클래스 인스턴스 생성 후 접근 가능
		 *      
		 *   2) 정적 멤버(내부) 클래스
		 *      - 멤버변수 및 메서드와 동일한 레벨에 정의한 클래스
		 *      - static 키워드를 지정한 클래스
		 *      - 외부클래스명만으로 접근 가능 
		 *   
		 *   3) 로컬 멤버(내부) 클래스
		 *      - 클래스 내의 메서드 내에서 정의한 클래스 
		 */
		
		// 1. 인스턴스 내부 클래스에 접근
		//  -> 반드시 외부클래스의 인스턴스 생성 후 참조변수를 통해
		// 	   내부클래스에 접근해야 한다!
		Outer outer = new Outer();
		
		// 외부클래스를 통해 내부클래스의 인스턴스 생성할 경우
		// -> 반드시!! 외부클래스명.내부클래스명 타입으로 변수를 지정하여야 한다.
		Outer.Inner inner = outer.new Inner();
		Inner inner2 = outer.new Inner();
		// -> import nested_class.Outer.Inner; = Inner타입 바로 사용 가능
		inner.innerMethod();
		System.out.println(inner.innerNum);
		
		System.out.println("----------------------------------------------------------");
		
		// 2. 정적 내부 클래스에 접근
		// -> 내부클래스 접근 문법은 외부클래스 인스턴스 생성 없이
		//	  외부클래스명만으로 접근 가능
		// -> 외부클래스명.내부클래스명 참조변수명 = new 외부클래스명.내부클래스명();
		Outer.StaticInner staticInner = new Outer.StaticInner();
		System.out.println(staticInner.innerNum);

	}

}// Ex

class Outer { // 외부클래스
	private int num = 10; // 인스턴스 멤버변수
	int num2 = 20; // 인스턴스 멤버변수
	static int num3 = 30; // 정적 멤버변수(=클래스 멤버변수) 
	// static이 붙어있으면 인스턴스 만들지 않아도 접근 가능 

	public void method() { // 인스턴스 멤버 메서드
		// 인스턴스 멤버메서드 내에서는 인스턴스 멤버변수 및 메서드에 대해 
		// 자유롭게 접근이 가능하다
		System.out.println("인스턴스 멤버변수 num = " + num);
		method2(); // 같은 클래스 내의 메서드라 서로 호출 가능
	}
	
	public void method2() { // 인스턴스 멤버 메서드
		System.out.println("인스턴스 메서드 method2() 호출!");
	}
	
	public static void method3() { // 정적 멤버메서드
		// 정적 메서드 내에서는 인스턴스 멤버에 대한 접근 불가!
		// -> num은 인스턴스 멤버변수로 인스턴스를 생성해야만 사용가능
		// -> 반면, method3() 메서드는 클래스가 메모리에 로딩될 때 같이 로딩되므로
		//    아직 생성되지 않은 인스턴스 멤버변수를 사용할 수 없다!
//		System.out.println("인스턴스 멤버 변수 num = " + num); // 접근 불가
		System.out.println("정적 멤버변수 num3 = " + num3); // 정적 멤버 접근 가능
	}
	
	//----------------------------------------------------------------------------------
	// 인스턴스 멤버 내부클래스
	// 인스턴스를 만들어야지만 사용 가능한 클래스, 그 전에는 사용 불가!!!
	// static 사용 불가 (static은 인스턴스 없이 사용 가능하므로!)
	class Inner {
		int innerNum = 100;
		// 인스턴스 멤버 내부클래스 에서는 외부클래스의 멤버에 자유롭게 접근
		// -> 인스턴스 멤버 메서드에서의 접근 범위와 동일함
		
//		static int innerNum2 = 200; 사용 불가 
		
		public void innerMethod() {
			System.out.println("외부클래스의 인스턴스 멤버변수 num = " + num);
			// -> 외부클래스의 멤버변수에 접근 가능
			method2(); // 외부클래스의 멤버에서도 호출 가능
		}
		
	}// Inner 클래스
	
	static class StaticInner {
		
		int innerNum = 300;
		// 정적 멤버 내부클래스에서는 외부클래스의 인스턴스 멤버에 접근 불가!
		// -> 메모리 로딩 시점이 다르기 때문(= 정적 메서드와 규칙 동일)
		
		static int innerStaticNum = 200;
		// -> 정적 멤버 내부 클래스에서는  static 키워드를 사용할 수 있음
		
		public void innerMethod() {
//			System.out.println("외부클래스의 인스턴스 멤버변수 num = " + num);
			// -> 외부클래스의 멤버변수 접근 불가능
//			method2(); // 외부클래스의 멤버메서드도 호출 불가능
			System.out.println("외부클래스의 정적 멤버변수 num3 = " + num3);
			method3();
			// -> 같은 static 멤버와 메서드는 사용 가능
		}
		
		public static void innerStaticMethod() {
//			System.out.println("내부클래스의 인스턴스 멤버변수 innerNum = " + innerNum); 
			// static 없는 인스턴스 멤버변수는 접근 불가
			System.out.println("내부클래스의 정적 멤버변수 innerStaticNum = " + innerStaticNum);
			// static 있는 정적 멤버변수는 사용 가능
		}
		
	}
	
}// outer 클래스



