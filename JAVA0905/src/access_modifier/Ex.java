package access_modifier;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 접근제한자
		 * - 클래스, 메서드, 멤버변수 등의 접근 제한 용도로 사용하는 키워드
		 * - (넓음) public > protected > default > private (좁음)
		 *   -> 단, default 접근제한자는 별도의 키워드 없이 생략하면 적용
		 *   
		 * 1. private 접근제한자
		 * - 외부 클래스에서 접근하지 못하며, 자신의 클래스 내에서만 접근 가능
		 * - 주로 외부에서 접근하지 못하도록 멤버변수에 적용
		 * - 자신의 클래스 내에서 private 멤버변수 값에 접근하여
		 * 	 멤버변수의 값을 변경하거나 리턴하는 역할의 메서드를 정의하여 제공
		 * 
		 * 2. public 접근제한자
		 * - 누구나 접근 가능
		 * - 주로 외부에서 접근하는 메서드에 적용
		 * 
		 * ---------------------------------------------------------------------
		 * 
		 * Getter / Setter 메서드
		 * - 클래스 내에서 private 접근제한자로 선언된 멤버변수 등에 접근을 위해
		 * 	 클래스 내에서 제공하는 중개 역할의 메서드
		 * -public 접근제한자를 사용하여 정의(누구나 접근 가능)
		 * 
		 * 1. Getter : 내부 멤버변수의 값을 외부로 리턴하는 메서드
		 * 		-> getXXX() 형식의 메서드 이름을 사용하여 정의
		 * 		이 때, XXX 은 접근할 멤버변수의 이름을 사용
		 * 		ex) 멤버변수 num에 접근하는 Getter 메서드 이름 : getNum()
		 * 2. Setter : 외부로부터 값을 전달받아 내부 멤버변수에 저장하는 메서드 
		 *      -> setXXX() 형식의 메서드 이름을 사용하여 정의
		 *      이 때, XXX 은 접근할 멤버변수의 이름을 사용
		 *      -> 파라미터는 있고, 리턴값은 없는 메서드
		 *      
		 */
		
		// Person 클래스의 인스턴스 생성
		Person p = new Person();
		
		// 멤버변수(field) 값을 변경하기 위해 참조변수를 통해 멤버변수 접근
//		p.name = "힌남노"; // The field Person.name is not visible
//		p.age = 2; // The field Person.age is not visible
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		p.setName("옹헤야");
		System.out.println("이름 : " + p.getName());
		
	}

}
