package abstract_;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 추상메서드(Abstract Method)
		 * 
		 * - 메서드 바디(=구현부, {})가 존재하지 않는 메서드 = 미완성 메서드
		 *   -> 실행 코드가 없으므로 실행(호출)될 수 없는 메서드
		 *   
		 * < 추상메서드 정의 기본 문법 >
		 * [접근제한자] abstract 리턴타입 메서드명([매개변수...]);
		 * ---------------------------------------------------------------------------
		 * 추상클래스(Abstract Class)
		 * 
		 * - 인스턴스를 생성할 수 없는 미완성 클래스(미정의 해두고 나중에 설정가능)
		 * - class 키워드 앞에 abstract 키워드를 붙여서 정의
		 *   -> 추상메서드 뿐만 아니라 일반메서드, 멤버변수, 생성자를 가질 수 있음
		 * - 인스턴스는 생성할 수 없지만, 상속을 통한 슈퍼클래스로 사용하거나
		 *   다형성 활용을 위한 참조변수 타입으로 사용 가능함
		 *   => 추상메서드를 포함하는 추상클래스를 상속받는 서브클래스에서는
		 *      반드시 오버라이딩을 통해 추상메서드 바디{} 를 구현해야 한다!
		 *      즉, 추상메서드 오버라이딩을 강제할 수 있다!
		 *      (What 에 대한 강제, How 는 서브클래스에 위임)
		 *   
		 *   < 추상클래스 정의 기본 문법 >
		 * [접근제한자] abstract class 클래스명 {
		 * 		             // 멤버변수
		 *		             // 생성자
		 *		             // 일반메서드
		 *		             // 추상메서드
		 * }
		 */
		
		// 추상클래스 AbstractClass 인스턴스 생성불가!
//		AbstractClass ac = new AbstractClass(); // 컴파일 에러 발생!
		
		// 추상클래스를 상속받는 서브클래스 인스턴스 생성
		SubClass sc = new SubClass();
		sc.normalMethod();
		sc.abstractMethod();
		sc.subClassMethod();
		
		// 추상클래스를 참조변수 타입으로 활용 가능 = 업캐스팅을 통한 다형성
		AbstractClass ac = new SubClass();
		ac.normalMethod();   // 공통(상속된) 메서드
		ac.abstractMethod(); // 공통(상속된) 메서드
//		ac.subClassMethod(); // 참조영역 축소로 접근 불가
		
		System.out.println("============================================================");
		
		// Flyer 클래스를 상속받은 SuperMan, Bird, Airplane 인스턴스 생성
		SuperMan s = new SuperMan();
		s.takeOff();
		s.fly();
		s.land();
		
		Bird b = new Bird();
		b.takeOff();
		b.fly();
		b.land();
		
		Airplane a = new Airplane();
		a.takeOff();
		a.fly();
		a.land();
		
		System.out.println("============================================================");
		
		// SuperMan, Bird, Airplane -> Flyer 타입 업캐스팅을 하여 다형성 활용
		
		Flyer f = s;
		f.takeOff();
		f.fly();
		f.land();
		
		f = b;
		f.takeOff();
		f.fly();
		f.land();
		
		f = a;
		f.takeOff();
		f.fly();
		f.land();
		
	}

}

abstract class AbstractClass {
	
	public abstract void abstractMethod(); // 추상메서드
	
	// 추상클래스가 추가로 가질 수 있는 것
	public void normalMethod() {} // 일반 메서드
	public AbstractClass() {} // (기본)생성자
	String member; // 인스턴스 변수
	
}// 추상클래스

class SubClass extends AbstractClass {
// 추상클래스를 상속받은 서브클래스는 반드시 추상메서드 오버라이딩 필수!
	
	@Override // alt+shift+s+v
	public void abstractMethod() {
		System.out.println("서브클래스에서 오버라이딩(구현)된 추상메서드!");
	}
	
	public void subClassMethod() {
		System.out.println("서브클래스에서 정의한 메서드!");
	}
	
}// 추상클래스를 상속받는 서브클래스

abstract class Flyer {
	
	public abstract void takeOff();
	public abstract void fly();
	public abstract void land();
	
}

class SuperMan extends Flyer {

	@Override
	public void takeOff() {
		System.out.println("SuperMan 이륙!");
	}

	@Override
	public void fly() {
		System.out.println("SuperMan 비행!");
	}

	@Override
	public void land() {
		System.out.println("SuperMan 착륙!");
	}
	
	
}// SuperMan 클래스

class Bird extends Flyer {

	@Override
	public void takeOff() {
		System.out.println("Bird 이륙!");
	}

	@Override
	public void fly() {
		System.out.println("Bird 비행!");
	}

	@Override
	public void land() {
		System.out.println("Bird 착륙!");
	}
	
}// Bird 클래스

class Airplane extends Flyer {

	@Override
	public void takeOff() {
		System.out.println("Airplane 이륙!");
	}

	@Override
	public void fly() {
		System.out.println("Airplane 비행!");
	}

	@Override
	public void land() {
		System.out.println("Airplane 착륙!");
	}
	
}// Airplane 클래스

