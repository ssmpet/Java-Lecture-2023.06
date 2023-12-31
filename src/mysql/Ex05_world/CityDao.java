package mysql.Ex05_world;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import mysql.Ex04_Properties;

public class CityDao {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	public CityDao() {
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
	
	public City getCityById(int id) {
		
		Connection conn = myConnection();
		String sql = "select * from city where id=?";
		City city = new City();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				city.setId(rs.getInt(1));
				city.setName(rs.getString(2));
				city.setCountryCode(rs.getString(3));
				city.setDistrict(rs.getString(4));
				city.setPopulation(rs.getInt(5));
			}
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return city;
	}
	
	public City getCityByName(String name) {
		
		Connection conn = myConnection();
		String sql = "select * from city where name=?";
		City city = null;
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next() ) {
				int id = rs.getInt(1);
				name = rs.getString(2);
				String countryCode = rs.getString(3);
				String district = rs.getString(4);
				int population = rs.getInt(5);
				city = new City(id, name, countryCode, district, population);
				// 다른 방법
//				city = new City( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
			}
			rs.close();
			pstmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return city;
	}
	
	public List<City> getCityList(String countryCode, int num) {
		
		Connection conn = myConnection();

		List<City> list = new ArrayList<City>();
		String sql = "select * from city where countryCode=? limit ?";
		
		try {
 
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, countryCode);
			pstmt.setInt(2, num);
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next() ) {
				
				list.add(new City(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
			}
			
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	
	public void insertCity(City city) {
		Connection conn = myConnection();
		
		try {
			
			String sql = "insert into city values(default, ?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, city.getName());
			pstmt.setString(2, city.getCountryCode());
			pstmt.setString(3, city.getDistrict());
			pstmt.setInt(4,	city.getPopulation());
			pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateCity(City city) {
		Connection conn = myConnection();
		
		try {
			
			String sql = "update city set name=?, countrycode=?, district=?, population=? where id=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, city.getName());
			pstmt.setString(2, city.getCountryCode());
			pstmt.setString(3, city.getDistrict());
			pstmt.setInt(4,	city.getPopulation());
			pstmt.setInt(5, city.getId());
			pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteCity(int id) {
		Connection conn = myConnection();
		try {
			
			String sql = "delete from city where id=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
