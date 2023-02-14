package switch_statement;

public class Ex2 {

	public static void main(String[] args) {
		// break 문을 의도적으로 생략하여 문장을 간소화시키는 방법

		// 월(month)을 입력받아 해당 월의 일수(날짜)를 출력하는 switch문 작성
		// ex) 1 입력시 "1월은 31일까지입니다!" 출력
		// 1 3 5 7 8 10 12 : 31일
		// 4 6 9 11 : 30일
		// 2 : 28일
		
		
//		switch(month) { 
//			case 1 : System.out.println(month + "월은 31일까지입니다!"); break;
//			case 2 : System.out.println(month + "월은 28일까지입니다!"); break;
//			case 3 : System.out.println(month + "월은 31일까지입니다!"); break;
//			case 4 : System.out.println(month + "월은 30일까지입니다!"); break;
//			case 5 : System.out.println(month + "월은 31일까지입니다!"); break;
//			case 6 : System.out.println(month + "월은 30일까지입니다!"); break;
//			case 7 : System.out.println(month + "월은 31일까지입니다!"); break;
//			case 8 : System.out.println(month + "월은 31일까지입니다!"); break;
//			case 9 : System.out.println(month + "월은 30일까지입니다!"); break;
//			case 10 : System.out.println(month + "월은 31일까지입니다!"); break;
//			case 11 : System.out.println(month + "월은 31일까지입니다!"); break;
//			case 12 : System.out.println(month + "월은 31일까지입니다!"); break;
//			
//		} 
		
		// case 문의 순서는 무관하므로 관련 있는 case문들끼리 
		
		int month = 2;
		switch(month) { 
			case 1 : 
			case 3 : 
			case 5 : 
			case 7 :
			case 8 : 
			case 10 : 
			case 12 : System.out.println(month + "월은 31일까지입니다!"); break;
			case 4 :
			case 6 : 
			case 9 : 
			case 11 : System.out.println(month + "월은 30일까지입니다!"); break;
			case 2 : System.out.println(month + "월은 28일까지입니다!"); 
		
			} 
		
		
		
	
	
	}

}
