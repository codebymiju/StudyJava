package operator;

public class Ex {

	public static void main(String[] args) {

		//출력문에 연산식 기술 > 결과를 출력
		System.out.println(10 + 2);
		System.out.println(10 - 2);
		System.out.println(10 * 2);
		System.out.println(10 / 2);
		System.out.println(10 % 2); // 10에서 2나눈 후 나머지인 0을 출력
		
		System.out.println("--------------------------------------------------");
		
		int a = 10, b = 2;
		System.out.println(a + b);	
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		//연산 결과를 변수에 저장 후 출력
		int c; // 연산 결과를 저장할 변수 c 선언
		
		//a와b의 덧셈 결과를 변수 c에 저장
		c = a + b;
		System.out.println(a + " + " + b + " = " + c);
		System.out.printf("%d + %d = %d\n", a, b, c);
		
		c = a - b;
		System.out.println(a + " - " + b + " = " + c);
		System.out.println(c);
		
		c = a * b;
		System.out.println(a + " * " + b + " = " + c);
		
		c = a / b;
		System.out.println(a + " / " + b + " = " + c);
		
		c = a % b;
		System.out.println(a + " % " + b + " = " + c);
		
		
		
		
		
	}

}
