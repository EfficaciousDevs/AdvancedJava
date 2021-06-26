import java.sql.*;

public class Jdbc {
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
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
