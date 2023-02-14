package jdbc;

import java.sql.*; // java.sql.으로 시작하는 패키지 안의 클래스를 사용하겠다는 만능문자

public class Ex4_Step4_SELECT {

	public static void main(String[] args) {
		// JDBC 사용에 필요한 4가지 문자열
		// 드라이버 위치, URL, 계정명, 패스워드
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java";
		String user = "root";
		String password = "1234";
		
		Connection con = null;
		PreparedStatement pstmt = null; // 하나하나 import 로 등록하던지 위의 import문 처럼 하던지
		ResultSet rs = null; // select 구문에는 이것 한줄 더 필요함
		
		try {
			// 1단계. 드라이버 로드
			Class.forName(driver);
			System.out.println("드라이버 로드 성공!");
			
			// 2단계. DB 연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 성공!");
			
			// 3단계. SQL 구문 작성 및 전달
			// test 테이블의 모든 레코드 조회
//			String sql = "SELECT * FROM test";
			String sql = "SELECT * FROM student";
			
			pstmt = con.prepareStatement(sql);
			
			// 4단계. SQL 실행 및 결과 처리
			// SELECT 결과를 java.sql.ResultSet 타입으로 리턴
			rs = pstmt.executeQuery(); // ResultSet 타입으로 리턴
			
			while(rs.next()) {
				// rs.getXXX() 메서드를 호출하여 컬럼 데이터 가져오기
//				int idx = rs.getInt(1); // 첫번째 컬럼 데이터 int형으로 가져오기
				int idx = rs.getInt("idx"); // idx라는 이름의 컬럼 데이터 가져오기
//				System.out.println(idx);
				
				int id = rs.getInt("id");
				String name = rs.getString("name");
				System.out.println(idx + " / " + id + " / " + name);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 연결 실패!");
			e.printStackTrace();
		} finally {
			// finally 블록 내에서 DB 관련 자원 반환 필수! (역순으로 반환)
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
