package inheritance_1110;

// Person 클래스를 상속받는 SpiderMan 클래스
public class SpiderMan extends Person {
	// SpiderMan 클래스만의 멤버변수 및 메서드 정의(추가) 가능함
	String friend = "네드 리즈";
	
	public void fireWeb() {
		System.out.println("SpiderMan - 거미줄 발사!");
	}
}
