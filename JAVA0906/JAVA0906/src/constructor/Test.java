package constructor;

public class Test {

	public static void main(String[] args) {
		// 은행계좌(Account) 클래스의 인스턴스(acc) 생성
		Account acc = new Account();
		
		// 계좌번호, 예금주명, 현재잔고의 값을 변경
		acc.accountNo = "555-5555-555";
		acc.ownerName = "이순신";
		acc.balance = 1000;
		
		// showAccountInfo() 메서드를 호출
		acc.showAccountInfo();
		
	}

}

class Account {
	
	// 멤버변수 선언
	String accountNo;
	String ownerName;
	int balance;
	
	// 계좌 정보를 출력하는 showAccountInfo() 메서드 정의
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
	
	// 생성자를 정의하지 않으면 자바 컴파일러가 기본 생성자를 만듦
//	public Account() {}
	
	// 생성자 정의
	// 인스턴스 생성 시 "Account 생성자 호출됨!" 출력
	// 인스턴스 생성 시 기본값으로 가져야할 데이터를 멤버변수에 저장
	// => 계좌번호 : 111-1111-111, 예금주명 : 홍길동, 현재잔고 : 10000원
	// 인스턴스 생성 시 계좌정보를 출력하는 showAccountInfo() 메서드 호출
	public Account() {
		System.out.println("Account 생성자 호출됨!");
		
		// 인스턴스 생성 시 기본값 설정
		accountNo = "111-1111-111";
		ownerName = "홍길동";
		balance = 0;
		
		// 인스턴스 생성 시 초기화 후 계좌 정보를 출력하기 위해
		// showAccountInfo() 메서드 호출
		showAccountInfo();
		
	}
	
	
}








