package array;

public class Test {

	public static void main(String[] args) {
		/*
		 * 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
		 * 변수 money 의 금액을 동전으로 바꿨을 때
		 * 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
		 * 단, 가능한 한 적은 수의 동전으로 거슬러 주어야 한다.
		 * [Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
		 * 
		 * [ 출력 예시 ]
		 * money = 2680
		 * 500원 = 5
		 * 100원 = 1
		 *  50원 = 1
		 *  10원 = 3
		 */
		
		int money = 2680;
		// 1. 동전액수에 대한 1차원 배열 생성
		int[] coin = {500, 100, 50, 10};
		
		System.out.println("money = " + money);
		// 2. money를 각 동전액수로 나누면 동전 개수(몫)가 나오고
		// 3. 그 나머지를 다시 다른 액수로 나누어 나감
		for(int i = 0; i < coin.length; i++) {
			System.out.println(coin[i] + "원 = " + (money / coin[i]));
			money = money % coin[i]; // money %= coin[i];
			System.out.println("남은 거스름돈 : " + money + "원");
		}

	}

}


