package inheritance_1109;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex {

	public static void main(String[] args) {
		// 서브클래스인 SpiderMan 인스턴스 생성
		// -> 클래스명 참조변수명 = new 생성자명([전달인자..]);
		SpiderMan s = new SpiderMan();
		// SpiderMan 클래스에는 정의되어 있지 않지만 
		// 슈퍼클래스인 Person 클래스가 가진 멤버들에 접근이 가능하다!
		
		s.setName("피터 파커");
		System.out.println(s.getName());
		
		s.talk();
		s.jump();
		// SpiderMan 자신이 정의한 멤버 접근
		System.out.println(s.friend);
		s.fireWeb();
		
		// 또한, Person 클래스뿐만 아니라 Person 클래스의 슈퍼클래스인 Object 에도 접근 가능
		System.out.println(s.toString());
		
		System.out.println("-----------------------------------------");
		IronMan i = new IronMan();
		
		i.setName("토니 스타크");
		System.out.println(i.getName());
		
		i.talk();
		i.jump();
		// IronMan 자신이 정의한 멤버 접근
		i.fly();
		i.fireBeam();
		
		System.out.println("-----------------------------------------");

		/*
		 * 다형성
		 * - 객체가 다른 형태로 변할 수 있는 성질
		 * - 주로, 업캐스팅을 의미함
		 * 
		 * 업캐스팅
		 * - 서브클래스 인스턴스를 슈퍼클래스 타입으로 변환하는 것
		 * 	 (슈퍼클래스 타입으로 여러 서브클래스 인스턴스를 참조하는 것)
		 */
		
		// 슈퍼클래스 타입인 Person 타입 변수 선언 후
		// 서브클래스 타입 SpiderMan 의 인스턴스를 전달(저장)
		Person p = s; // Person <- SpiderMan 형변환(=업캐스팅)
		// 업캐스팅 후에는 슈퍼클래스로부터 상속받은 공통 멤버에만 접근이 가능하다!
		
		p.talk();
		p.jump();
		
		System.out.println("-----------------------------------------");
		
		// 슈퍼클래스 타입 변수 p에 IronMan 인스턴스를 업캐스팅
		p = i; // Person <- IronMan
		
		p.jump();
		p.talk();
		
		System.out.println("-----------------------------------------");
		// 업캐스팅의 예)
		List list = new ArrayList<>();
		list = new LinkedList<>();
		List[] lists = {new ArrayList<>(), new LinkedList<>()};
		
		
	}

}
