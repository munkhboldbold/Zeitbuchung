package controller;

import data.DataSource;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Timesheet;
import javafx.event.ActionEvent;

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
            actionTargetBtn.setText("Saving ... \n");
        } else {
            actionTargetBtn.setText("Bitte wählen Sie einen Datum aus!");
        }
    }

    /*
     * change to Project list view
     */
    @FXML
    private Button projectBtn;
    @FXML
    protected void handleProjectBtnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage)projectBtn.getScene().getWindow();
        Parent root;
        root = FXMLLoader.load(getClass().getResource("../view/projectView.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /*
     * open addition Window for Help
     */
    @FXML
    private Button helpBtn;
    @FXML
    protected void handleHelpBtnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage)helpBtn.getScene().getWindow();
        Parent root;
        root = FXMLLoader.load(getClass().getResource("../view/help.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /*
     * disconnecting database
     */
    @FXML
    private Button cancelBtn;

    @FXML
    protected void handleCancelBtnAction (ActionEvent event) throws IOException {
        Stage stage = (Stage)cancelBtn.getScene().getWindow();
        Parent root;
        root = FXMLLoader.load(getClass().getResource("../view/login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
