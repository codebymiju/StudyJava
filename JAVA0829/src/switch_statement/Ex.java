package switch_statement;

public class Ex {

	public static void main(String[] args) {
		/*
		 * switch ~ case 문
		 * 
		 * < 기본 문법 > 
		 * switch(조건식| 식 또는 값) { 조건식에 문자거나 정수값이 들어가야함
		 * 		case 값1 : 
		 * 		// 무조건 값만 넣을 수 있음 (문자열, 문자, 정수)
		 * 		// 조건식 결과가 값1 과 일치할 경우 실행할 문장들....
		 * 				[break;]
		 * 		case 값2 :
		 * 				[break;]
		 * 		case 값n :
		 * 				[break;]
		 * 		[default : //  조건식 결과가 값 1과 일치할 경우  ]
		 * }
		 */
		
		int num = 4;
		switch(num) {
			case 1 : System.out.println("num = 1");
			case 2 : System.out.println("num = 2");
			case 3 : System.out.println("num = 3"); // num이 3일 때 실행되는 문장
			case 4 : System.out.println("num = 4"); // break 문이 없으므로 실행되는 문장
//			default : System.out.println("num = 나머지"); // break 문이 없으므로 실행되는 문장
			
			// 각 case 문 뒤에 break라는 문이 없으므로 num 이 3일 때 case 3의 문장 실행 후
			// 나머지 문장은 조건과 관계없이 아래쪽 방향으로 case 문과 default 문이 전부 실행됨
			
			// break 문이 없을 경우에는 조건과 상관없이 다음 case 문 또는 default 문을 전부 실행
		}
		
		System.out.println("==============================================");
	
//		switch(num) {
//			case 1 : System.out.println("num = 1"); break;
//			case 2 : System.out.println("num = 2"); break;
//			case 3 : System.out.println("num = 3"); break;
//			case 4 : System.out.println("num = 4"); break;
//			default : System.out.println("num = 나머지"); 
//		}
		// -> num이 3일 때 case 3  문장 실행 후 break 문을 switch ~ case 문 빠져나감 (종료)
		// -> num이 1 ~ 4 외의 숫자일 때 default 문이 있으면 해당 문장을 실행한다!
		
		
		// 위의 코드와 완벽하게 동일 (엔터키를 활용하여 각 문장 구분하면 가독성 향상)
		switch(num) {
			case 1 : 
				System.out.println("num = 1"); 
				break;
			case 2 : 
				System.out.println("num = 2");
				break;
			case 3 : 
				System.out.println("num = 3"); 
				break;
			case 4 : 
				System.out.println("num = 4"); 
				break;
			default : 
				System.out.println("num = 나머지"); 
		}
		
		System.out.println("===============================================");
		
		// char 타입은 내부적으로 정수로 취급되므로 사용 가능 (단, long 타입은 사용 불가)
		switch('U') {
			case 'K':
				System.out.println("KOREA");
				break;
			case 'B':
				System.out.println("BRAZIL");
				break;
			case 'U' :
				System.out.println("USA");
				break;
			}
		
	}

}
