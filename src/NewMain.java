import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

// ⚠️ CHANGE "NewMain" TO MATCH YOUR FILE NAME EXACTLY
public class NewMain {

    // Database Credentials (from your previous settings)
    private static final String dbName = "ENTER_MySQL_Database_Name";
    private static final String URL = "jdbc:mysql://localhost:3306/" + dbName;
    private static final String USER = "root";
    private static final String PASSWORD = "ENTER_MySQL_Password";

    public static void main(String[] args) {

        // SQL 1: Create Table
        String createTableSQL = "CREATE TABLE IF NOT EXISTS users ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "username VARCHAR(50) NOT NULL, "
                + "email VARCHAR(100) NOT NULL"
                + ")";

        // SQL 2: Insert Data
        String insertSQL = "INSERT INTO users (username, email) VALUES (?, ?)";

        System.out.println("Step 1: Connecting...");

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("✅ Connected to database!");

            // --- Execute Create Table ---
            try (Statement statement = connection.createStatement()) {
                statement.execute(createTableSQL);
                System.out.println("✅ Table 'users' checked/created.");
            }

            // --- Execute Insert Rows ---
            try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {

                // Add first user
                pstmt.setString(1, "Alice");
                pstmt.setString(2, "alice@example.com");
                pstmt.addBatch();

                // Add second user
                pstmt.setString(1, "Bob");
                pstmt.setString(2, "bob@example.com");
                pstmt.addBatch();

                // Send both to database
                int[] rowsAffected = pstmt.executeBatch();
                System.out.println("✅ Inserted " + rowsAffected.length + " rows.");
            }

        } catch (SQLException e) {
            System.err.println("❌ Error detected!");
            e.printStackTrace();
        }
    }
}