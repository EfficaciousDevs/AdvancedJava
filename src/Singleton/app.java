package Singleton;

public class app {
    public static void main(String[] args) {
        System.out.println(DBConn.getInstance().hashCode());
        System.out.println(DBConn.getInstance().hashCode());
    }

}
