package for_statement;

public class Test {

	public static void main(String[] args) {
		
		// for문을 사용하여 특정 단에 해당하는 구구단 출력
		// 단과 곱해지는 수(i)를 저장할 변수를 선언하고 값을 저장하면
		// 단이 바뀌더라도 대응이 가능하다!
		
		
		// 내가 한 것
//		int dan = 9;
//		
//		System.out.printf(" < %d단 >", dan);
//		System.out.println();
//		// 반복문을 사용하여 구구단 출력
//		for(int i = 1; i <=9 ; i++) {
//			System.out.println( dan + " * " + i + " = " + (dan * i));
//		}
		
		System.out.println("=================================================");
		
		// 정답
		int dan = 7;
		System.out.println(" < " + dan + "단 >");
		for(int i = 1; i <= 9 ; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		
		
	}

}
