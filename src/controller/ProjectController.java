package controller;

import data.DataSource;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class ProjectController implements Initializable{



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        DataSource ds = new DataSource();
        ds.getAllProject();
    }
}
