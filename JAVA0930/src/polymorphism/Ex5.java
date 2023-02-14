package polymorphism;

public class Ex5 {

	public static void main(String[] args) {
		
		병사 병사 = new 병사();
		칼 칼 = new 칼();
		총 총 = new 총();
		활 활 = new 활();
		
		병사.장착(칼); // 칼 인스턴스가 무기(칼이 상속받은)에 들어감
		병사.장착(총);
		병사.장착(활);
		
		System.out.println("==================================");
		
		병사.공격(칼);
		병사.공격(총);
		병사.공격(활);
		
//==============================================================================
		System.out.println("==================================");
		
		Employee emp = new Employee("홍길동", 3000);
		System.out.println("Employee 정보 : " + emp.getEmployee());
		emp.salaryCalculation();
		
		Manager man = new Manager("이순신", 4000, "개발팀", 3);
		System.out.println("Manager 정보 : " + man.getManager());
		System.out.println("Manager 정보 : " + man.getEmployee());
		man.salaryCalculation();
		
		Engineer eng = new Engineer("강감찬", 5000, 5);
		System.out.println("Enginner 정보 : " + eng.getEngineer());
		System.out.println("Enginner 정보 : " + eng.getEmployee());
		eng.salaryCalculation();
		
		System.out.println("==================================");
		
		emp.salaryCalculationAll(emp); // 내부의 매개변수 변경에 따라 다른 값 출력 : 다형성 적용됨
		emp.salaryCalculationAll(man);
		emp.salaryCalculationAll(eng);
		
	}// main() 메서드

}// Ex5 클래스

// 직원(Employee) 클래스 정의
// 일반 직원들은 연봉만 지급
class Employee { // = class Employee extends Object
	
	// Employee 멤버변수(로컬변수)
	String name; // 사원명
	int salary;  // 연봉
	
	// 파라미터 생성자 정의
	public Employee(String name, int salary) { // alt+shift+s > o
		super(); // Object() 기본생성자를 호출
		this.name = name;
		this.salary = salary;
	}
	
	// 직원 이름과 연봉을 리턴받는 getEmployee() 메서드 정의
	public String getEmployee() {
		return name + ", " + salary;
	}
	
	// 일반 직원의 연봉 계산기(기본 연봉을 그대로 적용)
	public void salaryCalculation() {
		System.out.println("연봉 : " + salary);
	}
	
	//=============================================================
	// 전 직원의 연봉을 슈퍼클래스인 Employee 클래스에서 모두 계산
	// -> *** 다형성 *** 필요 (Employee, Manager, Engineer인스턴스 모두 처리)
	public void salaryCalculationAll(Employee emp) { // 업캐스팅됨
		// 부모타입을 매개변수로 선언, 자식타입 클래스 다 사용가능 = 업캐스팅
		// Employee emp = new Manager();
		int salaryResult = 0; // 연봉 계산 결과를 저장할 변수
		
		// 참조영역의 축소로 인해 각 서브클래스 타입 멤버변수는 보이지 않음.
		// -> Employee를 제외한 Manager, Engineer 의 경우 
		//    다시 다운캐스팅을 통해 서브 클래스의 전용 멤버(변수)에 접근해야 함
		// 주의! 반드시 하위타입부터 판별을 수행해야 한다! (자식클래스 부터 > 부모클래스)
		// if ~ else if (= if 타입이 false면 else if로 내려가니까 첫질문에서 판별 가늠하게 X)
	
		
		if(emp instanceof Manager) { // Manager 타입으로 형변환 가능?
			System.out.println("Employee -> Manager 로 다운캐스팅 가능!");
			
			Manager man = (Manager)emp;// 타입이 Manager로 강제 형변원 필수!, 변수명(man)은 마음대로
			salaryResult = man.salary + man.manageEmployeeCount * 10;
			
		} else if (emp instanceof Engineer) {
			System.out.println("Employee -> Engineer 로 다운캐스팅 가능!");
			
			Engineer eng = (Engineer)emp;
			salaryResult = eng.salary + eng.numOfCertificate * 10;
			
		} else if (emp instanceof Employee){ // 슈퍼클래스 타입은 가장 마지막으로
			System.out.println("Employee 그대로 사용!");
			
			salaryResult = salary;
		}
		
		System.out.println("연봉 : " + salaryResult + "만원 입니다.");
		
	}
	
	
	
	
}// employee 클래스

// 관리자(Manager) 클래스 정의 - Employee 클래스 상속
class Manager extends Employee {
	// 관리 직원들은 연봉 + 관리하는 직원 수에 비례하여 인센티브 지급
	
	String depart; // 부서명
	int manageEmployeeCount; // 관리하는 직원 수 

	public Manager(String name, int salary, String depart, int manageEmployeeCount) {
		super(name, salary); // 슈퍼클래스 파라미터 생성자 호출 =  생성자(파라미터)
		this.depart = depart; // + 서브클래스의 생성자 포함정의 (alt+shift+s>o)
		this.manageEmployeeCount = manageEmployeeCount;
	}
	
	// 이름, 연봉, 부서명, 관리하는 직원 수를 리턴하는 getManager()	메서드 정의
	public String getManager() { // 상속의 이점 : 코드의 중복을 줄여주고, 유지보수 용이함
//		return name + ", " + salary + ", " + depart + ", " + manageEmployeeCount;
		return getEmployee() + ", " + depart + ", " + manageEmployeeCount;
	}
	
	// Employee 의 연봉 계산 메서드를 오버라이딩
	@Override // alt+shift+s+v : 오버라이딩
	public void salaryCalculation() {
		int salaryResult = salary + manageEmployeeCount * 10;
		System.out.println("연봉 : " + salaryResult); // 연산식을 넣으면 문자열화 되기에 변수선언
	}
	
}// Manager 

class Engineer extends Employee {
	// 엔지니어들은 자격증 수에 비례하여 연봉 인센티브 지급
	
	int numOfCertificate; //변수 선언 후 alt_shift_o 파라미터 생성자 호출

	public Engineer(String name, int salary, int numOfCertificate) {
		super(name, salary);
		this.numOfCertificate = numOfCertificate;
	}
	
	public String getEngineer() {
		return getEmployee() + ", " + numOfCertificate + "개";
	}

	//Employee의 연봉 계산 메서드를 오버라이딩
	@Override
	public void salaryCalculation() {
		int salaryResult = salary + numOfCertificate * 20;
		System.out.println("연봉 : " + salaryResult); 
	}
	
}


//==============================================================================
class 병사 {
	public void 장착(무기 무기) {
		무기.장착(); // 인스턴스.장착();
	}
	
	public void 공격(무기 무기) {
		무기.공격();
	}
}

class 무기 {
	public void 장착() {
		System.out.println("무기를 장착하다.");
	}
	
	public void 공격() {
		System.out.println("무기로 공격하다.");
	}
}

class 칼 extends 무기 {

	@Override
	public void 장착() {
		System.out.println("칼을 장착하다.");
	}

	@Override
	public void 공격() {
		System.out.println("칼로 공격하다.");
	}
	
}

class 총 extends 무기 {
	@Override
	public void 장착() {
		System.out.println("총을 장착하다.");
	}

	@Override
	public void 공격() {
		System.out.println("총으로 공격하다.");
	}
}

class 활 extends 무기 {
	@Override
	public void 장착() {
		System.out.println("활을 장착하다.");
	}

	@Override
	public void 공격() {
		System.out.println("활로 공격하다.");
	}
}


