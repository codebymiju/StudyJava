package method;

public class Ex4 {

	public static void main(String[] args) {
		// 4. 전달인자도 있고, 리턴값도 있는 메서드 호출
		System.out.println("동생아! 1000원 줄테니 새우깡 좀 사온나!");
		String snack = sister_4(1000);
		
		System.out.println("동생이 사다준 것 : " + snack);
		
	}// main() 메서드 끝
	
	// 4. 전달인자도 있고, 리턴값도 있는 메서드 정의
	public static String sister_4(int money) {
		System.out.println("동생 : 언니가 과자 사오라고 " + money + "원을 줬다!");
		money -= 200;
		
		System.out.println("동생 : 새우깡 사고 " + money + "원이 남았다!");
		
		return "새우깡";
		// -> 단, 리턴값으로 전달할 수 있는 데이터는 동시에 1개뿐이다!
	}
	
}// Ex4 클래스 끝
