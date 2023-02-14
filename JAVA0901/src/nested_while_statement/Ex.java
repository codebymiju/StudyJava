package nested_while_statement;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 중첩 whlie문
		 * 
		 * < 기본 문법 >
		 * 초기식1;
		 * 
		 * while(조건식2) {
		 * 		초기식2;
		 * 
		 * 
		 * 		while(조건식2) {
		 * 		//반복할 문장
		 * 		증감식2;
		 * 
		 * 		}
		 * 
		 * 		증감식1;
		 * }
		 */
		//for문을 사용하여  i값이 1 ~ 5까지 반복할 동안
		// 
		for(int i = 1; i <= 5; i++) {
			
			for(int j =1; j <=3 ; j++) {
				System.out.println(" i = " + i + ", j = " + j);
			}
			
		}
		
		System.out.println("==================================");
		
		int i = 1; // 초기식1
		while(i <= 5) {//조건식1
			
			int j = 1; // 초기식2
			while(j <= 3) {
				System.out.println(" i = " + i + ", j = " + j);
				j++; // 증감식2
			}
			i++; // 증감식1
		}
		
		
		
		
	}

}
