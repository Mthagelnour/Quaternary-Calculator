package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("/UI.fxml"));
       primaryStage.setTitle("Quaternary Calculator");
       primaryStage.setScene(new Scene(root));
       primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}