package access_modifier_p2;

import access_modifier_p1.ParentClass; // p1.*  = 클래스 내 전체 패키지 접근 가능

public class OtherPackageSomeClass {
	
	public void useMember() {
	// 다른 패키지의 상속 관계가 아닌 다른 클레스에 접근
	// -> 인스턴스 생성 후 참조변수를 통해 접근해야함 = has-a 관계
	// -> 다른 패키지이므로 import문이 필요!
		ParentClass p = new ParentClass();
//		SamePackageSomeClass spsc = new SamePackageSomeClass();
		p.publicVar = 10; // 다른 패키지의 다른 클래스 접근은 public만 가능
//		p.protectedVar = 20; // 패키지 다르고, 상속 관계가 아니므로 접근 불가
//		p.defaultVar = 30; // 다른 패키지에서 접근 불가
//		p.privateVar = 40; // 다른 클래스에서 접근 불가
		
	}	
}
