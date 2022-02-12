import java.sql.*;

public class DatabaseConnection {
    static Connection sql = null;
    
    public static Connection connectDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system","root","1234");
            return sql;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
