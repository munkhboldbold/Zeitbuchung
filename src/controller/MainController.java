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
    protected void handleSaveBtnAction() {
        System.out.println("Save Button Clicked");
        actionTargetBtn.setText("Saving ...");
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
    protected void handleHelpBtnAction() {
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
