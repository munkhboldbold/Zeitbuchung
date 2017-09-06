package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LoginController {

    @FXML private Text actionTarget;
    @FXML private TextField username;
    @FXML private PasswordField password;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        String userN = username.getText();
        String passW = password.getText();
        System.out.println("Username: " + userN + " Password: " + passW);
        actionTarget.setText("Sign in button pressed");
    }
}
