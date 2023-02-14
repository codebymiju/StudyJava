package object;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 *  toString() 메서드 (public String toString() {} )
		 * - 어떤 객체의 정보를 문자열로 변환하여 리턴
		 * - 기본적으로 Object 클래스의 toString() 메서드는 
		 *   객체의 정보(=주소값)을 문자열로 리턴하도록 정의되어 있음.
		 * - 일반적으로 객체의 정보는 객체 내의 멤버변수에 저장된 데이터(속성값)를
		 *   의미하므로 Object 클래스의 toString() 메서드를 오버라이딩하여
		 *   객체가 가진 멤버변수 값을 문자열로 결합하여 리턴하도록 해야함
		 * 
		 * - 단축키를 통한 자동 생성 가능
		 *  => Alt + Shift + S -> s
		 */
		
		String str = new String("정신꽉자바"); // String 타입도 객체이다!
		System.out.println(str); // toString() 메서드 생략되어 있음(문자열 출력)
		System.out.println(str.toString()); // 위의 결과와 동일함(문자열 출력)
		
		Person3 p = new Person3("홍길동", 20, "031010-1234567");
		System.out.println("사람 p의 정보 : " + p.toString());
		System.out.println("사람 p의 정보 : " + p); // 결과 동일
		
		
		String personInfo = p.toString();
		
		System.out.println("Person p 의 클래스명 : " + p.getClass().getName());
		System.out.println("Person p 의 주소값 : " + p.hashCode());
		
	}

}

class Person3 {
	String name;
	int age;
	String jumin;
	
	public Person3(String name, int age, String jumin) {
		super();
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}
}


class Person2 {
	String name;
	int age;
	String jumin;
	
	public Person2(String name, int age, String jumin) {
		super();
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}
	
	@Override
	public String toString() {
		// 현재 인스턴스가 가진 멤버변수들을 모두 문자열로 결합하여 리턴
		// => 결합하는 형태(출력 모양)는 개발자가 알아서 결정
		return "이름 : " + name + ", 나이 : " + age + ", 주민번호 : " + jumin;
	}
	
}






