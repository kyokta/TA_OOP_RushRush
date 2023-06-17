package Core;

import java.sql.*;
import javax.swing.JOptionPane;

public class Database {
    private static final String url = "jdbc:mysql://localhost:3306/rushrush";
    private static final String username = "root";
    private static final String pass = "";
    private Connection connection;

    public Database(){
        try {
            connection = DriverManager.getConnection(url, username, pass);
        } catch (SQLException e){
            System.err.println("Koneksi ke database gagal: " + e.getMessage());
        }
    }

    public Connection getConnection(){
        return connection;
    }
}