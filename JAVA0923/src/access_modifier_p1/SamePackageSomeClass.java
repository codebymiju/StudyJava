package access_modifier_p1;

public class SamePackageSomeClass {
	
	public void useMember() {
		// 같은 패키지 내의 다른 클래스(ParentClass)의 멤버에 접근
		// static이 붙어있지 않기에 인스턴스를 만들어야지만 접근가능!
		// -> 인스턴스 생성 후 참조변수를 통해 접근해야함 = has-a 관계
		// -> 같은 패키지이므로 import문이 불필요!
		ParentClass p = new ParentClass();
		p.publicVar = 10;
		p.protectedVar = 20;
		p.defaultVar = 30;
//		p.privateVar = 40; // private - 다른 클래스에서 접근 불가
	}
	
}

