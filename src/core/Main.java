package core;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    // Scene sceneLogin, sceneProject, sceneTimesheet;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("../view/createTS.fxml"));
        primaryStage.setTitle("Zeitbuchung");

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        // primaryStage.setResizable(false);
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(900);
        primaryStage.show();

        // Window width changed
        primaryStage.widthProperty().addListener((ObservableValue<? extends Number> obs, Number oldVal, Number newVal) -> {
            System.out.println("Breite: " + oldVal + " " + newVal);

        });

        // Window height changed
        primaryStage.heightProperty().addListener((ObservableValue<? extends Number> obs, Number oldVal, Number newVal) -> {
            System.out.println("Höhe: " + oldVal + " " + newVal);
        });

    }
    public static void main(String[] args) {
        launch(args);
    }
}
