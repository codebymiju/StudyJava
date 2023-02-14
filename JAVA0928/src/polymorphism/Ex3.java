package polymorphism;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 *  동적 바인딩
		 * - 상속 관계에서 업캐스팅 후 메서드를 호출할 때
		 *   컴파일 단계에서의 실행 대상과, 실제 실행 단계에서의
		 *   실행 대상이 달라진 것
		 * - 참조 변수의 타입과 무관하게 실제 인스턴스의 메서드를 실행하게 됨
		 *  
		 */

		// 슈퍼클래스 타입 인스턴스 생성
		Parent3 p = new Parent3();
		p.parentPrn();
		
		// 서브클래스 타입 인스턴스 생성
		Child3 c = new Child3();
		c.childPrn();
		c.parentPrn(); // 새롭게 오버라이딩된 parentPrn이 자리 차지
		
		System.out.println("==================================");
		
		// 서브클래스 타입 인스턴스 > 슈퍼클래스 타입으로 업캐스팅
		p = c; // Parent3 p = new Child3();
		p.parentPrn(); // Child 인스턴스의 오버라이딩 된 메서드가 호출됨!
		
		
		
	}

}

class Parent3 {
	
	public void parentPrn() {
		System.out.println("슈퍼클래스의 parentPrn(");
	}
	
}

class Child3 extends Parent3 {
	
	public void childPrn() {
		System.out.println("서브클래스의 childPrn()");
	}

	@Override
	public void parentPrn() {
		System.out.println("서브클래스에서 오버라이딩된 parentPrn()");
	}
	
	
}
