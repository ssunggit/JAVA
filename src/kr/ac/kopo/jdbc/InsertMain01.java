package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// id : 'hong' name : '홍길동' 레코드 삽입
/* (암기)
 작업순서
 1. 드라이버 로딩
 2. DB 접속 및 Connection 얻어오기
 3. sql 실행객체 얻어오기
 4. 쿼리 실행 및 결과 얻어오기
 5. 접속 종료
 */
public class InsertMain01 {
	public static void main(String[] args) {
		
//			자바는 블럭스코프이기때문에 stnt, conn 는 try 밖에 선언되어야한다.
		Connection conn = null;
		Statement stmt = null;
		
		try {
			// 1단계 : 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");			
			System.out.println("드라이버 로딩 완료...");
			
			// 2단계 : DB 접속 및 Connection 객체 얻기 
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";
			
//			new 객체 사용 x
			conn = DriverManager.getConnection(url, user, password);
			
			System.out.println("conn: " + conn);
			
			// 3단계 : sql 실행객체 얻어오기
//			연결객체(conn) Statement 얻어옴
//			Statement의 경우 auto commit -> 트랜잭션을 할 경우 auto commit 을 false 해줘야한다. 
			stmt = conn.createStatement();
			String sql = "insert into t_test(id, name) values('hong', '홍길동')";
			
			// 4단계 : sql 실행 및 결과 얻어오기
//			executeUpdate : (int) 수정한 레코드의 갯수가 return 
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 "+ cnt +"개 행이 삽입되었습니다.");
			
		} catch (Exception e) {			
			e.printStackTrace();
		} finally {
//			예외가 발생하거나 안해도 db접속을 종료시켜야 하기 때문에 final에 적어준다. 
//			종료할 때 쓰는 메소드 close()
//			만들어준 순서 반대로 close()
//			statement -> connection
//			자바는 블럭스코프이기때문에 stnt, conn 는 try 밖에 선언되어야한다.
//			stmt, conn은 따로 따로 예외처리 해주어야 한다.
			// 5단계 : 접속 종료
			if(stmt != null) {
				try {
					stmt.close();					
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











