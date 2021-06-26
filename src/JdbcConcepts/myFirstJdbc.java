package JdbcConcepts;
import java.sql.*;
public class myFirstJdbc {
    public static void main(String[] args) {
        try{

            String url = "jdbc:mysql://localhost:3306/sample";
            String username = "root";
            String password = "mypass";

            Connection con = DriverManager.getConnection(url,username,password);
            if(con.isClosed())
                System.out.println("Connection is Closed");
            else
                System.out.println("Connection Created");


            String query = "CREATE TABLE DETAILS(TID INT PRIMARY KEY AUTO_INCREMENT, TNAME VARCHAR(50) NOT NULL , TCITY VARCHAR(50))";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
            System.out.println("TABLE CREATED IN THE DATABASE ...");
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }


}
