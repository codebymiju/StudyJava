package enum_type;

public class Ex3 {

	public static void main(String[] args) {
		Month now = Month.FEBRUARY;
		System.out.println(now + ", " + now.getMonthKor());
	}

}

enum Month {
	// 생성자를 사용하면 상수에 다른 값을 결합 가능
	JANUARY("1월"), FEBRUARY("2월"); // 영어 + 한국어 달 이름 결합 / 객체가 만들어진다 라고 생각
	// -> The constructor Month(String) is undefined
	
	private String monthKor;

	public String getMonthKor() { // getter
		return monthKor;
	}

	public void setMonthKor(String monthKor) { // setter
		this.monthKor = monthKor;
	}

	private Month(String monthKor) { // 생성자 / month :FEB 영어 , monthKor : "2월")
		this.monthKor = monthKor;
	}
	
}