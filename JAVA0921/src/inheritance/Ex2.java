package inheritance;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 *  상속의 장점
		 *  1. 코드 재사용성이 증가
		 *  2. 코드의 유지보수성이 용이해짐
		 */
		Point3D p = new Point3D();
		p.print3D();
		
	}

}
// 2차원 좌표(x, y)를 관리하는 Point2D 클래스
class Point2D {
	int x = 10;
	int y = 20;
	
	// 2차원 좌표값을 출력하는 print2D() 메서드 정의
	public void print2D () {
		System.out.printf("x좌표 : %d, y좌표 : %d,", x, y );
		// 슈퍼클래스인 메서드를 수정하게되면
		// 서브클래스인 Point3D 클래스에서 수정 내용에 대한 적용을 받을 수 있음
	}
}

// 3차원 좌표 (x, y, z)를 관리하는 Point3D 클래스
// -> x, y 좌표 관리 기능은 기본적으로 Point2D 클래스와 중복되므로 사옷ㅇ
class Point3D extends Point2D {
	int z = 30;
	
	public void print3D () {
		// x, y 좌표는 슈퍼클래스인 Point3D 클래스의 
				// Print2D() 메서드가 출력하므로 해당 메서드 호출해서 출력하고
				// 자신의 클래스의 멤버인 z좌표만 별도로 출력하면 코드의 재사용이 가능
				print2D();
				System.out.println("  z좌표 : " + z );
	}
}