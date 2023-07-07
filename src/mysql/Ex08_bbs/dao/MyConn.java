package mysql.Ex08_bbs.dao;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class MyConn {
	
	private static String host;
	private static String user;
	private static String password;
	private static String database;
	private static String port;
	
	static {
		try {
					
				Properties props = new Properties();
				InputStream is = new FileInputStream("D:/mysql_prj.properties");
				props.load(is);
				is.close();
		
				host = props.getProperty("host");
				user	= props.getProperty("user");
				password = props.getProperty("password");
				database = props.getProperty("database");
				port = props.getProperty("port");
			
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
		
	
	public static Connection myConnection() {
		
		Connection conn = null;
		
		try {
			String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			conn = DriverManager.getConnection(connStr, user, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;

		
	}
		
}
