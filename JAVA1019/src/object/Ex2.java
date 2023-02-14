package object;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * String 객체(문자열) 생성 방법 두 가지 (1번 추천)
		 * 
		 * 1. 리터럴 할당을 통해 생성하는 방법(일반적으로 사용하는 방법)
		 *    -> 상수풀(Constant Pool)에서 동일한 문자열이 존재하는지 검사 후 
		 *    	 존재하지 않으면 새로 생성하고, 존재하면 해당 주소값을 리턴함.
		 * 
		 * 2. 일반적인 클래스 인스턴스를 생성하는 방법(new 연산자를 사용하는 방법)
		 *    -> new 연산자에 의해 heap 공간에 문자열 객체를 생성하며, 
		 *    	 동일한 문자열을 가진 객체가 존재하더라도 무조건 새로 생성함(공간차지 많이함)
		 */ 

		
		String s1 = "Hello";
		String s2 = "Hello";
		
		if(s1 == s2) {
			System.out.println("s1과 s2는 주소값이 같다!");
		} else {
			System.out.println("s1과 s2는 주소값이 다르다!");
		}
		
		if(s1.equals(s2)) {
			System.out.println("s1과 s2는 문자열 내용이 같다");
		} else {
			System.out.println("s1과 s2는 문자열 내용이 다르다");
		}
		
		System.out.println("--------------------------------------------------");
		
		// 생성된 s3과 s4는 문자열 내용은 같지만, 주소값이 다르다.
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		// 동등비교연산자를 사용한 두 문자열의 주소값 비교
		if(s3 == s4) {
			System.out.println("s3과 s4는 주소값이 같다!");
		} else {
			System.out.println("s3과 s4는 주소값이 다르다!");
		}
		
		// String 클래스의 오버라이딩 된 equals() 메서드를 사용한
		// 두 문자열의 내용 비교 
		if(s3.equals(s4)) {
			System.out.println("s3과 s4는 문자열 내용이 같다");
		} else {
			System.out.println("s3과 s4는 문자열 내용이 다르다");
		}
		
	}// main()

}// Ex2 클래스
