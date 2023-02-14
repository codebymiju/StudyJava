package constructor;

public class Test2 {

	public static void main(String[] args) {
		// 은행계좌(Account2) 클래스의 인스턴스(acc) 생성
		Account2 acc = new Account2("111-1111-111", "홍길동", 10000);
		acc.showAccountInfo();
		
		Account2 acc2 = new Account2("555-5555-555", "이순신", 900000);
		acc2.showAccountInfo();
		

	}

}

// Account2 클래스 정의
// 멤버변수 : accountNo, ownerName, balance
// 파라미터 생성자(newAccountNo, newOwnerName, newBalance) 정의
// 계좌 정보를 출력하는 showAccountInfo() 메서드 정의
class Account2 {
	String accountNo;
	String ownerName;
	int balance;
	
	// 계좌번호, 예금주명, 현재잔고를 전달받아 초기화는 파라미터 생성자 Account2() 정의
	public Account2(String newAccountNo, String newOwnerName, int newBalance) {
		System.out.println("Account2(String, String, int) 생성자 호출됨!");
		
		accountNo = newAccountNo;
		ownerName = newOwnerName;
		balance = newBalance;
		
//		showAccountInfo();
	}
	
	// 계좌번호를 출력하는 showAccountInfo() 메서드 정의
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
	
}


