package object;

import java.util.Objects;

public class Test3 {

	public static void main(String[] args) {
		
		
		Account acc = new Account("171-717-71", "자씨", 10000);
		Account acc2 = new Account("123-456-789", "안씨", 555555);
		
		if(acc.equals(acc2)) {
			System.out.println("두 인스턴스가 같다!");
		} else {
			System.out.println("두 인스턴스가 다르다!");
		}

		System.out.println("acc의 객체 정보 : " + acc);
		System.out.println("acc2의 객체 정보 : " + acc2);
		
	}// main()

}// Test3

// equals()와 toString()은 오브젝트로 부터 오버라이딩 받아서 사용하기 
// 원하는 형식에 맞게 오버라이딩 후 수정할 것

class Account {
	String accountNo;
	String owenrName;
	int balance;
	
	// 생성자 - 계좌번호, 예금주명, 현재잔고를 전달받아 초기화
	public Account(String accountNo, String owenrName, int balance) {
		// // alt + shift + s + o
		super();
		this.accountNo = accountNo;
		this.owenrName = owenrName;
		this.balance = balance;
	}
	
	// // alt + shift + s + h ( hashcode 지워도 됨)
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(accountNo, balance, owenrName);
//	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountNo, other.accountNo) && balance == other.balance
				&& Objects.equals(owenrName, other.owenrName);
	}
	
	
	// alt + shift + s + s
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", owenrName=" + owenrName + ", balance=" + balance + "]";
	}

}// account