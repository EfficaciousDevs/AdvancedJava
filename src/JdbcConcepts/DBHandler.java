package JdbcConcepts;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBHandler {

	public Connection establishConnection() {
		try {
			String url = "jdbc:mysql://localhost:3306/sample";
			String username = "root";
			String password = "mypass";

			Connection con = DriverManager.getConnection(url,username,password);
			return con;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
