package class_;

public class Test {

	public static void main(String[] args) {
			
		/*
		 * Account 인스턴스 (ac) 생성 후 다음과 같이 초기화 및 출력
		 * 계좌번호 : "111-1111-111"
		 * 예금주명 : "홍길동"
		 * 현재잔고 :  10000
		 */
		
		Account ac = new Account();
		ac.accountNo = "111-1111-111";
		ac.ownerName = "홍길동";
		ac.balance = 10000;
		
		System.out.println("계좌번호 : " + ac.accountNo);
		System.out.println("예금주명 : " + ac.ownerName);
		System.out.println("현재잔고 : " + ac.balance);
		
		System.out.println("=============================================");
		
		Account ac1 = new Account();
		ac1.accountNo = "123-456-789";
		ac1.ownerName = "김미주";
		ac1.balance = 1999999999;
		
		System.out.println("계좌번호 : " + ac1.accountNo);
		System.out.println("예금주명 : " + ac1.ownerName);
		System.out.println("현재잔고 : " + ac1.balance);
		
		
	}// main()메서드 끝

}// Test 클래스 끝

/*
 *  은행계좌(Account) 클래스 정의
 *  멤버변수 - 계좌번호(accountNo, 문자열) -> "111-1111-111"
 *  		   예금주명(ownerName, 문자열) -> "홍길동"
 *  		   현재잔고(balance, 정수) -> 10000
 */

 class Account {
	 String accountNo;
	 String ownerName;
	 int balance;
	 
 }
