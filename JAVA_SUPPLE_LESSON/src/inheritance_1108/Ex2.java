package inheritance_1108;

public class Ex2 {

	public static void main(String[] args) {
		// 서브클래스인 SpiderMan 인스턴스 생성
		// -> 클래스명 참조변수명 = new 생성자명([전달인자..]);
		SpiderMan2 s = new SpiderMan2();
		// SpiderMan 클래스에는 정의되어 있지 않지만 
		// 슈퍼클래스인 Person 클래스가 가진 멤버들에 접근이 가능하다!
		s.setName("피터 파커");
		System.out.println(s.getName());
		// 서브클래스에서 오버라이딩한 talk(), jump() 메서드 호출!
		s.talk();
		s.jump();
		// SpiderMan 자신이 정의한 멤버 접근
		System.out.println(s.friend);
		s.fireWeb();
		s.talk();
		
		// 또한, Person 클래스뿐만 아니라 Person 클래스의 슈퍼클래스인 Object 에도 접근 가능
		System.out.println(s.toString());
		
		System.out.println("-----------------------------------------");
		IronMan2 i = new IronMan2();
		
		i.setName("토니 스타크");
		System.out.println(i.getName());
		
		i.talk();
		i.jump();
		// IronMan 자신이 정의한 멤버 접근
		i.fly();
		i.fireBeam();
		
		System.out.println("-----------------------------------------");

	}

}
