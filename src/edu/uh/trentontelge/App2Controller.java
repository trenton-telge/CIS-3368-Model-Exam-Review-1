package edu.uh.trentontelge;

import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class App2Controller implements Initializable {
    public ChoiceBox<String> MonthChoice;
    public TextField DayInput;
    public Label SeasonOutput;
    public Button FindSeasonButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        MonthChoice.setItems(FXCollections.observableList(List.of("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")));
        MonthChoice.getSelectionModel().select(0);
        FindSeasonButton.setOnAction(e->{
            if (!MonthChoice.getSelectionModel().isEmpty()){
                switch (MonthChoice.getSelectionModel().getSelectedItem()){
                    case "January": case "February": {
                        SeasonOutput.setText("Winter");
                        break;
                    }
                    case "March": {
                        if (Double.parseDouble(DayInput.getText()) <= 19){
                            SeasonOutput.setText("Winter");
                        } else {
                            SeasonOutput.setText("Spring");
                        }
                        break;
                    }
                    case "April": case "May": {
                        SeasonOutput.setText("Spring");
                        break;
                    }
                    case "June": {
                        if (Double.parseDouble(DayInput.getText()) <= 20){
                            SeasonOutput.setText("Spring");
                        } else {
                            SeasonOutput.setText("Summer");
                        }
                        break;
                    }
                    case "July": case "August": {
                        SeasonOutput.setText("Summer");
                        break;
                    }
                    case "September": {
                        if (Double.parseDouble(DayInput.getText()) <= 21){
                            SeasonOutput.setText("Summer");
                        } else {
                            SeasonOutput.setText("Fall");
                        }
                        break;
                    }
                    case "October": case "November": {
                        SeasonOutput.setText("Fall");
                        break;
                    }
                    case "December": {
                        if (Double.parseDouble(DayInput.getText()) <= 20) {
                            SeasonOutput.setText("Fall");
                        } else {
                            SeasonOutput.setText("Winter");
                        }
                        break;
                    }
                }
            }
        });
    }
}
