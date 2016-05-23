
package progdatabase;
import java.sql.*;
public class PROGdatabase {

    public static void main(String[] args) {
Connection con = null;


try {

    con = DriverManager.getConnection(
            "jdbc:mysql://localhost/TuBaseDeDatos?"
            + "user=TuUsuario&password=TuPass");

    // Otros y operaciones sobre la base de datos...

} catch (SQLException ex) {

    // Mantener el control sobre el tipo de error
    System.out.println("SQLException: " + ex.getMessage());

}
    }
    
}
