package access_modifier_p2;

import access_modifier_p1.ParentClass; // import 있어야 상속 받을 수 있음

public class OtherPackageChildClass extends ParentClass{
	
	public void useMember() {
		// 다른 패키지 내의 상속 관계인 부모 클래스(ParentClass)의 멤버에 접근
		// -> 슈퍼클래스의 멤버에 접근할 때는 참조변수 없이 접근함
		// 		(또는 레퍼런스 this를 통해 접근)
		this.publicVar = 10;
		this.protectedVar = 20; // extends 통해서 protected도 접근 가능
								// 다른 패키지이지만, 상속 관계이므로 접근 가능
//		this.defaultVar = 30;   // 다른 패키지에서 접근 불가
//		this.privateVar = 40;   // 다른 클래스에서 접근 불가
		
		//================================================================
		// 서브클래스에서 슈퍼클래스의 인스턴스 생성 후 참조변수를 통해 접근 시
		// is-a 관계가 아닌 has-a 관계로 취급되므로 protected 도 접근 불가능
		// -> 즉, 상속 관계가 아닌 별도의 인스턴스로 취급됨
		ParentClass p = new ParentClass();
		p.publicVar = 10;
//		p.protectedVar = 20; // this는 상속, 상속 받았다고 하더라도 참조변수로
	    // 접근 시 접근되지 않음
				
	
	}
	
	
}
