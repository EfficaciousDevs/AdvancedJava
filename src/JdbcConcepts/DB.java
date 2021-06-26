package JdbcConcepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
    private static Connection connection = null;
    private static Properties properties = new Properties();

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/sample";
            String username = "root";
            String password = "mypass";

            Connection con = DriverManager.getConnection(url,username,password);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
}