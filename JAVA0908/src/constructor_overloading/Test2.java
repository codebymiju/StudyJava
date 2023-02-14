package constructor_overloading;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * Account() 생성자 호출 시 다음과 같이 초기화 후 호출
		 * - 계좌번호 : 111-1111-111
		 * 	 예금주명 : 홍길동
		 *   현재잔고 : 0원
		 */
		
		// 기본생성자 호출
		Account acc = new Account();
		acc.showAccountInfo();
		
		System.out.println("===============================");
		
		Account acc2 = new Account("999-9999-999");
		acc2.showAccountInfo();
		
		System.out.println("===============================");
		
		Account acc3 = new Account("999-9999-999", "이순신");
		acc3.showAccountInfo();
		
		System.out.println("===============================");
		
		Account acc4 = new Account("999-9999-999", "이순신", 10000);
		acc4.showAccountInfo();
		
		System.out.println("===============================");
	}

}

class Account{
	String accountNo;
	String ownerName;
	int balance;
	
	// 자동 생성 단축키로
	// 기본생성자, 오버로딩 된 다른 생성자 정의
	// -> Alt + Shift + s -> o
	
	public Account() {
		accountNo = "111-1111-111";
		ownerName = "홍길동";
		balance = 0;
	}

	public Account(String accountNo) {
		this.accountNo = accountNo;
		this.ownerName = "홍길동";
		this.balance = 0;
	}
	
	public Account(String accountNo, String ownerName) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = 0;
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
	
	
	
	
}

