package data;

import model.Timesheet;

import java.sql.*;
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


    /*
     * Login function
     */
    public boolean login(String usern, String pwd) {
        boolean correct = false;
        String sql = "Select username, password from user";
        try (Connection conn = DriverManager.getConnection(dbURL, username, password)){
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()) {
                if(result.getString(1).equals(usern) &&
                        result.getString(2).equals(pwd)) {
                    correct = true;
                }
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return correct;
    }
}