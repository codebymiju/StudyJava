package access_modifier;

public class Test {

	public static void main(String[] args) {
	Account acc = new Account();
	
	acc.setAccountNo("111-1111-111");
	System.out.println(acc.getAccountNo());
	acc.setOwnerName("홍길동");
	System.out.println(acc.getOwnerName());
	acc.setBalance(10000);
	System.out.println(acc.getBalance());
	

	}

}

class Account {
	// Account 클래스의 멤버변수를 private 접근제한자로 선언
	private String accountNo;
	private String ownerName;
	private int balance;
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// Getter/Setter 메서드를 정의하여 멤버변수에 간접적으로 접근하도록 수행
	// 1. String accountNo 변수에 대한 Getter/Setter
//	public String getAccountNo() {
//		return accountNo;
//	}
//	
//	public void setAccountNo(String newAccountNo) {
//		accountNo = newAccountNo;
//		
//	}
//	
//	// 2. String ownerName 변수에 대한 Getter/Setter
//	public String getOwnerName() {
//		return ownerName;
//	}
//	
//	public void setOwnerName(String newOnwerName) {
//		ownerName = newOnwerName;
//	}
//	
//	// 3. int balance 변수에 대한 Getter/Setter
//	public int getBalance() {
//		return balance;
//	}
//	
//	public void setBalance(int newBalance) {
//		balance = newBalance;
//	}
	
	// ======================================================
	// 단축키를 사용하여 Getter/Setter 메서드 정의 
	// - 클래스 내에서 멤버변수 선언 후 Alt + Shift + S -> R
	
	
	
	
	
}













