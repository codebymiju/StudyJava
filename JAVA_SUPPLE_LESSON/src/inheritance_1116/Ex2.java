package inheritance_1116;

public class Ex2 {

	public static void main(String[] args) {
		Shape s = new Circle(); // this = Circle
		s.draw();
		s = new Rectangle(); // this = Rectangle
		s.draw();

	}

}

class Shape {
	public void draw() {
//		System.out.println("도형 그리기!");
		
		// -> 현재 인스턴스를 가리키는 참조변수 this 를 사용하면
		//    전달받은 인스턴스에 따라 각각의 참조값이 달라진다.
		if(this instanceof Circle) { // 누가 나 라고 하느냐에 따라 그 안에 들어있는게 달라짐
//			System.out.println("Circle");
			// 현재 클래스 = Shape , this = Shape 
			// 따라서 Circle 의 멤버에는 접근 불가!!!
//			System.out.println("반지름 " + this.radius + "원 그리기!");
			Circle c = (Circle)this;
			System.out.println("반지름 " + c.radius + " 원 그리기!");
			// 이런식이면 circle 클래스 만들지 않아도 된다!!!!!!!
			
		} else if(this instanceof Rectangle) {
			Rectangle r = (Rectangle)this;
			System.out.println("Rectangle 두변의 길이가 " + r.line1 + "cm, " + r.line2 + "cm" );
		} else if(this instanceof Shape) {
			System.out.println("도형 그리기!");
		}
		
	}
}

class Circle extends Shape {
	double radius = 3.0;
//
//	@Override
//	public void draw() {
//		System.out.println("원 그리기!");
//	}
}

class Rectangle extends Shape {
	double line1 = 3.0, line2 = 2.5;

//	@Override
//	public void draw() {
//		System.out.println("사각형 그리기!");
//	}
}

















