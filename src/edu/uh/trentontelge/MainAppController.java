package edu.uh.trentontelge;

import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class MainAppController implements Initializable {
    public ChoiceBox<String> appPicker;
    public Button runButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        appPicker.setItems(FXCollections.observableList(List.of("App 1 - Calculator", "App 2 - Seasons", "App 3 - Loans", "App 4 - Voting Age", "App 5 - Area", "App 6 - Primes")));
        appPicker.getSelectionModel().select(0);
        runButton.setOnAction(e->{
            final String selectedOption = appPicker.getSelectionModel().getSelectedItem();
            if (!(selectedOption == null) && !selectedOption.isEmpty()){
                switch (selectedOption){
                    case "App 1 - Calculator":{
                        Stage s1 = new Stage();
                        Parent root;
                        try {
                            root = FXMLLoader.load(getClass().getResource("app1layout.fxml"));
                            s1.setTitle("App 1 - Calculator");
                            s1.setScene(new Scene(root, 350, 300));
                            s1.show();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        break;
                    }
                    case "App 2 - Seasons":{
                        Stage s2 = new Stage();
                        Parent root;
                        try {
                            root = FXMLLoader.load(getClass().getResource("app2layout.fxml"));
                            s2.setTitle("App 2 - Seasons");
                            s2.setScene(new Scene(root, 200, 300));
                            s2.show();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        break;
                    }
                    case "App 3 - Loans":{
                        Stage s3 = new Stage();
                        Parent root;
                        try {
                            root = FXMLLoader.load(getClass().getResource("app3layout.fxml"));
                            s3.setTitle("App 3 - Loans");
                            s3.setScene(new Scene(root, 400, 300));
                            s3.show();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        break;
                    }
                    case "App 4 - Voting Age":{
                        Stage s4 = new Stage();
                        Parent root;
                        try {
                            root = FXMLLoader.load(getClass().getResource("app4layout.fxml"));
                            s4.setTitle("App 4 - Voting Age");
                            s4.setScene(new Scene(root, 250, 180));
                            s4.show();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        break;
                    }
                    case "App 5 - Area":{
                        Stage s5 = new Stage();
                        Parent root;
                        try {
                            root = FXMLLoader.load(getClass().getResource("app5layout.fxml"));
                            s5.setTitle("App 5 - Area");
                            s5.setScene(new Scene(root, 300, 300));
                            s5.show();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        break;
                    }
                    case "App 6 - Primes":{
                        Stage s6 = new Stage();
                        Parent root;
                        try {
                            root = FXMLLoader.load(getClass().getResource("app6layout.fxml"));
                            s6.setTitle("App 6 - Primes");
                            s6.setScene(new Scene(root, 350, 300));
                            s6.show();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        break;
                    }
                    default:{
                        break;
                    }
                }
            }
        });
    }
}
