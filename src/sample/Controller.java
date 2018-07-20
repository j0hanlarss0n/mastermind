package sample;

import javafx.application.Platform;
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
    private Label paneUpLabel;

    @FXML
    private ImageView btnUp, btnDown, btnSettings, btnPower;

    @FXML
    private AnchorPane paneTop, paneUp, paneDown, paneSettings, paneStage;

    @FXML
    private void handleButtonAction(javafx.scene.input.MouseEvent event) {
        if ( event.getTarget() == btnUp) {
            paneUp.setVisible(true);
            paneDown.setVisible(false);
            paneSettings.setVisible(false);
        } else if ( event.getTarget() == btnDown) {
            paneUp.setVisible(false);
            paneDown.setVisible(true);
            paneSettings.setVisible(false);
        } else if ( event.getTarget() == btnSettings) {
            paneUp.setVisible(false);
            paneDown.setVisible(false);
            paneSettings.setVisible(true);
        } else if ( event.getTarget() == btnPower) {
            if (!(paneUp.isVisible() || paneDown.isVisible() || paneSettings.isVisible())) {
                Platform.exit();
            } else {
                paneUp.setVisible(false);
                paneDown.setVisible(false);
                paneSettings.setVisible(false);
            }
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Loading user data...");
    }
}