package Core;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Model {
    public String getPassword(String username){
        Database dbConnection = new Database();
        Connection connection = dbConnection.getConnection();
        String password = null;

        if (connection != null) {
            try {
                Statement statement = connection.createStatement();
                String query = "SELECT * FROM user where username = '" + username +"'";
                ResultSet resultSet = statement.executeQuery(query);

                while (resultSet.next()){
                    password = resultSet.getString("password");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        return password;
    }
}
