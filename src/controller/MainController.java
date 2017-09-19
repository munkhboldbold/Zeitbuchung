package controller;

import data.DataSource;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Timesheet;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Observable;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private TextField empName;
    @FXML
    private DatePicker datepicker;

    // Missing Project selection

    @FXML
    private TextField contractName;
    @FXML
    private TextField customerName;
    @FXML
    private TextField assignment;
    @FXML
    private ComboBox businessClass;
    @FXML
    private ComboBox jobType;
    @FXML
    private TextField duration;
    @FXML
    private ToggleGroup group;
    @FXML
    private CheckBox extra;
    @FXML
    private TextField comments;


    @FXML
    private Text actionTargetBtn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        businessClass.getItems().clear();
        jobType.getItems().clear();
        DataSource ds = new DataSource();
        ObservableList obListBusi = FXCollections.observableList(ds.getAllBusiness());
        businessClass.setItems(obListBusi);
        ObservableList obListJobT = FXCollections.observableList(ds.getAllJobtype());
        jobType.setItems(obListJobT);
    }

    /*
     * create Timesheet in DB
     */
    @FXML
    protected void handleSaveBtnAction() {
        String emName = empName.getText();
        LocalDate datum = datepicker.getValue();;
        String coName = contractName.getText();
        String cuName = customerName.getText();
        String assign = assignment.getText();
        String bClass = businessClass.getValue().toString();
        String jType = jobType.getValue().toString();
        String dtn = duration.getText();
        // Projectname missing
        ToggleGroup tgl = group;
        RadioButton selectedRadio = (RadioButton) tgl.getSelectedToggle();

        String ext = extra.selectedProperty().getValue().toString();
        String cmt = comments.getText();


        if (datum != null) {
            actionTargetBtn.setText("Saving ... \n" +
            emName + "\n" + datum + "\n" + coName + "\n" + cuName + "\n" +
            assign + "\n" + bClass + "\n" + jType + "\n" + dtn + "\n" +
                    selectedRadio.getText() + "\n" + ext + "\n" + cmt);
        } else {
            actionTargetBtn.setText("Bitte wählen Sie einen Datum aus!");
        }

        Timesheet tst = new Timesheet(
                emName,
                datum.toString(),
                null,
                coName,
                cuName,
                assign,
                bClass,
                jType,
                dtn,
                selectedRadio.getText(),
                ext,
                cmt
        );
        DataSource ds = new DataSource();
        ds.createTimesheet(tst);
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
