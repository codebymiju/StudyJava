package inheritance_1116;

public class Ex {

	public static void main(String[] args) {
		SpiderMan s = new SpiderMan();
		s.jump();
		System.out.println("---------------------------------");
		Person p = s; // 객체의 동적 바인딩 
		p.jump();
		System.out.println("---------------------------------");
		p = new IronMan();
		p.talk();
		p.jump();
	}

}

class Person {
	private String name;
	
	public Person() { // 기본 생성자
		super();
	}

	 // 생성자 : alt + shift + s + o (멤버변수에 있는 것으로 생성자 만들때)
	public Person(String name) { 
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void talk() {
		System.out.println("Person의 말하기!");
	}
	
	public void jump() {
		System.out.println("Person의 점프!");
	}
} // Person

class SpiderMan extends Person {
	
	// SpiderMan 클래스만의 멤버변수 및 메서드 정의(추가) 가능함
		String friend = "네드 리즈";
		
		public void fireWeb() {
			System.out.println("SpiderMan - 거미줄 발사!");
		}

		@Override
		public void jump() {
			System.out.println("SpiderMan - 고공 점프!");
		}
		
} // SpiderMan

class IronMan extends Person {
	
	public void fly() {
		System.out.println("IronMan - 비행!");
	}
	
	public void fireBeam() {
		System.out.println("IronMan - 빔 발사!");
	}

	@Override
	public void talk() {
		System.out.println("IronMan - 잔소리!");
	}
	
} // IronMan













