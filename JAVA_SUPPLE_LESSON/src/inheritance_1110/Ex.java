package inheritance_1110;

import java.util.ArrayList;
import java.util.List;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 다운캐스팅
		 * 
		 */

		// 슈퍼클래스 타입 Person 인스턴스 생성
		// 다른 패키지의 인스턴스 생성 > import 필요
		Person p = new Person();
		p.jump();
		p.talk();
		
		System.out.println("--------------------------------------------");
		
//		SpiderMan s = p;
//		SpiderMan s = (SpiderMan)p;
//		s.talk();
		
		Person p2 = new SpiderMan();
		p2.talk();
		p2.jump();
		
		System.out.println("--------------------------------------------");
		
		SpiderMan s2 = (SpiderMan)p2;
		s2.fireWeb();
		s2.talk();
		s2.jump();
		
		System.out.println("--------------------------------------------");
		
		List memberList = new ArrayList();
		
		memberList.add(new MemberDTO("홍길동"));
		memberList.add(new MemberDTO("이순신"));
		memberList.add(new MemberDTO("강감찬"));

		System.out.println(memberList);
		
		for(int i = 0; i < memberList.size(); i++) {
			Object o = memberList.get(i);
			MemberDTO member = (MemberDTO)o;
			
			System.out.println("이름 : " + member.getName());
			
		}
		
	}

}

class MemberDTO {
	
	private String name;

	public MemberDTO(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MemberDTO [name=" + name + "]";
	}
	
}
