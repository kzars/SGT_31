package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestingDBConnection {
    public static void main(String[] args) {

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java31", "root","1234");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from users");

            while (rs.next()){
                System.out.printf("ID %d username: %s password: %s full name: %s email: %s\n",
                        rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
            }

            con.close();

        }catch (Exception e){
            System.out.println(e);
        }



    }
}
