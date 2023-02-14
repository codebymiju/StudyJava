package inheritance;

public class Test2 {

	public static void main(String[] args) {
				
		Manager m = new Manager("김미주", 9000, "개발팀");
		System.out.println(m.getManager());
	}

}

/*
 * 직원(Employee) 클래스
 * 멤버변수
 *  - 직원이름(name, 문자열)
 *  - 연봉(salary, 정수)
 * 메서드
 *  - 직원 정보를 문자열로 결합하여 리턴하는 getEmployee() 메서드 정의
 *    (파라미터 없음, 리턴값 있음)
 *    -> 직원이름과 연봉을 문자열로 결합하여 리턴
 *     ex) 홍길동, 4000
 */

/*
 * Employee 클래스를 상속받는 Manager 클래스 정의
 *  - 이름, 연봉, 부서명(department, 문자열) 멤버변수
 *  - 이름, 연봉, 부서명을 문자열로 결합하여 리턴하는 getManager() 메서드 
 */

class Employee {
	String name;
	int salary;
	
	public String getEmployee() {
		return name + ", " + salary;
	}

}

class Manager extends Employee {
	String department;
	
	public Manager(String name, int salary, String department) {
		// 파라미터 생성자로 표현 (단축키 사용해서 생성 alt + shift + s > o)
		this.name = name; // Manager.name = name;
		this.salary = salary;
		this.department = department;
	}

	public String getManager() {
		return getEmployee() + ", " + department;
	}
}
