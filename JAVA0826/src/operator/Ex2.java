package operator;

public class Ex2 {

	public static void main(String[] args) {

		//산술 연산 시 자동 형변환
		
		byte b1 = 10, b2 = 20, b3;
		
		System.out.println(b1 + b2);
		
		//b1과 b2의 연산 결과를 byte타입 변수 b3에 저장 할 때 문제 발생
//		b3 = b1 + b2; // 오류발생 . 저장하려는 변수 데이터타입이 byte라서 문제 발생. 강제형변환 필요
		
//		연산결과에 형변환 연산자를 사용하여 byte타입으로 변환해야 한다. 
		b3 = (byte)(b1 + b2);
		System.out.println(b3);
		
//		short s  = b1 + b2; //오류 발생.
		short s = (short)(b1 + b2);
		System.out.println(s);
		
		System.out.println("--------------------------------");
		char ch = 'A';
//		char c2 = ch + 2; //오류발생
		char c2 = (char)(ch + 2);
		System.out.println(c2);
		
		System.out.println(ch + 2);
		System.out.println((char)(ch + 2));
		
		System.out.println("---------------------------------");
		
		int i = 100;
		long l = 200;
		
//		int i2 = i + l;
		int i2 = (int)(i + l);
		System.out.println(i2);
		
		float f = 3.14f;
		long l2 = (long)(l + f);
		System.out.println(l2);
		
		System.out.println("-----------------------------------------");
		
		System.out.println(3 / 2);
		
		//만약 3/2의 결과를 1.5의 결과값으로 얻고 싶을 경우 실수 형태의 나눗셈 연산을 수행해야함
		
		System.out.println((double)3 / 2);
		System.out.println(3 / 2.0);
		
		System.out.println("============================================");
		
		//실수 끼리의 연산(float 과 double간의 연산)
		float f1 = 0.1f;
		double d1 = 0.1;
		
		System.out.println(f1);
		System.out.println(d1);
		
		System.out.println(f1 + d1);
		
		//근사치 표현에 의해 잘못된 결과 발생할 수 있다. 
		
		System.out.println(f1 + (float)d1);
		System.out.println(((int)(f1*10) + (int)(d1*10)) / 10.0);
		
		System.out.println("==============================================");
		
		//리터럴 끼리 연산시에는 자동 형변환이 발생하지 않는다
		byte b4 = 10 + 20;
		System.out.println(b4);
	
//		byte b5 = 10 + 200; //오류발생, byte 타입 범위 (-128 ~ 127)
		
		
		
		
		
		
		
		
		
	}

}
