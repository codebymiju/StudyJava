package Scaner;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		/*
		 * < Scanner 설정 문법 >
		 * Scanner 변수 = new Scanner(); // 키보드부터 입력 받을 시 System.in활용
		 * 변수.nextXXX() 메서드 호출하여 입력 받음
		 */

		Scanner scan = new Scanner(System.in);
		String input = "";
		
		do {
			System.out.println("원하는 값을 입력하세요. 프로그램을 종료키 = Q ");
//			input = scan.next();
			input = scan.nextLine();
			System.out.println("입력하신 값은 " + input + "입니다.");
			
		} while (!input.equals("Q"));
		
		System.out.println("프로그램을 종료합니다");
		
		System.out.println("=====================================");
		
//		System.out.println("숫자(정수)만 입력하세요: ");
//		int num = scan.nextInt();
//		System.out.println(num);
//		// => 정수가 아닌 다른 값을 입력하면 InputMismatchException 예외 발생!
//		
//		System.out.println("숫자(실수)만 입력하세요: ");
//		double dnum = scan.nextDouble();
//		System.out.println(dnum);
//		// => 정수값을 입력하면 실수로 인식
//		
//		System.out.println("true 또는 false만 입력하세요: ");
//		boolean b = scan.nextBoolean();
//		System.out.println(b);
		// => 정수값을 입력하면 실수로 인식

	}

}
