package mysql.Ex08_bbs.dao;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import mysql.Ex08_bbs.entity.Board;
import mysql.Ex08_bbs.entity.User;

public class BoardDao {
//	private String host;
//	private String user;
//	private String password;
//	private String database;
//	private String port;
//	
//	public BoardDao() {
//		try {
//			
//			Properties props = new Properties();
//			InputStream is = new FileInputStream("D:/mysql_prj.properties");
//			props.load(is);
//			is.close();
//
//			this.host = props.getProperty("host");
//			this.user	= props.getProperty("user");
//			this.password = props.getProperty("password");
//			this.database = props.getProperty("database");
//			this.port = props.getProperty("port");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public Connection myConnection() {
//		Connection conn = null;
//		try {
//			String connStr = "jdbc:mysql://" + this.host + ":" + this.port + "/" + this.database;
//			conn = DriverManager.getConnection(connStr, this.user, this.password);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return conn;
//	}
	
	public Board getBoard(int bid) {
		Board b = null;
		Connection conn = MyConn.myConnection();
		String sql = "select * from board where bid=?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				b = new Board(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						 		LocalDateTime.parse(rs.getString(5).replace(" ", "T")), 
						 		rs.getInt(6), rs.getInt(7));
			}
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return b;	
	}
	
	public List<Board> getBoardList(String field, String query, int num, int offset) {
		
		List<Board> list = new ArrayList<Board>();
		String sql, strQuery;
		if ( field == null) {
			sql = "select * from board order by bid desc limit ? offset ?";
		} else {
			sql = "select * from board where " + field + " like ? order by bid desc limit ? offset ?";
		}
		

		Connection conn = MyConn.myConnection();
		
		try {
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			if ( field == null ) {				
				pstmt.setInt(1, num);
				pstmt.setInt(2, offset);
			} else {
				pstmt.setString(1, "%"+query+"%");
				pstmt.setInt(2, num);
				pstmt.setInt(3, offset);
			}
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				
				list.add(new Board(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							 LocalDateTime.parse(rs.getString(5).replace(" ", "T")), 
							 rs.getInt(6), rs.getInt(7)));
			}
			
			rs.close();	
			pstmt.close(); 
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public void insertBoard(Board b) {

		String sql = "insert into board values(default, ?, ?, ?, default, default, default)";

		Connection conn = MyConn.myConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getContent());
			pstmt.setString(3, b.getUid());
			
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void updateBoard(Board b) {
		Connection conn = MyConn.myConnection();
		String sql = "update board set title=?, content=?, modTime=NOW() where bid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getContent());
			pstmt.setInt(3, b.getBid());
			
			pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void deleteBoard(int bid) {
		Connection conn = MyConn.myConnection();
		String sql = "delete from board where bid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void increaseViewCount(int bid) {
		Connection conn = MyConn.myConnection();
		String sql = "update board set viewCount=viewCount+1 where bid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void increaseReplyCount(int bid) {
		
		Connection conn = MyConn.myConnection();
		String sql = "update board set replyCount=replyCount+1 where bid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
