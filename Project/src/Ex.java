
public class Ex {

	public static void main(String[] args) {
		String strNum = "00111"; // 2진수 문자열
		
		StringBuffer buffer = new StringBuffer(strNum);
		System.out.println(buffer.reverse()); // 뒤집은 결과
		System.out.println(strNum.charAt(3) == '1');
		System.out.println(buffer.reverse().charAt(2-1) == '1');
	
		String strNum2 = "00010";
		
		System.out.println("-------------------------------");
		
		
		int num = Integer.parseInt(strNum2, 2);
		
		int checkNum = 2; // "00010"을 직접 2로 지정
		if((num & checkNum) == checkNum) {
			System.out.println("권한 확인");
		} else {
			System.out.println("권한 없음");
		}
		
	}

}
 
