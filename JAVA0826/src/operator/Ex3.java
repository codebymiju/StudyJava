package operator;

public class Ex3 {

	public static void main(String[] args) {

		int a = 10, b = 20;
		System.out.println(a + b);
		
		System.out.println("a = " + a);

		String str = "a = " + a;
		System.out.println(str);
		
		System.out.println("b = " + b);
		
		int c = a + b;
		System.out.println(a + " + " + b + " = " + c);
		
		System.out.println("덧셈 결과 : " + c);
		
		System.out.println("==================================================");
		System.out.println(10 + 20);
		System.out.println(10 + "20");
		System.out.println("10" + 20);
		
		System.out.println(10 + "20" + 30);
		System.out.println("10" + 20 + 30);
		System.out.println(10 + 20 + "30");
		
		System.out.println("=============");
		
		String name = "강진석";
		int age = 20;		
		
		//주민번호 표현 시
//		int jumin = 031010-1234567; // 결과값 잘못됨, 뺄셈으로 취급됨
//		int jumin = 0310101234567; // 오류발생!
//		long jumin = 0310101234567L; // long타입으로 표현하거나
		String jumin = "031010-1234567"; // 문자열로 표현해야함
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주민번호 : " + jumin);
		
		
		
		
		
		
		
	}

}
