package interface_;

public class Test2 {

	public static void main(String[] args) {
		BumbleBee bee = new BumbleBee();
		bee.fight();
		bee.speak();
		bee.transform(BumbleBee.MODE_AIRPLANE);
		bee.transform(BumbleBee.MODE_CAR);
		bee.transform(BumbleBee.MODE_NORMAL);
		
		System.out.println("===============================");
		
		Robot bb = new BumbleBee();
		bb.transform(BumbleBee.MODE_AIRPLANE);
		bb.transform(BumbleBee.MODE_CAR);
		bb.transform(BumbleBee.MODE_NORMAL);
		bb.fight();
		bb.speak();
	}

}

/* Fightable 인터페이스
 * -> fight() 메서드 (리턴값, 매개변수 없음)
 * 
 * Transformable 인터페이스
 * -> MODE_CAR = 1, MODE_AIRPLANE = 2, MODE_NORMAL = 3
 * -> transform() 메서드 (리턴값 없음, mode 매개변수)
 * 
 * Robot 인터페이스 정의
 * -> Fightable 인터페이스, Transformable 인터페이스 상속
 * -> 말하기 기능(speak())
 * 
 * Robot 인터페이스를 상속하는 BumbleBee 클래스 정의
 * -> fight() 메서드 호출 시 "로켓 발사!" 출력
 * -> transform() 메서드 호출 시 mode 값에 따라 다른 형태로 변신
 * -> speak() 메서드 호출 시 "라디오로 말하기!" 출력
 */

interface Fightable {
	public abstract void fight();
}

interface Transformable {
	
	public static final int MODE_CAR = 1;
	int MODE_AIRPLANE = 2;
	int MODE_NORMAL = 3;
	
	public abstract void transform(int mode);
}

interface Robot extends Fightable, Transformable {
	
	public abstract void speak();

	@Override
	default void transform(int mode) {}

	@Override
	default void fight() {}
	
}

class BumbleBee implements Robot {

	@Override
	public void transform(int mode) {
		if(mode == Transformable.MODE_CAR) {
			System.out.println("자동차 모드!");
		} else if (mode == Transformable.MODE_AIRPLANE) {
			System.out.println("비행기 모드!");
		} else if(mode == Transformable.MODE_NORMAL) {
			System.out.println("일반 모드!");
		}
	}

	@Override
	public void fight() {
		System.out.println("로켓 발사!");
	}

	@Override
	public void speak() {
		System.out.println("라디오로 말하기!");
		
	}
	
}

