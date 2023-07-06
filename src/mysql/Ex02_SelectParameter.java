package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02_SelectParameter {

	public static void main(String[] args) {
		
		select("KOR", 15);

	}
	
	static void select(String countryCode, int num) {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "ysuser", "yspass");
			stmt = conn.createStatement();
			String sql = "select * from city where countrycode=? limit ?";
			
			// SQL에 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, countryCode);
			pstmt.setInt(2, num);
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				countryCode = rs.getString(3);
				String district = rs.getString(4);
				int population = rs.getInt(5);
				System.out.printf("%d, %s, %s, %s, %d\n", id, name, countryCode, district, population);
			}
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
