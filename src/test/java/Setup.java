import org.testng.annotations.BeforeClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Setup {

     Connection connection = null;
     @BeforeClass
    public Connection setUp() throws SQLException {

         String url = "jdbc:mysql://localhost:3306/student";
         String user = "root";
         String pass = "vaibhav";

         connection = DriverManager.getConnection(url,user,pass);
         return connection;
     }
}
