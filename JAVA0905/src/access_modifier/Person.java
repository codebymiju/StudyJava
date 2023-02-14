package access_modifier;

public class Person {
	
	// 외부에서 멤버변수에 접근이 불가능하도록 
	// private 접근제한자 적용 
	private String name;
	private int age;
	
	// 멤버변수에 대신 접근하도록 Getter/Setter 메서드 정의(public 접근제한자 적용)
	// 1. Getter 메서드 정의
	// -> 파라미터는 없고, 리턴값만 있는 메서드
	// String 타입 멤버변수 name에 대한 Getter 메서드
	
	public String getName() {//메서드니까 소괄호, 중괄호 필수
		return name;
	}
	
	// int 타입 멤버변수 age에 대한 Getter() 정의
	public int getAge() {
		return age;
	}
	
	// 2. Setter 메서드 정의
	// -> 파라미터는 있고, 리턴값은 없는 메서드
	
	public void setName(String newName) {
		name = newName;
		
	}
	
}
