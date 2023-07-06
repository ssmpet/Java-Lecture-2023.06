package mysql.Ex07_kpop;

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

import mysql.Ex06_customer.Customer;

public class KpopDao {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	public KpopDao() {
		try {
			
			Properties props = new Properties();
			InputStream is = new FileInputStream("D:/mysql.properties");
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
	
	
	public Song getSong(int sid) {
		Song s = null;
		Connection conn = myConnection();
		String sql = "select * from song where sid=?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sid);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				s = new Song(rs.getInt(1), rs.getString(2), rs.getString(3));
			}

			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return s;
	}
	
	public List<Song> getSongList() {
		List<Song> list = new ArrayList<Song>();
		Connection conn = myConnection();
		String sql = "select * from song";
		
		try {
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next() ) {
				int sid = rs.getInt(1);
				String title = rs.getString(2);
				String lyrics = rs.getString(3);
				
				list.add(new Song(sid, title, lyrics));
			}
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public void insertSong(Song s) {
		Connection conn = myConnection();
		String sql = "insert into song values(defualt, ?, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, s.getTitle());
			pstmt.setString(2, s.getLyrics());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateSong(Song s) {
		Connection conn = myConnection();
		String sql = "update song set title=?, lyrics=? where sid=?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, s.getTitle());
			pstmt.setString(2, s.getLyrics());
			pstmt.setInt(3, s.getSid());
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteSong(String sid) {
		Connection conn = myConnection();
		String sql = "delete from song where sid=?";
		
		try {
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sid);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// Girl Group
	public GirlGroup getGirlGroup(int gid) {
		GirlGroup g = null;
		Connection conn = myConnection();
		String sql = "select * from girl_group where gid=?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, gid);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				g = new GirlGroup(rs.getInt(1), rs.getString(2), LocalDate.parse(rs.getString(3)), rs.getInt(4));
			}

			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return g;
	}
	
	public List<GirlGroup> getGirlGroupList() {
		List<GirlGroup> list = new ArrayList<GirlGroup>();
		Connection conn = myConnection();
		String sql = "select l.gid, l.name, l.debut, l.hit_song_id, r.title from girl_group as l join song as r on ON l.hit_song_id = r.sid";
		
		try {
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next() ) {
				
				
				list.add(new GirlGroup(rs.getInt(1), rs.getString(2), LocalDate.parse(rs.getString(3)), rs.getInt(4), rs.getString(5)));
			}
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public void insertGirlGroup(GirlGroup g) {
		Connection conn = myConnection();
		String sql = "insert into girl_group values(defualt, ?, ?, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, g.getName());
			pstmt.setString(2, g.getDebut().toString());
			pstmt.setInt(3,  g.getHitSongId());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateGirlGroup(GirlGroup g) {
		Connection conn = myConnection();
		String sql = "update girl_group set name=?, debut=?, hit_song_id=? where gid=?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, g.getName());
			pstmt.setString(2, g.getDebut().toString());
			pstmt.setInt(3, g.getHitSongId());
			pstmt.setInt(4, g.getGid());
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteGirlGroup(int gid) {
		Connection conn = myConnection();
		String sql = "delete from girl_group where gid=?";
		
		try {
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, gid);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
