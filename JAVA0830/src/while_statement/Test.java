package while_statement;

public class Test {

	public static void main(String[] args) {
		// while 문을 사용한 구구단의 특정 단 출력
		
		int dan = 2; //동일한 타입일 때는 한줄로 선언 가능
		int i = 1; // int dan = 2, i = 1;
		
		System.out.printf(" < %d단 >\n", dan);
		while(i <= 9) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
			i++;
		}
		
		System.out.println("============================================");
		
		// while문을 사용하여 1 ~ 10 까지 정수의 합(sum) 계산 후 출력
		
		int sum = 0; i = 1;
		
		while (i <= 10) {
			sum += i;
			i++;
		}	
		System.out.printf("1 ~ 10까지 정수의 합은 : %d\n", sum);
		
		System.out.println("============================================");
		
		// 1 ~ 10 까지 정수 중, 짝수의 합(evenTotal)과 홀수의 합(oddTotal)을 각각 계산
		
		int evenTotal = 0, oddTotal = 0;
		i = 1;
		
		while (i <= 10) {
			if(i % 2 == 0) { 
				evenTotal += i;
			} else {
				oddTotal += i;
			}
			i++;
		}
		
		System.out.printf("1 ~ 10 까지 홀수의 합 : %d\n", oddTotal); // 25
		System.out.printf("1 ~ 10 까지 짝수의 합 : %d\n", evenTotal); // 30
		
		System.out.println("============================================");
		
	}

}
