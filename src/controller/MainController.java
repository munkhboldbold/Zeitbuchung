package controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.awt.event.ActionEvent;

public class MainController {
    @FXML
    private Text actionTargetBtn;

    /*
     * create Timesheet in DB
     */
    @FXML
    protected void handleSaveBtnAction(ActionEvent event) {
        System.out.println("Save Button Clicked");
    }

    /*
     * change to Project list view
     */
    @FXML
    protected void handleProjectBtnAction(ActionEvent event) {
        System.out.println("Project Button Clicked");
    }

    /*
     * open addition Window for Help
     */
    @FXML
    protected void handleHelpBtnAction(ActionEvent event) {
        System.out.println("Help Button Clicked");
    }

    /*
     * disconnect Database
     * close every sub window
     * close application
     */
    @FXML
    protected void handleCancelBtnAction (ActionEvent event) {
        System.out.println("Cancel Button Clicked");
        actionTargetBtn.setText("Closing ...");
        Platform.exit();
        System.exit(0);
    }
}
