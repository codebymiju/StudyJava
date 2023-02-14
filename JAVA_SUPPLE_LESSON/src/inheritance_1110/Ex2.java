package inheritance_1110;

public class Ex2 {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.draw();
		System.out.println(c.radius);
		
		Rectangle r = new Rectangle();
		r.draw();
		System.out.println("line 1 = " + r.line1 + ", line2 = " +  r.line2);
	
		System.out.println("------------------------------------------------");
		// 별도로 정의한 공통메서드 draw()에 Circle, Rectangle 인스턴스 전달하여
		// 해당 메서드에서 각 인스턴스의 draw() 메서드 호출
		draw(c); // Shape s = c; (업캐스팅)
		draw(r); // Shape s = r; (업캐스팅)
		System.out.println("------------------------------------------------");
		
		// 다형성을 배열에 적용시키는 경우
//		Circle[] cArr = {new Circle(), new Circle()}; // 배열에 객체가 두개 들어가있음
//		Circle[] cArr2 = {new Circle(), new Rectangle()}; // Circle 타입 배열에 Rectangle 인스턴스 저장 불가
		Shape[] sArr = {new Circle(), new Rectangle()};
		
		for( Shape s : sArr ) {
			s.draw();
		}
		
	}
	
	// Circle 과 Rectangle 타입 객체를 모두 전달받을 수 있도록
	// 두 클래스의 공통 부모인 슈퍼클래스 타입 Shape 타입으로 매개변수를 선언
	public static void draw(Shape s) { // 인스턴스 생성 안해도 접근가능한 static
		s.draw();
	}
	
//	public static void draw1(Circle circle) { // 인스턴스 생성 안해도 접근가능한 static
//		circle.draw();
//	}
//	public static void draw2(Rectangle rectangle) { // 인스턴스 생성 안해도 접근가능한 static
//		rectangle.draw();
//	}

}

class Shape {
	public void draw() {
		System.out.println("도형 그리기!");
	}
}

class Circle extends Shape {
	double radius = 3.0;
}

class Rectangle extends Shape {
	double line1 = 3.0, line2 = 2.5;
}







