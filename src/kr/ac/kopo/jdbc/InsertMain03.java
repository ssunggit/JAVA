package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// 1, 2, 5 단계는 같다
// 3, 4 단계만 달라진다
public class InsertMain03 {
	
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";
			
			conn = DriverManager.getConnection(url, user, password);
			String id = "kim";
			String name = "김길동";
			
//			쿼리를 가지고 있는 애를 먼저 전처리 
//			? -> 1 부터 시작 
//			values(?) - ?만 가능하다.
			String sql  = "insert into t_test(id, name) ";
				   sql += "values(?, ?)";
				   
//			위 쿼리를 가지고 있는 statement 객체를 먼저 만들기
		    pstmt = conn.prepareStatement(sql);
//		    set기본자료형
//		    prepareStatement 객체의 메소드 : .setString() : 문자열이면 작은따옴표 붙이기
		    pstmt.setString(1, id);
		    pstmt.setString(2, name);
		    
		    int cnt = pstmt.executeUpdate();
		    
		    System.out.println("총 "+ cnt +"개 행이 삽입되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if(pstmt != null) {
				try {
					pstmt.close();					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
