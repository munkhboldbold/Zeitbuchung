package data;

import model.Timesheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class DataSource {

    /*
     * Connection to database
     * CRUD Operationen
     */

    String dbURL = "jdbc:mysql://localhost:3306/javafx";
    String username = "root";
    String password = "Start#123";

    public void connectToDB() {
        try (Connection conn = DriverManager.getConnection(dbURL, username, password)){
            System.out.println("Connected!");
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }


}