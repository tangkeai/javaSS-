import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC1 {
    public static void main(String[] args) throws SQLException {

        DriverManager.deregisterDriver(new Driver());
    }
}
