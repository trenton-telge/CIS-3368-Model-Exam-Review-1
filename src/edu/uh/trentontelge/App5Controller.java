package edu.uh.trentontelge;

import edu.uh.trentontelge.shapes.Circle;
import edu.uh.trentontelge.shapes.Rectangle;
import edu.uh.trentontelge.shapes.Triangle;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class App5Controller implements Initializable {
    public ToggleGroup ShapeButtons;
    public Label InLabel1;
    public Label InLabel2;
    public TextField InField1;
    public TextField InField2;
    public Button AreaCalculateButton;
    public Label AreaOutput;
    public RadioButton CircleButton;
    public RadioButton TriangleButton;
    public RadioButton RectangleButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CircleButton.setOnAction(e->{
            unpopulate();
            repopulate();
        });
        TriangleButton.setOnAction(e->{
            unpopulate();
            repopulate();
        });
        RectangleButton.setOnAction(e->{
            unpopulate();
            repopulate();
        });
        AreaCalculateButton.setOnAction(e->{
            if (CircleButton.isSelected()){
                AreaOutput.setText("The area is " + new Circle(Double.parseDouble(InField1.getText())).calculateArea());
            } else if (TriangleButton.isSelected()){
                AreaOutput.setText("The area is " + new Triangle(Double.parseDouble(InField1.getText()), Double.parseDouble(InField2.getText())).calculateArea());
            } else if (RectangleButton.isSelected()){
                AreaOutput.setText("The area is " + new Rectangle(Double.parseDouble(InField1.getText()), Double.parseDouble(InField2.getText())).calculateArea());
            }
        });
    }
    private void unpopulate(){
        InField2.setVisible(false);
        InLabel2.setVisible(false);
        InField2.setText("");
        InField1.setText("");
    }
    private void repopulate(){
        if (CircleButton.isSelected()){
            InLabel1.setText("Radius:");
        } else if (TriangleButton.isSelected()){
            InLabel1.setText("Base:");
            InLabel2.setText("Height:");
            InLabel2.setVisible(true);
            InField2.setVisible(true);
        } else if (RectangleButton.isSelected()){
            InLabel1.setText("Height:");
            InLabel2.setText("Width:");
            InLabel2.setVisible(true);
            InField2.setVisible(true);
        }
    }
}
