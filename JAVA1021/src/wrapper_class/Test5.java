package wrapper_class;

import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {
		/*
		 * 문자열을 char[] 배열에 분리하여 저장 후
		 * 해당 문자열에 대한 간단한 암호화 작업
		 * - 문자열을 분리하여 저장한 배열을 메서드 encrypt()에 전달
		 * - 전달받은 배열의 문자에 대해 아스키코드값 3만큼 증가한 문자를
		 *   별도의 배열에 저장한 후 문자열로 변환하여 리턴
		 *    ex) 'A'(65) -> 'D'(68)
		 *     "Hello" -> 'H' , 'e', 'l', 'l', 'o' 형태로 배열에 저장됨
		 *       암호화 작업 결과물 : 'K', 'h', 'o', 'o', 'r'
		 *       리턴되는 데이터 : "Khoor"
		 */
		
		// String 타입 문자열을 char 타입 배열로 변환 
		String str = "admin123";
		char[] chArr = str.toCharArray();
		
		Test5 ex = new Test5();
		String encryptResult = ex.encrypt(chArr);
		
		System.out.println("암호화 전 : " + Arrays.toString(chArr));
		System.out.println("암호화 후 : " + encryptResult);
		
		
	}// main() 메서드 끝

	// encrypt() 메서드 정의(리턴타입(문자열), 파라미터(char타입 배열)) 
	// => 전달받은 배열 내의 모든 문자 값을 +3 을 수행하여 새 배열에 저장 후
	//    문자열로 결합하여 리턴
	
	public String encrypt(char[] arr) {
	
		// 전달받은 배열의 크기만큼의 새 배열 생성
		char[] encryptedArr = new char[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			encryptedArr[i] = (char)(arr[i] + 3);
		}
		
		// 1. 배열 내의 모든 문자를 문자열로 결합하여 리턴
//		 Arrays 클래스의 toString() 메서드 활용
//		return Arrays.toString(encryptedArr);
		
		// 2. String 생성자 활용
//		String str = new String(encryptedArr);
//		return str;
		
		// 3. String.valueOf() 메서드 활용
		String str2 = String.valueOf(encryptedArr);
		return str2;
		
		
	}// encrypt
	
} // Test5 클래스 끝
