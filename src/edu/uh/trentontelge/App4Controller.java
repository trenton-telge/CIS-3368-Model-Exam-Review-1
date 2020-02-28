package edu.uh.trentontelge;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class App4Controller implements Initializable {
    public DatePicker BirthdayInput;
    public Button CanVoteButton;
    public Label VoteOutput;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CanVoteButton.setOnAction(e->{
            if (BirthdayInput.getValue().isBefore(LocalDate.now().minusYears(18))){
                VoteOutput.setText("Yes");
            } else {
                VoteOutput.setText("No");
            }
        });
    }
}
