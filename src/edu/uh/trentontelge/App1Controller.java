package edu.uh.trentontelge;

import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class App1Controller implements Initializable {
    public TextField Num1;
    public TextField Num2;
    public RadioButton CalcFunctionAdd;
    public ToggleGroup CalcFunctions;
    public RadioButton CalcFunctionSubtract;
    public RadioButton CalcFunctionMultiply;
    public RadioButton CalcFunctionDivide;
    public Button CalcComputeButton;
    public Label CalcResult;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CalcComputeButton.setOnAction(e->{
            if (Num1.getText() != null && !Num1.getText().isEmpty() && Num2.getText() != null && !Num2.getText().isEmpty()) {
                if (CalcFunctionAdd.isSelected()) {
                    CalcResult.setText(String.valueOf(Double.parseDouble(Num1.getText()) + Double.parseDouble(Num2.getText())));
                } else if (CalcFunctionSubtract.isSelected()){
                    CalcResult.setText(String.valueOf(Double.parseDouble(Num1.getText()) - Double.parseDouble(Num2.getText())));
                } else if (CalcFunctionMultiply.isSelected()){
                    CalcResult.setText(String.valueOf(Double.parseDouble(Num1.getText()) * Double.parseDouble(Num2.getText())));
                } else if (CalcFunctionDivide.isSelected() && Double.parseDouble(Num2.getText()) != 0){
                    CalcResult.setText(String.valueOf(Double.parseDouble(Num1.getText()) / Double.parseDouble(Num2.getText())));
                }
            }
        });
    }
}
