package mysql.Ex08_bbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import mysql.Ex08_bbs.entity.Reply;

public class ReplyDao {

	public Reply getReply(int rid) {
		
		Reply b = null;
		Connection conn = MyConn.myConnection();
		
		String sql = "select * from reply where rid=?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rid);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				b = new Reply(rs.getInt(1), rs.getString(2),
						 		LocalDateTime.parse(rs.getString(3).replace(" ", "T")), 
						 		rs.getString(4), rs.getInt(5));
			}
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return b;	
	}
	
	public List<Reply> getReplyList(int bid) {

		List<Reply> list = new ArrayList<Reply>();
		String sql = "select * from reply where bid=? order by rid";
		
		Connection conn = MyConn.myConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				list.add(new Reply(rs.getInt(1), rs.getString(2),
						 		LocalDateTime.parse(rs.getString(3).replace(" ", "T")), 
						 		rs.getString(4), rs.getInt(5)));
			}
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public void insertReply(Reply r) {
		String sql = "insert into reply values(default, ?, default, ?, ?)";
		Connection conn = MyConn.myConnection();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, r.getComment());
			pstmt.setString(2, r.getUid());
			pstmt.setInt(3, r.getBid());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void updateReply(Reply r) {
		String sql = "update reply set comment=?, regTime=NOW() where rid=?";
		
		Connection conn = MyConn.myConnection();
		try {
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, r.getComment());
			pstmt.setInt(2, r.getRid());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void deleteReply(int rid) {
		String sql = "delete from reply where rid=?";
		Connection conn = MyConn.myConnection();
		try {
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rid);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
