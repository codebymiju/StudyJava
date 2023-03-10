package nested_class;

public class Ex2 {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.method();
		
	}

}

class Outer2 {
	private int num = 10; // 인스턴스 멤버변수

	public void method() {
		System.out.println(num);
		
//		public int num2 = 20; // 지역(로컬) 변수
		// Illegal modifier for parameter num2; only final is permitted
		// -> 로컬 변수라 외부에서 접근 불가! 접근제한자가 의미 없기에 에러 발생!
		
		// 로컬 내부 클래스에 접근하기 위해서는
		// 클래스 선언부보다 아래쪽에서 접근해야 함!
//		LocalInner localInner = new LocalInner();
//		System.out.println(localInner.name);
		
		
		// 로컬 내부 클래스 정의
		// -> 메서드 내에서 정의하며, 특정 메서드에서만 사용 가능한 클래스
		// -> 로컬 변수와 마찬가지로 접근제한 사용 불가
		
		class LocalInner {
			String name = "LocalInnerClass"; // 지역 내부 클래스의 인스턴스 변수
			
			public LocalInner() {
				System.out.println("LocalInner() 생성자 호출됨!");
			}
			
			public void print() {
				System.out.println("로컬 내부클래스의 인스턴스 멤버 메서드!");
			}
			
		}// 로컬 내부 클래스 LocalInner
		
		// 로컬 내부 클래스의 인스턴스 생성(일반 클래스처럼 사용 가능)
		LocalInner localInner = new LocalInner();
		System.out.println(localInner.name);
		localInner.print();
		
	}// method()
	
}// Outer2
