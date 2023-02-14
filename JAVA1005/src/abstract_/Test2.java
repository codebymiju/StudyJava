package abstract_;

public class Test2 {

	public static void main(String[] args) {
//		Vehicle v = new Vehicle(); // 인스턴스 생성 불가!
		
		// 추상클래스 Vehicle 타입을 참조변수 활용
		Vehicle v = new ElectricCar();
		v.reportPosition();
		v.addFuel();
		
		v = new DiselCar();
		v.reportPosition();
		v.addFuel();

	}

}

abstract class Vehicle {
	// 현재 위치 좌표를 저장하는 변수(curX, curY, 정수형)
	
	int curX, curY;
	
	// 일반 메서드(reportPosition()) 정의
	// -> "현재 위치 : curX, curY" 출력
	
	public void reportPosition() {// 서브클래스에서 오버라이딩 가능 (옵션)
		System.out.println("현재위치 : " + curX + ", " + curY);
	}
	
	// "자동차의 연료 공급"이 출력되는 addFuel() 메서드를 정의
	// -> 차량마다 연료 공급 방법이 달라지므로 오버라이딩을 해야하며
	//    오버라이딩 강제성을 부여하기 위해 추상메서드로 정의
	
	public abstract void addFuel(); // 서브클래스에서 오버라이딩 필수
	
}// Vehicle 클래스

// Vehicle 클래스를 상속받는 ElectricCar, DiselCar 클래스 정의
// -> ElectricCar 의 addFuel() : "전기차 충전소에서 배터리 충전!"
// -> DiselCar의 addFUEL() : "주유소에서 디젤 연료 공급!"

class ElectricCar extends Vehicle {

	@Override
	public void addFuel() {
		System.out.println("전기차 충전소에서 배터리 충전!");
	}
	
}

class DiselCar extends Vehicle {

	@Override
	public void addFuel() {
		System.out.println("주유소에서 디젤 연료 공급!");
	}
	
}