package JdbcConcepts;
import java.sql.*;
public class SelectQueryJdbc {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/sample";
            String username = "root";
            String password = "mypass";

            Connection con = DriverManager.getConnection(url,username,password);
            if(con.isClosed())
                System.out.println("Connection is Closed");
            else
                System.out.println("Connection Created");


            String query = "SELECT * FROM DETAILS";
            Statement stmt = con.createStatement();

            ResultSet set = stmt.executeQuery(query);

            while(set.next())
            {
                int id = set.getInt(1);
                String Name = set.getString(2);
                String City = set.getString(3);

                System.out.println(id + " " + Name + " " + City);
            }
        con.close();

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
