package controller;

import data.DataSource;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Timesheet;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.time.LocalDate;

public class MainController {
    @FXML
    private TextField empName;
    @FXML
    private DatePicker datepicker;
    @FXML
    private TextField contractName;
    @FXML
    private TextField customerName;
    @FXML
    private TextField orderName;
    @FXML
    private ToggleGroup group;
    @FXML
    private CheckBox moreCost;
    @FXML
    private Text actionTargetBtn;

    /*
     * create Timesheet in DB
     */
    @FXML
    protected void handleSaveBtnAction() {
        Timesheet ts;
        String emName = empName.getText();
        LocalDate datum = datepicker.getValue();;
        String coName = contractName.getText();
        String cuName = customerName.getText();
        String orName = orderName.getText();
        Toggle tgl = group.getSelectedToggle();
        boolean mCost = moreCost.isSelected();

        if (datum != null) {
            actionTargetBtn.setText("Saving ... \n" +
                    emName + "\n " + datum.toString());
            DataSource ds = new DataSource();
            ds.connectToDB();
        } else {
            actionTargetBtn.setText("Bitte wählen Sie einen Datum aus!");
        }
    }

    /*
     * change to Project list view
     */
    @FXML
    protected void handleProjectBtnAction() {
        System.out.println("Project Button Clicked");
        actionTargetBtn.setText("Projekt ...");
    }

    /*
     * open addition Window for Help
     */
    @FXML
    protected void handleHelpBtnAction(javafx.event.ActionEvent event) {
        System.out.println("Help Button Clicked");
        actionTargetBtn.setText("Help ...");
    }

    /*
     * disconnecting database
     *
     */
    @FXML
    protected void handleCancelBtnAction () {
        System.out.println("Cancel Button Clicked");
        actionTargetBtn.setText("Closing ...");
    }
}
