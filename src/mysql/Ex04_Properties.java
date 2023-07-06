package mysql;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.util.Properties;

public class Ex04_Properties {

	public static void main(String[] args) throws IOException {

		// database.properties 파일 로드 
		// 방법1 (상대경로)
		Properties prop = new Properties(); 	// Map<String, String>
		prop.load(Ex04_Properties.class.getResourceAsStream("mysql.properties"));
		

		// 방법2 (절대경로)
		Properties props = new Properties();
		InputStream is = new FileInputStream("D:/JavaWorkspace/JavaLecture/src/mysql/mysql.properties");
		props.load(is);
		is.close();
		
		String host = props.getProperty("host");
		String user	= props.getProperty("user");
		String password = props.getProperty("password");
		String database = props.getProperty("database");
		String port = props.getProperty("port");
		String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
		System.out.println(connStr);
		System.out.println("DriverManager.getConnection(connStr, user, password)");
		
	}

}
