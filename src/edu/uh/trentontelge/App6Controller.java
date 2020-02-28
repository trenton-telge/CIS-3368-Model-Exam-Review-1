package edu.uh.trentontelge;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

interface IsPrime{
    boolean determine(int x);
}

public class App6Controller implements Initializable {
    public TextField PrimeInput;
    public Button PrimeCalculateButton;
    public Label PrimeOutput;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        PrimeCalculateButton.setOnAction(e->{
            if (PrimeInput.getText() != null && !PrimeInput.getText().isEmpty()){
                IsPrime f = (int x)->{
                    int c = x;
                    while (c > 1) {
                        if (x%c == 0){
                            return false;
                        }
                        c--;
                    }
                    return true;
                };
                if (f.determine(Integer.parseInt(PrimeInput.getText()))){
                    PrimeOutput.setText("Yes");
                } else {
                    PrimeOutput.setText("No");

                }            }
        });
    }
}
