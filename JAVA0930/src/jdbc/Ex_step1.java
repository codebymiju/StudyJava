package jdbc;

public class Ex_step1 {

	public static void main(String[] args) {
		/*
		 *  JDBC(Java Database Connectivity)
		 *  - 자바에서 DB에 접근하기 위한 연결 방식을 제공하는 API(라이브러리)
		 *  - 데이터베이스 접근 방식 외의 모든 작업은 통일된 방법을 제공하고
		 *    각 DB 제조사에서 제공하는 드라이버를 로드하여 설정함
		 *    
		 *  < JDBC를 활용한 DB 구현프로그램 구현 4단계 >
		 * 1. JDBC 드라이버 로드 (드라이버 필요)
		 * 2. DB 연결(URL, 계정명, 패스워드 필요)
		 * 3. PreparedStatement 객체를 통해 SQL 구문 전달 및 실행
		 * 4. SQL 구문 실행 후 결과 처리
		 * 
		 *  < 기본 문법 >
		 * Class.forName("드라이버 위치");
		 * ex) MySQL의 드라이버 위치 : com.mysql.cj.jdbc.Driver
		 *  
		 */
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}// main() 메서드

}// class Ex_step1
