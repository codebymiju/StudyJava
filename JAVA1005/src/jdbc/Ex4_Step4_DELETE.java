package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex4_Step4_DELETE {

	public static void main(String[] args) {
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
					// 외부로부터 전달받은 번호(idx)를 찾아서 DELETE 하는 문장 작성
					int idx = 10;
					String sql = "DELETE FROM test WHERE idx=?";// DELETE FROM 테이블명 조건식
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, idx); // "바인딩 처리를 한다" idx값이 10인 테이블을 지워라
					
					// 4. SQL 구문 실행 및 결과 처리
					int result = pstmt.executeUpdate();
					
					if(result > 0) {
					    System.out.println("DELETE 작업 성공 - " + result  + "개 레코드");
					} else {
						System.out.println("DELETE 작업 실패 - " + result  + "개 레코드");
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
