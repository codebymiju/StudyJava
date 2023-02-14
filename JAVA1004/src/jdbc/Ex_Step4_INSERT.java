package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex_Step4_INSERT {

	public static void main(String[] args) {
		/*
		 *  4. SQL 구문 실행 후 결과 처리
		 *  - executeUpdate() 메서드 실행 결과 : int 타입
		 *  - executeQuery() 메서드 실행 결과 : ResultSet 타입
		 */
		
		// 외부로부터 전달받은 번호(idx)를 INSERT 하는 문장 작성
		int idx = 10;
		
		// JDBC 활용에 필요한 정보 문자열 4개 생성
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java";
		String user = "root";
		String password = "1234"; 
		
		Connection con = null; // null로 초기화 시킨것(db연결시 사용)
		PreparedStatement pstmt = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName(driver);
			System.out.println("드라이버 로드 성공!");
			
			// 2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 성공!");
			
			// 3. SQL 구문 작성 및 전달
//			String sql = "INSERT INTO test VALUES(" + idx + ")";
//			String sql = "INSERT INTO test VALUES(?)";
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, idx);
			
			String sql = "INSERT INTO student VALUES(?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 1); // 첫번째 물음표에 1을 넣어라
			pstmt.setInt(2, 1);
			pstmt.setString(3, "kim");
			
			// 4. SQL 구문 실행 및 결과 처리
			int result = pstmt.executeUpdate();
			// -> 실행 결과 리턴(insert 된 레코드 수)
			if(result > 0) {
				System.out.println("INSERT 작업 성공! - " + result + "개 레코드");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			// getConnection() 또는 executeXXX() 메서드 실행 과정에서 문제 발생 시
			System.out.println("DB 연결 실패! 또는 SQL 구문 오류 발생!");
			e.printStackTrace();
			System.out.println("DB 연결 실패!");
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
