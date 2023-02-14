package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex_Step2 {

	public static void main(String[] args) {
		/*
		 *  < JDBC를 활용한 DB 프로그램 구현 4단계 >
		 * 1. JDBC 드라이버 로드 (드라이버 필요)
		 * 2. DB 연결(URL, 계정명, 패스워드 필요)
		 * 3. PreparedStatement 객체를 통해 SQL 구문 전달 및 실행
		 * 4. SQL 구문 실행 후 결과 처리
		 */
		
		Connection con = null; // null로 초기화 시킨것
		
		
		try {
			// 1. 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로드 성공!");
			
			// 2. DB연결
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/java", "root", "1234");
			System.out.println("DB 연결 성공!");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("DB 연결 실패!");
		} finally { // finally안의 내용은 무조건 수행
			// finally 블록 내에서 DB 관련 자원 반환 필수!
			try {// try & catch에 finally 부분은 독립적으로 적용됨
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
