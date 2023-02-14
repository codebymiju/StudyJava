package class_;

public class Test2 {

	public static void main(String[] args) {
		
		Account2 ac2 = new Account2();
		ac2.accountNo = "111-1111-111";
		ac2.ownerName = "홍길동";
		ac2.balance = 10000;
		
		ac2.showAccountInfo();
		
	}//main()메서드 끝

}// Test2 끝

/*
 * 은행계좌(Account2) 클래스 정의
 * 멤버변수 - 계좌번호(accountNo, 문자열) -> "111-1111-111"
 * 			  예금주명(ownerName, 문자열) -> "홍길동"
 * 	  		  현재잔고(balance, 정수) -> 10000
 * 
 * 메서드
 *  showAccountInfo() -> 매개변수 없음, 리턴값 없음
 *  -> 계좌번호, 예금주명, 현재잔고를 출력하는 메서드 정의
 *  
 * 
 */

class Account2 {
	String accountNo;
	String ownerName;
	int balance;
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
	
}


