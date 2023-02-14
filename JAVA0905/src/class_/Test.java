package class_;

public class Test {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.name = "배고픈 나";
		p.age = 2022;
		p.isHungry = true;
		
		p.showPersonInfo();
		p.talk();
		p.eat("옹헤야");
		
		
	}// main() 메서드 끝
}//Test 클래스 끝

	 class Person{
		String name;
		int age;
		boolean isHungry;
	
		public void showPersonInfo() {
			System.out.println("이름 : " + name );
			System.out.println("나이 : " + age);
			System.out.println("배고픔 : " + isHungry);
			System.out.println();
		}//Show
		 public void eat(String foodName) {
			System.out.println( foodName + " 먹기!");
			isHungry = false;
			System.out.println("식사 후 배고픔 : " + isHungry);
		}//eat
		
		public void talk() {
			System.out.println("말하기!");
			isHungry = true;
			System.out.println("말한 후 배고픔 : " + isHungry);
			System.out.println();
		}//talk

		}//person 클래스


	/*
	 * Person 클래스 정의
	 * [ 멤버변수(인스턴스변수)선언 ]
	 * - 이름(name, 문자열)
	 * - 나이(age, 정수)
	 * - 배고픔(isHungry, boolean)
	 * 
	 * [메서드 정의]
	 * - 이름, 나이, 배고픔을 출력하는 showPersonInfo()메서드
	 * 		(매개변수 없음, 리턴값 없음)
	 * 
	 * - 밥먹는 기능을 수행하는 eat()메서드
	 * 		(매개변수 : 음식이름(foodName, 문자열), 리턴값 없음)
	 *  	-> "ㅇㅇ 먹기!" 출력
	 *  	-> 멤버변수 isHungry 의 값을 false로 변경
	 *  
	 *  - 말하는 기능을 수행하는 talk()메서드
	 *  	(매개변수 없음, 리턴값 없음)
	 *  	-> "말하기!" 출력
	 *  	-> 멤버변수 isHungry의 값을 true 로 변경 
	 */
