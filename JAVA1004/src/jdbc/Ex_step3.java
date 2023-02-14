package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex_step3 {

	public static void main(String[] args) {
		/*
		 *  3. PreparedStatement 객체를 통해 SQL 구문 전달 및 실행
		 *   1) executeUpdate()	: INSERT, UPDATE, DELETE 구문 실행(데이터 조작)
		 *    -> 실행 후 적용된 레코드 수가 int 타입으로 리턴됨
		 *   2) executeQuery() : SELECT 구문 실행 전용(데이터 조회)
		 *    -> 실행 후 조회된 테이블이 Result
		 */
		
		// JDBC 활용에 필요한 정보 문자열 4개 생성
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java";
		String user = "root";
		String password = "1234"; 
		
		
		Connection con = null; // null로 초기화 시킨것
		PreparedStatement pstmt = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName(driver);
			System.out.println("드라이버 로드 성공!");
			
			// 2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 성공!");
			
			// 3. SQL 구문 전달 및 실행 
//			String sql = "CREATE TABLE test(idx int)";
//			String sql = "DROP TABLE test";
			String sql = "CREATE TABLE student(idx INT, id INT, name VARCHAR(16))";
					
			pstmt = con.prepareStatement(sql);
			
			pstmt.executeUpdate();
			System.out.println("SQL 구문 실행 성공!");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			// getConnection() 또는 executeXXX() 메서드 실행 과정에서 문제 발생 시
			System.out.println("DB 연결 실패! 또는 SQL 구문 오류 발생!");
			e.printStackTrace();
		} finally { // finally안의 내용은 무조건 수행
			// finally 블록 내에서 DB 관련 자원 반환 필수!
			try {// try & catch에 finally 부분은 독립적으로 적용됨
				// 생성된 객체의 역순으로 반환
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

}
