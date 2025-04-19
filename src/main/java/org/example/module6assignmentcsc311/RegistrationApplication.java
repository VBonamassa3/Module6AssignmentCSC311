package org.example.module6assignmentcsc311;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class RegistrationApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RegistrationApplication.class.getResource("reg-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 450);
        scene.getStylesheets().add(Objects.requireNonNull(RegistrationApplication.class.getResource("mystyle.css")).toExternalForm());
        stage.setTitle("Registration");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}