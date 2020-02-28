package edu.uh.trentontelge;

import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.List;
import java.util.ResourceBundle;

public class App3Controller implements Initializable {
    public TextField LoanTermInput;
    public TextField InterestRateInput;
    public TextField LoanAmountInput;
    public ChoiceBox<String> LoanTypeSelection;
    public Label OutputText;
    public Button LoanCalculateButton;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        LoanTypeSelection.setItems(FXCollections.observableList(List.of("Housing Loan", "Auto Loan")));
        LoanTypeSelection.getSelectionModel().select(0);
        LoanCalculateButton.setOnAction(e->{
            if (!LoanTypeSelection.getSelectionModel().isEmpty() && LoanTermInput.getText() != null && !LoanTermInput.getText().isEmpty() && InterestRateInput.getText() != null && !InterestRateInput.getText().isEmpty() && LoanAmountInput.getText() != null && !LoanAmountInput.getText().isEmpty()){
                OutputText.setText("Your "+ ((LoanTypeSelection.getSelectionModel().getSelectedItem().equals("Housing Loan"))?"housing":"auto") + " loan monthly payment is " + df.format(Double.parseDouble(LoanAmountInput.getText()) * (((Double.parseDouble(InterestRateInput.getText()) / 1200) * Math.pow(1 + (Double.parseDouble(InterestRateInput.getText()) / 1200), Double.parseDouble(LoanTermInput.getText()))) / (Math.pow(1 + (Double.parseDouble(InterestRateInput.getText()) / 1200), Double.parseDouble(LoanTermInput.getText())) - 1))));
            }
        });
    }
}
