package controller;

import data.DataSource;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML private Text actionTarget;
    @FXML private TextField username;
    @FXML private PasswordField password;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException {
        String userN = username.getText();
        String passW = password.getText();
        DataSource dS = new DataSource();

        if(dS.login(userN,passW)){
            Stage stage = (Stage)actionTarget.getScene().getWindow();
            Parent root;
            root = FXMLLoader.load(getClass().getResource("../view/mainView.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else {
            actionTarget.setText("Login failed! Try again.");
        }
    }
}
