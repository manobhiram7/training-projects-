import java.sql.*;

public class III {
    public static void main(String[] args) {
        try {
            // 1. Create connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/colleges",
                "root",
                "Manobhi@0216"
            );

            // 2. Create statement
            Statement stmt = con.createStatement();

            // 3. Execute INSERT query
            String query = "INSERT INTO Students VALUES (9,'David',21,3)";
            int rows = stmt.executeUpdate(query);

            // 4. Check result
            System.out.println(rows + " row inserted");

            // 5. Close connection
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}