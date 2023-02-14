package inheritance_1109;

public class Person {
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
	
}
