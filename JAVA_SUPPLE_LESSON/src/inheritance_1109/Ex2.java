package inheritance_1109;

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
	}
	
	// Circle 과 Rectangle 타입 객체를 모두 전달받을 수 있도록
	// 두 클래스의 공통 부모인 슈퍼클래스 타입 Shape 타입으로 매개변수를 선언
	public static void draw(Shape s) { // 인스턴스 생성 안해도 접근가능한 static
		s.draw();
//		Circle c = (Circle)s;
		
		if(s instanceof Circle) {
			Circle c = (Circle) s;
			System.out.println("원의 반지름 : " + c.radius);
		} else if(s instanceof Rectangle) {
			Rectangle r = (Rectangle) s;
			System.out.println("사각형 각 변의 길이 : " + r.line1 +", " + r.line2);
		}
	}
	
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







