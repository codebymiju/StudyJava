package inheritance;

public class Test {

	public static void main(String[] args) {
		
		Itwillbank it = new Itwillbank();
		it.accountNo = "123-456-789";
		it.ownerName = "이순신";
		it.balance = 10000;
		it.showAccountInfo();
		
		it.deposit(50000);
		int amount = it.withdraw(40000);
		System.out.printf("출금된 금액 : %d\n",amount);
		System.out.println("--------------------------");
		it.contract("여행자");

	}

}

/*
 * Account 클래스를 상속받는 Itwillbank 클래스 정의
 * - Account 기본 기능은 그대로 유지
 *   -> accountNo, ownerName, balance
 *   -> deposit(입금기능), 출금기능(withdraw), 정보출력(showAccountInfo)
 * - 멤버변수 추가 : 보험명(insureName, 문자열)
 * - 메서드 추가 : 보험계약(contract())
 *  -> 파라미터 : 보험명
 *  -> 리턴값 : 없음
 *  -> 전달받은 보험명을 멤버변수에 저장 후 "xxx 보험 계약 완료!" 출력 
 * 
*/

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public void deposit(int money) {
		balance += money;
		System.out.printf("입금 금액 : %d원 현재 잔고 : %d원 \n", money, balance);
	}
	
	public int withdraw(int money) {
		if(balance < money) { 
			System.out.println("잔고가 부족하여 출금이 불가능합니다.");
			System.out.printf("출금할 금액 : %d원 현재 잔고 : %d원\n", money, balance);
			money = 0;
		} else {
			balance -= money;
			System.out.printf("출금할 금액 : %d원 출금 후 잔고 : %d원\n", money, balance);
		}
		return money;
	}
	
	public void showAccountInfo () {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
}

class Itwillbank extends Account {
	String insureName;

	public void contract(String insureName) {
		this.insureName =   insureName;
		System.out.println( insureName +  " 보험 계약 완료!");
	}
}