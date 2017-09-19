package data;

import model.Timesheet;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    private String dbURL = "jdbc:mysql://localhost:3306/javafx";
    private String username = "root";
    private String password = "Start#123";

    /*
     * Connection to database
     * CRUD Operationen
     */

    // CREATE
    public void createTimesheet(Timesheet timesheet) {

        String sql =
                "INSERT INTO timesheet (Name, Date, Project, Contract, Customer, Assignment, Businessclass, Jobtype, Duration, Calculation, Extra, Comments)" +
                        "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

        try (Connection conn = DriverManager.getConnection(dbURL, username, password)){
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,timesheet.getName());
            statement.setString(2,timesheet.getDatum().toString());
            statement.setString(3,timesheet.getProjectName());
            statement.setString(4,timesheet.getContractName());
            statement.setString(5,timesheet.getCustomerName());
            statement.setString(6,timesheet.getAssignment());
            statement.setString(7,timesheet.getBusinessClass());
            statement.setString(8,timesheet.getJobType());
            statement.setString(9,"" + timesheet.getDuration());
            statement.setString(10,"" + timesheet.isCalculation());
            statement.setString(11,"" + timesheet.isExtra());
            statement.setString(12,timesheet.getComments());
            statement.executeUpdate();
            System.out.println("New Timesheet creaeted!");
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    // READ
    /*
    public void getAllTimesheets() {
        String sql = "SELECT * from timesheet";
    }

    // UPDATE
    public void edit() {
        String sql = "UPDATE timesheet SET ..... WHERE ....";
    }

    // DELETE
    public void remove() {
        String sql = "DELETE FROM timesheet WHERE ....";
    }
    */
    /*
     * Login function
     */
    public boolean login(String usern, String pwd) {
        boolean correct = false;
        String sql = "SELECT username, password FROM user";
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

    public List<String> getAllProject() {
        String sql = "SELECT * FROM projects";
        List<String> allProject = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(dbURL, username, password)){
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()) {
                allProject.add(result.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return allProject;
    }

    public List<String> getAllBusiness() {
        String sql = "SELECT * FROM business";
        List<String> allBusiness = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(dbURL, username, password)){
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()) {
                allBusiness.add(result.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return allBusiness;
    }

    public List<String> getAllJobtype() {
        String sql = "SELECT * FROM jobtypes";
        List<String> allJobs = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(dbURL, username, password)){
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()) {
                allJobs.add(result.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return allJobs;
    }
}