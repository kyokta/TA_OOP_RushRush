package Core;

import java.sql.*;

public class Database {
    final static String url = "jdbc:mysql://localhost:3306/rushrush";
    final static String username = "root";
    final static String pass = "";
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, pass);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from user");

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
            }

            connection.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}