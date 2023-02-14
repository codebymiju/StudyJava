package super_;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 *  < 상속에서 생성자 >
		 * - 생성자는 상속되지 않음
		 *    -> 생성자 이름은 자신의 클래스 이름과 동일한데
		 *       만약, 상속받을 경우 생성자 이름이 부모 클래스 이므로
		 *       생성자 작성 규칙에 위배됨
		 *       
		 *  < 생성자 super() >
		 *  - 슈퍼클래스의 생성자를 명시적으로 호출할 때 사용
		 *  - 기본 문법 : super([데이터...]);
		 *  - 목적 1) 슈퍼클래스 생성자 중 특정 생성자를 명시적으로 
		 *  		  호출할 경우
		 *  - 목적 2) 슈퍼클래스의 생성자에 멤버변수 초기화 코드가 존재할 경우
		 *  		  
		 *  - 주의! 생성자 super() 는 반드시 생성자의 첫 문장에서 실행되어야 함!
		 *     -> 따라서, 생성자 내에서 super() 와 this() 동시 사용 불가!
		 */
		
		Student s = new Student();
		
	}

}

class Person {
	String name;
	int age;
	
	public Person() {} // 기본 생성자 //1번 방법

	public Person(String name, int age) { // alt+shift+o
		super(); // Object 
		this.name = name;
		this.age = age;
		System.out.println("Person(String, int) 생성자 호출됨!");
	}
}

class Student extends Person {
	boolean isStudyMode; //boolean의 기본값 : false!
	
	public Student() {
		// 서브클래스의 기본 생성자에서 슈퍼클래스인 Person 클래스의 
		// 기본생성자를 ( = public Person() {} ) 자동으로 호출하게 되는데
		// 만약, 슈퍼클래스 생성자가 파라미터(를 받는) 생성자만 존재할 경우 오류 발생!
//		super(); // 암묵적으로 생성자내에 포함됨
		// 1. 슈퍼클래스에서 기본 생성자를 별도로 정의하거나
		// 2. 서브클래스에서 슈퍼클래스의 파라미터 생성자를 명시적으로 호출
		
		
//		super("홍길동",25); // 2번 방법 : 생성자를 호출하기 위한 의미없는 리터럴값(중요X)
//		isStudyMode = true;
		
		// 슈퍼클래스의 생성자(=super('홍길동',25))를 호출하지 않고 자신의 다른 생성자를 호출하여
		// 해당 생성자 내에서 다시 슈퍼클래스의 생성자를 호출해야 된다!
		this("홍길동", 20, true); // 초기화 코드 중복 제거
		
		System.out.println("Student() 생성자 호출됨!");
	}
	
	public Student(String name, int age, boolean isStudyMode) {
		// Student 클래스 생성자에서 모든 멤버변수를 직접 초기화
//		super();
//		this.name = name;
//		this.age = age;
//		this.isStudyMode = isStudyMode;
		
		// name 과 age 멤버변수를 초기화하는 코드는
		// 슈퍼클래스인 Person 클래스의 생성자 초기화 코드와 중복됨
		// 따라서, 슈퍼클래스로부터 상속받은 멤버변수 초기화는
		// 슈퍼클래스의 생성자에서 수행하고, 서브클래스의 멤버만 초기화를 직접 수행
		// -> 이 때, 슈퍼클래스의 파라미터 생성자를 호출하여 대신 초기화를 수행
		
		super(name, age); // 슈퍼클래스의 생성자에 name, age 전달하여 대신 초기화
		this.isStudyMode = isStudyMode; // 자신의 멤버변수만 직접 초기화
	}
	
}