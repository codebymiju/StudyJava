package polymorphism;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 *  다형성(Polymorphism)
		 * - 하나의 데이터타입(참조변수)으로 여러 인스턴스를 참조하는 특성
		 * - 어떤 인스턴스를 업캐스팅하여 슈퍼클래스 타입 변수로 다루면
		 *   하나의 슈퍼클래스 타입으로 여러 서브클래스 타입 인스턴스를 다룰 수 있음
		 */
		
		// Circle 인스턴스(c) 생성
		Circle c = new Circle();
		c.circlePaint();
		
		// Rectangle 인스턴스(r) 생성
		Rectangle r = new Rectangle();
		r.rdraw();
		
		// Triangle 인스턴스(t) 생성
		Triangle t = new Triangle();
		t.design();
		
		// 슈퍼클래스의 메서드를 상속받아 오버라이딩 하는 경우
		// 코드의 동일성이 향상될 수 있다!
		
		c.draw();
		r.draw();
		t.draw();
		
		System.out.println("======================================");
		
		// 코드의 통일성을 더 향상시키기 위한 방법 : 업캐스팅 활용
		// -> Circle, Rectangle, Triangle 의 공통 슈퍼클래스인 
		//    Shape 타입 (s)로 세 인스턴스를 컨트롤 가능
		
		 Shape s = new Circle();
		 s.draw();
		 
		 s = new Rectangle();
		 s.draw();
		 
		 s = new Triangle();
		 s.draw();
		
		 System.out.println("======================================");
		 
		 // 다형성을 배열에 적용시키는 경우
//		 Shape[] sArr = new Shape[3]; // 
		 
//		 sArr[0] = new Circle();
//		 sArr[1] = new Rectangle();
//		 sArr[2] = new Triangle();
		 
		 Shape[] sArr = { new Circle(), new Rectangle(), new Triangle()};
		 
//		 sArr[0].draw();
//		 sArr[1].draw();
//		 sArr[2].draw();
		 
		 // 반복문을 사용하여 Shape 배열 크기만큼 반복하면서 
		 // 각 인덱스에 저장된 인스턴스의 draw() 메서드 호출
		 
		 for (int i = 0; i < sArr.length; i++) {
			 sArr[i].draw();
			 System.out.println("배열 크기만큼 반복");
		 }
		 
		 System.out.println("============================================");
		 
		 // 메서드에 다형성 활용
		 // 1. 이미 다형성이 적용된 배열을 메서드 파라미터로 전달
		  polymorphismDraw(sArr); // Ex4안의 main() 에서 부른것이지만 아래 메서드에 
		  // static 설정 or 참조변수.메서드() 불러야함
		 
		 // 2. 메서드 파라미터로 인스턴스를 직접 전달하는 방법
		  polymorphismDraw2(new Circle());
		  polymorphismDraw2(new Rectangle());
		  polymorphismDraw2(new Triangle());
		 
	}// main() 메서드 끝
			// 1번
			public static void polymorphismDraw(Shape[] sArr) {
				// 배열 타입에 맞춰서 매개변수 입력 (sArr의 데이터 타입 : Shape[])
				for(int i = 0; i < sArr.length; i++) {
					sArr[i].draw(); // i에 넣는 값에 따라 다른 값 호출 가능!
				}
			}
			
			// 2번
			public static void polymorphismDraw2(Shape s) {
				// 부모클래스로 매개변수를 설정하면 자식클래스의 변수 및 메서드 사용가능
				// 어떤 인스턴스가 전달되더라도 draw() 메서드는 공통이므로 호출 가능
				s.draw();
			}
	

}// Ex4클래스 끝

// 여러 도형의 특징을 공통적으로 포함하는 슈퍼클래스 Shape
class Shape {
	
	public void draw() {
		System.out.println("도형 그리기!");
	}
}

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("원 그리기!");
	}
	
	public void circlePaint() {
		System.out.println("원 그리기!");
	}
	
}

class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("사각형 그리기!");
	}
	
	public void rdraw() {
		System.out.println("사각형 그리기!");
	}
	
}

class Triangle extends Shape {

	@Override
	public void draw() {
		System.out.println("삼각형 그리기!");
	}
	
	public void design() {
		System.out.println("삼각형 그리기!");
	}
	
	
}
