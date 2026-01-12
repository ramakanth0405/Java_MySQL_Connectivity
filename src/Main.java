import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        // 1. UPDATE THESE VARIABLES
        String dbName = "ENTER_MySQL_Database_Name"; // e.g., "sys", "world", or your custom DB
        String user = "root";                 // Your MySQL username
        String password = "ENTER_MySQL_Password";    // Your MySQL password

        String url = "jdbc:mysql://localhost:3306/" + dbName;

        System.out.println("Connecting to database: " + dbName);

        // 2. Attempt Connection
        try (Connection connection = DriverManager.getConnection(url, user, password)) {

            System.out.println("✅ CONNECTION SUCCESSFUL!");
            System.out.println("You are now connected to MySQL.");

        } catch (SQLException e) {
            System.err.println("❌ CONNECTION FAILED");
            System.err.println("Error Message: " + e.getMessage());

            // Common Error Help
            if (e.getMessage().contains("Access denied")) {
                System.err.println("-> Check your Username and Password.");
            } else if (e.getMessage().contains("Communications link failure")) {
                System.err.println("-> Check if the MySQL server is actually running.");
            } else if (e.getMessage().contains("Unknown database")) {
                System.err.println("-> The database '" + dbName + "' does not exist.");
            }

            e.printStackTrace();
        }
    }
}