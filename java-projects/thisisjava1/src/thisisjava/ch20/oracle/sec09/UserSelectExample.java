package thisisjava.ch20.oracle.sec09;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelectExample {

	public static void main(String[] args) {
		Connection conn = null;
		//JDBC Driver 등록
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XE",
					"c##human",
					"human"
			);
			
			//매개변수화된 SQL 문 작성
			String sql = "" + 
				"SELECT userid \n"
			  + "     , username \n"
			  + "     , userpassword"
			  + "     , userage \n"
			  + "     , useremail \n" 
			  +" FROM users \n" +
			  "WHERE userid=?";
			
			//PrepareStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "Winter");
			
			//SQL문 실행 후, ResultSet을 통해 데이터 읽기
			ResultSet rs = pstmt.executeQuery();
			//1개의 데이터 행을 가져왔을 경우
			if(rs.next()) {
				//User 가져오기
				User user = new User();
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString("userpassname"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
				System.out.println(user);
			}
			//데이터 행을 가져오지 않았을 경우
			else { 
				System.out.println("사용자 아이디가 존재하지 않음");
			}
			rs.close();
			
			//PreparedStatement 닫기
			pstmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					//연결끊기
					conn.close();
				} catch(SQLException e) {}
			}
		}

	}

}

