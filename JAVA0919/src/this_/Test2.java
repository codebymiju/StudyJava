package this_;

public class Test2 {

	public static void main(String[] args) {
		// 레퍼런스 this, 생성자 this 복습
		Account ac1 = new Account();
		ac1.showAccountInfo();
		
		Account ac2 = new Account("000-1111-000");
		ac2.showAccountInfo();
		
		Account ac3 = new Account("123-4567-890", "강감찬");
		ac3.showAccountInfo();
		
		Account ac4 = new Account("111-4567-111", "이순신", + 99999);
		ac4.showAccountInfo();
		}

}

// Account 클래스 (계좌번호, 예금주명, 현재잔고) 정의 // Alt + shift + s > o
// -> 기본생성자
//    계좌번호 전달받아 초기화하는 생성자
//	  계좌번호, 예금주명 전달받아 초기화하는 생성자
//    계좌번호, 예금주명, 현재잔고까지 전달받아 초기화하는 생성자
// -> 레퍼런스 this 와 생성자 this()

class Account {
	
	String accountNum;
	String ownerName;
	int balance;

	public Account() {
		this("111-1111-111", "홍길동", 0);
	}
	public Account(String accountNum) {
		this(accountNum, "홍길동", 0);
	}
	public Account(String accountNum, String ownerName) {
		this(accountNum, ownerName, 0);
	}
	public Account(String accountNum, String ownerName, int balance) {//생성자 this
		this.accountNum = accountNum; //레퍼런스 this 
		this.ownerName = ownerName;
		this.balance = balance;
	} // 이 3줄은 있어야 함 this로 묶을 수 없음
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNum);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
}


