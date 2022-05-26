package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/*
 * 아이디입력 : 
 * 이름 입력 : 
 * 총 1개 행이 삽입되었습니다.
 */
public class InsertMain02 {
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			// 1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");			
			System.out.println("드라이버 로딩 완료...");
			
		
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";
			
			// 2단계
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn: " + conn);
			
			// 3단계
			System.out.println("아이디 입력 : ");
			String id = sc.nextLine();
			
			System.out.println("이름 입력 : ");
			String name = sc.nextLine();
															// 가독성이 떨어진다 -> PreparedStatement 등장
			String sql = "insert into t_test(id, name) values(\'"+ id +"\',\'"+ name +"\')";
			stmt = conn.createStatement();
			
			// 4단계
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 "+ cnt +"개 행이 삽입되었습니다.");
			
		} catch (Exception e) {			
			e.printStackTrace();
		} finally {

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











