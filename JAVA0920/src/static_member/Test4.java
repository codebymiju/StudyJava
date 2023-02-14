package static_member;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 생성된 인스턴스를 리턴 받기
		Account ac = Account.getInstance();
//		ac.getAccountNo(); // 틀만 가져오기
		
		// Setter 메서드를 호출하여 계좌번호 저장, showAccountInfo() 메서드
		ac.setAccountNo("111-1111-111"); // 값을 set하기
		ac.showAccountInfo(); // 메서드 동작 실행 후 값 출력하기
	}

}

class Account {
	
	// 1. 자신의 인스턴스를 생성하여 자신의 클래스 타입 변수 instance 에 저장
	private static Account instance = new Account();
	
	// 2. 기본 생성자를 정의 -> private 선언
	private Account() {}
	
	// 3. Getter 정의 -> public static 선언
	public static Account getInstance() {
		return instance;
	}	
	// 접근제한자가 private인 accountNo 변수 선언
	// accountNo에 대한 Getter/Setter 메서드 정의
	// showAccountInfo() 메서드 정의
	// -> 출력형태 (계좌번호 : 111-1111-111)
		
	private String accountNo; // 변수의 타입 명시할 것 
	
	public String getAccountNo() {//private 접근제한자 붙였기에 get/set 필요
		return accountNo;
	}

	public void setAccountNo(String accountNo) {// 값을 받아오는 set 설정
		this.accountNo = accountNo;
	}

	public void showAccountInfo() { // set에서 받아온 값을 메서드를 통해 출력
		System.out.println("계좌번호 : " + accountNo);
	}
	
	

}//class
