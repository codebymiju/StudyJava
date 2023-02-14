package dataType;

public class Ex {

	public static void main(String[] args) {
		
		
		byte b = 100;
		short s = 65;
		
		char ch;
		
		//byte 타입 > char 타입으로 변환
//		ch = b; //오류발생 명시적 형변환 필수
		ch = (char)b;
		System.out.println(ch);
		
		//char 타입 > byte타입으로 변환
//		b = ch; //오류발생, 명시적 형변환 필수
		b = (byte)ch;
		System.out.println(b);
		
		System.out.println("------------------------------------");
		
		//short 타입 > char타입 으로 변환
//		ch = s; //오류발생 명시적 형변환 필수
		ch = (char)s;
		System.out.println(ch);
		
		//char타입 > short타입으로 변환
		
//		s = ch; //오류발생, 명시적 형변환 필수
		s = (short)ch;
		System.out.println(s);
		
		
		System.out.println("========================================");
		
		//int형 변수 i에 변수 ch값을 저장
		
		int i = ch; //char > int 자동형변환
		System.out.println(i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
