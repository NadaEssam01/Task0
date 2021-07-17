
package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sql {

    static String add= "jdbc:mysql://localhost/mysql";
    static String user ="root";
    static String pass ="";
    static Connection c;
    public static void main(String[] args) throws SQLException {    
        c = DriverManager.getConnection(add, user, pass);
    }
    
}
