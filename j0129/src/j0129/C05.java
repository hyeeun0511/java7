package j0129;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C05 {
	public static void main(String[] args) {
		// try-exception 하는 경우
		// 1) db접속
		// 2) 입출력
		// 3) file처리
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "ora_user";
		String pw = "1111";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// Class.forName : 드라이버 로드 / 이름을 알아서 찾아줌
			// 클래스 정보 가져오기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);
			String query = "select * from member";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String pass = rs.getString("pw");
				String name = rs.getString("name");
				System.out.printf("%s,%s,%s\n", id, pass, name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
	}//main
}