package interface_;

public class Ex2 {

	public static void main(String[] args) {
		고래상어 고래상어인스턴스 = new 고래상어();
		고래상어인스턴스.번식();
		
		동물 동물인스턴스 = 고래상어인스턴스; // 업캐스팅
		동물인스턴스.번식();
	}

}

// 고래와 상어의 특징을 추상화하여 동물 인터페이스로 정의 
interface 동물 {
	// 인터페이스 내의 모든 메서드는 추상메서드
	public abstract void 번식(); // 추상메서드 = 바디가 없는 메서드
}

// 헤엄칠 수 있는 특징을 갖는 인터페이스 정의
interface 헤엄칠수있는 {}

// 동물 인터페이스와 헤엄칠수있는 인터페이스를 상속받는
// 서브인터페이스 고래, 상어 정의
interface 고래 extends 동물, 헤엄칠수있는 {}
interface 상어 extends 동물, 헤엄칠수있는 {}

// 고래와 상어 인터페이스를 동시에 상속받아 구현하는 서브클래스 고래상어 정의
class 고래상어 implements 고래, 상어 { // alt_shift_s_v = 오버라이드

	@Override
	public void 번식() {
		System.out.println("알을 낳아 번식!");
		
	}
	
}

//======================= 다이아몬드 상속에서의 문제점(이슈)========================
// 번식() 메서드를 갖는 슈퍼클래스 동물 클래스를 정의하고
// 고래와 상어클래스에서 동물클래스를 상속 받기

abstract class 동물2{
	public abstract void 번식();
}

class 고래2 extends 동물2 {

	@Override
	public void 번식() {
		System.out.println("새끼를 낳아 번식!");
		
	}
	
}

class 상어2 extends 동물2 {

	@Override
	public void 번식() {
		System.out.println("알을 낳아 번식!");
		
	}
	
}

// 만약, 다중 상속을 허용할 경우 발생하는 문제점
// -> 고래와 상어 클래스를 동시에 상속받는 고래상어 클래스 정의

//class 고래상어 extends 고래, 상어 {
//	
//	외부 또는 내부에서 고래와 상어클래스가 공통적으로 갖는
//	번식()메서드를 호출하게 되면 어느 객체의 번식()메서드를 호출하는지
//	분명하지 않기 때문에 자바에서 다중 상속은 금지되어 있음!
//	고래상어.번식();
//	
//}





















