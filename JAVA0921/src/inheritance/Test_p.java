package inheritance;

public class Test_p {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동";
		
		System.out.println("================================");
		Student s2 = new Student();
		s2.eat();
		s2.sleep();
		s2.study();
	}

}

/*
 * Person 클래스 정의
 * - 멤버변수 : 이름(name, 문자열), 나이(age, 정수), 배고픔(isHungry, boolean)
 * - 기본 생성자 정의
 *   -> "Person() 생성자 호출됨!" 출력
 * - 메서드 정의
 *   eat() : 파라미터 없고, 리턴값 없음 -> "밥먹기!" 출력
 *   sleep() : 파라미터 없고, 리턴값 없음 -> "잠자기!" 출력
 */

/*
 * Person 클래스를 상속받는 Student 클래스 정의
 * - 멤버변수 : 공부모드(isStudyMode, boolean)
 * - 기본 생성자 정의
 *  => "Student() 생성자 호출됨!" 출력
 * - 4개의 멤버변수 값을 입력받아 초기화하는 생성자 정의
 *  -> "Student(String, int, boolean, boolean) 생성자 호출됨!" 출력
 * - 메서드 정의
 *   study() : 파라미터 없고, 리턴값 없음 -> "공부하기!" 출력 
 *   
 */

class Person {
	String name;
	int age;
	boolean isHungry;
	
	public Person() {
		super(); // Object 클래스
		System.out.println("Person() 생성자 호출됨!");
	}
	
	public void eat() {
		System.out.println("밥먹기!");
	}
	
	public void sleep() {
		System.out.println("잠자기!");
	}
}// person 클래스

class Student extends Person {
	boolean isStudyMode;
	
	// 기본 생성자 정의
	public Student() {
		super(); //Person 클래스
		System.out.println("Student() 생성자 호출됨!");
	}
	
	public Student(String name, int age, boolean isHungry, boolean isStudyMode) {
		super();
		System.out.println("Student(String, int, boolean, boolean) 생성자 호출됨!");
		this.name = name;
		this.age = age;
		this.isHungry = isHungry;
		this.isStudyMode = isStudyMode;
		
	}
	
	public void study() {
		System.out.println("공부하기!");
	}
	
	
}// student 클래스

