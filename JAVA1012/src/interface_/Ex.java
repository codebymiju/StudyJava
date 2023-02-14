package interface_;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 인터페이스(Interface)
		 * - 클래스 혹은 프로그램이 제공하는 기능을 명시적으로 선언하는 역할
		 * - 인터페이스는 상수와 추상메서드만 가질 수 있다.
		 * - 역할 : 인터페이스를 구현한 클래스가 어떤 기능의 메서드를 제공하는지 명시
		 * 
		 *  < 인터페이스 정의 기본 문법 >
		 * [접근제한자] interface 인터페이스명 {
		 * 		// 상수
		 * 		// 추상메서드
		 * }
		 * 
		 * < 인터페이스를 상속받은(= 구현하는) 서브클래스(구현클래스) 정의 문법 >
		 * [접근제한자] class 클래스명 implements 인터페이스명 {}
		 */

		// 추상클래스는 인스턴스 생성이 불가능!
//		MyClass mc = new MyClass(); //Cannot instantiate the type MyClass
		
		// 인터페이스도 인스턴스 생성이 불가능! 
//		MyExInterface mi = new MyExInterface(); //Cannot instantiate the type MyExInterface
		
		// 인터페이스를 구현한 서브클래스(구현체클래스) 인스턴스 생성
		MySubClass msc = new MySubClass();
		msc.method1();
		msc.method2();
		msc.method3();
		
		// 인터페이스 내의 모든 변수는 상수이므로 값 변경 불가
		// -> 구현체 클래스도 동일한 상수가 상속됨
//		MyExInterface.NUM1 = 99; // 변경 불가
//		MySubClass.NUM1 = 99; // 변경 불가
//		msc.NUM1 = 99; // 변경 불가
		
		System.out.println("============================================");
		
		// 인터페이스는 인스턴스 생성은 불가능하지만 참조변수 타입으로 사용 가능
		// -> 구현체 클래스의 인스턴스를 인터페이스 타입으로 업캐스팅 가능
		//    = 다형성 활용 가능
		MyExInterface mi2 = new MySubClass(); // 업캐스팅
		mi2.method1();
		mi2.method2();
		mi2.method3();
		
		// 상수도 인터페이스에서 선언했으므로 업캐스팅 후에도 접근 가능
		System.out.println(mi2.NUM1);
		System.out.println(mi2.NUM2);
		
		// 상수는 인스턴스를 통한 접근보다 클래스 또는 인터페이스명으로 접근
		System.out.println(MyExInterface.NUM1);
		System.out.println(MyExInterface.NUM2);
		
	}

}

// 인터페이스 정의
// class 키워드 대신 interface 키워드를 사용하여 정의
interface MyExInterface {
	// 인터페이스 내의 모든 멤버변수는 상수이다!
	public static final int NUM1 = 10; // 상수
	int NUM2 = 20; //(Public static final)생략된 상수
	
	// 인터페이스는 생성자를 가질 수 없다!
//	public MyExInterface() {} // 컴파일 에러(Interfaces cannot have constructors)
	
	// 인터페이스 내의 모든 메서드는 추상메서드(public abstract) 이다!
	public abstract void method1(); // 추상메서드
	
//	public void method2() {}; // 일반메서드(컴파일 에러 발생)
	// 추상 메서드여야 하므로 메서드 바디 {}를 가질 수 없다!
	
	public void method2(); // (abstract 생략된)추상메서드
	
	void method3(); // (public abstract 생략된)추상메서드
}

// 인터페이스를 상속받아 구현하는 서브클래스(구현클래스) MySubClass 정의
// -> 서브클래스 정의 시 클래스명 뒤에 implements 키워드를 쓰고 인터페이스명 지정

class MySubClass implements MyExInterface {

	@Override
	public void method1() {
		System.out.println("서브클래스에서 구현한 추상메서드 method1()");
		
	}

	@Override
	public void method2() {
		System.out.println("서브클래스에서 구현한 추상메서드 method2()");
		
	}

	@Override
	public void method3() {
		// 인터페이스에서 method3()정의 시 접근제한자를 생략했지만
		// 인터페이스 내의 모든 메서드는 public 접근제한자를 가지므로
		// 오버라이딩을 통한 구현 시 무조건 public 접근제한자만 사용
		
		System.out.println("서브클래스에서 구현한 추상메서드 method3()");
		
	}
	
}

abstract class MyClass {
	// 인터페이스 내의 모든 멤버변수는 상수가 아니며, 선언 방법에 따라 달라짐
	public static final int NUM1 = 10; // 상수
	int NUM2 = 20; // 인스턴스 멤버변수(상수X)
	
	public MyClass() {} // 기본 생성자
	// -> 추상클래스는 생성자를 가질 수 있다
	
	public abstract void method1(); // 추상메서드
	// -> 추상메서드를 갖는 클래스는 반드시 추상클래스로 선언해야 한다!
	
	public void method2() {} // 일반메서드
	// -> 추상클래스는 일반메서드도 가질 수 있다!
	
}