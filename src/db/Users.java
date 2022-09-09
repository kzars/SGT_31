package db;

import java.sql.*;
import java.util.Scanner;

public class Users {
    public static void main(String[] args) {

        String dbURL = "jdbc:mysql://localhost:3306/java31";
        String username = "root";
        String password = "1234";
        Scanner scanner = new Scanner(System.in);
        char again = 'y';

        try (Connection conn = DriverManager.getConnection(dbURL,username,password)){
            System.out.println("Connected to database");

            while (again == 'y'){

                System.out.println("Choose one option (r, i, d)");
                System.out.println("r - reading data");
                System.out.println("i - inserting data");
                System.out.println("d - deleting data");
                char action = scanner.nextLine().charAt(0);

                if(action == 'i'){

                    System.out.println("Enter username");
                    String newUsername = scanner.nextLine();

                    System.out.println("Enter password");
                    String newPassword = scanner.nextLine();

                    System.out.println("Enter full name");
                    String newFullName = scanner.nextLine();

                    System.out.println("Enter email");
                    String newEmail =scanner.nextLine();

                    insertData(conn, newUsername, newPassword, newFullName, newEmail);
                } else if (action == 'r') {
                    readData(conn);
                } else if (action == 'd') {
                    System.out.println("Enter username that you want to delete");
                    String deleteUser = scanner.nextLine();
                    deleteData(conn,deleteUser);
                }

                System.out.println("Do you want to do something more y/n");
                again = scanner.nextLine().charAt(0);


            }




        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void readData (Connection conn) throws SQLException {

        String sql = "SELECT * FROM users";

        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        int count = 0;

        while (resultSet.next()){

            String username = resultSet.getString(2);
            String password = resultSet.getString(3);
            String fullName = resultSet.getString("fullname");
            String email = resultSet.getString("email");

            String output = "User #%d: %s - %s - %s - %s";
            System.out.println(String.format(output, ++count, username, password, fullName, email));

        }

    }

    public static void insertData (Connection conn, String username, String password, String fullName, String email) throws SQLException {

        String sql = "INSERT INTO Users (username, password, fullname, email) VALUE (?, ?, ?, ?)";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, username);
        statement.setString(2, password);
        statement.setString(3, fullName);
        statement.setString(4, email);

        int rowsInserted = statement.executeUpdate();

        if (rowsInserted > 0){
            System.out.println("A new user was inserted successfully");
        } else {
            System.out.println("Something was wrong");
        }

    }

    public static void deleteData (Connection conn, String username) throws SQLException {

        String sql = "DELETE FROM Users WHERE username = ?";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, username);

        int rowsDeleted = statement.executeUpdate();

        if (rowsDeleted > 0){
            System.out.println("User was deleted successfully");
        } else {
            System.out.println("Something was wrong");
        }

    }

}
