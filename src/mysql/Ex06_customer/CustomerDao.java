package mysql.Ex06_customer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import ch06_class.Example09.Accumulator;

public class CustomerDao {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	public CustomerDao() {
		try {
			
			Properties props = new Properties();
			InputStream is = new FileInputStream("D:/JavaWorkspace/JavaLecture/src/mysql/mysql.properties");
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
	
	public Customer getCustomer(String uid) {
		Customer c = null;
		Connection conn = myConnection();
		String sql = "select * from customer where uid=?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				c = new Customer(rs.getString(1), rs.getString(2), LocalDate.parse(rs.getString(3)), rs.getInt(4));
			}
				
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return c;
	}
	
	
	public List<Customer> getCustomerList() {
		List<Customer> list = new ArrayList<Customer>();
		Connection conn = myConnection();
		String sql = "select * from customer where isDeleted=0";
		
		try {
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next() ) {
				String uid = rs.getString(1);
				String uname = rs.getString(2);
//				LocalDate regDate = LocalDate.parse(rs.getDate(3).toString());
				LocalDate regDate = LocalDate.parse(rs.getString(3));
				int isDeleted = rs.getInt(4);
				
				Customer c = new Customer(uid, uname, regDate, isDeleted);
				list.add(c);
			}
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void insertCustomer(Customer c) {
		Connection conn = myConnection();
		String sql = "insert into customer values(?, ?, default, default)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c.getUid());
			pstmt.setString(2, c.getUname());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateCustomer(Customer c) {
		Connection conn = myConnection();
		String sql = "update customer set uname=?, regDate=?, isDeleted=? where uid=?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c.getUname());
			pstmt.setString(2, c.getRegData().toString());
			pstmt.setInt(3, c.getIsDeleted());
			pstmt.setString(4, c.getUid());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteCustomer(String uid) {
		Connection conn = myConnection();
		String sql = "update customer set isDeleted=1 where uid=?";
		
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
