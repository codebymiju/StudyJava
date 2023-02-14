package nested_class;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 *  익명(anonymous) 객체
		 *  - 이름이 없는 객체
		 *  - 클래스 선언과 객체의 생성을 동시에 하기 때문에 
		 *    단 한번만 사용 가능한 일회용 클래스!
		 *  - 이름 x = 생성자 가질 수 없음
		 *  
		 * < 익명 객체 문법 >
		 * new 슈퍼클래스이름() {
		 * 		// 멤버 선언
		 * };
		 * 
		 * 또는
		 * 
		 * new 구현인터페이스이름() {
		 * 		// 멤버 선언
		 * };
		 * 
		 * 익명객체를 사용하면 참조변수가 없기 때문에 한번만 사용하고 사라짐
		 * 멤버 선언 - 오버라이딩 등 / 따로 클래스 정의 하지 않아도
		 * 같은 결과를 내는 인스턴스 생성 및 활용이 가능하다!
		 */
		
		Parent p = new Child(); // 업캐스팅 발생!
		p.wake(); // 동적바인딩 (오버라이딩된 자식클래스의 wake메서드가 호출됨)
		System.out.println("==================================================");
		
		Child c = new Child();
		c.method2(new Child2());
		// -> method2의 파라미터 = Parent p 이므로 서브클래스인 
		//    Child2 클래스의 객체가 파라미터 값으로 사용될 수 있다!
		
		System.out.println("==================================================");
		
		AnonymousClass anony = new AnonymousClass();
		anony.p.wake(); // 익명변수(참조변수).멤버변수.멤버메서드()

		System.out.println();
		
		Parent parent = anony.p; // p는 Parent 타입이므로 Parent 타입 변수에 저장 가능
		parent.wake();
		
		System.out.println("==================================================");
		
//		C c = new C(); 
		// 지역(로컬) 내부 클래스는 객체를 바로 생성할 수 없음!
		// -> 즉, C 클래스를 사용하려면 클래스 직접 생성하는 것이 아니라
		//	  method1() 메서드 호출을 통해 생성된 객체를 리턴(반환) 받아야 함
		
		Parent parent2 = anony.method1();
		parent2.wake();
		
		System.out.println();
		
		Parent parent3 = anony.anonyMethod1();
		parent3.wake();
		
		System.out.println("==================================================");
//		I i = new I();
//		i.wake();
		// 인터페이스 요소에 생성자가 없기 때문에 인스턴스 생성 불가!
		
		// 인터페이스 익명 객체
		I i = new I() {

			@Override
			public void wake() {
				System.out.println("9시에 일어납니다!");
			}
			
		};
		
		i.wake();
	}

}

//=============================================================
// 인터페이스 익명 객체
interface I {
	public abstract void wake();
}

class Parent {
	public void wake() {
		System.out.println("7시에 일어납니다!");
	}
} // Parent

class Child extends Parent {
	public void work() {
		System.out.println("출근합니다!");
	}

	@Override
	public void wake() {
		System.out.println("6시에 일어납니다!");
		work();
	}
	
	public void method2(Parent p) {
		p.wake();
	}
	
} // child

class Child2 extends Parent {
	public void study() {
		System.out.println("공부합니다!");
	}

	@Override
	public void wake() {
		System.out.println("4시에 일어납니다!");
		study();
	}
	
}// Child2


class AnonymousClass {
	// AnonymousClass 클래스의 필드(멤버변수) 선언
	Parent p = new Parent() {
		public void work() {
			System.out.println("출근합니다!");
		}

		@Override
		public void wake() {
			System.out.println("6시에 일어납니다!");
			work();
		}	
	};
	
	// 지역(로컬) 내부 클래스 활용
	public Parent method1() { // 메서드의 리턴타입이 Parent
		class C extends Parent { 
			// 리턴 타입이 Parent 이므로 Parent 타입의 객체를
			// 반환하기 위하여 메서드 내부에 클래스 정의						
			public void walk() {
				System.out.println("강아지와 함께 산책합니다.");
			}

			@Override
			public void wake() {
				System.out.println("5시에 일어납니다.");
				walk();
			}
		}
		return new C(); // C 클래스 생성 후 반환
	}// method1()
	
	// 위의 지역 내부 클래스를 익명 내부 클래스로 변경하면 아래와 같음
	public Parent anonyMethod1() { // 익명 내부 클래스
		return new Parent() {
			public void walk() {
				System.out.println("고양이와 함께 산책합니다!");
			}
			@Override
			public void wake() {
				System.out.println("5시에 일어납니다.");
				walk();
			}
		};  
	}// anonyMethod1()
	
	public void method2(Parent p) {
		p.wake();
	}
	
} // AnonymousClass








