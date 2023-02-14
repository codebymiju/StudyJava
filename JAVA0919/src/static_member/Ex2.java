package static_member;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * static 메서드 (= 정적 메서드)
		 * - 메서드 정의 시 리턴타입 앞에 static 키워드를 붙여서 정의
		 * - 클래스가 메모리에 로딩될 때 static 변수와 함께 메모리에 로딩되므로
		 * 	 인스턴스 생성과 무관
		 * - 클래스명만으로 접근 가능(클래스명.메서드명() 형태로 호출)
		 * 
		 *  < static 메서드 정의 시 주의 사항 >
		 *  1. 인스턴스 변수 사용 불가
		 *  	=>  static 메서드가 로딩되는 시점 > 인스턴스 변수 - 인스턴스 생성 시점
		 *  	=>  static 메서드 로딩되는 시점에 인스턴스 변수는 로딩되지 않아 존재x
		 *  
		 *  2. 레퍼런스 this 또는 super 사용 불가
		 * 	   => 원인 : static 메서드가 로딩되는 시점은 클래스 로딩 시점이며
		 * 				 레퍼런스 this는 인스턴스 생성 시점에서 생성되므로
		 * 				 static 메서드가 로딩되는 시점에서는 존재하지 않는다!
		 * 	   => 해결책 : this.XXX 또는 super.XXX 대신
		 * 				   클래스명.XXX 형식으로 접근
		 *  
		 *  3. 메서드 오버라이딩 불가(상속 단원에서 배움)
		 *   
		 */
		
		// static 메서드도 static 멤버변수처럼 인스턴스 생성과 무관하므로 
		// 인스턴스 생성 없이도 클래스명만으로 접근 가능
		StaticMethod.staticMethod(); // 정적 메서드 호출 (올바른 접근 문법)
		
//		StaticMethod.staticVar = 99; //private 접근제한자 적용 시 접근 불가
		// -> setter 를 호출하여 접근 가능
		StaticMethod.setStaticVar(99);
		
		// StaticMethod 클래스 인스턴스 생성
		StaticMethod sm = new StaticMethod();
		
		// normalMethod(), staticMethod() 메서드 호출
		sm.normalMethod(); // 일반 메서드 호출 : 참조변수명.메서드
		sm.staticMethod(); // 정적 메서드 호출 (올바른 표현은 아님)
		StaticMethod.staticMethod(); // 정적 메서드 호출 (올바른 접근 문법)
		
	}

}

class StaticMethod {
	// 인스턴스 멤버변수 normalVar 선언(int형) - 10 초기화
	private int normalVar = 10;
	// 정적 멤버변수 staticVar 선언(int형) - 20 초기화
	private static int staticVar = 20;
	
	// 일반 메서드 normalMethod() 메서드 정의 - 파라미터, 리턴값 없음
	public void normalMethod( ) {
		System.out.println("일반 메서드 normalMethod()");
		
		// 일반 메서드는 인스턴스가 생성되는 시점에 메모리에 로딩됨
		System.out.println("일반 메서드에서 인스턴스 변수 접근 : " + normalVar);
		System.out.println("일반 메서드에서 static 변수 접근 : " + staticVar);
		
		// 일반 메서드에서 static 메서드 호출 가능!
		staticMethod();
		
	}
	
	// static 메서드 staticMethod() 메서드 정의 - 파라미터, 리턴값 없음
	public static void staticMethod() {
		System.out.println("정적 메서드 staticMethod()");
		
		// static 메서드는 클래스가 메모리에 로딩되는 시점에 함께 로딩됨
//		System.out.println("static 메서드에서 인스턴스 변수 접근!" + normalVar);
		// -> 컴파일 에러 발생 (인스턴스 변수는 아직 메모리에 로딩되기 전이라 접근불가!)
		System.out.println("static 메서드에서 static 변수 접근 : " + staticVar);
		
		// static 메서드에서 일반 메서드 호출 불가! (변수의 원인과 동일)
//		normalMethod(); 
		
	}//alt + shift + s > r (getter/setter)
	
	// 인스턴스 변수 normalVar 에 대한 Setter 정의
	public void setNormalVar(int normalVar) {
		this.normalVar = normalVar;
	}

	// static 변수 staticVar 에 대한 Setter 정의
	public static void setStaticVar(int staticVar) {
		StaticMethod.staticVar = staticVar; //레퍼런스 this 대신 클래스명으로 static 변수 접근 가능
		
//		this.staticVar = staticVar; // static 메서드 내에서 레퍼런스 this 사용 불가
		// 레퍼런스 this는 인스턴스 생성 시점에 생성되지만 
		// static 메서드가 로딩되는 시점에는 레퍼런스 this 가 존재하지 않음
	}
	
 }
