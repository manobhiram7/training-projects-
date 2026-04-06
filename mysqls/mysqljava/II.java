import java.sql.*;

public class II{
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

            // 3. Execute SELECT query
            ResultSet rs = stmt.executeQuery("SELECT * FROM Students");

            // 4. Display data
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("Name");

                System.out.println(id + " " + name);
            }

            // 5. Close connection
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}