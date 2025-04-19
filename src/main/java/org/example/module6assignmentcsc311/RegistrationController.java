package org.example.module6assignmentcsc311;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class RegistrationController {

    @FXML
    private Button addButton;

    @FXML
    private Text verifiedText;

    @FXML
    void onAddButtonClick(ActionEvent event) {
        verifiedText.setText("Information Added Successfully");
        PauseTransition pause = new PauseTransition(Duration.seconds(2));
        pause.setOnFinished(e -> verifiedText.setText(""));
        pause.play();
    }
}