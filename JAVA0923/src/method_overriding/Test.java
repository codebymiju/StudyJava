package method_overriding;

public class Test {

	public static void main(String[] args) {
		
		ElectricCar ec = new ElectricCar();
		ec.speed = 0;
		ec.maxSpeed = 250;
		ec.batteryCapacity = 5;
		
		ec.speedUP();
		ec.speedDown();
		ec.addFuel();
		
		System.out.println("====================================");
		DiselCar dc = new DiselCar();
		dc.speed = 0;
		dc.maxSpeed = 230;
		dc.cc = 3000;
		
		dc.speedUP();
		dc.speedDown();
		dc.addFuel();

	}

}

/*
 * Car 클래스 정의
 * - 멤버변수 : 현재속력(speed, 정수), 최대속력(maxSpeed, 정수)
 * - 메서드 
 *   speedUp() : "자동차 속도 증가" 출력 (리턴타입 없음, 파라미터 없음)
 *   speedDown() : "자동차 속도 감소" 출력 (리턴타입 없음, 파라미터 없음)
 *   addFuel() : "자동차 연료 주입!" 출력 (리턴타입 없음, 파라미터 없음)
 */

/*
 * 자동차(Car) 클래스를 상속받는 전기자동차(ElectricCar)정의
 * - 멤버변수 : 배터리 용량(batteryCapacity, 정수)
 * - Car 클래스의 메서드 오버라이딩 
 * - 메서드 
 *   speedUp() : "Electric 전기모터의 힘으로 속력 증가!" 출력 (리턴타입 없음, 파라미터 없음)
 *   speedDown() : "Electric 속력 감소하면서 전기 배터리 충전!!" 출력 (리턴타입 없음, 파라미터 없음)
 *   addFuel() : "전기차 충전소에서 배터리 충전!" 출력 (리턴타입 없음, 파라미터 없음)
 */

/*
* 자동차(Car) 클래스를 상속받는 디젤자동차(DiselCar)정의
* - 멤버변수 : 엔진 배기량 (cc, 정수)
* - Car 클래스의 메서드 오버라이딩 
* - 메서드 
*   speedUp() : "디젤 엔진의 힘으로 속력 증가!" 출력 (리턴타입 없음, 파라미터 없음)
*   speedDown() : "디젤 자동차 속력 감소!!" 출력 (리턴타입 없음, 파라미터 없음)
*   addFuel() : "주유소에서 디젤 연료 주입!" 출력 (리턴타입 없음, 파라미터 없음)
*/

class Car { 
	int speed;
	int maxSpeed;
	
	public void speedUP() {
		System.out.println("자동차 속도 증가");
	}
	
	public void speedDown() {
		System.out.println("자동차 속도 감소");
	}
	public void addFuel() {
		System.out.println("자동차 연료 주입");
	}
}

class ElectricCar extends Car {
	int batteryCapacity;

	@Override
	public void speedUP() {
		System.out.println("Electric 전기모터의 힘으로 속력 증가!");
	}

	@Override
	public void speedDown() {
		System.out.println("Electric 속력 감소하면서 전기 배터리 충전!!");
	}

	@Override
	public void addFuel() {
		System.out.println("전기차 충전소에서 배터리 충전!");
	}
}

class DiselCar extends Car {
	int cc;

	@Override
	public void speedUP() {
		System.out.println("디젤 엔진의 힘으로 속력 증가!");
	}

	@Override
	public void speedDown() {
		System.out.println("디젤 자동차 속력 감소!!");
	}

	@Override
	public void addFuel() {
		System.out.println("주유소에서 디젤 연료 주입!");
	}
}
	


