package class_;

public class Test2 {

	public static void main(String[] args) {
		
		Account ac = new Account();
		
			ac.accountNo = "111-1111-111";
			ac.ownerName = "홍길동";
			ac.balance = 10000;
			ac.showAccountInfo();
			
			System.out.println("-------------------------");
			
			ac.deposit(5000);
			System.out.println("-------------------------");
			
			int money = ac.withdraw(10000);
			System.out.println("출금된 금액 : " + money + "원");
//			System.out.println("출금된 금액 : " + ac.withdraw(5000) + "원");
			System.out.println("-------------------------");
			//현재잔고보다 많은 금액을 출금하는 경우(출금불가)
			money = ac.withdraw(20000);
			System.out.println("출금된 금액 : " + money + "원");
			
			
	}//main()메서드 끝

}//Test 2클래스 끝

	class Account{
		String accountNo;
		String ownerName;
		int balance;
		
		public void showAccountInfo() {// 리턴값 X, 매개변수(파라미터) X
			System.out.println("계좌번호 : " + accountNo);
			System.out.println("예금주명 : " + ownerName);
			System.out.println("현재잔고 : " + balance + "원");
		}//show메서드 끝
		
		public void deposit(int amount) {// 리턴값 X, 매개변수 O
			balance += amount; //전달받은 amount를 balance에 누적 후 출력
			System.out.println("입금하신 금액     : " + amount +"원");
			System.out.println("입금 후 현재 잔고 : " + balance + "원");
		}//deposit 메서드 끝
		
		public int withdraw(int amount){// 리턴값 O, 매개변수 O
			//입력받은 amount를 balance에 차감 후 출금되는 금액(amount)을 리턴
			if( amount > balance) {// 현재잔고가 출금금액보다 적은지 판별(출금불가)
				System.out.println("잔고가 부족하여 출금이 불가능합니다.");
				System.out.println(
						"출금할 금액 : " + amount + "원, 현재잔고 : " + balance +"원" );
//				return 0;
				amount = 0;
			} else {//출금이 가능할 경우 (현재잔고 >= 출금금액)
				balance -= amount;
				System.out.println("출금하신 금액     : " + amount + "원");
				System.out.println("출금 후 현재 잔고 : " + balance + "원");
//				return amount; //출금금액 리턴
			}//else문
			
			return amount; // if~else문과 관계없이 amount설정하는 방법ㅋ
			
		}//withdraw 메서드 끝
			
	}//Account 클래스 끝



/*
 * 은행계좌(Account) 클래스 정의
 * [ 멤버변수 선언 ]
 * - 계좌번호(accountNo, 문자열)
 * 	 예금주명(ownerName, 문자열)
 * 	 현재잔고(balance, 정수)
 * 
 * 
 * [ 메서드 정의 ]
 * - 계좌번호, 예금주명, 현재잔고를 출력하는 showAccountInfo() 메서드 
 *  	ex) 계좌번호 : 111-1111-111
 *  		예금주명 : 홍길동
 *  		현재잔고 : 10000원
 *  
 * - 입금 기능을 수행하는 deposit() 메서드
 * 		-> 입금할 금액(amount, 정수)을 전달받아 현재잔고(balance)에 누적한 후
 * 		   입금된 금액과 입금 후 현재잔고를 출력
 * 		   ex) "입금하신 금액     : xxxx원"
 * 			   "입금 후 현재 잔고 : xxxx원"
 *      -> 단, 리턴값은 없음
 * 
 * - 출금 기능을 수행하는 withdraw() 메서드
 * 		-> 출금할 금액(amount, 정수)을 전달받아 현재잔고(balance)에 차감한 후
 * 		   출금된 금액과 출금 후 현재잔고를 출력
 * 		   ex) "출금하신 금액     : xxxx원"
 * 			   "출금 후 현재 잔고 : xxxx원"
 *      -> 단, 출금 기능을 수행하기 전 현재잔고와 출금할 금액을 비교하여 
 *         현재잔고가 출력할 금액보다 적을 경우 출금을 수행하지 않고
 *         다음과 같이 출력
 *      -> ex) "잔고가 부족하여 출금이 불가능합니다."
 *      	   "출력할 금액 : xxxx원, 현재잔고 : xxxx원"
 *      -> 리턴값 있음(출금할 금액에 해당하는 금액 리턴)
 *      
 * 
 * 
 */











