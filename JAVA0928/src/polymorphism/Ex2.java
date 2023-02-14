package polymorphism;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * instanceof 연산자
		 * - 좌변의 객체(참조변수)가 우변 클래스의 타입인지 판별하는 연산자
		 * - 판별 결과가 true이면 형변환이 가능한 관계(업캐스팅 or 다운캐스팅)
		 * 	 판별 결과가 false이면 절대 형변환 불가
		 * 
		 * < 기본 정의 >
		 *  A is a B = A instanceof B
		 *  부모 = 자식 (왼쪽이 부모, 오른쪽이 자식)
		 *  
		 * < 기본 문법 >
		 * if(A instanceof B) { // A : 참조변수(객체), B : 클래스명(타입)
		 * 		// 형변환 가능 관계이므로 변환 수행
		 * } else {
		 *      // 절대 형변환 불가능한 관계이므로 변환 수행 X
		 * }
		 */
		
		// 서브클래스(SmartPhone)의 인스턴스(sp)를 생성
		SmartPhone sp = new SmartPhone("갤럭시 z플립4", "010-1234-5678", "안드로이드");
		
		//호출 가능한 메서드 : 3개
		sp.call();
		sp.sms();
		sp.kakaoTalk();
		
		// sp 는 SmartPhone 입니까? True
		if(sp instanceof SmartPhone) {
			System.out.println("sp는 SmartPhone 이다!");
			SmartPhone phone = sp;
		} 
		
		System.out.println("========================================");
		
		// 업캐스팅 가능 대상 확인
		// sp 는 HandPhone 입니까? True
		if(sp instanceof HandPhone) {
			System.out.println("sp는 HandPhone 이다!");
			System.out.println("그러므로 sp를 HandPhone 으로 형변환 가능하다!");
			
			// sp > HandPhone 타입 (hp) 으로 변환
			HandPhone hp = sp; // 업캐스팅 > 묵시적(자동) 형변환
			System.out.println("sp는 HandPhone이 가진 모든 기능을 포함한다!");
			System.out.println("따라서, 업캐스팅 이후에도 HandPhone의 기능 사용 가능!");
			
			hp.call();
			hp.sms();
//			hp.kakaoTalk(); // 사용 불가능!
			
		} else {
			System.out.println("sp 는 HandPhone이 아니다!");
		}
		
		System.out.println("========================================");
		// 다운캐스팅 가능 대상 확인
		// 슈퍼클래스 타입 인스턴스 생성
		HandPhone hp = new HandPhone("애니콜", "011-878-9056");
		
		// hp는 SmartPhone 입니까? false
		if(hp instanceof SmartPhone) {
			System.out.println("hp는 SmartPhone 이다!");
		} else {
			System.out.println("hp는 SmartPhone 이 아니다!");
			System.out.println("그러므로, SmartPhone 으로 변환 불가능!");
			System.out.println("hp는 SmartPhone 이 가진 기능을 모두 포함하지 못함!");
		}

		
		System.out.println("========================================");
		
		// 다운캐스팅 가능 대상 확인 (가능한 경우)
		// SmartPhone > HandPhone 타입(hp2) 으로 업캐스팅
		HandPhone hp2 = new SmartPhone("갤럭시 z플립4", "010-1234-5678", "안드로이드");
		
		// 업캐스팅 후에는 참조 영역 축소로 접근 범위가 줄어들게 됨
		hp2.call();
		hp2.sms();
//		hp2.kakaoTalk(); // 접근 불가
		
		// hp2 는 SmartPhone 입니까? yes
		if(hp2 instanceof SmartPhone) {
			System.out.println("hp2 는 SmartPhone 이다!");
			System.out.println("그러므로 hp2는 SmartPhone 으로 형변환 가능!");
			
			SmartPhone sp2 = (SmartPhone)hp2;
			System.out.println("sp2 는 SmartPhone 이 가진 모든 기능을 포함한다!");
			sp2.call();
			sp2.sms();
			sp2.kakaoTalk();
		} else {
			System.out.println("hp2 는 SmartPhone 이 아니다!");
		}
		
		System.out.println("===================================");
		
		Child c = new Child();
		
//		Parent p;
//		p = c; // Parent p = new Child(); 업캐스팅
//		p.parentPrn();
//		
//		Parent p2 = new Parent();
//		Child c2 = (Child)p2; // 강제 형변환
		// -> 업캐스팅 후 다운캐스팅이 아니라
		//    다운캐스팅을 바로 수행해서 논리적(실행)오류가 발생!
		
		if(c instanceof Parent) {
			System.out.println("c는 Parent 이다!");
			Parent p = c;
			p.ParentPrn();
		} else {
			System.out.println("c는 Parent 가 아니다!");
		}
		
//		Parent p2 = new Parent();
//		Child c2 = (Child)p2; // 강제 형변환
		// -> 업캐스팅 후 다운캐스팅이 아니라
		//    다운캐스팅을 바로 수행해서 논리적(실행)오류가 발생!
		
		Parent p2 = new Parent();
		// Parent > Child 변환 가능 여부 판별 후 변환
		if(p2 instanceof Child) {
			System.out.println("p2는 Child 이다!");
			
			Child c2 = (Child)p2;
			c2.childPrn();
		
		} else {
			System.out.println("p2는 Child 가 아니다!");
		}
		
		
		
	}

}

class HandPhone {
	String modleName;
	String phoneNumber;
	
	public HandPhone(String modleName, String phoneNumber) {// 파라미터 생성자
		super();
		this.modleName = modleName;
		this.phoneNumber = phoneNumber;
	}
	
	public void call() {
		System.out.println("전화 기능!");
	}
	
	public void sms() {
		System.out.println("문자 기능!");
	}
}

class SmartPhone extends HandPhone { // alt+shift+o > 파라미터 생성자 생성
	String osName;

	public SmartPhone(String modleName, String phoneNumber, String osName) {
		super(modleName, phoneNumber);
		this.osName = osName;
	}
	
	public void kakaoTalk() {
		System.out.println("카톡 기능!");
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





