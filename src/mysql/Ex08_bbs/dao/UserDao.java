package mysql.Ex08_bbs.dao;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import mysql.Ex08_bbs.entity.User;

public class UserDao {
	
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	public UserDao() {
		try {
			
			Properties props = new Properties();
			InputStream is = new FileInputStream("D:/mysql_prj.properties");
			props.load(is);
			is.close();
			
			this.host = props.getProperty("host");
			this.user	= props.getProperty("user");
			this.password = props.getProperty("password");
			this.database = props.getProperty("database");
			this.port = props.getProperty("port");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection myConnection() {
		Connection conn = null;
		try {
			String connStr = "jdbc:mysql://" + this.host + ":" + this.port + "/" + this.database;
			conn = DriverManager.getConnection(connStr, this.user, this.password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}
	
	
	public User getUser(String uid) {
		
		User u = null;
		String sql = "select * from users where uid=?";

		Connection conn = myConnection();
		try {

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				u = new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
							 LocalDate.parse(rs.getString(5)), rs.getInt(6));
			}
			
			rs.close();	
			pstmt.close(); 
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return u;		
	}
	
	
	public List<User> getUserList(int num, int offset) {
		
		List<User> list = new ArrayList<User>();
		
		String sql = "select * from users where isDeleted=0 order by regDate desc limit ? offset ?";

		Connection conn = myConnection();
		try {

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setInt(2, offset);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
							 LocalDate.parse(rs.getString(5)), rs.getInt(6)));
			}
			
			rs.close();	
			pstmt.close(); 
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;		
	}
	
	
	public void registerUser(User u ) {
		
		String sql = "insert into users values(?, ?, ?, ?, default, default)";
		
		Connection conn = myConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u.getUid());
			pstmt.setString(2, u.getPassword());
			pstmt.setString(3, u.getUname());
			pstmt.setString(4, u.getEmail());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void updateUser(User u ) {
		
		String sql = "update users set password=?, uname=?, email=?, regDate=? where uid=? ";
		
		Connection conn = myConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u.getPassword());
			pstmt.setString(2, u.getUname());
			pstmt.setString(3, u.getEmail());
			pstmt.setString(4, u.getRegDate().toString());
			pstmt.setString(5, u.getUid());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void deleteUser(String uid) {
		
		String sql = "update users set isDelete=1 where uid=? ";
		
		Connection conn = myConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
