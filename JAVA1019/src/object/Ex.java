package object;

import java.util.Objects;

public class Ex {

	public static void main(String[] args) {
		/*
		 *  Object 클래스
		 * - 모든 클래스의 슈퍼클래스(최상위클래스)
		 *  -> 상속을 표현하지 않으면 자동으로 상속되는 클래스
		 *  
		 *  1. equals() 메서드 (public boolean equals(Object o) {})
		 *  - 실제 '두 객체가 같다'는 의미는 두 객체의 주소값 비교가 아닌
		 *    객체가 가지는 멤버가 같다는 의미로 사용됨
		 *  - equals() 메서드 자동 생성(오버라이딩) 기능을 활용하여 쉽게 구현
		 *    alt + shift + s + h
		 */
		
		Person p1 = new Person("홍길동", "031010-1234567");
		Person p2 = new Person("홍길동", "031010-1234567");
		
		System.out.println("p1의 객체 정보 : " + p1);
		System.out.println("p2의 객체 정보 : " + p2);
		
		// 참조변수에 대한 동등비교 (==) 수행
		if(p1 == p2) { // 객체 p1과 p2에 저장된 주소값 비교
			System.out.println("두 객체의 주소값이 같다! (==)");
		} else {
			System.out.println("두 객체의 주소값이 다르다! (==)");
		}
		
		// 참조변수에 대한 Object 클래스의 equals() 메서드를 통한 비교 수행
		if(p1.equals(p2)) { // 동등비교 연산(==) 과 동일한 결과를 수행
			System.out.println("두 객체의 주소값이 같다! (equals())");
		} else {
			System.out.println("두 객체의 주소값이 다르다! (equals())");
		}
		
		System.out.println("----------------------------------------------");
		
		OverridePerson p10 = new OverridePerson("홍길동", "031010-1234567");
		OverridePerson p11 = new OverridePerson("홍길동", "031010-1234567");
		
		// 참조변수에 대한 동등비교 (==) 수행
		if(p10 == p11) { 
			System.out.println("두 객체의 주소값이 같다! (==)");
		} else {
			System.out.println("두 객체의 주소값이 다르다! (==)");
		}
		
		// 오버라이딩 된 equals() 메서드를 호출하여 객체의 멤버변수 비교 진행
		if(p10.equals(p11)) {
			System.out.println("두 객체의 내용(멤버변수 값)이 같다!");
		} else {
			System.out.println("두 객체의 내용(멤버변수 값)이 다르다!");
		}
		
		
	}// main() 메서드

}// Ex 클래스

class Person {
	String name;
	String jumin;
	
	public Person(String name, String jumin) {
		super();
		this.name = name;
		this.jumin = jumin;
	}
} // person 클래스

class OverridePerson {
	String name;
	String jumin;
	
	public OverridePerson(String name, String jumin) {
		super();
		this.name = name;
		this.jumin = jumin;
	}


	// Object 클래스의 equals() 메서드 오버라이딩
	// Person 클래스의 모든 멤버변수를 비교하여
	// 하나라도 다를 경우 false를 리턴, 모두 같을 경우 true 리턴하도록 수정
	
//	@Override // alt + shift + v > object 만 선택
//	public boolean equals(Object obj) {
//		// 주의! equals() 메서드 파라미터로 객체를 전달하면
//		// 해당 객체는 Object 타입으로 업캐스팅이 일어남
//		// 따라서 다시 해당 객체 타입으로 다운캐스팅이 필요함
////		OverridePerson p = (OverridePerson)obj; // Object > OverridePerson 다운캐스팅
//		if(obj instanceof OverridePerson) {
//			OverridePerson p = (OverridePerson)obj; 
//			
//			if(name.equals(p.name) && jumin.equals(p.jumin)) {
//				// 이름과 주민번호가 모두 같을 경우 true 리턴
//				return true;
//			}
//			
//		} else {
//			
//		}
//
//		// 두 객체의 변수가 하나라도 다르거나
//		// instanceof 연산 결과가 false일 경우 false 리턴
//		return false;
//	}
//	
//	// equals() 메서드 자동 오버라이딩 단축키 : Alt + Shift + s + > h
//	// => 직접 오버라이딩 하기 보단 자동 생성 기능을 활용하자!
//	
	@Override
	public int hashCode() {
		return Objects.hash(jumin, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OverridePerson other = (OverridePerson) obj;
		return Objects.equals(jumin, other.jumin) && Objects.equals(name, other.name);
	}
	
}// OverridePerson 클래스



















