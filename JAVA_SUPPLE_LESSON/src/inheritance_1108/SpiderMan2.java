package inheritance_1108;

// Person 클래스를 상속받는 SpiderMan 클래스
public class SpiderMan2 extends Person {
	// SpiderMan 클래스만의 멤버변수 및 메서드 정의(추가) 가능함
	String friend = "네드 리즈";
	
	public void fireWeb() {
		System.out.println("SpiderMan - 거미줄 발사!");
	}
	
	public void jump() {
		System.out.println("SpiderMan - 고공 점프!");
	}

	// 자동 오버라이딩 단축키 alt_shift_s_v
	@Override // 오버라이드 어노테이션 - 오버라이딩으로 선언하고 오버로딩으로 고치면 오류남
	public void talk() {
		System.out.println("SpiderMan - 수다 떨기!");
	}
	
}
