package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    private Label label;

    @FXML
    private ImageView btnUp, btnDown, btnSettings, btnPower;

    @FXML
    private AnchorPane paneUp, paneDown, paneSettings, paneStage;

    @FXML
    private void handleButtonAction(javafx.scene.input.MouseEvent event) {
        if ( event.getTarget() == btnUp) {
            System.out.println("You clicked me");
            label.setText("Hello World");
        }
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Loading user data...");
    }
}
