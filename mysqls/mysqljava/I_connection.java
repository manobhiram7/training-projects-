import java.sql.*;
public class I_connection{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db","root","Manobhi@0216");
            System.out.println("Connected Successfully!");
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}