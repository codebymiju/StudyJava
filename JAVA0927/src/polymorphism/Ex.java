package polymorphism;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 레퍼런스 형변환
		 * - 어떤 객체(인스턴스)를 다른 타입으로 변환하는 것
		 * - 참조형 데이터타입간의 변환
		 * - 반드시 상속 관계가 전제되어야 함 (슈퍼클래스타입 <-> 서브클래스타입)
		 * - 묵시적 형변환(Up Casting, 업캐스팅 / sub > super)과 
		 *   명시적 형변환(Down Casting, 다운캐스팅 / super > sub)으로 구분
		 *   
		 *   1. 업캐스팅(Up Casting)
		 * - 슈퍼클래스 타입 레퍼런스로 서브클래스 인스턴스를 참조하는 것
		 * 	( 참조 가능한 영역이 축소됨 )
		 *   = 서브클래스의 인스턴스를 슈퍼클래스 타입으로 변환하는 것
		 */
		
		// 슈퍼클래스 Parent 타입 인스턴스 생성
//		Parent p = new Parent();
//		// Parent 타입으로 접근 가능한 메서드 : 1개
//		p.ParentPrn();
		
		System.out.println("======================================");
		
		// 서브클래스 Child 인스턴스 생성
		Child c = new Child();
		// Child 타입으로 접근 가능한 메서드 : 2개
		c.childPrn(); 
		c.ParentPrn();
		
		System.out.println("======================================");
		
		//================= 업캐스팅 ( sub > super )==================
		int iNum = 10;
		long lNum = iNum; // 자동 형변환 ( 작은 타입 > 큰 타입 )
		
		// 슈퍼클래스타입 Parent의 레퍼런스 변수 선언
		Parent p;
		// 슈퍼클래스타입 변수 p 에 서브클래스 타입 Child 인스턴스 참조변수를 전달
		p = c; // 묵시적 형변환(업캐스팅) : Parent p = new Child();
		
		System.out.println("p와 c의 인스턴스가 동일한가? " + (p == c));
		
		// Parent 타입 레퍼런스 변수 p로 접근 가능한 메서드 : 1개
		p.ParentPrn(); // 자신의 메서드(접근 가능)
//		p.childPrn(); // 서브클래스에서 정의한 메서드(접근 불가)
		// -> 슈퍼클래스 타입으로 업캐스팅 후에는 상속된(공통) 메서드만 호출
		
		System.out.println("=======================================");
		
		/*
		 *  2. 다운캐스팅 (Down Casting)
		 * - 서브클래스의 레퍼런스가 슈퍼클래스의 인스턴스를 참조하는 것
		 *   ( 참조 가능한 영역이 확대됨 )
		 *   -> 슈퍼클래스의 인스턴스를 서브클래스 타입으로 형변환 하는 것 
		 */
		
		// 슈퍼클래스 Parent 타입 인스턴스 생성
		Parent p2 = new Parent();
		// 슈퍼클래스 Parent 타입 변수 p2로 접근 가능한 메서드 : 1개
		p2.ParentPrn();
		
		// 서브클래스 Child 타입 변수 c2 선언
		Child c2;
		// 서브클래스타입 변수 c2에 슈퍼클래스 타입 인스턴스 전달
//		c2 = p2; // 컴파일에러 발생! (슈퍼 > 서브로 자동 형변환 불가)
		
//		c2 = (Child)p2; // Parent > Child 타입으로 강제 형변환(=다운캐스팅)
//		
//		c2.ParentPrn(); // 실제 Parent 인스턴스에 존재하는 메서드
//		c2.childPrn(); // 실제 Parent 인스턴스에 존재하지않는 메서드
		
		// 기본적으로 자바에서는 다운캐스팅을 허용하지 않음!
		System.out.println("=========================================");
		
		// 다운캐스팅이 가능한 경우
		// child 타입 인스턴스를 Parent 타입 변수 p3에 전달 = 업캐스팅
		Parent p3 = new Child(); 
		// 업캐스팅에 의해 참조 영역이 축소됨. 접근 가능한 메서드 : 1개
		p3.ParentPrn(); // 상속된(공통) 메서드
		
		// 업캐스팅 된 Parent 타입 p3의 인스턴스를 Child 타입 변수 c3에 전달
		Child c3 = (Child)p3; // 다운캐스팅 수행
		
		// 다운캐스팅에 의해 참조 영역이 확대되므로 접근 가능한 메서드 : 2개
		c3.ParentPrn(); // 상속된(공통) 메서드
		c3.childPrn(); // 상속되지 않은(서브클래스에서 정의한) 메서드
		// -> 다운캐스팅 후에도 아무런 문제없이 사용이 가능하다.
	}

}

class Parent {
	// Parent 클래스의 멤버 : 1개(자신의 멤버)
	public void ParentPrn() {
		System.out.println("슈퍼클래스의 ParentPrn()");
	}
}

class Child extends Parent {
	// Child 클래스의 멤버 : 1개(자신의 멤버 & 상속받은 멤버)
	public void childPrn() {
		System.out.println("서브클래스의 childPrn()");
	}
}
